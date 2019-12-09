package com.tu.controller;

import com.tu.pojo.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class UsersController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/getallusers")
    public List<Users> getAllUsers(){
        return restTemplate.getForObject("http://eurekaclient-provider/provider/getallusers/",List.class);
    }
}
