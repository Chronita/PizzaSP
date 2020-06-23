package com.epam.pizza.model.products;

import java.util.Objects;

public class Beverage extends Product {  //класс-наследник класса Product
private int size;

    public Beverage(String name, int price, int size) {
        super(name, price);
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
        Beverage beverage = (Beverage) o;
        return size == beverage.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }
}
