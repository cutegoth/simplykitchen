package com.kis.simplykitchen.services;

import com.kis.simplykitchen.models.Users;
import com.kis.simplykitchen.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.List;

@Service
public class AdminService {
    private final UserRepository usersRepository;

    public AdminService(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void delUser(Integer id) {
        usersRepository.deleteById(id);
    }

    public List<Users> getAll(){
       return usersRepository.findAll();
    }
}