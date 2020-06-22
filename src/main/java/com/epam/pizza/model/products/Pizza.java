package com.epam.pizza.model.products;

import java.util.List;
import java.util.Objects;

public class Pizza extends Product{

    private String pizzaType;
    private String nutritionalValue;
    private int ccal;
    private List<Ingredients> ingredients;

    public Pizza(String productName, int productValue, String pizzaType, String nutritionalValue, int ccal, List<Ingredients> ingredients) {
        super(productName, productValue);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pizza pizza = (Pizza) o;
        return ccal == pizza.ccal &&
                pizzaType.equals(pizza.pizzaType) &&
                nutritionalValue.equals(pizza.nutritionalValue) &&
                ingredients.equals(pizza.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pizzaType, nutritionalValue, ccal, ingredients);
    }
}
