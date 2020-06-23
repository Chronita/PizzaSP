package com.epam.pizza.model.products;

public class Beverage extends Product {  //класс-наследник класса Product
private int size;

    public Beverage(String name, int price, int size) {
        super(name, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
