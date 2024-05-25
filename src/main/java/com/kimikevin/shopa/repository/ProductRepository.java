package com.kimikevin.shopa.repository;

import com.kimikevin.shopa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
