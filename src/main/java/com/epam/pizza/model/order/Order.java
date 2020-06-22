package com.epam.pizza.model.order;

import com.epam.pizza.model.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> products;
    private String name;
    private String phoneNumber;
    private String address;
    private int amountOfPizza;
    private int amountOfDrink;
    private PayMethod payMethod;

    public Order(String name, String phoneNumber, String address, PayMethod payMethod) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.payMethod = payMethod;
        amountOfDrink = 0;
        amountOfPizza = 0;
        products = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPayMethod(PayMethod payMethod) {
        this.payMethod = payMethod;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public PayMethod getPayMethod() {
        return payMethod;
    }

}
