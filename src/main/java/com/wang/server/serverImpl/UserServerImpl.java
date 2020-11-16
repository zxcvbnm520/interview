package com.wang.server.serverImpl;

import com.wang.mapper.UserMapper;
import com.wang.pojo.User;
import com.wang.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServerImpl implements UserServer {

    @Autowired
    private UserMapper userMapper;



    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }

    @Override
    public void updateUser(int id) {
        userMapper.updateUser(id);
    }

    @Override
    public User queryUser(int id) {
       return userMapper.queryUser(id);
    }

    @Override
    public void queryUserById(int id) {
        userMapper.queryUserById(id);
    }


}
