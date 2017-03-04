package com.springtutor.service.impl;

import com.springtutor.domain.User;
import com.springtutor.domain.security.UserRole;
import com.springtutor.repository.RoleRepository;
import com.springtutor.repository.UserRepository;
import com.springtutor.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by izayoi on 3/4/17.
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User localUser = userRepository.findByUsername(user.getUsername());

        if(localUser != null) {
            LOG.info("user {} already exists. Nothing will be done.", user.getUsername());
        } else {
            for(UserRole ur : userRoles) {
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);
            localUser = userRepository.save(user);
        }

        return localUser;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
