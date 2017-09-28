
package Juego;

import Cartas.Carta;
import Cartas.Palo;
import Cartas.Valor;

public class Jugador implements Comparable<Jugador>{
    private static final int FICHAS = 200;
    public final String nombre;
    private int fichasTotales;
    private Mano mano;
    private int cartaInicioEscalera;
    private int partidasJugadas;
    private int partidasGanadas;
    private final static int PARTIDASINICIALES = 0;
    private int apuesta;
    
    
    
    
    public Jugador(String nombre){
        this.nombre = nombre;
        this.fichasTotales = FICHAS;
        this.mano = new Mano();
        this.partidasGanadas = PARTIDASINICIALES;
        this.partidasJugadas = PARTIDASINICIALES;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFichasTotales() {
        return fichasTotales;
    }
    
    public void actualizaGanancias(int fichas){
        this.fichasTotales += fichas;
    }
    
    public void actualizaPerdidas(int fichas){
        this.fichasTotales -= fichas;
    }
    
    public boolean existeJugador(Jugador j){
        return nombre.equals(j.nombre);
    }
    
    @Override
    public boolean equals(Object o){
        if (this==o){
            return true;
        }
        if ((o == null) || (o.getClass() != this.getClass())) {
            return false;
        }
        Jugador j = (Jugador) o;
        return this.nombre.equals(o);
    }

    public Mano getMano() {
        return mano;
    }

    public void setMano(Mano mano) {
        this.mano = mano;
    }
    
    
   // comparadores de manos 
    
    
    public boolean tienePareja(){
        int n = 0;
        for(int i = 0; i<= mano.size()-1;i++){
            
            if(mano.repeticionesValor(mano.get(i)) == 2)
                n = mano.repeticionesValor(mano.get(i));
            
        }
        if(n == 2)
        return true;
        else return false;
        
    }
    
    public boolean tieneDoblesParejas(){
        int n = 0;
        for(int i = 0; i<= mano.size()-1;i++){
            
            if(mano.repeticionesValor(mano.get(i)) == 2)
                n += mano.repeticionesValor(mano.get(i));
            
        }
        if(n == 8)
        return true;
        else return false;
        
    }
    
    public boolean tieneTrio(){
        
        int n = 0;
        
        for(int i = 0; i<= mano.size()-1; i++){
            
            if(mano.repeticionesValor(mano.get(i)) == 3)
                n = mano.repeticionesValor(mano.get(i));
            
            
        }
        
        
        if(n == 3)
            return true;
        else return false;
                   
    }
    public boolean tieneFull(){
        int n = 0;
        
        for(int i = 0; i<= mano.size()-1;i++){
            
            if(mano.repeticionesValor(mano.get(i)) == 3 || mano.repeticionesValor(mano.get(i)) == 2 )
            
                n += mano.repeticionesValor(mano.get(i));
            
        }
        
        
        if(n >= 13)
            return true;
        else return false;
        
    }
    public boolean tienePoker(){
        
        int n = 0;
        
        for(int i = 0; i<= mano.size()-1; i++){
            
            if(mano.repeticionesValor(mano.get(i)) == 4)
                n = mano.repeticionesValor(mano.get(i));
            
            
        }
        
        
        if(n == 4)
            return true;
        else return false;
                   
    }
    
    
    
    
    public boolean tieneEscalera(){
        int x = 0;
      if(mano.size() == 5){
          
          if(mano.get(0).getValor().getValorEnum()  == mano.get(1).getValor().getValorEnum()-1
               &&   mano.get(0).getValor().getValorEnum()  == mano.get(2).getValor().getValorEnum()-2
                   &&       mano.get(0).getValor().getValorEnum()  == mano.get(3).getValor().getValorEnum()-3
                         &&         mano.get(0).getValor().getValorEnum()  == mano.get(4).getValor().getValorEnum()-4){
              this.cartaInicioEscalera = 0;
              return true;}
          else return false;
          
          
      }
      else if(!tienePoker() && !tieneFull()){
          
          for(int i = 0; i<3; i++){
              
              if(i == 0){
                  
                  if((mano.get(i).getValor().getValorEnum() == mano.get(i+1).getValor().getValorEnum()-1 ||
                          mano.get(i).getValor().getValorEnum() == mano.get(i+1).getValor().getValorEnum())
                          && (mano.get(i+1).getValor().getValorEnum() == mano.get(i+2).getValor().getValorEnum()-1 ||
                          mano.get(i+1).getValor().getValorEnum() == mano.get(i+2).getValor().getValorEnum() )
                                && (mano.get(i+2).getValor().getValorEnum() == mano.get(i+3).getValor().getValorEnum()-1 ||
                         mano.get(i+2).getValor().getValorEnum() == mano.get(i+3).getValor().getValorEnum() )
                                  &&  (mano.get(i+3).getValor().getValorEnum() == mano.get(i+4).getValor().getValorEnum()-1)||
                          mano.get(i+3).getValor().getValorEnum() == mano.get(i+4).getValor().getValorEnum()){
                      this.cartaInicioEscalera = i;
                      x = 5;}
                  
              }
              
              else {
                  
                  if((mano.get(i).getValor().getValorEnum() == mano.get(i+1).getValor().getValorEnum()-1 ||
                          mano.get(i).getValor().getValorEnum() == mano.get(i+1).getValor().getValorEnum())
                          && (mano.get(i+1).getValor().getValorEnum() == mano.get(i+2).getValor().getValorEnum()-1 ||
                          mano.get(i+1).getValor().getValorEnum() == mano.get(i+2).getValor().getValorEnum() )
                                && (mano.get(i+2).getValor().getValorEnum() == mano.get(i+3).getValor().getValorEnum()-1 ||
                         mano.get(i+2).getValor().getValorEnum() == mano.get(i+3).getValor().getValorEnum() )
                                  &&  (mano.get(i+3).getValor().getValorEnum() == mano.get(i+4).getValor().getValorEnum()-1)||
                          mano.get(i+3).getValor().getValorEnum() == mano.get(i+4).getValor().getValorEnum()){
                      this.cartaInicioEscalera = i;
                      x = 5;}
                      
                  
              }
              
              
          }
          
          
      }
        
     if(x == 5)
         return true;
     else return false;
             
    }
   public boolean tieneColor(){
    int n = 0;
    
    
    for(int i = 0; i<= mano.size()-1; i++){
        
        if(mano.cartasDelMismoColor(mano.get(i)) >= 5)
            n = 5;
        
        
    }
    
    if (n==5)
        return true;
    else return false;
    
   }
    public boolean tieneEscaleraDeColor(){
        int x = 0;
        if(mano.size() == 5 && tieneEscalera() && tieneColor()){
            this.cartaInicioEscalera = 0;
            return true;}
        else if( mano.size() > 5 && tieneEscalera() && tieneColor() && !tienePoker() && !tieneFull()){
            for(int i = 0; i<3; i++){
              
              if(i == 0){
                  
                  if(((mano.get(i).getValor().getValorEnum() == mano.get(i+1).getValor().getValorEnum()-1
                          || mano.get(i).getValor().getValorEnum() == mano.get(i+1).getValor().getValorEnum())
                          && mano.get(i).getPalo() == mano.get(i+1).getPalo())
                          && ((mano.get(i+1).getValor().getValorEnum() == mano.get(i+2).getValor().getValorEnum()-1
                          || mano.get(i+1).getValor().getValorEnum() == mano.get(i+2).getValor().getValorEnum())
                            && mano.get(i+1).getPalo() == mano.get(i+2).getPalo())
                                && ((mano.get(i+2).getValor().getValorEnum() == mano.get(i+3).getValor().getValorEnum()-1 
                          || mano.get(i+2).getValor().getValorEnum() == mano.get(i+3).getValor().getValorEnum())
                                    && mano.get(i+2).getPalo() == mano.get(i+3).getPalo())
                                  &&  ((mano.get(i+3).getValor().getValorEnum() == mano.get(i+4).getValor().getValorEnum()-1)
                          || mano.get(i+3).getValor().getValorEnum() == mano.get(i+4).getValor().getValorEnum())
                                    &&   mano.get(i+3).getPalo() == mano.get(i+4).getPalo()){
                      this.cartaInicioEscalera = i;
                      
                      x = 5;}
                  
              }
              
              else {
                  
                  if(((mano.get(i).getValor().getValorEnum() == mano.get(i+1).getValor().getValorEnum()-1
                          || mano.get(i).getValor().getValorEnum() == mano.get(i+1).getValor().getValorEnum())
                          && mano.get(i).getPalo() == mano.get(i+1).getPalo())
                          && ((mano.get(i+1).getValor().getValorEnum() == mano.get(i+2).getValor().getValorEnum()-1
                          || mano.get(i+1).getValor().getValorEnum() == mano.get(i+2).getValor().getValorEnum())
                            && mano.get(i+1).getPalo() == mano.get(i+2).getPalo())
                                && ((mano.get(i+2).getValor().getValorEnum() == mano.get(i+3).getValor().getValorEnum()-1 
                          || mano.get(i+2).getValor().getValorEnum() == mano.get(i+3).getValor().getValorEnum())
                                    && mano.get(i+2).getPalo() == mano.get(i+3).getPalo())
                                  &&  ((mano.get(i+3).getValor().getValorEnum() == mano.get(i+4).getValor().getValorEnum()-1)
                          || mano.get(i+3).getValor().getValorEnum() == mano.get(i+4).getValor().getValorEnum())
                                    &&   mano.get(i+3).getPalo() == mano.get(i+4).getPalo()){
                      this.cartaInicioEscalera = i;
                      x = 5;}
                      
                  
              }
              
              
          }
            
            
            
            
        }
            
            
            
        
        
       
          if(x == 5)
          return true;
      else return false;
    
        
    }
    public boolean tieneEscaleraMasAlta(){
    Carta c0 = new Carta(Valor.AS, mano.get(0).getPalo());
        Carta c2 = new Carta(Valor.J, mano.get(0).getPalo());
        Carta c3 = new Carta(Valor.Q, mano.get(0).getPalo());
        Carta c4 = new Carta(Valor.K, mano.get(0).getPalo());
        Carta c1 = new Carta(Valor.DIEZ, mano.get(0).getPalo());
     
        if(mano.size() == 5){
            if( mano.get(0).mismoValor(c0) && mano.get(1).mismoValor(c1) && mano.get(2).mismoValor(c2) && mano.get(3).mismoValor(c3) &&
                    mano.get(4).mismoValor(c4) )
                return true;
            else return false;
            
            
            
        }
        else {
           if(mano.repeticionesValor(c4) >= 1 && mano.repeticionesValor(c3) >= 1 && mano.repeticionesValor(c2) >= 1 && mano.repeticionesValor(c1) >= 1 && 
                   mano.repeticionesValor(c0) >= 1 )
               return true;
           else return false;
            
            
            
        }
        
    }
    
    
    public boolean tieneEscaleraReal(){
        
        Carta c0 = new Carta(Valor.AS, mano.get(0).getPalo());
        Carta c2 = new Carta(Valor.J, mano.get(0).getPalo());
        Carta c3 = new Carta(Valor.Q, mano.get(0).getPalo());
        Carta c4 = new Carta(Valor.K, mano.get(0).getPalo());
        Carta c1 = new Carta(Valor.DIEZ, mano.get(0).getPalo());
     
        if(mano.size() == 5){
            if( mano.get(0).sonIguales(c0) && mano.get(1).sonIguales(c1) && mano.get(2).sonIguales(c2) && mano.get(3).sonIguales(c3) &&
                    mano.get(4).sonIguales(c4) )
                return true;
            else return false;
            
            
            
        }
        else {
           if(mano.repeticionesCartasIguales(c4) >= 1 && mano.repeticionesCartasIguales(c3) >= 1 && mano.repeticionesCartasIguales(c2) >= 1 && mano.repeticionesCartasIguales(c1) >= 1 && 
                   mano.repeticionesCartasIguales(c0) >= 1 )
               return true;
           else return false;
            
            
            
        }
        
    }
    public boolean tieneCartaAlta(){
        
        if(!tieneEscaleraReal() && !tieneEscaleraDeColor() && !tienePoker() && !tieneFull() && !tieneColor() && !tieneEscalera()
                && !tieneTrio() && !tieneDoblesParejas() && !tienePareja())
            return true;
        else return false;
        
        
        
    }
    
    public Carta sacarCartaAlta(){          //solo para carta alta
        int n = 0;
        
            if(mano.get(0).getValor() == Valor.AS)
                return mano.get(0);
            else return mano.get(mano.size());
            
            
            
        
    }
    
    
    public Carta deQueCartaEsLaPareja(){
        int n = 0;
        if(tienePareja()){
        do{
            n+=1;
            
        } while(mano.repeticionesValor(mano.get(n)) != 2);
      
    }
    
    return mano.get(n);
    }
    
    public Carta deQueCartaEsElTrio(){
        int n = 0;
        
        do{
            n+=1;
            
        } while(mano.repeticionesValor(mano.get(n)) != 3);
      
    
    
    return mano.get(n);
    }
    
    public Carta cartaAltaDelColor(){
        
        int x = 0;
        
            
            if(mano.get(0).getValor() == Valor.AS && mano.cartasDelMismoColor(mano.get(0)) == 5)
                x = 0;
            
            else {
                for(int i = mano.size()-1; i>=4; i--){
                    
                    if(mano.cartasDelMismoColor(mano.get(i)) == 5)
                        
                        x=i;
                    
                    
                }
            }
               
        
        
        return mano.get(x);
        
    }
    
    public Carta[] cartasDeLasDoblesParejas(){
        
        Carta[] c = new Carta[2];
        if(mano.get(0).getValor() == Valor.AS && mano.repeticionesValor(mano.get(0)) == 2){
            c[0] = mano.get(0);
            
            for(int i = mano.size()-1; i>=2; i--){
                
                if(mano.repeticionesValor(mano.get(i)) == 2)
                    c[1] = mano.get(i);
                
            }
        }
        else{
            
            for(int i = mano.size()-1; i>= 0; i++){
                
                if(mano.repeticionesValor(mano.get(i)) == 2)
                    c[0] = mano.get(i);
                
                
                
            }
            for(int i = 0; i<= mano.size()-1; i++){
                if(mano.repeticionesValor(mano.get(i)) == 2)
                    c[1] = mano.get(i);
            }
            
            
            
        }
        
        
        
        return c;
    }
    
    
    public Carta[] cartasDelFull(){
        
        Carta c[] = new Carta[2];
        
        if(mano.get(0).getValor() == Valor.AS && (mano.repeticionesValor(mano.get(0))== 2 || mano.repeticionesValor(mano.get(0)) == 3) )
            c[0] = mano.get(0);
        else{
            for(int i = mano.size()-1; i>= 0; i--){
                
                if(mano.repeticionesValor(mano.get(i)) == 2 || mano.repeticionesValor(mano.get(i)) == 3)
                    c[0] = mano.get(i);
                
                
                
            }
            for(int i = 0; i<= mano.size()-1; i++){
                if(mano.repeticionesValor(mano.get(i)) == 2 || mano.repeticionesValor(mano.get(i)) == 3)
                    c[1] = mano.get(i);
            }
            
            
        }
        
        
        
        return c;
        
    }
    
    public Carta cartaDelPoker(){
        int i = 0;
        
        do{
            i +=1;
        }while(mano.repeticionesValor(mano.get(i)) != 4);
        
        
        return mano.get(i);
    }
    
    
    public Carta cartaDeLaEscalera(){
        
        
      return  mano.get(this.cartaInicioEscalera + 4);
        
        
        
    }
    
    public void repartir(Carta c){
        
        this.mano.add(c);
        
        
    }
    
    public int apostar(int apuesta){
        
        this.apuesta = apuesta;
        this.fichasTotales -= apuesta;
        
        return apuesta;
        
        
        
    }
    
    public void sumarFichas(int fichas){
        
        this.fichasTotales+= fichas;
        
        
        
        
        
    }

    @Override
    public int compareTo(Jugador j) {
        if(fichasTotales <= j.fichasTotales){
            return -1;
        }
        else if(fichasTotales >= j.fichasTotales){
            return 1;
        }
        else return 0;
    }
}
    
