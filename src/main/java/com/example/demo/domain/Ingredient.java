package com.example.demo.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
//@RequiredArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force = true)
public class Ingredient {
    @Id
    private String id;
    private String name;
    private Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
