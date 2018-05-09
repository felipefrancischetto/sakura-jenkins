package com.francischetto.calculadora.test;

import com.francischetto.calculadora.Calculadora;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculadoraTest {
    
    private Calculadora calc;

    @Test
    public void testSoma() {
        calc = new Calculadora();
        assertEquals(5, calc.somar(2,3));
    }
    
    @Test
    public void testSubtrair() {
        calc = new Calculadora();
        assertEquals(5, calc.subtrair(10, 5));
    }

    @Test
    public void testMultiplicar() {
        calc = new Calculadora();
        assertEquals(10, calc.multiplicar(5, 2));
    }

    @Test
    public void testDividir() {
        calc = new Calculadora();
        assertEquals(5, calc.dividir(10, 2));
    }    
}
