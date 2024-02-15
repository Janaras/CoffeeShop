package com.example.demo.model.request;

import com.example.demo.model.dto.DrinkDto;
import com.example.demo.model.dto.IngredientDto;
import com.example.demo.model.entity.DrinkType;
import com.example.demo.model.entity.Ingredient;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DrinkCreateRequest {

    DrinkType drinkType;
    String name;
    int price;
    IngredientDto ingredientDto;
    int size;
}