package com.kodilla.good.patterns.challenges;

public class Order {

    private final User user;
    private final String productName;
    private final int quantity;
    private final boolean isOrdered;

    public Order(User user, String productName, int quantity, boolean isOrdered) {
        this.user = user;
        this.productName = productName;
        this.quantity = quantity;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
