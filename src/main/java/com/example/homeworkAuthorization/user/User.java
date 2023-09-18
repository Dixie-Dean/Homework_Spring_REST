package com.example.homeworkAuthorization.user;

import jakarta.validation.constraints.*;

public class User {

    @NotBlank
    @NotNull
    @Size(min = 2, max = 30)
    private String user;

    @NotBlank
    @NotNull
    @Min(10)
    private String password;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
