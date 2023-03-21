/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author EDUARDO.C
 */
public class Ventanaganador extends javax.swing.JDialog {

    private String usuario;
    private String usuario2;
    public Ventanaganador(javax.swing.JFrame parent, boolean modal,String usuario) {
        super(parent, modal);
        this.usuario=usuario;
        initComponents();
        this.setSize(400,400);
        setLocationRelativeTo(null);
    }

      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetanombre = new javax.swing.JLabel();
        botonreinicio = new javax.swing.JButton();
        botonsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetanombre.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        etiquetanombre.setText("Felicidades :" + usuario);
        getContentPane().add(etiquetanombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 320, 30));

        botonreinicio.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        botonreinicio.setText("Jugar de nuevo");
        botonreinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonreinicioActionPerformed(evt);
            }
        });
        getContentPane().add(botonreinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        botonsalir.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        botonsalir.setText("Salir");
        botonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/winner.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 480, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonreinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonreinicioActionPerformed
      
     
       dispose();
    }//GEN-LAST:event_botonreinicioActionPerformed

    private void botonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonsalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Ventanaganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanaganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanaganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanaganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ventanaganador dialog = new Ventanaganador(new javax.swing.JFrame(), true,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonreinicio;
    private javax.swing.JButton botonsalir;
    private javax.swing.JLabel etiquetanombre;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
