package com.example.demo.domain;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Taco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date createdAt = new Date();
    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;
    @NotNull
    @Size(min=1, message="You must choose at least 1 ingredient")
    @ManyToMany
    @JoinTable(name="taco_ingredients", joinColumns = @JoinColumn(name="taco_id"),
    inverseJoinColumns = @JoinColumn(name="ingredient_id"))
    private List<Ingredient> ingredients = new ArrayList<>();
}
