package com.Diplom.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Diplom.entity.Role;
import com.Diplom.entity.User;
import com.Diplom.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public String listUsers(Model model, @RequestParam(defaultValue = "") String name) {
		model.addAttribute("users", userService.findByNameSearch(name));
		return "views/users";
	}

	@PostMapping("/changeRole/{id}")
	public String setUserAdmin(@PathVariable(value = "id") Integer id, @Valid User user) {
		User oldUser = userService.findById(id);
		if (oldUser.getRole().equals(Role.USER)) {
			oldUser.setRole(Role.ADMIN);
		} else if (oldUser.getRole().equals(Role.ADMIN)) {
			oldUser.setRole(Role.USER);
		}
		userService.saveUser(oldUser);
		return "redirect:/users";

	}
}
