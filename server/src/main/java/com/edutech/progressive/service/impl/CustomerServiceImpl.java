package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.edutech.progressive.dao.CustomerDAO;
import com.edutech.progressive.dao.CustomerDAOImpl;
import com.edutech.progressive.entity.Customers;
import com.edutech.progressive.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDAO customerDAO;
    private static List<Customers> customersList = new ArrayList<>();

    public CustomerServiceImpl(CustomerDAOImpl customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        return this.customerDAO.getAllCustomers();
    }

    @Override
    public int addCustomer(Customers customers) throws SQLException {
        return this.customerDAO.addCustomer(customers);
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        List<Customers> sortedCustomers=this.customerDAO.getAllCustomers();
        Collections.sort(sortedCustomers);
        return sortedCustomers;
    }

    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        this.customerDAO.updateCustomer(customers);
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
        this.customerDAO.deleteCustomer(customerId);
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        return this.customerDAO.getCustomerById(customerId);
    }

}