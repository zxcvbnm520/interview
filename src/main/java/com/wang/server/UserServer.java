package com.wang.server;

import com.wang.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserServer {

    //增加用户
    void addUser(User user);

    //删除用户
    void deleteUser(int id);

    //修改用户
    void updateUser(int id);

    //查询用户
    User queryUser(int id);

    //查询用户id
    void queryUserById(int id);
}
