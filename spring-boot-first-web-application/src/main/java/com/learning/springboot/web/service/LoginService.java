package com.learning.springboot.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userid, String password){
        //userid: eliza, password: password
        return userid.equalsIgnoreCase("eliza") && password.equalsIgnoreCase("password");
    }
}

