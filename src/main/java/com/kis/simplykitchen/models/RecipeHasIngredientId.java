package com.kis.simplykitchen.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter

@Embeddable
public class RecipeHasIngredientId implements Serializable {
    private static final long serialVersionUID = 5277838457229420693L;
    @Column(name = "recipe_recipe_id", nullable = false)
    private Integer recipeRecipeId;
    @Column(name = "ingredients_ingred_id", nullable = false)
    private Integer ingredientsIngredId;

    @Override
    public int hashCode() {
        return Objects.hash(ingredientsIngredId, recipeRecipeId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RecipeHasIngredientId entity = (RecipeHasIngredientId) o;
        return Objects.equals(this.ingredientsIngredId, entity.ingredientsIngredId) &&
                Objects.equals(this.recipeRecipeId, entity.recipeRecipeId);
    }
}