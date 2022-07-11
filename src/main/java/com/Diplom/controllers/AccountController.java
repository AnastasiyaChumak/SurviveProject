package com.Diplom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Diplom.entity.LogUser;
import com.Diplom.entity.Result;
import com.Diplom.entity.User;
import com.Diplom.services.LogUserService;
import com.Diplom.services.ResultService;
import com.Diplom.services.UserService;

@Controller
public class AccountController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private LogUserService logService;
	
	@Autowired
	private ResultService service;

	@GetMapping("/account")
	public String dashboardPageList(Model model, LogUser currentUser) {
		LogUser us = logService.findById(1);
		User user = userService.findByEmail(us.getEmail());
		model.addAttribute("user", user);
		System.out.println(user.getEmail());
		System.out.println(user.getResult());
		Result result = service.findByRes(user.getResult());
		model.addAttribute("result", result); 
		return "views/account";
	}
	
	 
}
