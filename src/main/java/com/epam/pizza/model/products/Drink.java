package com.epam.pizza.model.products;

import java.util.Objects;

public class Drink extends Product {

    private int size;

    public Drink(String productName, int productValue, int size) {
        super(productName, productValue);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Drink drink = (Drink) o;
        return size == drink.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }
}
