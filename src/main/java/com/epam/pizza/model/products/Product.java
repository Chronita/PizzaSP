package com.epam.pizza.model.products;

public abstract class Product {

    protected String productName;
    protected int productValue;

    Product(String productName, int productValue) {
        this.productName = productName;
        this.productValue = productValue;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductValue() {
        return productValue;
    }
}
