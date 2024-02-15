package com.example.demo.mapper;

import com.example.demo.model.dto.DrinkDto;
import com.example.demo.model.entity.Drink;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DrinkMapper extends BaseMapper<DrinkDto, Drink> {

    DrinkMapper INSTANCE = Mappers.getMapper(DrinkMapper.class);

}
