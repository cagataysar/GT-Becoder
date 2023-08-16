package com.gtbecoder.assignment.service;

import com.gtbecoder.assignment.model.Customer;
import com.gtbecoder.assignment.repo.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository customerRepo;

    public Customer createCustomer(Customer customer) {
        customer.setName(new String());
        customer.setSurname(new String());
        customer.setEmail(new String());

        return customerRepo.findById(customer.getId()).get();
    }
}
