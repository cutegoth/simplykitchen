package com.kis.simplykitchen.repositories;

import com.kis.simplykitchen.models.Ingredients;
import com.kis.simplykitchen.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface IngredientsRepository extends JpaRepository<Ingredients, Integer> {
    List<Ingredients> findAllByRecipesIn(Collection<Set<Recipe>> recipes);
}
