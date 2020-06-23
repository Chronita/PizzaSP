package com.epam.pizza.model.order;

import com.epam.pizza.model.products.Pizza;
import com.epam.pizza.model.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> products;
    private String name;
    private String phone_number;
    private String address;
    private int amountOfPizza;
    private int amountOfDrink;
    private Pay_method pay_method;

    public Order(String name, String phone_number, String address, Pay_method pay_method) {
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
        this.pay_method = pay_method;
        amountOfDrink = 0;
        amountOfPizza = 0;
        products = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phone_number = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPayMethod(Pay_method pay_method) {
        this.pay_method = pay_method;
    }

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getAddress() {
        return address;
    }

    public Pay_method getPay_method() {
        return pay_method;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int sum() {
        int sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }
    public boolean addProduct(Product newProduct) {
        if (newProduct instanceof Pizza) {
            if (amountOfPizza < 5) {
                products.add(newProduct);
                amountOfPizza++;
                return true;
            }
        } else {
            if (amountOfDrink < 4) {
                products.add(newProduct);
                amountOfDrink++;
                return true;
            }
        }
        return false;
    }

    public void deleteProduct(Product oldProduct) {
        if (products.remove(oldProduct)) {
            if (oldProduct instanceof Pizza) {
                amountOfPizza--;
            } else {
                amountOfDrink--;
            }
        }
    }

}

