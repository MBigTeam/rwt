package com.tu.dao;

import com.tu.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUsersDao {

    List<Users> getAllUsers();
}
