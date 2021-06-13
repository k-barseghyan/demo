package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.dao.CafeOrder;

public interface CafeOrderRepository extends JpaRepository<CafeOrder, Long> {

}
