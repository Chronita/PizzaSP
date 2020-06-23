package com.epam.pizza.model.products;

import java.util.List;
import java.util.Objects;

public class Pizza extends Product {
    private String pizza_type;
    private String nutrition_value;
    private int calories;
    private List<Ingredients> ingredients;

    public Pizza(String name, int price, String pizza_type, String nutrition_value, int calories, List<Ingredients> ingredients) {
        super(name, price);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pizza pizza = (Pizza) o;
        return calories == pizza.calories &&
                pizza_type.equals(pizza.pizza_type) &&
                nutrition_value.equals(pizza.nutrition_value) &&
                ingredients.equals(pizza.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pizza_type, nutrition_value, calories, ingredients);
    }
}
