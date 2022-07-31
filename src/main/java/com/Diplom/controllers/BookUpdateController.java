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
public class BookUpdateController {

	@Autowired
	private BookService service;

	@PostMapping("/bookUpdate/{id}")
	public String editBook(@Valid Book book, @PathVariable(value = "id") Integer id, Model model) {
		Book oldBook = service.findById(id);
		oldBook.setDescription(book.getDescription());
		oldBook.setTopic(book.getTopic());
		oldBook.setLink(book.getLink());
		service.saveBook(oldBook);
		model.addAttribute("book.id", oldBook);
		return "redirect:/bookList";
	}
}
