package com.lms.LibraryManagementSystem.Service;

import com.lms.LibraryManagementSystem.Entity.Author;

import java.util.List;

public interface IServiceAuthor {
    List<Author> getAllAuthor();
    void addAuthor(Author author);
}
