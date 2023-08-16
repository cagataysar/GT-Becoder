package com.gtbecoder.assignment.controller;

import com.gtbecoder.assignment.model.Customer;
import com.gtbecoder.assignment.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "customer")
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @GetMapping
    public void findById(@PathVariable(name = "id") Long id) {
    }

    @GetMapping
    public void findByIdentyNo() {

    }

   /* @DeleteMapping
    public ResponseEntity delete(@RequestBody Customer customer) {
//        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.create(customer));
    }*/

    @PostMapping(path = "save")
    public Customer save(@RequestBody Customer customer) {
        // {"name":"Hamza", "surname" : "Hamzaoğlu",  "email" : "hamza@gmail.com"}
        return customerService.createCustomer(customer);
    }
}
