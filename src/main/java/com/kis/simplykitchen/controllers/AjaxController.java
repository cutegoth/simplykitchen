package com.kis.simplykitchen.controllers;

import com.kis.simplykitchen.models.Dishes;
import com.kis.simplykitchen.services.DishService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AjaxController {
    private final DishService dishService;

    public AjaxController(DishService dishService) {
        this.dishService = dishService;
    }


}