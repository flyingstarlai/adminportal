package com.springtutor.repository;

import com.springtutor.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by izayoi on 3/1/17.
 */
public interface UserRepository extends CrudRepository<User, Long>{
    User findByUsername(String username);
}
