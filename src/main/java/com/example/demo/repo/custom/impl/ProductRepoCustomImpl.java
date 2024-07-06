package com.example.demo.repo.custom.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.ProductEntity;
import com.example.demo.entity.QProductEntity;
import com.example.demo.repo.custom.ProductRepoCustom;
import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ProductRepoCustomImpl implements ProductRepoCustom{

	final JPAQueryFactory jpaQueryFactory;
	
	@Override
	public List<ProductEntity> findListByCategory(String category) {
		
		QProductEntity qProductEntity = QProductEntity.productEntity;
		
		return jpaQueryFactory
			.selectFrom(qProductEntity)
			.where(qProductEntity.category.eq(category))
			.orderBy(new OrderSpecifier<>(Order.DESC, qProductEntity.category))
			.orderBy(new OrderSpecifier<>(Order.DESC, qProductEntity.price))
			.fetch();
	}

	@Override
	public List<ProductDto.NameAndPrice> findNameAndPriceById(String category) {
		
		QProductEntity qProductEntity = QProductEntity.productEntity;
		
		
		return jpaQueryFactory
			.select(Projections.bean(ProductDto.NameAndPrice.class, qProductEntity.name, qProductEntity.price))
			.from(qProductEntity)
			.where(qProductEntity.category.eq(category))
			.fetch();
			
	}

}
