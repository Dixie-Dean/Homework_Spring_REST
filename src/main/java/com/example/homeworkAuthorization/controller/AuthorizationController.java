package com.example.homeworkAuthorization.controller;

import com.example.homeworkAuthorization.authorities.Authorities;
import com.example.homeworkAuthorization.service.AuthorizationService;
import com.example.homeworkAuthorization.user.User;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService authorizationService;

    public AuthorizationController(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        return authorizationService.getAuthorities(user);
    }
}
