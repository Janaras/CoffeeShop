package com.example.demo.mapper;

import com.example.demo.model.dto.DrinkTypeDto;
import com.example.demo.model.entity.DrinkType;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface DrinkTypeMapper extends BaseMapper<DrinkTypeDto, DrinkType> {

    DrinkTypeMapper INSTANCE = Mappers.getMapper(DrinkTypeMapper.class);

}
