package com.example.mongodbdemo.controller;

import com.example.mongodbdemo.model.Customer;
import com.example.mongodbdemo.repo.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@AllArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;
    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer)
    {
        customer.setCustomerId(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(customerRepository.save(customer));
    }
    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAll()
    {
        return ResponseEntity.ok(customerRepository.findAll());
    }

    @GetMapping("/customers/{customerId}")
    public ResponseEntity<Customer> getByCustomerId(@PathVariable("customerId") String customerId) {
        Customer customer = customerRepository.findByCustomerId(customerId);
        if (customer == null) {
            throw new RuntimeException("");
        }
        return ResponseEntity.ok(customer);
    }
}
