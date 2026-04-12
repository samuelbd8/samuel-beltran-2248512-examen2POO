/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author samue
 */
public class Profesor extends Persona {

    private String cedula;
    private String area;
    private double salarioHora;
    private int horasMes;

    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento,
                    String cedula, String area, double salarioHora, int horasMes) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasMes = horasMes;
    }

    
    public String getCedula() { return cedula; }
    public String getArea() { return area; }
    public double getSalarioHora() { return salarioHora; }
    public int getHorasMes() { return horasMes; }

    
    public void setCedula(String cedula) { this.cedula = cedula; }
    public void setArea(String area) { this.area = area; }
    public void setSalarioHora(double salarioHora) { this.salarioHora = salarioHora; }
    public void setHorasMes(int horasMes) { this.horasMes = horasMes; }
    
 @Override
    public String toString() {
        return getNombre() + " - " + area + " - Salario: $" + String.format("%.2f", calcularSalario());
    }
    
    public double calcularSalario() {
        double base = salarioHora * horasMes;
        return base + base * 0.30;
    }
    public double calcularSalario(int horasExtras) {
        double base = salarioHora * (horasMes + horasExtras);
        return base + base * 0.30;
    }
    public double calcularSalario(int horasExtras, double bono) {
        return calcularSalario(horasExtras) + bono;
    }
public double calcularPrestaciones() {
        return calcularSalario() * 0.19;
    }
    
}



