package com.example.homeworkAuthorization.repository;

import com.example.homeworkAuthorization.authorities.Authorities;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    private final Map<String, String> users = new HashMap<>();

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (users.containsKey(user) && users.containsValue(password)) {
            return List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else {
            return Collections.emptyList();
        }
    }
}
