package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repo.custom.ProductRepoCustom;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Long>, ProductRepoCustom {


}
