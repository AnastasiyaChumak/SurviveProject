package com.Diplom.controllers;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Diplom.entity.Book;
import com.Diplom.services.BookService;

@Controller
public class BookUpdateController {
	
	@Autowired
	private BookService service;
	
	/*@GetMapping("/bookList")
	public String bookList(Model model, @RequestParam(defaultValue = "") String topic) {
		model.addAttribute("book", service.findByTopicSearch(topic));
		return "views/bookList";
	}*/
}
 

