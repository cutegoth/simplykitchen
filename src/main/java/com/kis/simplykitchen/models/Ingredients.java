package com.kis.simplykitchen.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ingredients", schema = "simplykitchen")
public class Ingredients {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ingred_id")
    private int ingredId;

    @Column(name = "ingred_name")
    private String ingredName;

    @ManyToMany(mappedBy = "ingredients")
    private Set<Recipe> recipes;

}
