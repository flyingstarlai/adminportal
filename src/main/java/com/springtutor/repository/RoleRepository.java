package com.springtutor.repository;

import com.springtutor.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by izayoi on 3/3/17.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByName(String name);
}
