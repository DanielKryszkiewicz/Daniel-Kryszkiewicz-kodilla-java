package com.kodilla.exception.test;

public class Main {

    public static void main(String[] args) {


        FlightCheck flightCheck = new FlightCheck();

        Flight flight1 = new Flight("MAD", "VIE");
        Flight flight2 = new Flight("AMS", "LHR");

        try {
            flightCheck.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());

        }
        try {
            flightCheck.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
