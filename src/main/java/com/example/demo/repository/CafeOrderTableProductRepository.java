package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.dao.CafeOrderTableProduct;

public interface CafeOrderTableProductRepository extends JpaRepository<CafeOrderTableProduct, Long> {

}
