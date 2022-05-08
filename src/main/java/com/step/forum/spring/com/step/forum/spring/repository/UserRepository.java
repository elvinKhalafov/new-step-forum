package com.step.forum.spring.com.step.forum.spring.repository;


import com.step.forum.spring.com.step.forum.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
