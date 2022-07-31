package com.Diplom.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Diplom.dto.BookDto;
import com.Diplom.dto.QuestionDto;

@Controller
public class AddQuestionController {

	@GetMapping("/addQuestion")
	public String registerForm(Model model) {

		model.addAttribute("question", new BookDto());
		return "views/addQuestion";
	}

	@PostMapping("/addQuestion")
	public String registerUser(@Valid QuestionDto book, BindingResult bindingResult, Model model) {
		return "views/addQuestion";
	}
}
