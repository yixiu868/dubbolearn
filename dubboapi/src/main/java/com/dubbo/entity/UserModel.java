package com.dubbo.entity;

import java.io.Serializable;

public class UserModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String passwrod;

    public UserModel() {
    }

    public UserModel(Long id, String name, String passwrod) {
        this.id = id;
        this.name = name;
        this.passwrod = passwrod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }
}
