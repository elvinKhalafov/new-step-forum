package com.step.forum.spring.com.step.forum.spring.service;


import com.step.forum.spring.com.step.forum.spring.model.Topic;
import com.step.forum.spring.com.step.forum.spring.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    private TopicRepository topicRepository;

    @Autowired
    public TopicServiceImpl(TopicRepository topicRepository){
        this.topicRepository=topicRepository;
    }

    @Override
    public List<Topic> getAllTopic() {
        return topicRepository.findAll();
    }

    @Override
    public Topic getTopicById(Integer id) {
        return topicRepository.findById(id).get();
    }

}
