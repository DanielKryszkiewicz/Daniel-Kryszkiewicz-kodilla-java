package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {

        InformationService informationService = new OrderInformationService();
        ProductService productService = new OrderProductService();

        OrderProcessor orderProcessor = new OrderProcessor(informationService, productService);
        orderProcessor.process(new User("Daniel", 1), "Laptop", 1, true);


    }
}
