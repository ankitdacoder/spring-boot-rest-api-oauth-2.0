package com.fakeorder.foodorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fakeorder.foodorder.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
