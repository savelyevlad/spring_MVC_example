package com.savelyevlad.springNewFreakingCourse.bootstrap;

import com.savelyevlad.springNewFreakingCourse.repositories.GroupRepository;
import com.savelyevlad.springNewFreakingCourse.repositories.UserRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private UserRepository userRepository;
    private GroupRepository groupRepository;

    public DevBootstrap(UserRepository userRepository, GroupRepository groupRepository) {
        this.userRepository = userRepository;
        this.groupRepository = groupRepository;
    }

    private void initData() {

//        GroupOfUsers groupOfUsers = new GroupOfUsers("kek");

//        User user = new User("kakashek", groupOfUsers);
//        User user2 = new User("vor", groupOfUsers);
//
//        groupRepository.save(groupOfUsers);
//        userRepository.save(user);
//        userRepository.save(user2);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
