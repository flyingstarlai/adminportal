package com.springtutor.domain.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by izayoi on 3/2/17.
 */
public class Authority implements GrantedAuthority {

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
