package com.jellyfish.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jellyfish.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}
