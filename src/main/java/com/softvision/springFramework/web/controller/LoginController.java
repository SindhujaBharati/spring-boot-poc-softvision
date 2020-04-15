package com.softvision.springFramework.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.RequestScope;

import com.softvision.springFramework.web.service.LoginService;

@Controller

public class LoginController {
	
	    @Autowired
	    LoginService service;
		@RequestMapping(value="/login",method=RequestMethod.GET)
		public String showloginPage(ModelMap model) {
			return "login";
		}
		@RequestMapping(value="/login",method=RequestMethod.POST)
		public String showWelcomePage(ModelMap model,@RequestParam String name,@RequestParam String password) {
			boolean isValidUser=service.validateUser(name, password);
			if(!isValidUser)
			{
				model.put("errorMessage","Invalid Credentials");
				return "login";
			}
				
			else {
				model.put("name",name);
				model.put("password",password);
				return "welcome";
			}
			
		}
		
	

}
