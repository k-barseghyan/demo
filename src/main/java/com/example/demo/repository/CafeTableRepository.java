package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.dao.CafeTable;

public interface CafeTableRepository extends JpaRepository<CafeTable, Long> {

}
