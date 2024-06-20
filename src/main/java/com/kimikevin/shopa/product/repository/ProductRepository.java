package com.kimikevin.shopa.product.model.repository;

import com.kimikevin.shopa.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}