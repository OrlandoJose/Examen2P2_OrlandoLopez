/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_orlandolopez;
import java.util.ArrayList;
/**
 *
 * @author Home
 */
public class Luchador {
    String Nombre;
      String Reino ;
    int Vida;
       double Ataque ;
       int Velocidad ;
    int Probabilidad;
double BonoHabilidad;
ArrayList<Habilidad>lista=new ArrayList<>();

    public Luchador(String Nombre, String Reino, int Vida, int Ataque, int Velocidad, int Probabilidad, double BonoHabilidad) {
        this.Nombre = Nombre;
        this.Reino = Reino;
        this.Vida = Vida;
        this.Ataque = Ataque;
        this.Velocidad = Velocidad;
        this.Probabilidad = Probabilidad;
        this.BonoHabilidad = BonoHabilidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getReino() {
        return Reino;
    }

    public void setReino(String Reino) {
        this.Reino = Reino;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public double getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getProbabilidad() {
        return Probabilidad;
    }

    public void setProbabilidad(int Probabilidad) {
        this.Probabilidad = Probabilidad;
    }

    public double getBonoHabilidad() {
        return BonoHabilidad;
    }

    public void setBonoHabilidad(int BonoHabilidad) {
        this.BonoHabilidad = BonoHabilidad;
    }

    public ArrayList<Habilidad> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Habilidad> lista) {
        this.lista = lista;
    }
    public void agregar(Habilidad h){
        lista.add(h);
    }
    public double GolpeNormal(Luchador d){
        
        double causado = (d.getAtaque()*(d.getProbabilidad()))*0.5;
        
    return causado;}
//    public double LanzarHabilidad(Luchador enemigo){
//        double=
//    }
    @Override
    public String toString() {
        return "Nombre  ";

}
}
