package com.jellyfish.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jellyfish.course.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
