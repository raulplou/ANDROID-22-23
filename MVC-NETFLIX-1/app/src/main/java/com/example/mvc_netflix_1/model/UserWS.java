package com.example.mvc_netflix_1.model;

import com.example.mvc_netflix_1.model.pojo.Student;
import com.example.mvc_netflix_1.model.pojo.User;

public class UserWS {
    private User user;

    public User getData() {
        user = new User();
        user.setEmail("pepe@gmail.com");
        user.setPassword("0000");
        return user;
    }

    public User getUser(String email, String password) {
        user = new User();
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }
}

