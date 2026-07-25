package com.example.moviewreviewapplication.controller;

import com.example.moviewreviewapplication.dto.LoginRequest;
import com.example.moviewreviewapplication.dto.LoginResponse;
import com.example.moviewreviewapplication.dto.UserRequestDTO;
import com.example.moviewreviewapplication.dto.UserResponseDTO;
import com.example.moviewreviewapplication.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDTO register(@Valid @RequestBody UserRequestDTO dto) {
        return authService.register(dto);
    }

    @PostMapping("/login")
    public LoginResponse login(@Valid @RequestBody LoginRequest dto) {
        return authService.login(dto);
    }
}