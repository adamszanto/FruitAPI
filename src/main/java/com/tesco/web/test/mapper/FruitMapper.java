package com.tesco.web.test.mapper;

import com.tesco.web.test.controller.dto.AggregatedFruitResponse;
import com.tesco.web.test.service.model.Currency;
import com.tesco.web.test.service.model.Fruit;
import org.springframework.stereotype.Component;

@Component
public class FruitMapper {

    //TODO: kell egy mapper ami Fruitból > AggregateFruitResponse-t csinál (modelből dto-t)

    public AggregatedFruitResponse convertFruitToAggregateFruitResponse(Fruit fruit) {
        AggregatedFruitResponse response = new AggregatedFruitResponse();
        response.setId(fruit.getId());
        response.setName(fruit.getName());
        response.setCurrency(fruit.getCurrency().name());
        response.setPrice(fruit.getPrice());

        return response;
    }
}
