package com.jellyfish.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jellyfish.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
