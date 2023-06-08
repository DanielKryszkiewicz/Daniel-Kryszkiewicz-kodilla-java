package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements FoodShop {
    @Override
    public boolean process(String product, int quantity) {
        System.out.println("Processing order in ExtraFoodShop for " + quantity + " units of " + product);
        System.out.println("ExtraFoodShop: Applying standard packaging for the product.");
        System.out.println("ExtraFoodShop: Order processed successfully");
        return true;
    }
}
