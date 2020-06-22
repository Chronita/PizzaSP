package com.epam.pizza.model.order;

import com.epam.pizza.model.products.Pizza;
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

    public List<Product> getProducts() {
        return products;
    }

    public int sum() {
        int sum = 0;
        for (Product product : products) {
            sum += product.getProductValue();
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
            if (oldProduct instanceof  Pizza) {
                amountOfPizza--;
            } else {
                amountOfDrink--;
            }
        }
    }

}
