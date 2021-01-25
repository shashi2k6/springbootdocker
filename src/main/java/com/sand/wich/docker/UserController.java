package com.sand.wich.docker;

import com.sand.wich.docker.bean.UserBean;
import com.sand.wich.docker.service.DockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private DockerService dockerService;

    @RequestMapping("/adduser")
    public UserBean addUser(){
        return dockerService.addUser(new UserBean("Shashi","password"));
    }
}
