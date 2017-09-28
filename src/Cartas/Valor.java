
package Cartas;


public enum Valor {
     AS(1),DOS(2),TRES(3),CUATRO(4),CINCO(5),SEIS(6),SIETE(7),OCHO(8),NUEVE(9),DIEZ(10),J(11),Q(12),K(13);
    private final int valor;

        Valor(int numVal) {
        this.valor = numVal;
        }

      public int getValorEnum() {
        return valor;
    }
    
}
