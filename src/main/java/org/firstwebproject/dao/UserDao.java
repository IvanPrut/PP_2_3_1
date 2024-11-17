package org.firstwebproject.dao;

import org.firstwebproject.models.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
    User findUserById(Long id);
    List<User> findAllUsers();
}
