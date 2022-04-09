package com.kis.simplykitchen.repositories;

import com.kis.simplykitchen.models.Ingredients;
import com.kis.simplykitchen.models.Recipe;
import com.kis.simplykitchen.models.RecipeHasIngredient;
import com.kis.simplykitchen.models.RecipeHasIngredientId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeHasIngredsRepository extends JpaRepository<RecipeHasIngredient, RecipeHasIngredientId> {
    List<RecipeHasIngredient> findByRecipe(Recipe recipe);
}
