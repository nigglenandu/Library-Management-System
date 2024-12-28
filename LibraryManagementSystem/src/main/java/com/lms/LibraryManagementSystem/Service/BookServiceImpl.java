package com.lms.LibraryManagementSystem.Service;

import com.lms.LibraryManagementSystem.Entity.Book;
import com.lms.LibraryManagementSystem.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements IServiceBook {

    @Autowired
    private BookRepository repositoryBook;

    @Override
    public List<Book> getAllBooks() {
        return repositoryBook.findAll();
    }

    @Override
    public void saveBook(Book book) {
        repositoryBook.save(book);
    }

    @Override
    public boolean deleteBookById(Long id) {
        if(repositoryBook.existsById(id)) {
            repositoryBook.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
