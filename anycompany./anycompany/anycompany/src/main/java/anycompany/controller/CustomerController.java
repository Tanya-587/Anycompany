package anycompany.controller;


import anycompany.entity.Customer;
import anycompany.entity.Order;
import anycompany.repository.CustomerRepository;
import anycompany.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/api/customer")
    public class CustomerController {


        private final CustomerRepository customerRepository;

        @Autowired
        public CustomerController(CustomerRepository customerRepository) {
            this.customerRepository = customerRepository;
        }

        @GetMapping
        public List<Customer> getAllCustomers() {
            return customerRepository.findAll();
        }

        // Other CRUD operations for customers
    }
