package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private ProductService productService;

    public OrderProcessor(InformationService informationService, ProductService productService) {
        this.informationService = informationService;
        this.productService = productService;
    }

    public Order process(User user, String product, int quantity, boolean isOrdered) {
        boolean result = productService.order(new Order(user, "Laptop", 2, true));
        informationService.inform(user);
        return new Order(user, product, quantity, isOrdered);
    }
}
