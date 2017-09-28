
package Juego;

import Cartas.Baraja;

public class Jugada {
    private int numCartas;
    private Baraja b;
    private Jugador j1;
    private Jugador j2;
    private int apuesta;

    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }
    
    public Jugada(int numCartas, Jugador j1, Jugador j2){
        
        this.numCartas = numCartas;
        this.b = new Baraja();
        this.b.mezclar();
        this.j1 = j1;
        this.j2 = j2;

    
    }

    public Baraja getB() {
        return b;
    }

    public void setB(Baraja b) {
        this.b = b;
    }

    public Jugador getJ1() {
        return j1;
    }

    public void setJ1(Jugador j1) {
        this.j1 = j1;
    }

    public Jugador getJ2() {
        return j2;
    }

    public void setJ2(Jugador j2) {
        this.j2 = j2;
    }
    
    
   
    public void descartar(){
        
        this.j1.getMano().limpiarMano();
        for(int i=1; i<= this.numCartas;i++){
            j1.repartir(b.sacarPrimeraCarta());  
    }
    }
    
    
    public Jugador establecerGanador(){
        j1.getMano().ordenarMano();
        j2.getMano().ordenarMano();
        if(j1.tieneEscaleraReal() && !j2.tieneEscaleraReal())
            return j1;
        if(!j1.tieneEscaleraReal() && j2.tieneEscaleraReal())
            return j2;
        if(j1.tieneEscaleraReal() && j2.tieneEscaleraReal())
            return null;
        if(!j1.tieneEscaleraDeColor()&& j2.tieneEscaleraDeColor())
            return j2;
        if(j1.tieneEscaleraDeColor()&& !j2.tieneEscaleraDeColor())
            return j1;
        if(j1.tieneEscaleraDeColor()&& j2.tieneEscaleraDeColor()){
            if(j1.cartaDeLaEscalera().getValor().getValorEnum()>j2.cartaDeLaEscalera().getValor().getValorEnum())
                return j1;
            else if(j1.cartaDeLaEscalera().getValor().getValorEnum()<j2.cartaDeLaEscalera().getValor().getValorEnum())
                return j2;
            else return null;
            
        }
        if(j1.tienePoker()&& !j2.tienePoker())
            return j1;
        if(!j1.tienePoker()&& j2.tienePoker())
            return j2;
        if(j1.tienePoker()&& j2.tienePoker()){
            
            if(j1.cartaDelPoker().getValor().getValorEnum()>j2.cartaDelPoker().getValor().getValorEnum())
                return j1;
            else if (j1.cartaDelPoker().getValor().getValorEnum()<j2.cartaDelPoker().getValor().getValorEnum())
                return j2;
            else return null;
            
        }
        if(j1.tieneFull()&& !j2.tieneFull())
            return j1;
        if(!j1.tieneFull()&& j2.tieneFull())
            return j2;
        if(j1.tieneFull()&& j2.tieneFull()){
            
            if(j1.cartasDelFull()[0].getValor().getValorEnum()>j2.cartasDelFull()[0].getValor().getValorEnum())
                return j1;
            else if (j1.cartasDelFull()[0].getValor().getValorEnum()<j2.cartasDelFull()[0].getValor().getValorEnum()) return j2;
            else return null;
        }
          if(j1.tieneColor()&& !j2.tieneColor())
            return j1;
        if(!j1.tieneColor()&& j2.tieneColor())
            return j2;
        if(j1.tieneColor()&& j2.tieneColor()){
            
            if(j1.cartaAltaDelColor().getValor().getValorEnum()>j2.cartaAltaDelColor().getValor().getValorEnum())
                return j1;
            else if (j1.cartaAltaDelColor().getValor().getValorEnum()<j2.cartaAltaDelColor().getValor().getValorEnum()) return j2;
            else return null;
        }
            
        if(j1.tieneEscalera()&& !j2.tieneEscalera())
            return j1;
        if(!j1.tieneEscalera()&& j2.tieneEscalera())
            return j2;
        if(j1.tieneEscalera()&& j2.tieneEscalera()){
            
            if(j1.cartaDeLaEscalera().getValor().getValorEnum()>j2.cartaDeLaEscalera().getValor().getValorEnum())
                return j1;
            else if (j1.cartaDeLaEscalera().getValor().getValorEnum()<j2.cartaDeLaEscalera().getValor().getValorEnum())return j2;
            else return null;
        }
           if(j1.tieneTrio()&& !j2.tieneTrio())
            return j1;
        if(!j1.tieneTrio()&& j2.tieneTrio())
            return j2;
        if(j1.tieneTrio()&& j2.tieneTrio()){
            
            if(j1.deQueCartaEsElTrio().getValor().getValorEnum()>j2.deQueCartaEsElTrio().getValor().getValorEnum())
                return j1;
            else if (j1.deQueCartaEsElTrio().getValor().getValorEnum()<j2.deQueCartaEsElTrio().getValor().getValorEnum()) return j2;
            else return null;
        }
        if(j1.tieneDoblesParejas()&& !j2.tieneDoblesParejas())
            return j1;
        if(!j1.tieneDoblesParejas()&& j2.tieneDoblesParejas())
            return j2;
        if(j1.tieneDoblesParejas()&& j2.tieneDoblesParejas()){
            
            if(j1.cartasDeLasDoblesParejas()[0].getValor().getValorEnum()>j2.cartasDeLasDoblesParejas()[0].getValor().getValorEnum())
                return j1;
            else if (j1.cartasDeLasDoblesParejas()[0].getValor().getValorEnum()<j2.cartasDeLasDoblesParejas()[0].getValor().getValorEnum())return j2;
            else return null;
        }
        
        if(j1.tienePareja()&& !j2.tienePareja())
            return j1;
        if(!j1.tienePareja()&& j2.tienePareja())
            return j2;
        if(j1.tienePareja()&& j2.tienePareja()){
            
            if(j1.deQueCartaEsLaPareja().getValor().getValorEnum()>j2.deQueCartaEsLaPareja().getValor().getValorEnum())
                return j1;
            else if (j1.deQueCartaEsLaPareja().getValor().getValorEnum()<j2.deQueCartaEsLaPareja().getValor().getValorEnum()) return j2;
            else return null;
        }
        else if(j1.sacarCartaAlta().getValor().getValorEnum()>j2.sacarCartaAlta().getValor().getValorEnum())
            return j1;
        else if (j1.sacarCartaAlta().getValor().getValorEnum()<j2.sacarCartaAlta().getValor().getValorEnum()) return j2;
        else return null;

    }
    
}
