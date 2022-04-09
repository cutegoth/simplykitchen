package com.kis.simplykitchen.controllers;

import com.kis.simplykitchen.dto.SaveRecipeRequest;
import com.kis.simplykitchen.models.*;
import com.kis.simplykitchen.services.DishService;
import com.kis.simplykitchen.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class RecipeController {
    @Autowired
    private final RecipeService recipeService;
    @Autowired
    private final DishService dishService;

    public RecipeController(RecipeService recipeService, DishService dishService1) {
        this.recipeService = recipeService;
        this.dishService = dishService1;
    }
    @GetMapping("/recipeview")
    public String recipes(Model model) {
        model.addAttribute("recipes", recipeService.getAll());
        return "recipe-view";
    }

    @GetMapping("/recipeview/add")
    public String addRecipe(Model model) {
        SaveRecipeRequest recipeRequest = new SaveRecipeRequest();
        recipeRequest.setTags(new HashSet<>());
        List<Tags> tags = recipeService.getAllTags();
        model.addAttribute("tags", tags);
        model.addAttribute("recipe", recipeRequest);
        model.addAttribute("dishes", recipeService.getAllDishes());
        return "recipe-add";
    }

    @PostMapping("/recipeview/add")
    public String postRecipe(@ModelAttribute SaveRecipeRequest request, Model model) {
        recipeService.save(request);
        return "redirect : /recipeview";
    }
    @GetMapping("/recipeview/edit/{id}")
    public String recipeEdit(@PathVariable("id") String id, Model model) {
            Recipe recipe = recipeService.find(Integer.parseInt(id));
            List<Tags> tags = recipeService.getAllTags();
            model.addAttribute("tags", tags);
            model.addAttribute("recipes", recipe);
            model.addAttribute("dishes", recipeService.getAllDishes());
//            model.addAttribute("ingredients", ingredients);
            return "recipe-edit";
    }

    @DeleteMapping("/recipeview/delete/{id}")
    public String delete(@PathVariable String id) {
        recipeService.delete(Integer.parseInt(id));
        return "deleteSuccess";
    }
}
