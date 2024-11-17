package org.firstwebproject.service;

import org.firstwebproject.models.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
    User findUserById(Long id);
    List<User> findAllUsers();
}
