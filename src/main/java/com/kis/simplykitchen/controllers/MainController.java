package com.kis.simplykitchen.controllers;

import com.kis.simplykitchen.models.Ingredients;
import com.kis.simplykitchen.models.Recipe;
import com.kis.simplykitchen.repositories.IngredientsRepository;
import com.kis.simplykitchen.services.DishService;
import com.kis.simplykitchen.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private final DishService dishService;
    private final RecipeService recipeService;
    private final IngredientsRepository ingredientsRepository;

    public MainController(DishService dishService, RecipeService recipeService, IngredientsRepository ingredientsRepository) {
        this.dishService = dishService;
        this.recipeService = recipeService;
        this.ingredientsRepository = ingredientsRepository;
    }

    @GetMapping("/")
    public String home() {
        return "hello";
    }

    @GetMapping("/home")
    public String main(Model model) {
        model.addAttribute("dishesCateg", dishService.getAllCateg());
        model.addAttribute("dishes", dishService.getOne(1));
        return "home";
    }


    @GetMapping("/categ")
    public String getByCateg(Model model, @RequestParam("id") Integer id) {
        model.addAttribute("dishesCateg", dishService.getCategById(id));
        model.addAttribute("dishes", dishService.getByCategory(id));
        return "home :: dishesList";
    }

    @GetMapping("/recipes/{id}")
    public String recipes(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("recipes", recipeService.getByDish(id));
        model.addAttribute("dish", dishService.getOne(id));
        model.addAttribute("ingreds", recipeService.getAllIngredients());
        return "recipes";
    }


}
