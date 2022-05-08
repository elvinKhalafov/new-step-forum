package com.step.forum.spring.com.step.forum.spring.controller;

import com.step.forum.spring.com.step.forum.spring.model.Topic;
import com.step.forum.spring.com.step.forum.spring.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics/popular")
    @ResponseBody
    public List<Topic> getPopularTopics(){
        return topicService.getAllTopic();
    }

}
