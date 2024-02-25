package com.jellyfish.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jellyfish.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
