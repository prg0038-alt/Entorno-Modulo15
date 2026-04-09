package entornos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraRiesgoTest {
    CalculadoraRiesgo calc = new CalculadoraRiesgo();

    @Test
    void testEdadNegativa() {
        assertEquals("Error", calc.evaluarEdad(-5));
    }

    @Test
    void testAdulto() {
        assertEquals("Adulto", calc.evaluarEdad(25));
    }

    @Test
    void testSenior() {
        assertEquals("Senior", calc.evaluarEdad(75));
    }

    @Test
    void testLimiteJovenAdulto() {
        assertEquals("Adulto", calc.evaluarEdad(18));
    }
}