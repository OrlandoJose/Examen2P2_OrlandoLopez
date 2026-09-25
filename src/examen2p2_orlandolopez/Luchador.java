/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_orlandolopez;
import java.util.ArrayList;
import java.util.Random;
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
        Random R=new Random();
        double causado=0;
        int cont=0;
        double mul=0;
        int probabilidad=R.nextInt(100)+1;

        for(int i=0;i<5;i++){
        cont++;
        if(cont==2){
            mul=0.8;
        }else if(cont==3){
            mul=0.6;
        }else if(cont==4){
            mul=0.4;
        }else if(cont==5){
            mul=0.2;
        }
        if(cont==1){
                            double factorcombo=mul*d.getAtaque();      
         causado=(d.getAtaque()*(factorcombo))*0.5;
        }
    if(cont==2&&probabilidad<=d.getProbabilidad()){
                double factorcombo=mul*d.getAtaque();      
         causado=(d.getAtaque()*(factorcombo))*0.5;
    }  else{
        causado=0;
    }   
        }
    return causado;}
    @Override
    public String toString() {
        return "Nombre  ";

}
}
