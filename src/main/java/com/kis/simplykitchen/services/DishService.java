package com.kis.simplykitchen.services;

import com.kis.simplykitchen.models.Dishes;
import com.kis.simplykitchen.models.DishesCategories;
import com.kis.simplykitchen.repositories.DishesCategoriesRepository;
import com.kis.simplykitchen.repositories.DishesRepository;
import jdk.jfr.Category;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class DishService {

    private final DishesRepository dishesRepository;
    private final DishesCategoriesRepository categoriesRepository;


    public DishService(DishesRepository dishesRepository, DishesCategoriesRepository categoriesRepository) {
        this.dishesRepository = dishesRepository;
        this.categoriesRepository = categoriesRepository;
    }
    public DishesCategories getCategById(int id) {
        return categoriesRepository.getById(id);
    }

    public Dishes getOne(int id) {
        return dishesRepository.getById(id);
    }

    public List<Dishes> getAll() {
        return dishesRepository.findAll();
    }

    public List<DishesCategories> getAllCateg() {
        return categoriesRepository.findAll();
    }

    public void dishesFindAll(Model model) {
        Iterable<Dishes> dishes = dishesRepository.findAll();
        model.addAttribute("dishes", dishes);
    }


    public List<Dishes> getByCategory(Integer id) {
        return dishesRepository.findByDishesCategoriesIdCategory(id);
    }
}
