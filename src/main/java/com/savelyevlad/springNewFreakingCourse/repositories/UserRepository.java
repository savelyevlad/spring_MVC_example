package com.savelyevlad.springNewFreakingCourse.repositories;

import com.savelyevlad.springNewFreakingCourse.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
