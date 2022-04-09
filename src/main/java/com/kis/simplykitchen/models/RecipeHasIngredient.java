package com.kis.simplykitchen.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "recipe_has_ingredients")
public class RecipeHasIngredient {
    @EmbeddedId
    private RecipeHasIngredientId id;

    @Column(name = "count")
    private Integer count;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "measure_id")
    private Measure measure;

    @ManyToOne
    @MapsId("recipeRecipeId")
    @JoinColumn(name = "recipe_recipe_id")
    @JsonIgnore
    private Recipe recipe;

    @ManyToOne
    @MapsId("ingredientsIngredId")
    @JoinColumn(name = "ingredients_ingred_id")
    @JsonIgnore
    private Ingredients ingredients;
}