package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.dao.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
