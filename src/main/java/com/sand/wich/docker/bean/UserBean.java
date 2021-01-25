package com.sand.wich.docker.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class UserBean {

    @Id
    @GeneratedValue
    private int id;

    private String username;

    private String password;

    public UserBean(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserBean userBean = (UserBean) o;
        return id == userBean.id && Objects.equals(username, userBean.username) && Objects.equals(password, userBean.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password);
    }
}
