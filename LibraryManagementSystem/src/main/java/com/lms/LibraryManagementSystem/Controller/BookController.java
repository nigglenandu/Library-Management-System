package com.lms.LibraryManagementSystem.Controller;

import com.lms.LibraryManagementSystem.Entity.Book;
import com.lms.LibraryManagementSystem.Service.IServiceBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("books")
public class BookController {

    @Autowired
    private IServiceBook serviceBook;

    @GetMapping
    public String getAllBooks(Model model){
        model.addAttribute("books", serviceBook.getAllBooks());
        return "books";
    }

    @GetMapping("create")
    public String ShowCreateBookForm(Model model){
        model.addAttribute("book", new Book());
        return "create-book";
    }

    @PostMapping("create")
    public String CreateBook(@ModelAttribute Book book){
        serviceBook.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("delete/{id}")
    public String DeleteBookById(@PathVariable Long id){
        serviceBook.deleteBookById(id);
        return "redirect:/books";
    }
}
