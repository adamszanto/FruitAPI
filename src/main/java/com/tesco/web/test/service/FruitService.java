package com.tesco.web.test.service;

import com.tesco.web.test.client.FruitClient;
import com.tesco.web.test.client.StockClient;
import com.tesco.web.test.client.dto.FruitIdResponse;
import com.tesco.web.test.client.dto.FruitPriceResponse;
import com.tesco.web.test.client.dto.ShopStockResponse;
import com.tesco.web.test.mapper.FruitMapper;
import com.tesco.web.test.service.model.Currency;
import com.tesco.web.test.service.model.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FruitService {
    private final FruitClient fruitClient;
    private final StockClient stockClient;

    @Autowired
    public FruitService(FruitClient fruitClient, StockClient stockClient) {
        this.fruitClient = fruitClient;
        this.stockClient = stockClient;
    }

    public Fruit aggregate(String fruitName) {
        ResponseEntity<FruitIdResponse> fruitIdResponse = fruitClient.getFruitId(fruitName);
        FruitIdResponse fruitId = fruitIdResponse.getBody();

        ResponseEntity<FruitPriceResponse> fruitPriceResponse = fruitClient.getPrice(fruitId.getId());
        FruitPriceResponse fruitPrice = fruitPriceResponse.getBody();

        ResponseEntity<List<ShopStockResponse>> stockResponse = stockClient.getFruitAvailability(fruitId.getId());
        List<ShopStockResponse> stocks = stockResponse.getBody();

        Fruit fruit = new Fruit();
        fruit.setId(fruitId.getId());
        fruit.setName(fruitName);
        fruit.setCurrency(Currency.valueOf(fruitPrice.getCurrency().toUpperCase()));
        fruit.setAvailableAt(
                stocks.stream().map(
                        ShopStockResponse::getId
                ).collect(Collectors.toList())
        );
        fruit.setPrice(fruit.getPrice());

        return fruit;
    }
}
