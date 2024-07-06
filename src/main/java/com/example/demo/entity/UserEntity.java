package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_user")
@Data
public class UserEntity {

	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;

	  @Column(name = "name")
	  private String name;

	  @Column(name = "address")
	  private String address;

	  @Column(name = "email")
	  private String email;
 
	  @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	  private List<OrderEntity> orderEntityList;
}
