package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.edutech.progressive.entity.Accounts;

public class AccountServiceImplArraylist {
    private static List<Accounts> accountsList=new ArrayList<>();
    public List<Accounts> getAllAccounts() throws SQLException {
        return accountsList;
    }

    public int addAccount(Accounts accounts) throws SQLException {
        accountsList.add(accounts);
        return accountsList.size();
    }

    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        List <Accounts> tempList=new ArrayList<>(accountsList);
        Collections.sort(tempList);
        return tempList;
    }
    public Accounts getAccountById(int accountId) throws SQLException{
         for (Accounts accounts : accountsList) {
            if(accounts.getAccountId()==accountId)
                return accounts;
         }
         return null;
    }
    public void emptyArrayList() {
        accountsList=new ArrayList<>();
    }
}