package com.lms.LibraryManagementSystem.Service;

import com.lms.LibraryManagementSystem.Entity.BorrowHistory;

import java.util.List;

public interface IServiceBorrowHistory {
    List<BorrowHistory> getAllBorrowHistory();
    void addBorrowHistory(BorrowHistory borrowHistory);
    boolean deleteBorrowHistoryById(Long id);
}
