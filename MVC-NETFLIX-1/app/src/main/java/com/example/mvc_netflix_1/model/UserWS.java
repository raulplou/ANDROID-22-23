package com.example.mvc_netflix_1.model;

import com.example.mvc_netflix_1.model.pojo.Student;
import com.example.mvc_netflix_1.model.pojo.User;

public class UserWS {
    private User user;

    public User getUserWS(){
        user = new User();
        user.setEmail("PEPE");
        user.setPassword("PALOTES");
        return user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
