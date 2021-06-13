package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.constants.CafeMessages;
import com.example.demo.model.dao.CafeTable;
import com.example.demo.model.dao.Product;
import com.example.demo.model.dto.ProductDto;
import com.example.demo.service.CafeService;
import com.example.demo.service.interfaces.ManagingOperations;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@RequestMapping(path = "/managing")
@RestController
public class ManagingController {

	@Autowired
	private ManagingOperations cafeService;

	@ApiOperation(value = "Create a single table")
	@PostMapping(path = "/create-table")
	public ResponseEntity<String> addTable() {
		cafeService.addTable();
		return new ResponseEntity<String>(CafeMessages.CREATED, HttpStatus.CREATED);
	}

	@ApiOperation(value = "Create a single product")
	@PostMapping(path = "/create-product")
	public ResponseEntity<String> addProduct(@Valid @RequestBody ProductDto productDto) {
		cafeService.addProduct(productDto);
		return new ResponseEntity<String>(CafeMessages.CREATED, HttpStatus.CREATED);
	}
}
