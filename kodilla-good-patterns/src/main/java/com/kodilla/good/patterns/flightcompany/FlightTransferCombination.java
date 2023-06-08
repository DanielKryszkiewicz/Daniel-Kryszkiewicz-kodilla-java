package com.kodilla.good.patterns.flightcompany;

import java.util.ArrayList;
import java.util.List;

public class FlightTransferCombination {

    private List<Flight> flights;

    public FlightTransferCombination() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    public List<Flight> getFlights() {
        return flights;
    }

    @Override
    public String toString() {
        return "Flight with transfer : " +
                flights;
    }
}


