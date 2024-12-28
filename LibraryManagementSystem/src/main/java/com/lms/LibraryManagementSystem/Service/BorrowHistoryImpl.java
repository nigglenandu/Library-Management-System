package com.lms.LibraryManagementSystem.Service;

import com.lms.LibraryManagementSystem.Entity.BorrowHistory;
import com.lms.LibraryManagementSystem.Repository.BorrowHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BorrowHistoryImpl implements IServiceBorrowHistory {

    @Autowired
    private BorrowHistoryRepository repositoryBorrowHistory;


    @Override
    public List<BorrowHistory> getAllBorrowHistory() {
        return repositoryBorrowHistory.findAll();
    }

    @Override
    public void addBorrowHistory(BorrowHistory borrowHistory) {
        repositoryBorrowHistory.save(borrowHistory);
    }

    @Override
    public boolean deleteBorrowHistoryById(Long id) {
        if(repositoryBorrowHistory.existsById(id)){
            repositoryBorrowHistory.deleteById(id);
            return true;
        }  else {
            return false;
        }
    }
}
