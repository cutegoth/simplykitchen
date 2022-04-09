package com.kis.simplykitchen.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users", schema = "simplykitchen")
public class Users implements UserDetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "users_has_dishes_categories",
            joinColumns = @JoinColumn(name = "users_user_id"),
            inverseJoinColumns = @JoinColumn(name = "dishes_categories_id_category")
    )
    private Set<DishesCategories> dishesCategories;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "users_has_advice_categories",
            joinColumns = @JoinColumn(name = "users_user_id"),
            inverseJoinColumns = @JoinColumn(name = "advice_categories_id_category")
    )
    private Set<AdviceCategories> adviceCategories;

    private boolean active;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.LAZY)
    @CollectionTable(name = "users_role", joinColumns = @JoinColumn(name = "users_user_id"), schema = "simplykitchen")
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

}
