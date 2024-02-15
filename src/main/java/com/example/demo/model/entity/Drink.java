package com.example.demo.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@ToString
@Entity
@Table( name = "tb_drink")
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "created_date")
    LocalDateTime createdDate;
    @Column(name = "update_date")
    LocalDateTime updatedDate;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "drink_id")
    Set<DrinkType> drinkType;
    String name;
    int price;
    @ManyToMany(fetch = FetchType.EAGER)
    Set<Ingredient> ingredients;
    int size;
}
