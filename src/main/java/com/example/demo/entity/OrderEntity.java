package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_order")
@Data
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;

	@ManyToOne(fetch = FetchType.LAZY)
	private UserEntity user;

	@ManyToOne(fetch = FetchType.LAZY)
  	private ProductEntity product;
}
