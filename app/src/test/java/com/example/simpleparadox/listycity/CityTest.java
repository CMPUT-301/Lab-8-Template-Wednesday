package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CityTest {

    @Test
    void testGetCityName() {
        City city = new City("Edmonton", "AB");
        City city1;
        assertTrue(city.getCityName().equals("Edmonton"));
    }

}
