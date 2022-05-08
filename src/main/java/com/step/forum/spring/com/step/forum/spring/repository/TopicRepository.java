package com.step.forum.spring.com.step.forum.spring.repository;


import com.step.forum.spring.com.step.forum.spring.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicRepository extends JpaRepository<Topic, Integer> {
    Optional<Topic> findById(Integer id);
}
