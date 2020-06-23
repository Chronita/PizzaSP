package com.epam.pizza.model.products;

import java.util.List;

public class Pizza {
    private String pizza_type;
    private String nutrition_value;
    private int calories;
    private List<Ingredients> ingredients;

    public Pizza(String pizza_type, String nutrition_value, int calories, List<Ingredients> ingredients) {
        this.pizza_type = pizza_type;
        this.nutrition_value = nutrition_value;
        this.calories = calories;
        this.ingredients = ingredients;
    }

    public String getPizza_type() {
        return pizza_type;
    }

    public String getNutrition_value() {
        return nutrition_value;
    }

    public int getCalories() {
        return calories;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }
}
