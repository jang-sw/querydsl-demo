package com.example.demo.dto;

import lombok.Data;

public class ProductDto {

	@Data
	public static class NameAndPrice{
		String name;
		int price;
	}
}
