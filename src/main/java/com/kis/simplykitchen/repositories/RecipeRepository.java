package com.kis.simplykitchen.repositories;

import com.kis.simplykitchen.models.Ingredients;
import com.kis.simplykitchen.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    List<Recipe> findByDishesDishId(int id);

}
