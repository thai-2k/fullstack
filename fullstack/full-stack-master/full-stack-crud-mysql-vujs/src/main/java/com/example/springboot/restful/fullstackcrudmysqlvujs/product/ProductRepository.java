package com.example.springboot.restful.fullstackcrudmysqlvujs.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
