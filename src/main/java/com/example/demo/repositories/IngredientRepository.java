package com.example.demo.repositories;
import java.util.List;
import java.util.Optional;
import com.example.demo.domain.Ingredient;


public interface IngredientRepository {
    List<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
