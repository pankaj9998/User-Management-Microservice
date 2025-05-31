package com.example.demo.dto;


import com.example.demo.entity.Role;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;
    private Role role;
}