package com.kis.simplykitchen.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "advice", schema = "simplykitchen")
public class Advice {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "advice_id")
    private int adviceId;

    @Column(name = "advice_name")
    private String adviceName;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "advice_text")
    private String adviceText;

    @Column(name = "advice_img")
    private String adviceImg;

    @ManyToOne(optional = false)
    @JoinColumn(name = "categories_id_category")
    private AdviceCategories adviceCategories;

}

