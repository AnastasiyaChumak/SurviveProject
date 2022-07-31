package com.Diplom.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Diplom.entity.Book;
import com.Diplom.services.BookService;

@Controller
public class DeleteBookController {

	@Autowired
	private BookService service;

	@PostMapping("/bookDelete/{id}")
	public String editBook(@Valid Book book, @PathVariable Integer id, Model model) {
		Book thisBook = service.findById(id);
		service.deleteBook(thisBook);
		model.addAttribute("books", thisBook);
		return "redirect:/bookList";
	}
}
