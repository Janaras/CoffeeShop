package com.example.demo.service.impl;

import com.example.demo.exception.EmptyListException;
import com.example.demo.exception.NotFoundException;
import com.example.demo.mapper.DrinkMapper;
import com.example.demo.mapper.IngredientMapper;
import com.example.demo.model.dto.DrinkDto;
import com.example.demo.model.entity.Drink;
import com.example.demo.model.request.DrinkCreateRequest;
import com.example.demo.repository.DrinkRepository;
import com.example.demo.service.DrinkService;
import com.example.demo.utils.Language;
import com.example.demo.utils.ResourseBundleLanguage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import static java.time.chrono.HijrahChronology.INSTANCE;


@Service
@RequiredArgsConstructor

public class DrinkServiceImpl implements DrinkService {

    private  final DrinkRepository repository;
    @Override
    public List<DrinkDto> getAll() {
        List<Drink> drinkList = (List<Drink>) repository.findAll();
        if (drinkList.isEmpty()) {
            throw new EmptyListException("Restaurant list is empty");
        }
        return DrinkMapper.INSTANCE.toDtos(drinkList);

    }


    @Override
    public DrinkDto getById(Long id, int languageOrdinal) {
        Language language = Language.getLanguage(languageOrdinal);

        return DrinkMapper.INSTANCE.toDto(repository.findById(id)
                .orElseThrow(()
                        -> new NotFoundException(ResourseBundleLanguage.periodMessage(language, "entityNotFound"))));
    }
    @Override
    public DrinkDto save(DrinkCreateRequest request) {
        Drink entity = Drink.builder()
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .name(request.getName())
                .price(request.getPrice())
                .size(request.getSize())
                .ingredients(IngredientMapper.INSTANCE.toEntity(request.getIngredientDto()))
                .build();



        return DrinkMapper.INSTANCE.toDto(repository.save(entity));
    }

    @Override
    public DrinkDto getByType(Long drinkTypeId) {
        return null;
    }

    @Override
    public List<DrinkDto> filter(Long drinkTypeId, int priceFrom, int priceTo) {
        return null;
    }

    @Override
    public List<DrinkDto> filter(Long drinkTypeId, int priceFrom) {
        return null;
    }

    @Override
    public List<DrinkDto> filter(Long drinkTypeId) {
        return null;
    }

    @Override
    public List<DrinkDto> filter() {
        return null;
    }

    @Override
    public List<DrinkDto> filter(int priceFrom, int priceTo) {
        return null;
    }



    @Override
    public DrinkDto getByName(String name, int languageOrdinal) {
        Language language = Language.getLanguage(languageOrdinal);

        return DrinkMapper.INSTANCE.toDto(repository.findById(Long.valueOf(name))
                .orElseThrow(()
                        -> new NotFoundException(ResourseBundleLanguage.periodMessage(language, "entityNotFound"))));
    }
}

