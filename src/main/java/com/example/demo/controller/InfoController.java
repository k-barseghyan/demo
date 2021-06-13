package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.constants.CafeMessages;
import com.example.demo.model.dao.CafeTable;
import com.example.demo.model.dao.Product;
import com.example.demo.service.interfaces.InfoProvider;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@RequestMapping(path = "/info")
@RestController
public class InfoController {

	@Autowired
	private InfoProvider cafeService;

	@ApiOperation(value = "Getting tables for creating an order.")
	@GetMapping(path = "/get-tables")
	public ResponseEntity<?> getTables() {
		List<CafeTable> tables = cafeService.getTables();
		if (!tables.isEmpty()) {
			return new ResponseEntity<List<CafeTable>>(tables, HttpStatus.OK);
		} else {
			return new ResponseEntity<String>(CafeMessages.NO_CONTENT, HttpStatus.NO_CONTENT);
		}
	}

	@ApiOperation(value = "Getting products for creating and an order.")
	@GetMapping(path = "/get-products")
	public ResponseEntity<?> getProducts() {
		List<Product> products = cafeService.getProducts();
		if (!products.isEmpty()) {
			return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
		} else {
			return new ResponseEntity<String>(CafeMessages.NO_CONTENT, HttpStatus.NO_CONTENT);
		}
	}
}
