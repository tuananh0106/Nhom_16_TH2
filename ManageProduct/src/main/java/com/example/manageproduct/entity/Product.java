package com.example.manageproduct.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="products")
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="product_code",nullable = false)
    private String productCode;

    @Column(name="product_description",nullable = false)
    private String productDescription;

    @Column(name="product_price",nullable = false)
    private double productPrice;

    public Product(String productCode, String productDescription, double productPrice) {
        this.productCode = productCode;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }
}
