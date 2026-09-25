/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_orlandolopez;

/**
 *
 * @author Home
 */
public class Habilidad {
    String Nombre;
    double Daño;

    public Habilidad(String Nombre, int Daño) {
        this.Nombre = Nombre;
        this.Daño = Daño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getDaño() {
        return Daño;
    }

    public void setDaño(int Daño) {
        this.Daño = Daño;
    }

    @Override
    public String toString() {
        return "Habilidad{" + "Nombre=" + Nombre + ", Daño=" + Daño + '}';
    }
    
}
