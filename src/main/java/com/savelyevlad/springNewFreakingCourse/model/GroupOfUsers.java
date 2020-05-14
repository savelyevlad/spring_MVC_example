package com.savelyevlad.springNewFreakingCourse.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class GroupOfUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public GroupOfUsers(String name) {
        this.name = name;
    }
}
