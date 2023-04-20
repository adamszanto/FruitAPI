package com.tesco.web.test.controller.dto;

import java.util.List;
import java.util.Objects;

public class AggregatedFruitResponse {
    private String id;
    private String name;
    private String currency;
    private Double price;
    private List<String> availableAt;

    public AggregatedFruitResponse(String id, String name, String currency, Double price, List<String> availableAt) {
        this.id = id;
        this.name = name;
        this.currency = currency;
        this.price = price;
        this.availableAt = availableAt;
    }

    public AggregatedFruitResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<String> getAvailableAt() {
        return availableAt;
    }

    public void setAvailableAt(List<String> availableAt) {
        this.availableAt = availableAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AggregatedFruitResponse that = (AggregatedFruitResponse) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(currency, that.currency)) return false;
        if (!Objects.equals(price, that.price)) return false;
        return Objects.equals(availableAt, that.availableAt);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (availableAt != null ? availableAt.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AggregatedFruitResponse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", currency='" + currency + '\'' +
                ", price=" + price +
                ", availableAt=" + availableAt +
                '}';
    }
}
