package com.kodilla.good.patterns.flightcompany;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    private final List<Flight> flightList;


    public FlightService() {
        this.flightList = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flightList.add(flight);
    }

    public List<Flight> findFlightsFrom(String departureAirport) {
        return flightList.stream()
                .filter(flight -> flight.getDepartureAirport().equalsIgnoreCase(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String arrivalAirport) {
        return flightList.stream()
                .filter(flight -> flight.getArrivalAirport().equalsIgnoreCase(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<FlightTransferCombination> findFlightsVia(String transferCity, String departureAirport, String arrivalAirport) {
        List<Flight> flightsToTransfer = flightList.stream()
                .filter(flight -> flight.getDepartureAirport().equalsIgnoreCase(departureAirport) && flight.getArrivalAirport().equalsIgnoreCase(transferCity))
                .collect(Collectors.toList());

        List<Flight> flightsFromTransfer = flightList.stream()
                .filter(flight -> flight.getDepartureAirport().equalsIgnoreCase(transferCity) && flight.getArrivalAirport().equalsIgnoreCase(arrivalAirport))
                .collect(Collectors.toList());

        List<FlightTransferCombination> result = new ArrayList<>();

        for (Flight flightToTransfer : flightsToTransfer) {
            for (Flight flightFromTransfer : flightsFromTransfer) {
                FlightTransferCombination flightTransferCombination = new FlightTransferCombination();
                flightTransferCombination.addFlight(flightToTransfer);
                flightTransferCombination.addFlight(flightFromTransfer);
                result.add(flightTransferCombination);
            }
        }
        return result;
    }

}
