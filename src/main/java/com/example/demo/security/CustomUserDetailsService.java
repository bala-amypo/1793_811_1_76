package com.example.demo.security;

import com.example.demo.exception.ApiException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class CustomUserDetailsService implements UserDetailsService {

    // In-memory store (used only for tests)
    private final Map<String, UserPrincipal> users = new HashMap<>();
    private final AtomicLong idGen = new AtomicLong(1);

    // Used in test21, test22, test53
    public UserPrincipal register(String username, String password, String role) {

        if (users.containsKey(username)) {
            throw new ApiException("User already exists");
        }

        UserPrincipal user = new UserPrincipal(
                idGen.getAndIncrement(),
                username,
                password,
                role
        );

        users.put(username, user);
        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        UserPrincipal user = users.get(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }
}
