package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.ProductEntity;
import com.example.demo.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired ProductRepo productRepo;
	
	public List<ProductEntity> getAll() {
		return productRepo.findAll();
	}
	
	public List<ProductEntity> getProductList(String category) {
		return productRepo.findListByCategory(category);
	}
	public List<ProductDto.NameAndPrice> getProductList2(String category) {
		return productRepo.findNameAndPriceById(category);
	}
}
