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


public ArrayList<Profesor> listarProfesoresOrdenados() {
        for (int i = 0; i < profesores.size() - 1; i++) {
            for (int j = 0; j < profesores.size() - 1; j++) {
                if (profesores.get(j).calcularSalario() < profesores.get(j + 1).calcularSalario()) {
                    Profesor temp = profesores.get(j);
                    profesores.set(j, profesores.get(j + 1));
                    profesores.set(j + 1, temp);
                }
            }
        }
        return profesores;
}}