package com.kis.simplykitchen.models;

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
@Table(name = "contacts", schema = "simplykitchen")
public class Contacts {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "contact_id")
    private int contactId;

    @Column(name = "type")
    private String type;

    @Column(name = "value")
    private String value;

    @ManyToOne(optional = false)
    @JoinColumn(name = "users_user_id")
    private Users user;

}