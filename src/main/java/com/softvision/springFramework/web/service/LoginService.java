package com.softvision.springFramework.web.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
     public boolean validateUser(String username,String password) {
    	 return username.equalsIgnoreCase("Sindhuja") && password.equalsIgnoreCase("password");
     }
}
