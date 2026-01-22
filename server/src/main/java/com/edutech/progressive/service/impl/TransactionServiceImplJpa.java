package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Transactions;
import com.edutech.progressive.repository.AccountRepository;
import com.edutech.progressive.repository.TransactionRepository;
import com.edutech.progressive.service.TransactionService;

@Service
public class TransactionServiceImplJpa implements TransactionService {
    private TransactionRepository transactionRepository;
    private AccountRepository accountRepository;

    @Autowired
    public TransactionServiceImplJpa(TransactionRepository transactionRepository, AccountRepository accountRepository) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Transactions> getAllTransactions() throws SQLException {
      return null;
    }

    @Override
    public Transactions getTransactionById(int transactionId) throws SQLException {
      return null;
    }

    @Override
    public int addTransaction(Transactions transaction) throws SQLException {
     return -1;
    }

    @Override
    public void updateTransaction(Transactions transaction) throws SQLException {
        
    }

    @Override
    public void deleteTransaction(int transactionId) throws SQLException {
      
    }

    @Override
    public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
        return null;
    }

}
