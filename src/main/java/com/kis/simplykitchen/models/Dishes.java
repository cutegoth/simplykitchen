package com.kis.simplykitchen.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dishes", schema = "simplykitchen")
public class Dishes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "dish_id")
    private int dishId;

    @Column(name = "dish_name")
    private String dishName;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "dish_descr")
    private String dishDescr;

    @Column(name = "dish_img")
    private String dishImg;

    @ManyToOne(optional = false)
    @JoinColumn(name = "dishes_categories_id_category")
    @JsonIgnore
    private DishesCategories dishesCategories;
}
