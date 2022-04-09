package com.kis.simplykitchen.repositories;

import com.kis.simplykitchen.models.Dishes;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DishesRepository extends JpaRepository<Dishes, Integer> {
    List<Dishes> findByDishesCategoriesIdCategory(Integer id);

}
