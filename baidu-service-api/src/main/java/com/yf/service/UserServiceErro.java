package com.yf.service;

import com.yf.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceErro implements  UserServiceFeign{
    public void test() {

    }

    public List<User> findUserList() {
        return null;
    }

    public String getUserName() {
        return null;
    }
}
