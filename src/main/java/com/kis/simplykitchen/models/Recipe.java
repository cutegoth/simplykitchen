package com.kis.simplykitchen.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "recipe", schema = "simplykitchen")
public class Recipe {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "recipe_id")
    private int recipeId;

    @Column(name = "recipe_name")
    private String recipeName;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "recipe_text")
    private String recipeText;

    @Column(name = "recipe_img")
    private String recipeImg;

    @ManyToOne(optional = false)
    @JoinColumn(name = "dishes_dish_id")
    @JsonIgnore
    private Dishes dishes;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "recipe_has_ingredients",
            joinColumns = @JoinColumn(name = "recipe_recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredients_ingred_id")
    )
    private Set<Ingredients> ingredients;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "recipe_has_tags",
            joinColumns = @JoinColumn(name = "recipe_recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "tags_id")
    )
    private Set<Tags> tags;

}
