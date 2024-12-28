package com.lms.LibraryManagementSystem.Controller;

import com.lms.LibraryManagementSystem.Entity.Author;
import com.lms.LibraryManagementSystem.Service.IServiceAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("authors")
public class AuthorController {

    @Autowired
    private IServiceAuthor serviceAuthor;

    @GetMapping
    public String getAllAuthor(Model model){
        model.addAttribute("authors", serviceAuthor.getAllAuthor());
        return "authors";
    }

    @GetMapping("create")
    public String ShowAuthorForm(Model model){
        model.addAttribute("author", new Author());
        return "create-author";
    }

    @PostMapping("create")
    public String CreateAuthor(@ModelAttribute Author author){
        serviceAuthor.addAuthor(author);
        return "redirect:/authors";
    }
}
