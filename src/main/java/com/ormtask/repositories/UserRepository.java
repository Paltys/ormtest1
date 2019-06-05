package com.ormtask.repositories;

import com.ormtask.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository <User,Integer> {
    User findByName_users(String login){

    }

}
