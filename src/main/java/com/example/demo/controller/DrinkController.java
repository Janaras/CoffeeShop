package com.example.demo.controller;

import com.example.demo.service.DrinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/drink")
@RequiredArgsConstructor
public class DrinkController {

    private final DrinkService service;

    @GetMapping
    public ResponseEntity<?> getByName(@RequestHeader int lang, @RequestParam String name) {
        return ResponseEntity.ok(service.getByName(name,lang));
    }

    @GetMapping
    public ResponseEntity<?> getByType(@RequestParam Long id) {
        return ResponseEntity.ok(service.getByType(id));
    }

    @GetMapping
    public ResponseEntity<?> filter(@RequestParam Long drinkTypeId, int priceFrom, int priceTo) {
        return ResponseEntity.ok(service.filter(drinkTypeId,priceFrom,priceTo));
    }


}
