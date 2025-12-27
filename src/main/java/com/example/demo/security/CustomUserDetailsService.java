package com.example.demo.security;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class CustomUserDetailsService {

    private final Map<String, UserPrincipal> users = new HashMap<>();
    private final AtomicLong seq = new AtomicLong(1);

    public UserPrincipal register(String email, String pass, String role) {
        UserPrincipal u = new UserPrincipal(seq.getAndIncrement(), email, role);
        users.put(email, u);
        return u;
    }

    public Object loadUserByUsername(String email) {
        return users.get(email);
    }
}
