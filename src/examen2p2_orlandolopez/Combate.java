/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_orlandolopez;

/**
 *
 * @author Home
 */
public class Combate {
    Luchador Usuario; 
    Luchador Enemigo ;
     int   numeroRonda ;
Luchador GanadorLucha ;

    public Combate(Luchador Usuario, Luchador Enemigo, int numeroRonda, Luchador GanadorLucha) {
        this.Usuario = Usuario;
        this.Enemigo = Enemigo;
        this.numeroRonda = numeroRonda;
        this.GanadorLucha = GanadorLucha;
    }

    public Luchador getUsuario() {
        return Usuario;
    }

    public void setUsuario(Luchador Usuario) {
        this.Usuario = Usuario;
    }

    public Luchador getEnemigo() {
        return Enemigo;
    }

    public void setEnemigo(Luchador Enemigo) {
        this.Enemigo = Enemigo;
    }

    public int getNumeroRonda() {
        return numeroRonda;
    }

    public void setNumeroRonda(int numeroRonda) {
        this.numeroRonda = numeroRonda;
    }

    public Luchador getGanadorLucha() {
        return GanadorLucha;
    }

    public void setGanadorLucha(Luchador GanadorLucha) {
        this.GanadorLucha = GanadorLucha;
    }
public void LuchadorUsuario(){
    
} 
public void LuchadorEnemigo (){
    
}
public void numeroRonda (){
    
}
public void GanadorLucha(){
    
} 
    @Override
    public String toString() {
        return "Combate{" + "Usuario=" + Usuario + ", Enemigo=" + Enemigo + ", numeroRonda=" + numeroRonda + ", GanadorLucha=" + GanadorLucha + '}';
    }

}
