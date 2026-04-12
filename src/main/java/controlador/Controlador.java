/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Colegio;
import modelo.Estudiante;
import modelo.Profesor;
import java.util.ArrayList;
/**
 *
 * @author samue
 */


public class Controlador {

    private Colegio colegio;

    public Controlador() {
        colegio = new Colegio();
    }

 

    public void registrarProfesor(String nombre, String direccion, String telefono,
                                   String fechaNacimiento, String cedula, String area,
                                   double salarioHora, int horasMes) {

        Profesor p = new Profesor(nombre, direccion, telefono, fechaNacimiento,
                                   cedula, area, salarioHora, horasMes);
        colegio.agregarProfesor(p);
    }

    public ArrayList<Profesor> obtenerProfesoresOrdenados() {
        return colegio.listarProfesoresOrdenados();
    }

    public double obtenerTotalPrestaciones() {
        return colegio.calcularTotalPrestaciones();
    }

   
    

    public void registrarEstudiante(String nombre, String direccion, String telefono,
                                     String fechaNacimiento, String codigo,
                                     String grado, double promedio) {

        Estudiante e = new Estudiante(nombre, direccion, telefono, fechaNacimiento,
                                       codigo, grado, promedio);
        colegio.agregarEstudiante(e);
    }

    public ArrayList<Estudiante> obtenerEstudiantes() {
        return colegio.listarEstudiantes();
    }
}
