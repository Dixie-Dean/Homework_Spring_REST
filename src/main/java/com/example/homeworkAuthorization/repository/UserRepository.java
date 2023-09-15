package com.example.homeworkAuthorization.repository;

import com.example.homeworkAuthorization.authorities.Authorities;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return null;
    }
}
