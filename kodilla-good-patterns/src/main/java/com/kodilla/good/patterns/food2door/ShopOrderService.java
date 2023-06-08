package com.kodilla.good.patterns.food2door;

public class ShopOrderService {

    private FoodShop foodShop;

    public ShopOrderService(FoodShop foodShop) {
        this.foodShop = foodShop;
    }

    public void setFoodProducer(FoodShop foodShop) {
        this.foodShop = foodShop;
    }

    public boolean order(String product, int quantity) {
        return foodShop.process(product, quantity);
    }
}
