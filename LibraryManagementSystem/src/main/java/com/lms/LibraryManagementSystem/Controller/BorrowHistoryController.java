package com.lms.LibraryManagementSystem.Controller;

import com.lms.LibraryManagementSystem.Entity.BorrowHistory;
import com.lms.LibraryManagementSystem.Service.IServiceBorrowHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("borrow-history")
public class BorrowHistoryController {

    @Autowired
    private IServiceBorrowHistory serviceBorrowHistory;

    @GetMapping
    public String getAllBorrowHistory(Model model){
        model.addAttribute(serviceBorrowHistory.getAllBorrowHistory());
        return "borrow-history";
    }

    @GetMapping("create")
    public String showBorrowHistoryForm(Model model){
       model.addAttribute("borrow-history", new BorrowHistory());
       return "create-borrow-history";
    }

    @PostMapping("create")
    public String createBorrowHistory(@ModelAttribute BorrowHistory borrowHistory){
        serviceBorrowHistory.addBorrowHistory(borrowHistory);
        return "redirect:/borrow-history";
    }

    @GetMapping("delete/{id}")
    public String deleteBorrowHistory(@PathVariable Long id){
        serviceBorrowHistory.deleteBorrowHistoryById(id);
        return "redirect:/borrow-history";
    }
}
