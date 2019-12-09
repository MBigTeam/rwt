package com.tu.controller;

import com.tu.pojo.Users;
import com.tu.service.IUsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/provider")
public class UsersController {


    @Resource
    private IUsersService usersService;

    @GetMapping("/getallusers")
    public List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }
}
