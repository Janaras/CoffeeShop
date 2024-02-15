package com.example.demo.service;

import com.example.demo.model.dto.DrinkDto;
import com.example.demo.model.request.DrinkCreateRequest;

import java.util.List;

public interface DrinkService {

    List<DrinkDto> getAll();

    DrinkDto getById(Long id, int languageOrdinal);


    DrinkDto save(DrinkCreateRequest request);

    DrinkDto getByName(String name, int lang);

    DrinkDto getByType(Long drinkTypeId);

    List<DrinkDto> filter(Long drinkTypeId, int priceFrom, int priceTo);
    List<DrinkDto> filter(Long drinkTypeId, int priceFrom);
    List<DrinkDto> filter(Long drinkTypeId);
    List<DrinkDto> filter();
    List<DrinkDto> filter(int priceFrom, int priceTo);








}
