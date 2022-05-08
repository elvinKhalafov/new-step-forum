package com.step.forum.spring.com.step.forum.spring.service;


import com.step.forum.spring.com.step.forum.spring.model.Topic;

import java.util.List;

public interface TopicService {
    List<Topic> getAllTopic();

    Topic getTopicById(Integer id);
}
