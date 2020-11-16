package com.wang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id; //主键
    private String mobile; //用户登录名（使用电话号码）
    private String password;//用户密码
    private String sex; //性别
    private Date birthday;  //出生日期
    private String address; //详细地址
    private String email; //邮箱
    private String state; // -1表示删除，1表示正常状态
    private Date create_time; //创建时间
    private Date update_time; //修改时间

}
