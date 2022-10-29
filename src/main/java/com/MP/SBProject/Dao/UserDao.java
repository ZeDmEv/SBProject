package com.MP.SBProject.Dao;

import com.MP.SBProject.model.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getById(long id);
}
