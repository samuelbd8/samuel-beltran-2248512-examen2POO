/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author samue
 */
public class Estudiante extends Persona {

    private String codigo;
    private String grado;
    private double promedio;

    

   
    public String getCodigo() { return codigo; }
    public String getGrado() { return grado; }
    public double getPromedio() { return promedio; }

   
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setGrado(String grado) { this.grado = grado; }
    public void setPromedio(double promedio) { this.promedio = promedio; }

    
    @Override
    public String toString() {
        return getNombre() + " - Codigo: " + codigo + " - Grado: " + grado + " - Promedio: " + promedio;
    }
}