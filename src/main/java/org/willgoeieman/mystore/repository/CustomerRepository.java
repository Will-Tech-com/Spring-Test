package org.willgoeieman.mystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.willgoeieman.mystore.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByCustomerName(String name);
}
