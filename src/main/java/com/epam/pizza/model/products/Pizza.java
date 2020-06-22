package com.epam.pizza.model.products;

import java.util.List;

public class Pizza {

    private String pizzaType;
    private String nutritionalValue;
    private int ccal;
    private List<Ingredients> ingredients;

    public Pizza(String pizzaType, String nutritionalValue, int ccal, List<Ingredients> ingredients) {
        this.pizzaType = pizzaType;
        this.nutritionalValue = nutritionalValue;
        this.ccal = ccal;
        this.ingredients = ingredients;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public String getNutritionalValue() {
        return nutritionalValue;
    }

    public int getCcal() {
        return ccal;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }
}
