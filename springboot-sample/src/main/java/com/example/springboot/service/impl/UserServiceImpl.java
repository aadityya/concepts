package com.example.springboot.service.impl;

import com.example.springboot.dao.UserRepo;
import com.example.springboot.dto.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public void saveUser(User userVO) {
        com.example.springboot.entity.User user = new com.example.springboot.entity.User();
        user.setName(userVO.getName());

        userRepo.save(user);
    }
}
