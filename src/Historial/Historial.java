package Historial;

import Juego.Jugador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class Historial{
    
    private ArrayList<Jugador> jugadores;
    private int partidasTotales = 0;
    Comparator<Jugador> c = Collections.reverseOrder();
    
    public Historial(){
        this.jugadores = new ArrayList();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public int getPartidasTotales() {
        return partidasTotales;
    }
    
    /*public void crearJugador(String nombre){
        int i = 0;
        boolean encontrado = false;


            while(i <= jugadores.size()&& !encontrado){
                Jugador j = jugadores.get(i);
                String n = j.getNombre();
                if (nombre.equals(n)){
                    JOptionPane.showInputDialog("El jugador ya existe!");
                    encontrado = true;
                }
                else
                    i++;    
            }
            if (i == jugadores.size()){
                this.jugadores.add(new Jugador(nombre));
            }   
        }*/ 
    
    
    public void crearJugador(String nombre){
        this.jugadores.add(new Jugador(nombre));
    }
    
    public boolean existeJugador(String nombre){
        boolean encontrado = false;
        Iterator i = jugadores.iterator();
        while(i.hasNext() && !encontrado){
            Jugador j = (Jugador) i.next();
            if(j.getNombre().equals(nombre)){
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    public void actualizaPartidasTotales(){
        this.partidasTotales += 1;
    }
    
    public void ordenarJugadores(){
        jugadores.sort(c);
    }
}