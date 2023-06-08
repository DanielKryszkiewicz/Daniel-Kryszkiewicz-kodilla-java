package com.kodilla.good.patterns.challenges;

public class OrderProductService implements ProductService {
    @Override
    public boolean order(final Order order) {
        System.out.println(order.getUser().getName() + " ordered " + order.getProductName() + " quantity: " + order.getQuantity());
        return true;
    }
}
