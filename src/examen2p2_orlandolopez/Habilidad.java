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
    int efecto;
    public Habilidad(String Nombre, int Daño,int efecto) {
        this.Nombre = Nombre;
        this.Daño = Daño;
        this.efecto=efecto;
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
    public int getEfecto() {
        return efecto;
    }

    public void setEfecto(int efecto) {
        this.efecto=efecto;
    }
    @Override
    public String toString() {
        return "Habilidad{" + "Nombre=" + Nombre + ", Daño=" + Daño + '}';
    }
    
}
