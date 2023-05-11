package com.hccs.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	@RequestMapping(value="/bookslist", method= RequestMethod.GET)
	public ModelAndView getStudentsList(ModelAndView model) {
		ArrayList<Book> studentsList = bookService.getBooksList();
		model.addObject("studentsList",studentsList);
		model.setViewName("studentslist");
		return model;
	}

	@RequestMapping(value="/newspringbook",method=RequestMethod.GET)
	public ModelAndView newSpringbook(ModelAndView modelView) {
		Book book = new Book();
		modelView.addObject("book",book);
		modelView.setViewName("addnewbook");
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