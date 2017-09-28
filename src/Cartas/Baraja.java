
package Cartas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Baraja {

    private ArrayList<Carta> baraja = new ArrayList();
    
    
    
    public Baraja() {
        
        for(Palo p: Palo.values()){
            
            for(Valor r: Valor.values()){
                
                this.baraja.add(new Carta(r,p));
                
            }
            
            
        }
        
        
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }
    
    
    public void mezclar(){
        
        Collections.shuffle(baraja);
        
    }
    
    public Carta sacarPrimeraCarta(){
        
        Carta c;
        c = baraja.get(0);
        baraja.remove(0);
        return c;
        
        
    }
    
    
    
    
    
}