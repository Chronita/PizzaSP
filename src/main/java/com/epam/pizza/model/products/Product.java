package com.epam.pizza.model.products;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productValue == product.productValue &&
                productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productValue);
    }
}
