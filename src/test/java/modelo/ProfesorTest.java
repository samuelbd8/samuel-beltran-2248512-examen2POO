/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author samue
 */
public class ProfesorTest {

    @Test
    public void testCalcularSalario() {
        Profesor p = new Profesor("Juan", "", "", "", "123", "Matematicas", 10000, 100);
        assertEquals(1300000, p.calcularSalario(), 0.01);
    }

    @Test
    public void testCalcularSalarioConExtras() {
        Profesor p = new Profesor("Juan", "", "", "", "123", "Matematicas", 10000, 100);
        assertEquals(1430000, p.calcularSalario(10), 0.01);
    }

    @Test
    public void testPrestaciones() {
        Profesor p = new Profesor("Juan", "", "", "", "123", "Matematicas", 10000, 100);
        assertEquals(247000, p.calcularPrestaciones(), 0.01);
    }
}    