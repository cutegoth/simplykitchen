package com.kis.simplykitchen.services;

import com.kis.simplykitchen.dto.SaveRecipeRequest;
import com.kis.simplykitchen.models.*;
import com.kis.simplykitchen.repositories.*;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;
    private final IngredientsRepository ingredientsRepository;
    private final RecipeHasIngredsRepository recipeHasIngredsRepository;
    private final DishesRepository dishesRepository;
    private final TagsRepository tagsRepository;

    public RecipeService(RecipeRepository recipeRepository, IngredientsRepository ingredientsRepository, RecipeHasIngredsRepository recipeHasIngredsRepository, DishesRepository dishesRepository, TagsRepository tagsRepository) {
        this.recipeRepository = recipeRepository;
        this.ingredientsRepository = ingredientsRepository;
        this.recipeHasIngredsRepository = recipeHasIngredsRepository;
        this.dishesRepository = dishesRepository;
        this.tagsRepository = tagsRepository;
    }

    public List<Dishes> getAllDishes() {
        return dishesRepository.findAll();
    }

    public List<Recipe> getByDish(int id) {
        return recipeRepository.findByDishesDishId(id);
    }
    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    public List<Ingredients> getByRecipe(Set<Recipe> recipes) {
        return ingredientsRepository.findAllByRecipesIn(Collections.singleton(recipes));
    }

    public List<RecipeHasIngredient> getAllIngreds() {
        return recipeHasIngredsRepository.findAll();
    }

    public List<RecipeHasIngredient> getIngredsByRecipe(Recipe recipe) {
        return recipeHasIngredsRepository.findByRecipe(recipe);
    }

    public List<Ingredients> getAllIngredients() {
        return ingredientsRepository.findAll();
    }

    public List<Tags> getAllTags() {
        return tagsRepository.findAll();
    }


    public Recipe save(SaveRecipeRequest recipeRequest) {
        Recipe recipe = new Recipe();
        recipe.setRecipeName(recipeRequest.getName());
        recipe.setRecipeText(recipeRequest.getText());
        recipe.setRecipeImg("");
        Integer dishId = recipeRequest.getDish();
        Dishes dish = dishesRepository.getById(dishId);
        recipe.setDishes(dish);
        recipe.setTags(recipeRequest.getTags());

        return recipeRepository.save(recipe);
    }

    public Recipe update(Recipe recipe) {
        recipe.setRecipeName(recipe.getRecipeName());
        recipe.setRecipeText(recipe.getRecipeText());
        recipe.setRecipeImg("");
        recipe.setTags(recipe.getTags());
        recipe.setDishes(recipe.getDishes());
        recipe.setIngredients(recipe.getIngredients());
        return recipeRepository.save(recipe);
    }
    public Recipe find(int id) {
        Optional<Recipe> recipe = recipeRepository.findById(id);
        return recipe.get();
    }
    public Integer delete(int id) {
        Recipe recipe = find(id);
        recipeRepository.delete(recipe);
        return id;
    }


}
