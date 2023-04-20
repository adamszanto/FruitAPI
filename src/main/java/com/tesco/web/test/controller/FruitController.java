package com.tesco.web.test.controller;

import com.tesco.web.test.controller.dto.AggregatedFruitResponse;
import com.tesco.web.test.mapper.FruitMapper;
import com.tesco.web.test.service.model.Fruit;
import com.tesco.web.test.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController {
    private final FruitService fruitService;
    private final FruitMapper fruitMapper;

    @Autowired
    public FruitController(FruitService fruitService, FruitMapper fruitMapper) {
        this.fruitService = fruitService;
        this.fruitMapper = fruitMapper;
    }

    @GetMapping("/fruits/{name}")
    public ResponseEntity<AggregatedFruitResponse> getFruitInfo(@PathVariable("name") String name) {
        Fruit fruit = fruitService.aggregate(name);
        AggregatedFruitResponse response = fruitMapper.convertFruitToAggregateFruitResponse(fruit);
        return ResponseEntity.ok().body(response);
    }

}
