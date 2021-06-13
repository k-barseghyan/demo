package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.model.dao.CafeOrder;
import com.example.demo.model.dao.CafeTable;
import com.example.demo.model.dao.Product;

public interface InfoProvider {

	List<CafeTable> getTables();

	List<Product> getProducts();

	List<CafeOrder> getOrders();
}
