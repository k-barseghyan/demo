package com.example.demo.service.interfaces;

import com.example.demo.model.dao.CafeTable;
import com.example.demo.model.dao.Product;
import com.example.demo.model.dto.ProductDto;

public interface ManagingOperations {

	void addProduct(ProductDto dto);

	void addTable();

}
