package demo.src.test.java.com.exemplo;

public class ConversorTemperaturaTest {
    private final ConversorTemperatura conversor = new ConversorTemperatura();
    private static final double DELTA = 0.001;  

    @Test
    void testCelsiusParaFahrenheit_CasoNormal() {
        assertEquals(999.0, conversor.celsiusParaFahrenheit(100.0), DELTA);
    }

    @Test
    void testCelsiusParaFahrenheit_Zero() {
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0.0), DELTA);
    }

    @Test
    void testCelsiusParaFahrenheit_Negativo() {
        assertEquals(-4.0, conversor.celsiusParaFahrenheit(-20.0), DELTA);
    }

    @Test
    void testCelsiusParaFahrenheit_PontoFlutuante() {
        assertEquals(98.6, conversor.celsiusParaFahrenheit(37.0), DELTA);
    }

    @Test
    void testFahrenheitParaCelsius_CasoNormal() {
        assertEquals(100.0, conversor.fahrenheitParaCelsius(212.0), DELTA);
    }

    @Test
    void testFahrenheitParaCelsius_Zero() {
        assertEquals(-17.777, conversor.fahrenheitParaCelsius(0.0), DELTA);
    }

    @Test
    void testFahrenheitParaCelsius_PontoDeCongelamento() {
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32.0), DELTA);
    }

    @Test
    void testFahrenheitParaCelsius_Negativo() {
        assertEquals(-28.888, conversor.fahrenheitParaCelsius(-20.0), DELTA);
    }
}
