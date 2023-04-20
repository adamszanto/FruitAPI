package com.tesco.web.test.client;

import com.tesco.web.test.client.dto.ShopStockResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "StockApi", url = "http://localhost:8989/stock")
public interface StockClient {
    @RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = "application/json")
    ResponseEntity<List<ShopStockResponse>> getFruitAvailability(@PathVariable("id") String id);
}
