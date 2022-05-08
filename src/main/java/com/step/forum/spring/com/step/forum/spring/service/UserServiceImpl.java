package com.step.forum.spring.com.step.forum.spring.service;

import com.step.forum.spring.com.step.forum.spring.model.User;
import com.step.forum.spring.com.step.forum.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
}
