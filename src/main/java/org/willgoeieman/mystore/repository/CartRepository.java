package org.willgoeieman.mystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.willgoeieman.mystore.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
