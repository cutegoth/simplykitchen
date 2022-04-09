package com.kis.simplykitchen.repositories;

import com.kis.simplykitchen.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
    void deleteById(Integer id);
}
