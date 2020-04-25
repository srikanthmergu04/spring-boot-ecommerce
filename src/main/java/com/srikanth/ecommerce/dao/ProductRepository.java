package com.srikanth.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.srikanth.ecommerce.entity.Product;

@CrossOrigin
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
