package org.willgoeieman.mystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.willgoeieman.mystore.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByProductName(String name);
}
