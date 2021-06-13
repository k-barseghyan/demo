package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dao.CafeOrder;
import com.example.demo.model.dao.CafeOrderTableProduct;
import com.example.demo.model.dao.CafeTable;
import com.example.demo.model.dao.Product;
import com.example.demo.model.dto.ProductDto;
import com.example.demo.repository.CafeTableRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.interfaces.InfoProvider;
import com.example.demo.service.interfaces.ManagingOperations;
import com.example.demo.service.interfaces.WaiterOperations;

@Service
public class CafeService implements WaiterOperations, ManagingOperations, InfoProvider {
	@Autowired
	private CafeTableRepository cafeTableRepository;
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<CafeTable> getTables() {
		return cafeTableRepository.findAll();
	}

	@Override
	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	@Override
	public List<CafeOrder> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProduct(ProductDto dto) {
		Product newProduct = new Product();
		newProduct.setName(dto.getName());
		newProduct.setPrice(dto.getPrice());
		productRepository.save(newProduct);
	}

	@Override
	public void addTable() {
		cafeTableRepository.save(new CafeTable());
	}

	@Override
	public CafeOrder createOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CafeOrderTableProduct fillOrder(List<Product> products) {
		// TODO Auto-generated method stub
		return null;
	}
}
