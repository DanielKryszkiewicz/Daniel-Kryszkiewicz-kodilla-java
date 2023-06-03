package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightCheck {


    public void findFlight (Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("LHR", true);
        flightMap.put("LUX", true);
        flightMap.put("MAD", false);
        flightMap.put("VIE", false);
        flightMap.put("AMS", true);
        flightMap.put("YVR", false);
        flightMap.put("NRT", true);

        String departureAirport = flight.getDepartureAirport();
        String arrivalAirport = flight.getArrivalAirport();
        boolean isDepartureAirportAvailable = flightMap.get(departureAirport);
        boolean isArrivalAirportAvailable = flightMap.get(arrivalAirport);

        if (!flightMap.containsKey(departureAirport) || !flightMap.containsKey(arrivalAirport)) {
            throw new RouteNotFoundException("Flight not available");
        }
        if (!isDepartureAirportAvailable || !isArrivalAirportAvailable) {
            throw new RouteNotFoundException("Flight not available");
        }
    }
}
