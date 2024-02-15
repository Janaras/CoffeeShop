package com.example.demo.mapper;

import com.example.demo.model.dto.IngredientDto;
import com.example.demo.model.entity.Ingredient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IngredientMapper extends BaseMapper<IngredientDto, Ingredient> {
    IngredientMapper INSTANCE = Mappers.getMapper(IngredientMapper.class);



}
