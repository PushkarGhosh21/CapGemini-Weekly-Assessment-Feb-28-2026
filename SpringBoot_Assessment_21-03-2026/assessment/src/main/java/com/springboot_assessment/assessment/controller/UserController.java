package com.springboot_assessment.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot_assessment.assessment.model.User;
import com.springboot_assessment.assessment.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/auth")
    public String authPage(Model model) {
        model.addAttribute("user", new User());
        return "auth-page";
    }

    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute User user) {
        if (userService.existsByEmail(user.getEmail())) {
            return "redirect:/auth?alreadyExists";
        }
        userService.save(user);
        return "redirect:/auth?success";
    }

    @PostMapping("/signin")
    public String signin(@ModelAttribute User user) {
        String result = userService.authenticate(user.getEmail(), user.getPassword());

        if (result.equals("SUCCESS")) {
            return "redirect:/dashboard";
        } else if (result.equals("NOT_FOUND")) {
            return "redirect:/auth?notfound";
        } else {
            // WRONG_PASSWORD
            return "redirect:/auth?error";
        }
    }
}