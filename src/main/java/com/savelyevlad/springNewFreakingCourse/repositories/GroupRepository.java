package com.savelyevlad.springNewFreakingCourse.repositories;

import com.savelyevlad.springNewFreakingCourse.model.GroupOfUsers;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends CrudRepository<GroupOfUsers, Integer> {
}
