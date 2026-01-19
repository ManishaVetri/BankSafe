package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.edutech.progressive.dao.AccountDAO;
import com.edutech.progressive.dao.AccountDAOImpl;
import com.edutech.progressive.entity.Accounts;
import com.edutech.progressive.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountDAO accountDAO;
    private static List<Accounts> accountsList = new ArrayList<>();
    public AccountServiceImpl(AccountDAOImpl accountDAO) {
        this.accountDAO = accountDAO;
    }
   

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        return this.accountDAO.getAllAccounts();

    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        return this.accountDAO.addAccount(accounts);
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        List <Accounts>sortedAccounts=this.accountDAO.getAllAccounts();
        Collections.sort(sortedAccounts);
        return sortedAccounts;

    }
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        return this.accountDAO.getAllAccounts();
    }
 
    public Accounts getAccountById(int accountId) throws SQLException {
        return this.accountDAO.getAccountById(accountId);
    }
 
    public void updateAccount(Accounts accounts) throws SQLException {
        this.accountDAO.updateAccount(accounts);
    }
 
    public void deleteAccount(int accountId) throws SQLException {
        this.accountDAO.deleteAccount(accountId);
    }

}