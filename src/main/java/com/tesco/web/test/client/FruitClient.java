package com.tesco.web.test.client;

import com.tesco.web.test.client.dto.FruitIdResponse;
import com.tesco.web.test.client.dto.FruitPriceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "FruitApi", url = "http://localhost:8989/fruits")
public interface FruitClient {
    @RequestMapping(method = RequestMethod.GET, value = "/{id}/price", produces = "application/json")
    ResponseEntity<FruitPriceResponse> getPrice(@PathVariable("id") String id);

    @RequestMapping(method = RequestMethod.GET, value = "/{name}", produces = "application/json")
    ResponseEntity<FruitIdResponse> getFruitId(@PathVariable("name") String name);

}
