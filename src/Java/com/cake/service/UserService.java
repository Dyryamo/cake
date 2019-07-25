package com.cake.service;

import com.cake.bean.User;

import java.util.List;

public interface UserService {
    public List<User> allUserInfo();
    public boolean loginUser(User user);
    public void addUser(User user);
    public User selectUserById(int id);
    public User selectUserByMail(String mail);
    public void updateUserInfo(User user);
    public void forgetPassword(int id);
    public int userMaxId();
}
