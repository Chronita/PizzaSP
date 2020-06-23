package com.epam.pizza.model.products;

public abstract class Product {
    protected String name;
    protected int price;

    Product(String name, int price) { //доступ внутри пакета Product
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
