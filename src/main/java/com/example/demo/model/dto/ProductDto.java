package com.example.demo.model.dto;

import javax.validation.constraints.*;

public class ProductDto {
	@Size(min = 2, message = "Name is too short")
	private String name;
	@Min(value = 1, message = "The price must be positive")
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
