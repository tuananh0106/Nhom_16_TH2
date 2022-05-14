package com.example.manageproduct.service;

import com.example.manageproduct.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();//tạo ra 1 interface lấy 1 list danh sách student

    Product saveProduct(Product product);

    Product getProductById(Long id);

    Product updateProduct(Product student);

    void deleteProductById(Long id);
}
