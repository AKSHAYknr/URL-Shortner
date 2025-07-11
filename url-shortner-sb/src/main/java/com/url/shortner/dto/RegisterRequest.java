package com.url.shortner.dto;

import lombok.Data;

import java.util.Set;

@Data
public class RegisterRequest {

    private String username;
    private String email;
    private Set<String> roles;
    private String password;
}
