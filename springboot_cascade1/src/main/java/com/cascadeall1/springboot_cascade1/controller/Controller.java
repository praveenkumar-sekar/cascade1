package com.Sample.Cascade.controller;

import com.Sample.Cascade.dto.OderRequest;
import com.Sample.Cascade.entity.Customer;
import com.Sample.Cascade.repo.CustomerRepository;
import com.Sample.Cascade.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    public CustomerRepository customerRepository;
    @Autowired
    public ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OderRequest request)
    {
        return customerRepository.save(request.getCustomer());
    }
    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders()
    {
        return  customerRepository.findAll();
    }

}
