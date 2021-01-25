package com.sand.wich.docker.repository;

import com.sand.wich.docker.bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DockerRepository extends JpaRepository<UserBean,Integer> {
}
