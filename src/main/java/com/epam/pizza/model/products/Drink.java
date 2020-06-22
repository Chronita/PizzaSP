package com.epam.pizza.model.products;

public class Drink extends Product {

    private int size;

    public Drink(String productName, int productValue, int size) {
        super(productName, productValue);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
