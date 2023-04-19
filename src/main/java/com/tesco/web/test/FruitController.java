package com.tesco.web.test;

import com.tesco.web.test.AggregatedFruitResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController {
    @GetMapping("/fruits/{name}")
    public AggregatedFruitResponse getFruitInfo(@PathVariable("name") String name) {
        //TODO: implement
        return null;
    }
}
