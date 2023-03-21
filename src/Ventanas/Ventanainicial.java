/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author EDUARDO.C
 */
public class Ventanainicial extends javax.swing.JFrame {

    private String usuario1;
    private String usuario2;

    public Ventanainicial() {
        initComponents();
        setLocationRelativeTo(null);
        botoncomenzar.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cajanombre1 = new javax.swing.JTextField();
        cajanombre2 = new javax.swing.JTextField();
        botonguardar = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        jturno1 = new javax.swing.JLabel();
        jturno2 = new javax.swing.JLabel();
        botoncomenzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 400));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Juego Gato");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 496, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setText("Digite primer usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 235, 26));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel3.setText("Digite segundo usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 101, 235, 31));

        cajanombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajanombre1ActionPerformed(evt);
            }
        });
        jPanel1.add(cajanombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 75, 266, -1));

        cajanombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajanombre2ActionPerformed(evt);
            }
        });
        jPanel1.add(cajanombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 106, 266, -1));

        botonguardar.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        botonguardar.setText("Guardar");
        botonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarActionPerformed(evt);
            }
        });
        jPanel1.add(botonguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 182, 296, -1));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tic.gif"))); // NOI18N
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 240, 210));

        jturno1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(jturno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 243, 215, 118));

        jturno2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(jturno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 371, 215, 119));

        botoncomenzar.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        botoncomenzar.setText("Comenzar juego");
        botoncomenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncomenzarActionPerformed(evt);
            }
        });
        jPanel1.add(botoncomenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarActionPerformed
        usuario1 = cajanombre1.getText();
        usuario2 = cajanombre2.getText();
        
        
        if (cajanombre1.getText().equals("") || cajanombre2.equals("")) {
            
            JOptionPane.showMessageDialog(rootPane, "No puede dejar campos vacios ");
        }
        else if (cajanombre1.getText().equals(cajanombre2.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Los nombres no pueden ser iguales ");
        
            
        }
       else {
            botonguardar.setEnabled(true);
            botoncomenzar.setVisible(true);
            jturno1.setText(usuario1 + "jugara primero ,su ficha es: X");
            jturno2.setText(usuario2 + "jugara segundo ,su ficha es: O");
            cajanombre1.setEnabled(false);
            cajanombre2.setEnabled(false);
        }
    }//GEN-LAST:event_botonguardarActionPerformed

    private void botoncomenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncomenzarActionPerformed

        Ventanaprincipal principal = new Ventanaprincipal(usuario1, usuario2);
        principal.setVisible(true);
        //Ventanaseleccion seleccion = new Ventanaseleccion(new javax.swing.JDialog(),true,usuario1,usuario2);

        this.dispose();
    }//GEN-LAST:event_botoncomenzarActionPerformed

    private void cajanombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajanombre1ActionPerformed

       


    }//GEN-LAST:event_cajanombre1ActionPerformed

    private void cajanombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajanombre2ActionPerformed

        if (cajanombre2.getText().length() > 15) {
            cajanombre2.setEnabled(false);
        }
    }//GEN-LAST:event_cajanombre2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventanainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanainicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoncomenzar;
    private javax.swing.JButton botonguardar;
    private javax.swing.JTextField cajanombre1;
    private javax.swing.JTextField cajanombre2;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jturno1;
    private javax.swing.JLabel jturno2;
    // End of variables declaration//GEN-END:variables
}
