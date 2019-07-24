package com.cake.service.Impl;

import com.cake.bean.User;
import com.cake.bean.UserExample;
import com.cake.dao.UserMapper;
import com.cake.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> allUserInfo(){
        List<User> users = userMapper.selectByExample(null);
        System.out.println("all user info");
        return users;
    }

    public boolean loginUser(User user){
        UserExample userExample = new UserExample();
        String pwd = user.getPassword();
        String email = user.getEmail();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andEmailEqualTo(email).andPasswordEqualTo(pwd);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() == 0)
            return false;
        return true;
    }

    public void addUser(User user){
        userMapper.insert(user);
    }

    public User selectUserById(int id){
        return userMapper.selectByPrimaryKey(id);
    }

    public User selectUserByMail(String mail){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andEmailEqualTo(mail);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() == 0)
            return null;
        return users.get(0);
    }

    public void updateUserInfo(User user){
        User user1 = userMapper.selectByPrimaryKey(user.getId());
        user1.setLastname(user.getLastname());
        user1.setFirstname(user1.getFirstname());
        user1.setPassword(user.getPassword());
        userMapper.updateByPrimaryKey(user);
    }

    public void forgetPassword(int id){
        User user = userMapper.selectByPrimaryKey(id);
        user.setPassword("123456");
        userMapper.updateByPrimaryKey(user);
    }
}
