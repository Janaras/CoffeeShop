package com.example.demo.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@ToString
public class DrinkDto {
    Long id;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;
    DrinkTypeDto drinkType;
    String name;
    int price;
    IngredientDto ingredientDto;
    int size;
}
