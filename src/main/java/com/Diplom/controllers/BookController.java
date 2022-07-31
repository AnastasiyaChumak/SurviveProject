package com.Diplom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.Diplom.services.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService service;

	@GetMapping("/bookList")
	public String bookList(Model model, @RequestParam(defaultValue = "") String topic) {
		model.addAttribute("book", service.findByTopicSearch(topic));
		return "views/bookList";
	}

	@GetMapping("/bookUpdate/{id}")
	public String bookListUpdate(@PathVariable(value = "id") Integer id, Model model) {
		model.addAttribute("book", service.findById(id));
		return "bookUpdate";
	}

}