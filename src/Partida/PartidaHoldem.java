
package Partida;

import Juego.Jugada;
import Juego.Jugador;
import Juego.Mano;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class PartidaHoldem extends javax.swing.JFrame {

    /**
     * Creates new form PartidaHoldem
     */
    private Jugador maquina = new Jugador("Maquina");
    private Jugada jugada;
    private int contadorDeJugadas;
    private int contadorJuego;
    private static final int MAXCARTASMANO = 7;
    private static final int CIEGAGRANDE = 10;
    private static final int CIEGAPEQUE = 5;
    private int apuestaJugada = 0;
    private Jugador j1;
    public PartidaHoldem(Jugador j1) {
        initComponents();
        this.j1 = j1;
        contadorDeJugadas = 0;
        
        comenzarJuego();
       
        
    }
    
    public final void comenzarJuego(){
        if(j1.getFichasTotales()>0){
           
        jugada = new Jugada(MAXCARTASMANO, this.j1, maquina);
         fichasJugLabel.setText(""+ jugada.getJ1().getFichasTotales());
        contadorDeJugadas +=1;
        contadorJuego +=1;
        if(contadorDeJugadas % 2 == 0){
          apuestaJugada =  jugada.getJ1().apostar(CIEGAGRANDE) + jugada.getJ2().apostar(CIEGAPEQUE); 
        }
        else apuestaJugada =  jugada.getJ1().apostar(CIEGAPEQUE) + jugada.getJ2().apostar(CIEGAGRANDE);
        
        jugada.getJ1().repartir(jugada.getB().sacarPrimeraCarta());
        jugada.getJ1().repartir(jugada.getB().sacarPrimeraCarta());
        jugada.getJ2().repartir(jugada.getB().sacarPrimeraCarta());
        jugada.getJ2().repartir(jugada.getB().sacarPrimeraCarta());

        c1.setText(jugada.getJ1().getMano().get(0).toString());
        c2.setText(jugada.getJ1().getMano().get(1).toString());
        apuestaLabel.setText(apuestaJugada + " FICHAS");
    }
         else JOptionPane.showMessageDialog(null,"NO TIENES FICHAS PARA SEGUIR JUGANDO!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pasarBoton = new javax.swing.JButton();
        retirarseBoton = new javax.swing.JButton();
        apostarBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        apuestaLabel = new javax.swing.JLabel();
        fichasJLabel = new javax.swing.JLabel();
        fichasJugLabel = new javax.swing.JLabel();
        nuevaJugadaBoton = new javax.swing.JButton();
        volverBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pasarBoton.setText("Pasar");
        pasarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasarBotonActionPerformed(evt);
            }
        });

        retirarseBoton.setText("Retirarse");
        retirarseBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarseBotonActionPerformed(evt);
            }
        });

        apostarBoton.setText("Apostar");
        apostarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apostarBotonActionPerformed(evt);
            }
        });

        jLabel1.setText("TUS CARTAS");

        jLabel2.setText("CARTAS DE LA MESA");

        jLabel3.setText("APUESTA EN JUEGO:");

        apuestaLabel.setText("0");

        fichasJLabel.setText("TUS FICHAS");

        nuevaJugadaBoton.setText("NUEVA JUGADA");

        volverBoton.setText("VOLVER");
        volverBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pasarBoton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(retirarseBoton)
                                        .addGap(156, 156, 156)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(apuestaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(142, 142, 142)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(fichasJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(fichasJugLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(apostarBoton)
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c2, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(nuevaJugadaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volverBoton)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(volverBoton))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fichasJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fichasJugLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apuestaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pasarBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(retirarseBoton)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apostarBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addComponent(nuevaJugadaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pasarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasarBotonActionPerformed
        // TODO add your handling code here:
      
         if(contadorJuego == 1){
        jugada.getJ1().repartir(jugada.getB().sacarPrimeraCarta());
        jugada.getJ2().repartir(jugada.getJ1().getMano().get(jugada.getJ1().getMano().size()-1));
        c3.setText(jugada.getJ1().getMano().get(2).toString());
        jugada.getJ1().repartir(jugada.getB().sacarPrimeraCarta());
        c4.setText(jugada.getJ1().getMano().get(3).toString());
        jugada.getJ2().repartir(jugada.getJ1().getMano().get(jugada.getJ1().getMano().size()-1));
        jugada.getJ1().repartir(jugada.getB().sacarPrimeraCarta());
        c5.setText(jugada.getJ1().getMano().get(4).toString());
        jugada.getJ2().repartir(jugada.getJ1().getMano().get(jugada.getJ1().getMano().size()-1));
        contadorJuego+=1;
        
        }
        else if (contadorJuego == 2)
        {
            jugada.getJ1().repartir(jugada.getB().sacarPrimeraCarta());
            c6.setText(jugada.getJ1().getMano().get(5).toString());
        jugada.getJ2().repartir(jugada.getJ1().getMano().get(jugada.getJ1().getMano().size()-1));
        contadorJuego+=1;}
        
        else if(contadorJuego == 3){
            jugada.getJ1().repartir(jugada.getB().sacarPrimeraCarta());
            c7.setText(jugada.getJ1().getMano().get(6).toString());
        jugada.getJ2().repartir(jugada.getJ1().getMano().get(jugada.getJ1().getMano().size()-1));
        contadorJuego+=1;
     
        }
        else if (contadorJuego == 4){
            
        contadorJuego+=1;
        if(jugada.establecerGanador() != null){
        JOptionPane.showMessageDialog(null,"Ganador: " + jugada.establecerGanador().getNombre());
        if(jugada.establecerGanador().getNombre() == j1.getNombre())
            jugada.getJ1().actualizaGanancias(apuestaJugada);
        else jugada.getJ1().actualizaPerdidas(apuestaJugada);
   
        
        
        }}
        else JOptionPane.showMessageDialog(null,"Empate");

         jugada.getJ2().getMano().imprimir();
        
    }//GEN-LAST:event_pasarBotonActionPerformed

    private void apostarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apostarBotonActionPerformed
        // TODO add your handling code here:

        
   if(contadorJuego == 1){
       
       
        int respuesta =  Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto quieres apostar?: "));
        if(respuesta >= jugada.getJ1().getFichasTotales() ){
            JOptionPane.showInputDialog("No tienes fichas suficientes");
        }else{
        apuestaJugada += jugada.getJ1().apostar(respuesta) + jugada.getJ2().apostar(respuesta);
        jugada.getJ1().repartir(jugada.getB().sacarPrimeraCarta());
        jugada.getJ2().repartir(jugada.getJ1().getMano().get(jugada.getJ1().getMano().size()-1));
        c3.setText(jugada.getJ1().getMano().get(2).toString());
        jugada.getJ1().repartir(jugada.getB().sacarPrimeraCarta());
        c4.setText(jugada.getJ1().getMano().get(3).toString());
        jugada.getJ2().repartir(jugada.getJ1().getMano().get(jugada.getJ1().getMano().size()-1));
        jugada.getJ1().repartir(jugada.getB().sacarPrimeraCarta());
        c5.setText(jugada.getJ1().getMano().get(4).toString());
        jugada.getJ2().repartir(jugada.getJ1().getMano().get(jugada.getJ1().getMano().size()-1));
        contadorJuego+=1;}
        
        }
        else if (contadorJuego == 2)
        {
            int respuesta =  Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto quieres apostar?: "));
            if(respuesta >= jugada.getJ1().getFichasTotales() ){
            JOptionPane.showInputDialog("No tienes fichas suficientes");
        }else{
        apuestaJugada += jugada.getJ1().apostar(respuesta) + jugada.getJ2().apostar(respuesta);
            jugada.getJ1().repartir(jugada.getB().sacarPrimeraCarta());
            c6.setText(jugada.getJ1().getMano().get(5).toString());
        jugada.getJ2().repartir(jugada.getJ1().getMano().get(jugada.getJ1().getMano().size()-1));
        contadorJuego+=1;}}
        
        else if(contadorJuego == 3){
            int respuesta =  Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto quieres apostar?: "));
            if(respuesta >= jugada.getJ1().getFichasTotales() ){
            JOptionPane.showInputDialog("No tienes fichas suficientes");
        }else{
        apuestaJugada += jugada.getJ1().apostar(respuesta) + jugada.getJ2().apostar(respuesta);
            jugada.getJ1().repartir(jugada.getB().sacarPrimeraCarta());
            c7.setText(jugada.getJ1().getMano().get(6).toString());
        jugada.getJ2().repartir(jugada.getJ1().getMano().get(jugada.getJ1().getMano().size()-1));
        contadorJuego+=1;}
     
        
        }
        else {
            int respuesta =  Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto quieres apostar?: "));
            if(respuesta >= jugada.getJ1().getFichasTotales() ){
            JOptionPane.showInputDialog("No tienes fichas suficientes");
        }else{
        apuestaJugada += jugada.getJ1().apostar(respuesta) + jugada.getJ2().apostar(respuesta);
            JOptionPane.showMessageDialog(null,"Ganador: " + jugada.establecerGanador().getNombre());
            if(jugada.establecerGanador().getNombre() == j1.getNombre())
        jugada.getJ1().actualizaGanancias(apuestaJugada);
            else jugada.getJ1().actualizaPerdidas(apuestaJugada);
            this.apuestaJugada = 0;
        this.contadorJuego = 0;
        this.jugada.getJ1().getMano().limpiarMano();
        this.jugada.getJ2().getMano().limpiarMano();
        this.c1.setText("");
        this.c2.setText("");
        this.c3.setText("");
        this.c4.setText("");
        this.c5.setText("");
        this.c6.setText("");
        this.c7.setText("");
        this.apuestaLabel.setText("");
        comenzarJuego();
        }}
   apuestaLabel.setText(apuestaJugada + " FICHAS");
    }//GEN-LAST:event_apostarBotonActionPerformed

    private void retirarseBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarseBotonActionPerformed
        // TODO add your handling code here:
        this.apuestaJugada = 0;
        this.contadorJuego = 0;
        this.jugada.getJ1().getMano().limpiarMano();
        this.jugada.getJ2().getMano().limpiarMano();
        this.c1.setText("");
        this.c2.setText("");
        this.c3.setText("");
        this.c4.setText("");
        this.c5.setText("");
        this.c6.setText("");
        this.c7.setText("");
        this.apuestaLabel.setText("");
        JOptionPane.showMessageDialog(null,"Gana la maquina, te has retirado");
        jugada.getJ1().setPartidasJugadas( jugada.getJ1().getPartidasJugadas()+1);
        comenzarJuego();
       
        
        
    }//GEN-LAST:event_retirarseBotonActionPerformed

    private void volverBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBotonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_volverBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Jugador j = new Jugador("daniel");
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PartidaHoldem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartidaHoldem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartidaHoldem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartidaHoldem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartidaHoldem(j).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apostarBoton;
    private javax.swing.JLabel apuestaLabel;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel fichasJLabel;
    private javax.swing.JLabel fichasJugLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton nuevaJugadaBoton;
    private javax.swing.JButton pasarBoton;
    private javax.swing.JButton retirarseBoton;
    private javax.swing.JButton volverBoton;
    // End of variables declaration//GEN-END:variables
}
