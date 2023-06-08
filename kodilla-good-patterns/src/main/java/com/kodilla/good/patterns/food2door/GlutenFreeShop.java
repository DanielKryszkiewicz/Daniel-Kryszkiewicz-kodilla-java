package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements FoodShop {
    @Override
    public boolean process(String product, int quantity) {
        System.out.println("Processing order in GlutenFreeShop for " + quantity + " units of " + product);
        System.out.println("GlutenFreeShop: Verifying gluten-free certification");
        System.out.println("GlutenFreeShop: Order processed successfully");
        return true;
    }
}
