package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args) {

        ShopOrderService shopOrderService1 = new ShopOrderService(new GlutenFreeShop());
        shopOrderService1.order("GlutenFree Bread", 5);

        ShopOrderService shopOrderService2 = new ShopOrderService(new HealthyShop());
        shopOrderService2.order("Salad", 1);

        ShopOrderService shopOrderService3 = new ShopOrderService(new ExtraFoodShop());
        shopOrderService3.order("Vanilla Ice Cream", 2);

    }
}
