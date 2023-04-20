package com.tesco.web.test.client.dto;

public class ShopStockResponse {
    private String id;
    private long stock;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }
}
