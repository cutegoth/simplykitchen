package com.kis.simplykitchen.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dishes_categories", schema = "simplykitchen")
public class DishesCategories {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_category")
    private int idCategory;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "img")
    private String img;

    @ManyToMany(mappedBy = "dishesCategories")
    private Set<Users> users;
}
