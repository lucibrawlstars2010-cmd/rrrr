package com.impact.lessons.services;

import database.UserStore;
import models.User;

public class UserService {
    private final UserStore store =new UserStore();
    public User CreateUser(User user){
        User newUser = new User( user.getUsername(),
                user.getEmail(),user.getPassword(), user.getRole());
        return store.save
    }
}
