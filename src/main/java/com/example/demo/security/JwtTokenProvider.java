package com.example.demo.security;

public class JwtTokenProvider {

    private final String secret;
    private final long expiry;

    public JwtTokenProvider(String secret, long expiry) {
        this.secret = secret;
        this.expiry = expiry;
    }

    public String generateToken(UserPrincipal p) {
        return p.getUsername() + ".token";
    }

    public boolean validateToken(String token) {
        return token != null && token.contains(".");
    }

    public String getUsernameFromToken(String token) {
        return token.split("\\.")[0];
    }
}
