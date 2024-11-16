package org.firstwebproject.dao;

import org.firstwebproject.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    User findUserById(Long id);
    List<User> findAllUsers();
}
