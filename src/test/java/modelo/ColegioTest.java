/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import java.util.ArrayList;
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

public class ColegioTest {

    @Test
    public void testAgregarProfesor() {
        Colegio c = new Colegio();
        c.agregarProfesor(new Profesor("Juan", "", "", "", "1", "Math", 10000, 100));

        assertEquals(1, c.listarProfesoresOrdenados().size());
    }

    @Test
    public void testTotalPrestaciones() {
        Colegio c = new Colegio();

        c.agregarProfesor(new Profesor("Juan", "", "", "", "1", "Math", 10000, 100));

        double total = c.calcularTotalPrestaciones();

        assertTrue(total > 0);
    }
}