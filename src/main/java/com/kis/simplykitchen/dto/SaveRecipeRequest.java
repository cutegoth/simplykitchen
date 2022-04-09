package com.kis.simplykitchen.dto;

import com.kis.simplykitchen.models.Ingredients;
import com.kis.simplykitchen.models.Tags;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
public class SaveRecipeRequest {
    private String name;
    private String text;
    private Set<Tags> tags;
    private Integer dish;
    private Set<Ingredients> ingredients;
}
