package com.tesco.web.test.client.dto;

import java.util.Objects;

public class FruitIdResponse {
    private String id;

    public FruitIdResponse(String id) {
        this.id = id;
    }

    public FruitIdResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FruitIdResponse that = (FruitIdResponse) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "FruitIdResponse{" +
                "id='" + id + '\'' +
                '}';
    }
}
