package com.tu.service.impl;

import com.tu.dao.IUsersDao;
import com.tu.pojo.Users;
import com.tu.service.IUsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUsersService {

    @Resource
    private IUsersDao usersDao;

    @Override
    public List<Users> getAllUsers() {
        return usersDao.getAllUsers();
    }
}
