package com.t1.task5_1;

import java.util.ArrayList;

public abstract class User {
    public String login;
    private String password;

    public User(String login) {
        this.login = login;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
