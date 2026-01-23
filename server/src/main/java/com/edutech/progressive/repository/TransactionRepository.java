package com.edutech.progressive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edutech.progressive.entity.Transactions;

public interface TransactionRepository extends JpaRepository<Transactions,Integer> {
     List<Transactions> findByAccountsAccountId(int accountId);
}
