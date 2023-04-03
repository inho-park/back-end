package com.example.c2c.user.service;


import com.example.c2c.user.domain.Role;
import com.example.c2c.user.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
