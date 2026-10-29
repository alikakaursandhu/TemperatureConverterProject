import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureConverterTest {
    private static final double DELTA = 0.0001;
    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void convertsZeroCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), DELTA);
    }

    @Test
    void converts212FahrenheitToCelsius() {
        assertEquals(100.0, converter.fahrenheitToCelsius(212.0), DELTA);
    }

    @Test
    void convertsZeroCelsiusToKelvin() {
        assertEquals(273.15, converter.celsiusToKelvin(0.0), DELTA);
    }
}
