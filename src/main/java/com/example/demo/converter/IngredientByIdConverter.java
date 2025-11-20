package com.example.demo.converter;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.repositories.IngredientRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.Ingredient;
import com.example.demo.domain.Ingredient.Type;

@Component
public class IngredientByIdConverter implements Converter<String,Ingredient>{

        private IngredientRepository ingredientRepo;

        @Autowired
        public IngredientByIdConverter(IngredientRepository ingredientRepo){
            this.ingredientRepo = ingredientRepo;
        }
        @Override
        public Ingredient convert(String id) {
            return ingredientRepo.findById(id).orElse(null);
        }

}

