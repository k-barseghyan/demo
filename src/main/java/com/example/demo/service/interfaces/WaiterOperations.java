package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.model.dao.CafeOrder;
import com.example.demo.model.dao.CafeOrderTableProduct;
import com.example.demo.model.dao.Product;

public interface WaiterOperations {

	CafeOrder createOrder();

	CafeOrderTableProduct fillOrder(List<Product> products);
}
