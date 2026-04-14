/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestIntegracion;
import controlador.Controlador;
import modelo.Estudiante;
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


public class IntegracionTest {

    @Test
    public void testRegistrarEstudiante() {

        Controlador controlador = new Controlador();

        controlador.registrarEstudiante(
                "Ana", "Calle 1", "123", "2005",
                "1001", "10", 4.5
        );

        assertEquals(1, controlador.obtenerEstudiantes().size());

        Estudiante e = controlador.obtenerEstudiantes().get(0);

        assertEquals("Ana", e.getNombre());
        assertEquals("1001", e.getCodigo());
    }

    @Test
    public void testRegistrarProfesor() {

        Controlador controlador = new Controlador();

        controlador.registrarProfesor(
                "Carlos", "Calle 2", "456", "1980",
                "12345", "Matematicas", 10000, 10
        );

        assertEquals(1, controlador.obtenerProfesoresOrdenados().size());
    }

    @Test
    public void testOrdenamientoProfesores() {

        Controlador controlador = new Controlador();

        controlador.registrarProfesor("A","Dir","1","1990","1","Area",10000,10);
        controlador.registrarProfesor("B","Dir","1","1990","2","Area",20000,10);

        double salario1 = controlador.obtenerProfesoresOrdenados().get(0).calcularSalario();
        double salario2 = controlador.obtenerProfesoresOrdenados().get(1).calcularSalario();

        assertTrue(salario1 >= salario2);
    }

    @Test
    public void testTotalPrestaciones() {

        Controlador controlador = new Controlador();

        controlador.registrarProfesor("A","Dir","1","1990","1","Area",10000,10);
        controlador.registrarProfesor("B","Dir","1","1990","2","Area",20000,10);

        double total = controlador.obtenerTotalPrestaciones();

        assertTrue(total > 0);
    }
}