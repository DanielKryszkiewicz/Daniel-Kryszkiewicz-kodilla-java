package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Standard")
                .burgers(2)
                .sauce("Standard")
                .ingredient("Mushrooms")
                .ingredient("Bacon")
                .ingredient("Onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        //Then
        assertEquals(3, howManyIngredients);
        assertEquals(2, howManyBurgers);

    }
}
