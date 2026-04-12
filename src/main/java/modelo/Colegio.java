/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author samue
 */
import java.util.ArrayList;

public class Colegio {

    private ArrayList<Profesor> profesores;
    private ArrayList<Estudiante> estudiantes;

    public Colegio() {
        profesores = new ArrayList<>();
        estudiantes = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public ArrayList<Estudiante> listarEstudiantes() {
        return estudiantes;
    }
}
