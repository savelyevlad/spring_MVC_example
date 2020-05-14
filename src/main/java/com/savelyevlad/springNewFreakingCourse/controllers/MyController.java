package com.savelyevlad.springNewFreakingCourse.controllers;

import com.savelyevlad.springNewFreakingCourse.repositories.GroupRepository;
import com.savelyevlad.springNewFreakingCourse.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    private UserRepository userRepository;
    private GroupRepository groupRepository;

    @GetMapping(path = "/users")
    public String getUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "users.html";
    }

    @GetMapping(path = "groups")
    public String getGroups(Model model) {
        model.addAttribute("groups", groupRepository.findAll());
        return "mygroups.html";
    }

    public MyController(UserRepository userRepository, GroupRepository groupRepository) {
        this.userRepository = userRepository;
        this.groupRepository = groupRepository;
    }
}
