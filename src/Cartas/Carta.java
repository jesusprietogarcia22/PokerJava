
package Cartas;


public class Carta  implements Comparable<Carta>{
private Valor valor;
private Palo palo;



    public Carta( Valor valor, Palo palo) {
        
        this.palo = palo;
        this.valor = valor;
         
        
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }
@Override
    public int compareTo(Carta c) {
        if(valor.getValorEnum() <= c.valor.getValorEnum()){
            return -1;
        }
        else if(valor.getValorEnum() >= c.valor.getValorEnum()){
            return 1;
        }
        else return 0;
    }
    
    @Override
   public String toString(){
       
       return (this.valor + " de " + this.palo);
       
   }
    
   public boolean sonIguales(Carta c){
       
       if(mismoPalo(c) && mismoValor(c))
           return true;
       else return false;
       
   }
   public boolean mismoPalo(Carta c){
       
       if(this.palo == c.palo)
           return true;
       else return false;
       
       
   }
   public boolean mismoValor(Carta c){
       
       if(this.valor == c.valor)
           return true;
       else return false;
       
   }
 
    
}
