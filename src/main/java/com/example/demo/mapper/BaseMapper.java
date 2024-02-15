package com.example.demo.mapper;

import com.example.demo.model.entity.Ingredient;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper
public interface BaseMapper<D, E> {

    Set<Ingredient> toEntity(D d);

    D toDto(E e);

    List<E> toEntities(List<D> dtos);

    List<D> toDtos(List<E> entities);

}
