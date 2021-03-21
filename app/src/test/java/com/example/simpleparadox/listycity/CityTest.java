package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CityTest {

    @Test
    void testGetCityName() {
        City city1 = new City("Edmonton", "AB");
        City city2;

        assertTrue(city1.getCityName().equals("Not Edmonton"));
    }

}
