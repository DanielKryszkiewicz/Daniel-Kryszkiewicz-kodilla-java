package com.kodilla.good.patterns.flightcompany;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        FlightService flightService = new FlightService();
        flightService.addFlight(new Flight("Gdansk", "Krakow"));
        flightService.addFlight(new Flight("Krakow", "Wroclaw"));
        flightService.addFlight(new Flight("Gdansk", "Warsaw"));
        flightService.addFlight(new Flight("Warsaw", "Wroclaw"));

        List<FlightTransferCombination> flightTransferCombinations = flightService.findFlightsVia("Krakow", "Gdansk", "Wroclaw");
        for (FlightTransferCombination flightComb : flightTransferCombinations) {
            System.out.println(flightComb);
        }
    }

}
