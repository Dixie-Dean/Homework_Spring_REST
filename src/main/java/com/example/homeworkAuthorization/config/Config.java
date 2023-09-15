package com.example.homeworkAuthorization.config;

import com.example.homeworkAuthorization.controller.AuthorizationController;
import com.example.homeworkAuthorization.repository.UserRepository;
import com.example.homeworkAuthorization.service.AuthorizationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public AuthorizationController authorizationController(AuthorizationService authorizationService) {
        return new AuthorizationController(authorizationService);
    }

    @Bean
    public AuthorizationService authorizationService(UserRepository userRepository) {
        return new AuthorizationService(userRepository);
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
}
