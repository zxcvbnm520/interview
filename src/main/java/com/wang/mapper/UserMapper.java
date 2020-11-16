package com.wang.mapper;


import com.wang.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    //增加用户
    void addUser(User user);

    //删除用户
    void deleteUser(@Param("id") int id);

    //修改用户
    void updateUser(@Param("id")int id);

    //查询用户
    User queryUser(@Param("id")int id);

    //查询用户id
    void queryUserById(@Param("id") int id);
}
