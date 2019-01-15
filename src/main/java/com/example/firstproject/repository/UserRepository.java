package com.example.firstproject.repository;

import com.example.firstproject.models.User ;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User , Integer> {
}
