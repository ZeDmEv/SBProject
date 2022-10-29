package com.MP.SBProject.service;

import com.MP.SBProject.Dao.UserDao;
import com.MP.SBProject.Dao.UserDaoImpl;
import com.MP.SBProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    @Autowired
    @Qualifier("UserDaoImpl")
    private void setUserDao(UserDaoImpl userDao){
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public List<User> allUsers() {
        return userDao.allUsers();
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Transactional
    @Override
    public void edit(User user) {
        userDao.edit(user);
    }

    @Transactional
    @Override
    public User getById(long id) {
        return userDao.getById(id);
    }
}
