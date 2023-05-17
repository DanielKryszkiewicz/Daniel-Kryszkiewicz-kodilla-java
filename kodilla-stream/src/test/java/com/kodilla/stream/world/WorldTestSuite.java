package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("4000000"));
        Country germany = new Country("Germany", new BigDecimal("4500000"));
        Country canada = new Country("Canada", new BigDecimal("12000000"));

        Continent europe = new Continent("Europe");
        Continent northamerica = new Continent("North America");

        europe.addCountry(poland);
        europe.addCountry(germany);
        northamerica.addCountry(canada);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(northamerica);

        BigDecimal expectedPeopleQuantity = new BigDecimal("20500000");

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then

        Assertions.assertEquals(expectedPeopleQuantity,result);
    }
}
