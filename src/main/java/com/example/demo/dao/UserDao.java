package com.example.demo.dao;

import com.example.demo.model.PO.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Insert("insert into user(username,password) values(#{username},#{password} )")
    void addUser(User user);
    @Select("select * from user where username=#{username}")
    User selectUserByname(String username);

}
