package com.example.demo.repository;

import com.example.demo.model.entity.Drink;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends CrudRepository<Drink, Long> {



    @Query(value = "SELECT AVG(d.name) FROM tb_drink r WHERE d.drink_id = :drinkId", nativeQuery = true)
    String getByName(String name);



}
