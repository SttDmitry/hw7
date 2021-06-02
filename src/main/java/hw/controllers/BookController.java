package hw.controllers;

import hw.entities.Book;
import hw.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@Controller
@RequestMapping("/books")
public class BookController {
    private BooksService booksService;

    @Autowired
    public void setBooksService(BooksService booksService) {
        this.booksService = booksService;
    }

    @RequestMapping("/showAllBooks")
    public String showAllProducts(Model uiModel) {
        uiModel.addAttribute("booksList", booksService.getBooks());
        return "books";
    }

    @RequestMapping("/showForm")
    public String showSimpleForm(Model uiModel) {
        Book book = new Book();
        uiModel.addAttribute("book", book);
        return "book-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("book") Book book) {
        System.out.println(book);
        booksService.addBook(book);
        return "redirect:/books/showAllBooks";
    }


}
