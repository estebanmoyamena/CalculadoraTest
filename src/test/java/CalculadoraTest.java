import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    public void testSumar() {
        Integer resultado = Calculadora.sumar(1, 1);
        assertEquals(Integer.valueOf(2), resultado);
    }

    @Test
    public void testRestar() {
        Integer resultado = Calculadora.restar(111, 11);
        assertEquals(Integer.valueOf(100), resultado);

    }

    @Test
    public void TestMultiplicar() {
        Integer resultado = Calculadora.multiplicar(4, 4);
        assertEquals(Integer.valueOf(16), resultado);
    }

    @Test
    public void testDividir() {
        Integer resultado = Calculadora.dividir(9, 3);
        assertEquals(Integer.valueOf(3), resultado);
    }

    private void assertEquals(Integer valueOf, Integer resultado) {
        // TODO Auto-generated method stub

    }
}