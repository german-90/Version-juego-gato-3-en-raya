/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author EDUARDO.C
 */
public class Ventanaprincipal extends javax.swing.JFrame {

    public boolean casillas[][] = new boolean[3][3];
    public String turno = "usuario1";
    public int matriz[][] = new int[3][3];
    private String usuario1;
    private String usuario2;
    private int contadorx = 0, contadoro = 0, contadorempates = 0;

    public Ventanaprincipal(String usuario1, String usuario2) {
        initComponents();
        setLocationRelativeTo(null);
        llenarcasillas();
        llenarmatriz();
        this.setSize(600, 500);
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
    }

    private void llenarcasillas() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casillas[i][j] = true;
            }
        }
    }

    private void llenarmatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l1 = new javax.swing.JButton();
        l2 = new javax.swing.JButton();
        l3 = new javax.swing.JButton();
        l4 = new javax.swing.JButton();
        l5 = new javax.swing.JButton();
        l6 = new javax.swing.JButton();
        l7 = new javax.swing.JButton();
        l8 = new javax.swing.JButton();
        l9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jresultados = new javax.swing.JMenuItem();
        reset = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 500));
        setSize(new java.awt.Dimension(600, 500));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1ActionPerformed(evt);
            }
        });
        jPanel1.add(l1);

        l2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2ActionPerformed(evt);
            }
        });
        jPanel1.add(l2);

        l3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3ActionPerformed(evt);
            }
        });
        jPanel1.add(l3);

        l4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l4ActionPerformed(evt);
            }
        });
        jPanel1.add(l4);

        l5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l5ActionPerformed(evt);
            }
        });
        jPanel1.add(l5);

        l6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l6ActionPerformed(evt);
            }
        });
        jPanel1.add(l6);

        l7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l7ActionPerformed(evt);
            }
        });
        jPanel1.add(l7);

        l8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l8ActionPerformed(evt);
            }
        });
        jPanel1.add(l8);

        l9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l9ActionPerformed(evt);
            }
        });
        jPanel1.add(l9);

        jMenu1.setText("Menu");

        jresultados.setText("Mostrar tabla");
        jresultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresultadosActionPerformed(evt);
            }
        });
        jMenu1.add(jresultados);

        reset.setText("Comenzarde nuevo");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jMenu1.add(reset);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1ActionPerformed
        if (casillas[0][0] == true) {
            if (turno == "usuario1") {
                pulsarx(l1);
                matriz[0][0] = 1;
                turno = "usuario2";
            } else {
                pulsaro(l1);
                matriz[0][0] = 2;
                turno = "usuario1";
            }
            casillas[0][0] = false;
            comprobarjuego();
        }
    }//GEN-LAST:event_l1ActionPerformed

    private void l2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2ActionPerformed
        if (casillas[0][1] == true) {
            if (turno == "usuario1") {
                pulsarx(l2);
                matriz[0][1] = 1;
                turno = "usuario2";
            } else {
                pulsaro(l2);
                matriz[0][1] = 2;
                turno = "usuario1";
            }
            casillas[0][1] = false;
            comprobarjuego();
        }
    }//GEN-LAST:event_l2ActionPerformed

    private void l3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3ActionPerformed
        if (casillas[0][2] == true) {
            if (turno == "usuario1") {
                pulsarx(l3);
                matriz[0][2] = 1;
                turno = "usuario2";
            } else {
                pulsaro(l3);
                matriz[0][2] = 2;
                turno = "usuario1";
            }
            casillas[0][2] = false;
            comprobarjuego();
        }
    }//GEN-LAST:event_l3ActionPerformed

    private void l4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l4ActionPerformed
        if (casillas[1][0] == true) {
            if (turno == "usuario1") {
                pulsarx(l4);
                matriz[1][0] = 1;
                turno = "usuario2";
            } else {
                pulsaro(l4);
                matriz[1][0] = 2;
                turno = "usuario1";
            }
            casillas[1][0] = false;
            comprobarjuego();
        }
    }//GEN-LAST:event_l4ActionPerformed

    private void l5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l5ActionPerformed
        if (casillas[1][1] == true) {
            if (turno == "usuario1") {
                pulsarx(l5);
                matriz[1][1] = 1;
                turno = "usuario2";
            } else {
                pulsaro(l5);
                matriz[1][1] = 2;
                turno = "usuario1";
            }
            casillas[1][1] = false;
            comprobarjuego();
        }
    }//GEN-LAST:event_l5ActionPerformed

    private void l6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l6ActionPerformed
        if (casillas[1][2] == true) {
            if (turno == "usuario1") {
                pulsarx(l6);
                matriz[1][2] = 1;
                turno = "usuario2";
            } else {
                pulsaro(l6);
                matriz[1][2] = 2;
                turno = "usuario1";
            }
            casillas[1][2] = false;
            comprobarjuego();
        }
    }//GEN-LAST:event_l6ActionPerformed

    private void l7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l7ActionPerformed
        if (casillas[2][0] == true) {
            if (turno == "usuario1") {
                pulsarx(l7);
                matriz[2][0] = 1;
                turno = "usuario2";
            } else {
                pulsaro(l7);
                matriz[2][0] = 2;
                turno = "usuario1";
            }
            casillas[2][0] = false;
            comprobarjuego();
        }
    }//GEN-LAST:event_l7ActionPerformed

    private void l8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l8ActionPerformed
        if (casillas[2][1] == true) {
            if (turno == "usuario1") {
                pulsarx(l8);
                matriz[2][1] = 1;
                turno = "usuario2";
            } else {
                pulsaro(l8);
                matriz[2][1] = 2;
                turno = "usuario1";
            }
            casillas[2][1] = false;
            comprobarjuego();
        }
    }//GEN-LAST:event_l8ActionPerformed

    private void l9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l9ActionPerformed
        if (casillas[2][2] == true) {
            if (turno == "usuario1") {
                pulsarx(l9);
                matriz[2][2] = 1;
                turno = "usuario2";
            } else {
                pulsaro(l9);
                matriz[2][2] = 2;
                turno = "usuario1";
            }
            casillas[2][2] = false;
            comprobarjuego();
        }
    }//GEN-LAST:event_l9ActionPerformed

    private void jresultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresultadosActionPerformed
        Ventanaresultados resultados = new Ventanaresultados(this, true, usuario1, usuario2, contadorx, contadoro, contadorempates);
        resultados.setVisible(true);
    }//GEN-LAST:event_jresultadosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        llenarcasillas();
        llenarmatriz();
        reiniciarJuego();
    }//GEN-LAST:event_resetActionPerformed

    private void pulsarx(JButton x) {
        x.setIcon(new ImageIcon(getClass().getResource("/Imagenes/x.png")));
    }

    private void pulsaro(JButton o) {
        o.setIcon(new ImageIcon(getClass().getResource("/Imagenes/o.png")));
    }

    private void restaurar(JButton y) {

        y.setIcon(null);
    }

    private void comprobarjuego() {
        // Ventanainicial ventana= new Ventanainicial();

        boolean ganador1 = false;
        boolean ganador2 = false;
        int casillaempate = 0;

        ganador1 = comprobar(1);
        ganador2 = comprobar(2);

        if (ganador1 == true) {
            contadorx++;
            Ventanaganador ganador = new Ventanaganador(this, true, usuario1);
            ganador.setVisible(true);

            reiniciarJuego();
        } else if (ganador2 == true) {
            contadoro++;
            Ventanaganador ganador = new Ventanaganador(this, true, usuario2);
            ganador.setVisible(true);

            reiniciarJuego();

        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] != 0) {
                        casillaempate++;
                    }
                }
            }
            if (casillaempate == 9) {
                contadorempates++;
                Empate empate = new Empate(this, true);
                empate.setVisible(true);
                reiniciarJuego();
            } else {
                casillaempate = 0;
            }
        }

    }

    private boolean comprobar(int num) {
        boolean ganador = false;
        if (matriz[0][0] == num && matriz[0][1] == num && matriz[0][2] == num) {
            ganador = true;
        } else if (matriz[1][0] == num && matriz[1][1] == num && matriz[1][2] == num) {
            ganador = true;
        } else if (matriz[2][0] == num && matriz[2][1] == num && matriz[2][2] == num) {
            ganador = true;
        } else if (matriz[0][0] == num && matriz[1][0] == num && matriz[2][0] == num) {
            ganador = true;
        } else if (matriz[0][1] == num && matriz[1][1] == num && matriz[2][1] == num) {
            ganador = true;
        } else if (matriz[0][2] == num && matriz[1][2] == num && matriz[2][2] == num) {
            ganador = true;
        } else if (matriz[0][0] == num && matriz[1][1] == num && matriz[2][2] == num) {
            ganador = true;
        } else if (matriz[0][2] == num && matriz[1][1] == num && matriz[2][0] == num) {
            ganador = true;
        }

        return ganador;
    }

    private void reiniciarJuego() {
        llenarcasillas();
        llenarmatriz();

        restaurar(l1);
        restaurar(l2);
        restaurar(l3);
        restaurar(l4);
        restaurar(l5);
        restaurar(l6);
        restaurar(l7);
        restaurar(l8);
        restaurar(l9);

        quienjuegaprimero();
    }

    private void quienjuegaprimero() {
        Ventanaseleccion seleccion = new Ventanaseleccion(this, true, usuario1, usuario2);
        seleccion.setVisible(true);
        turno = seleccion.getTurno();
    }

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
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanaprincipal(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jresultados;
    private javax.swing.JButton l1;
    private javax.swing.JButton l2;
    private javax.swing.JButton l3;
    private javax.swing.JButton l4;
    private javax.swing.JButton l5;
    private javax.swing.JButton l6;
    private javax.swing.JButton l7;
    private javax.swing.JButton l8;
    private javax.swing.JButton l9;
    private javax.swing.JMenuItem reset;
    // End of variables declaration//GEN-END:variables
}
