package com.kodilla.good.patterns.food2door;

public class HealthyShop implements FoodShop {
    @Override
    public boolean process(String product, int quantity) {
        System.out.println("Processing order in HealthyShop for " + quantity + " units of " + product);
        System.out.println("Ensuring products are organic and applying eco-friendly packaging.");
        System.out.println("Order processed successfully");
        return true;
    }
}
