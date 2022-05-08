package com.step.forum.spring.com.step.forum.spring.controller;

import com.step.forum.spring.com.step.forum.spring.model.Topic;
import com.step.forum.spring.com.step.forum.spring.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/main")
    public String index(Model model) {
        List<Topic> list = topicService.getAllTopic();
        System.out.println("LIST: " + list);
        model.addAttribute("topicList", list);
        return "view/index";
    }
}
