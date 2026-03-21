package com.springboot_assessment.assessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot_assessment.assessment.model.User;
import com.springboot_assessment.assessment.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public boolean existsByEmail(String email) {
        return userRepo.findByEmail(email) != null;
    }

    public void save(User user) {
        userRepo.save(user);
    }

    // UPDATED METHOD
    public String authenticate(String email, String password) {
        User user = userRepo.findByEmail(email);

        if (user == null) {
            return "NOT_FOUND";
        }

        if (!user.getPassword().equals(password)) {
            return "WRONG_PASSWORD";
        }

        return "SUCCESS";
    }
}