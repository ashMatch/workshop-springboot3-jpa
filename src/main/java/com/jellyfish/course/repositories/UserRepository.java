package com.jellyfish.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jellyfish.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
