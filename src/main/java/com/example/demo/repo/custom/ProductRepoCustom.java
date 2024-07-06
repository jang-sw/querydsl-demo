package com.example.demo.repo.custom;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.ProductEntity;

@Repository
public interface ProductRepoCustom {

	List<ProductEntity> findListByCategory(String category);

	List<ProductDto.NameAndPrice> findNameAndPriceById(String category);
}
