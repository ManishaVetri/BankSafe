package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Customers;
import com.edutech.progressive.repository.CustomerRepository;
import com.edutech.progressive.service.CustomerService;

@Service
public class CustomerServiceImplJpa implements CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImplJpa( CustomerRepository customerRepository) {
        // this.passwordEncoder = passwordEncoder;
        // this.transactionRepository = transactionRepository;
        // this.accountRepository = accountRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        return customerRepository.findAll();
    }

    @Override
    public int addCustomer(Customers customers) throws SQLException {
       return customerRepository.save(customers).getCustomerId();
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        List<Customers> sortedCustomers = customerRepository.findAll();
        Collections.sort(sortedCustomers);
        return sortedCustomers;
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
       customerRepository.deleteById(customerId);
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
      return   customerRepository.findByCustomerId(customerId);
    }

    @Override
    public void updateCustomer(Customers customers) throws SQLException {
      customerRepository.save(customers);
    }

}