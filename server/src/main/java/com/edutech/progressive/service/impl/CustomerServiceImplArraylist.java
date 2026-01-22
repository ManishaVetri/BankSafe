package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Customers;
@Service
public class CustomerServiceImplArraylist {
    private static List<Customers> customersList = new ArrayList<>();

    public List<Customers> getAllCustomers() throws SQLException {
        return customersList;
    }

    public int addCustomer(Customers customers) throws SQLException {
        customersList.add(customers);
        return customersList.size();
    }

    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        List <Customers> tempList=new ArrayList<>(customersList);
        Collections.sort(tempList);
        return tempList;
    }
    public Customers getCustomerById(int customerId) throws SQLException{
        for (Customers customers : customersList) {
            if(customers.getCustomerId()==customerId){
                return customers;
            }
        }
        return null;
    }

    public void emptyArrayList() {
         customersList=new ArrayList<>();
    }
}