package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.OrderRepo;

@Service
public class OrderService {

	@Autowired OrderRepo orderRepo;
	
}
 