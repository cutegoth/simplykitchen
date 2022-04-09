package com.kis.simplykitchen.repositories;

import com.kis.simplykitchen.models.DishesCategories;
import com.kis.simplykitchen.models.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DishesCategoriesRepository extends JpaRepository<DishesCategories, Integer> {

}
