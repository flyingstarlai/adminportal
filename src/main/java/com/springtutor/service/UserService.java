package com.springtutor.service;

import com.springtutor.domain.User;
import com.springtutor.domain.security.UserRole;

import java.util.Set;

/**
 * Created by izayoi on 3/3/17.
 */
public interface UserService {
    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User save);
}
