package com.example.temperatureconverter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Unit tests for TemperatureConverter (JUnit 5). */
public class TemperatureConverterTest {

    @Test
    void celsiusToFahrenheit_zeroToThirtyTwo() {
        double result = TemperatureConverter.celsiusToFahrenheit(0.0);
        assertEquals(32.0, result, 1e-3);
    }

    @Test
    void fahrenheitToCelsius_boilingPoint() {
        double result = TemperatureConverter.fahrenheitToCelsius(212.0);
        assertEquals(100.0, result, 1e-3);
    }

    @Test
    void celsiusToKelvin_absoluteZero() {
        double result = TemperatureConverter.celsiusToKelvin(-273.15);
        assertEquals(0.0, result, 1e-3);
    }

    @Test
    void roundTrip_cToFToC_identity() {
        double c = 23.7;
        double back = TemperatureConverter.fahrenheitToCelsius(
                TemperatureConverter.celsiusToFahrenheit(c));
        assertEquals(c, back, 1e-9);
    }
}
