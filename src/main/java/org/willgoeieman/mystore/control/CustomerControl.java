package org.willgoeieman.mystore.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.willgoeieman.mystore.entity.Customer;
import org.willgoeieman.mystore.service.CustomerService;

import java.util.List;

@RestController
public class CustomerControl {
    @Autowired
    private CustomerService service;

    @GetMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.saveCustomer(customer);
    }

    @GetMapping("/addCustomers")
    public List<Customer> addCustomers(@RequestBody List<Customer> customers) {
        return service.saveCustomers(customers);
    }

    @GetMapping("/customers")
    public List<Customer> findAllCustomers() {
        return service.getCustomer();
    }

    @GetMapping("/customer/{id}")
    public Customer findCustomerById(@PathVariable Long id) {
        return service.getCustomerById(id);
    }
    @GetMapping("/customer/{customerName}")
    public Customer findCustomerName(@PathVariable String customerName){
        return service.getCustomerByName(customerName);
    }
    @PutMapping("/customer/update")
    public Customer updateCustomer(@RequestBody Customer customer){
        return service.updateCustomer(customer);
    }
    @DeleteMapping("/customer/delete/{id}")
    public String deleteCustomer(@PathVariable Long id){
        return service.deleteCustomer(id);
    }
}
