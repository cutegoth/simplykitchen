package com.kis.simplykitchen.controllers;

import com.kis.simplykitchen.models.Users;
import com.kis.simplykitchen.services.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Controller
public class UsersController {
    private final AdminService adminService;

    public UsersController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/subscribes")
    public String subs(Model model) {

        model.addAttribute("users", adminService.getAll());
        return "users";
    }

    @PostMapping("/subscribes/delete/{id}")
    public String delete(@PathVariable String id) {
        adminService.delUser(Integer.valueOf(id));
        return "redirect:/subscribes";
    }


}
