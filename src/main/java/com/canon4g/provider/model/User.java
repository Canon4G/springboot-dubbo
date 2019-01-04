package com.canon4g.provider.model;

import java.io.Serializable;

/**
 * create by Canon4G 2019-01-04
 **/
public class User implements Serializable {

    private String userName;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }
}
