package com.tesco.web.test.service.model;

import java.util.List;
import java.util.Objects;

public class Fruit {
        private String id;
        private String name;
        private Currency currency;
        private Double price;
        private List<String> availableAt;

        public Fruit(String id, String name, Currency currency, Double price, List<String> availableAt) {
                this.id = id;
                this.name = name;
                this.currency = currency;
                this.price = price;
                this.availableAt = availableAt;
        }

        public Fruit() {
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

        public Currency getCurrency() {
                return currency;
        }

        public void setCurrency(Currency currency) {
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

                Fruit fruit = (Fruit) o;

                if (!Objects.equals(id, fruit.id)) return false;
                if (!Objects.equals(name, fruit.name)) return false;
                if (currency != fruit.currency) return false;
                if (!Objects.equals(price, fruit.price)) return false;
                return Objects.equals(availableAt, fruit.availableAt);
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
                return "Fruit{" +
                        "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", currency=" + currency +
                        ", price=" + price +
                        ", availableAt=" + availableAt +
                        '}';
        }
}
