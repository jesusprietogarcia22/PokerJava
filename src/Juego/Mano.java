
package Juego;

import Cartas.Carta;
import java.util.ArrayList;
import java.util.Comparator;


public class Mano{
    Comparator<Carta> c;
    
    private  ArrayList<Carta> mano;
    
    public Mano(){
        this.mano = new ArrayList<>();
        
    }
    
    public void add(Carta c){
        
        mano.add(c);
        
        
    }

    public void setMano(Mano m) {
        this.mano = m.getMano();
    }
    
    public void remove(int i){
        
        this.mano.remove(i);
        
    }
    public int size(){
        
        return this.mano.size();
        
    }
    public void limpiarMano(){
        
        mano.clear();
        
    }
    
    public Carta get(int n){
        
        return mano.get(n);
        
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }
    
    
    public void ordenarMano(){
        mano.sort(c);
    }
    public void imprimir(){
        
        for(int i = 0; i<= mano.size()-1; i++){
            
            System.out.println(mano.get(i).toString());
            
        }
        
    }
    
    public int repeticionesValor(Carta c){
        int n = 0;
        for(int i = 0; i<= mano.size()-1; i++){
            
            if(mano.get(i).getValor().getValorEnum() == c.getValor().getValorEnum())
                n +=1;
            
            
        }
        
        return n;
    }
   
    public int repeticionesCartasIguales(Carta c){
        int n = 0;
        for(int i = 0; i<= mano.size()-1; i++){
            
            if(mano.get(i).getValor().getValorEnum() == c.getValor().getValorEnum()
                    && mano.get(i).getPalo() == c.getPalo())
                n +=1;
            
            
        }
        
        return n;
    }
    
    public int cartasDelMismoColor(Carta c){
        int n = 0;
        for (int i = 0; i<= mano.size()-1;i++){
            
            if(mano.get(i).getPalo() == c.getPalo())
                n += 1;
            
            
            
        }
        
        
        return n;
    }
    
    
   
  
}
