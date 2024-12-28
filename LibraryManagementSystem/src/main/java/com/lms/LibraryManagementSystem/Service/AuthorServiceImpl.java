package com.lms.LibraryManagementSystem.Service;

import com.lms.LibraryManagementSystem.Entity.Author;
import com.lms.LibraryManagementSystem.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements IServiceAuthor{

    @Autowired
    private AuthorRepository repositoryAuthor;

    @Override
    public List<Author> getAllAuthor() {
        return repositoryAuthor.findAll();
    }

    @Override
    public void addAuthor(Author author) {
        repositoryAuthor.save(author);
    }
}
