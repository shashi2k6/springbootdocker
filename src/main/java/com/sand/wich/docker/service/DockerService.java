package com.sand.wich.docker.service;

import com.sand.wich.docker.bean.UserBean;
import com.sand.wich.docker.repository.DockerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DockerService {

    @Autowired
    private DockerRepository dockerRepository;

    public UserBean addUser(UserBean userBean){
        return dockerRepository.save(userBean);
    }
}
