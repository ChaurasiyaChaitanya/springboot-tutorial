package com.springboot.springbootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SpringbootAppController {
	
	@RequestMapping("/")
	public String testHandler() {
		return "Welcome to Spring boot Tutorial. This is my first handler.";
	}

}
