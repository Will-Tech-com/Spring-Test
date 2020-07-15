package org.willgoeieman.mystore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.willgoeieman.mystore.entity.Customer;
import org.willgoeieman.mystore.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
     private CustomerRepository repository;

    public Customer saveCustomer(Customer customer){
        return repository.save(customer);
    }
    public List<Customer> saveCustomers(List<Customer> customers){
        return repository.saveAll(customers);
    }
    public List<Customer> getCustomer(){
        return repository.findAll();
    }
    public Customer getCustomerById(Long id) {
        return repository.findById(id).orElse(null);
    }
    public Customer getCustomerByName(String customerName){
        return repository.findByCustomerName(customerName);
    }
    public String deleteCustomer(Long id){
        repository.deleteById(id);
        return "Customer Has Been Removed..." + id;
    }
    public Customer updateCustomer(Customer customer){
        Customer existingCustomer = repository.findById(customer.getId()).orElse(null);
        existingCustomer.setCustomerName(customer.getCustomerName());
        existingCustomer.setCustomerSurname(customer.getCustomerSurname());
        existingCustomer.setCustomerCellNum(customer.getCustomerCellNum());
        existingCustomer.setCustomerCellNum(customer.getCustomerCellNum());
        return repository.save(existingCustomer);
    }
}
