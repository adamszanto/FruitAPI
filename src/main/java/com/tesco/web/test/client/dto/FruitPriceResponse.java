package com.tesco.web.test.client.dto;

import java.util.Objects;

public class FruitPriceResponse {
    private String id;
    private String currency;
    private String price;

    public FruitPriceResponse(String id, String currency, String price) {
        this.id = id;
        this.currency = currency;
        this.price = price;
    }

    public FruitPriceResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FruitPriceResponse that = (FruitPriceResponse) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(currency, that.currency)) return false;
        return Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FruitPriceResponse{" +
                "id='" + id + '\'' +
                ", currency='" + currency + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
