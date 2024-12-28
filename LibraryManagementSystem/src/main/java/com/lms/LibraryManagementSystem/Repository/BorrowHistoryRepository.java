package com.lms.LibraryManagementSystem.Repository;

import com.lms.LibraryManagementSystem.Entity.Author;
import com.lms.LibraryManagementSystem.Entity.BorrowHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowHistoryRepository extends JpaRepository<BorrowHistory, Long> {
}
