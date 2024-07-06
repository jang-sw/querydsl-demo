package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.ProductEntity;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
 
	
	@Autowired ProductService productService;
	
	@GetMapping("getProductList")
	public List<ProductEntity> getProductList(@RequestParam String category){
		return productService.getProductList(category);
	}
	@GetMapping("getProductList2")
	public List<ProductDto.NameAndPrice> getProductList2(@RequestParam String category){
		return productService.getProductList2(category);
	}
	
	@GetMapping("getProductList3")
	public List<ProductEntity> getProductList3(){
		return productService.getAll();
	}
}
