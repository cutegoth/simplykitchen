package com.kis.simplykitchen.models;

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
@Table(name = "advice_categories", schema = "simplykitchen")
public class AdviceCategories {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_category")
    private int idCategory;

    @Column(name = "category_name")
    private String categoryName;

    @ManyToMany(mappedBy = "adviceCategories")
    private Set<Users> users;

}
