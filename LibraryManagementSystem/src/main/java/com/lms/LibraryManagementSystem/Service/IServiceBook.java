package com.lms.LibraryManagementSystem.Service;

import com.lms.LibraryManagementSystem.Entity.Book;

import java.util.List;

public interface IServiceBook {
    List<Book> getAllBooks();
    void saveBook(Book book);
    boolean deleteBookById(Long id);
}
