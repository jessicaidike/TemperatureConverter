package com.example.temperatureconverter;

/**
 * TemperatureConverter provides conversion utilities between
 * Celsius, Fahrenheit, and Kelvin. Each method is independent.
 */
public class TemperatureConverter {

    /** Converts Celsius to Fahrenheit. Formula: F = (C × 9/5) + 32 */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    /** Converts Fahrenheit to Celsius. Formula: C = (F − 32) × 5/9 */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    /** Converts Celsius to Kelvin. Formula: K = C + 273.15 */
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    /** Optional manual run */
    public static void main(String[] args) {
        System.out.println("25°C = " + celsiusToFahrenheit(25) + "°F");
        System.out.println("77°F = " + fahrenheitToCelsius(77) + "°C");
        System.out.println("25°C = " + celsiusToKelvin(25) + "K");
    }
}
