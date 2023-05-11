package com.hccs.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class LibraryAppController {

	@Autowired
	private BookService bookService;
	
	public LibraryAppController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String menuPage(ModelMap model) {
	    model.addAttribute("menu", "Hi, Welcome to the Library App, Glad to meet you :) !!!!");
	    return "menu";
	}
	@RequestMapping(value="/index", method= RequestMethod.GET)
	public String welcomeMessaging(ModelMap model) {
	    model.addAttribute("greetings", "Hi, Welcome to the Library App, Glad to meet you :) !!!!");
	    return "hello";
	}
	
	@RequestMapping(value="/bookslist", method= RequestMethod.GET)
	public ModelAndView getBooksList(ModelAndView model) {
		ArrayList<Book> booksList = bookService.getBooksList();
		model.addObject("booksList",booksList);
		model.setViewName("bookslist");
		return model;
	}

	@RequestMapping(value="/addbook",method=RequestMethod.GET)
	public ModelAndView addbook(ModelAndView modelView) {
		Book book = new Book();
		modelView.addObject("book",book);
		modelView.setViewName("addbook");
		return modelView;
	}
	
	@RequestMapping(value="/addspringbook", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView addSpringbook(@ModelAttribute Book book) {
		System.out.println("----------");
		if (book.getID() == 0) {
			bookService.addBook(book);
		} else {
			bookService.updateBook(book);
		}
		ArrayList<Book> booksList = bookService.getBooksList();

		return new ModelAndView("bookslist","booksList",booksList);
	}
	
	
}