package org.willgoeieman.mystore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String productName;
    private Double productPrice;
    private int numberOfStock;
    private String category;
}
