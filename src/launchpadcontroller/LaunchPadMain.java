/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launchpadcontroller;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author Casa
 */
public class LaunchPadMain extends javax.swing.JFrame {

    

    public Clip clip;

    
    public static Librerias librerias = new Librerias();
    ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();

    public LaunchPadMain() {
        initComponents();
        Evento tecla = new Evento();
        addKeyListener(tecla);
        jTextField1.setVisible(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pad1 = new javax.swing.JButton();
        Pad2 = new javax.swing.JButton();
        Pad3 = new javax.swing.JButton();
        Pad4 = new javax.swing.JButton();
        Pad5 = new javax.swing.JButton();
        Pad6 = new javax.swing.JButton();
        Pad7 = new javax.swing.JButton();
        Pad8 = new javax.swing.JButton();
        Pad9 = new javax.swing.JButton();
        Pad10 = new javax.swing.JButton();
        Pad11 = new javax.swing.JButton();
        Pad12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Pad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launchpadcontroller/Img/pad_blue.9.png"))); // NOI18N
        Pad1.setDefaultCapable(false);
        Pad1.setFocusable(false);
        Pad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pad1ActionPerformed(evt);
            }
        });

        Pad2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launchpadcontroller/Img/pad_blue.9.png"))); // NOI18N
        Pad2.setFocusable(false);
        Pad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pad2ActionPerformed(evt);
            }
        });

        Pad3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launchpadcontroller/Img/pad_blue.9.png"))); // NOI18N
        Pad3.setFocusable(false);
        Pad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pad3ActionPerformed(evt);
            }
        });

        Pad4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launchpadcontroller/Img/pad_blue.9.png"))); // NOI18N
        Pad4.setFocusable(false);
        Pad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pad4ActionPerformed(evt);
            }
        });

        Pad5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launchpadcontroller/Img/pad_blue.9.png"))); // NOI18N
        Pad5.setFocusable(false);
        Pad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pad5ActionPerformed(evt);
            }
        });

        Pad6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launchpadcontroller/Img/pad_blue.9.png"))); // NOI18N
        Pad6.setFocusable(false);
        Pad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pad6ActionPerformed(evt);
            }
        });

        Pad7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launchpadcontroller/Img/pad_blue.9.png"))); // NOI18N
        Pad7.setFocusable(false);
        Pad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pad7ActionPerformed(evt);
            }
        });

        Pad8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launchpadcontroller/Img/pad_blue.9.png"))); // NOI18N
        Pad8.setFocusable(false);
        Pad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pad8ActionPerformed(evt);
            }
        });

        Pad9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launchpadcontroller/Img/pad_blue.9.png"))); // NOI18N
        Pad9.setFocusable(false);
        Pad9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pad9ActionPerformed(evt);
            }
        });

        Pad10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launchpadcontroller/Img/pad_blue.9.png"))); // NOI18N
        Pad10.setFocusable(false);
        Pad10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pad10ActionPerformed(evt);
            }
        });

        Pad11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launchpadcontroller/Img/pad_blue.9.png"))); // NOI18N
        Pad11.setFocusable(false);
        Pad11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pad11ActionPerformed(evt);
            }
        });

        Pad12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launchpadcontroller/Img/pad_blue.9.png"))); // NOI18N
        Pad12.setFocusable(false);
        Pad12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pad12ActionPerformed(evt);
            }
        });

        jLabel1.setText("1");

        jLabel2.setText("2");

        jLabel3.setText("3");

        jLabel4.setText("4");

        jLabel5.setText("5");

        jLabel6.setText("6");

        jLabel7.setText("7");

        jLabel8.setText("8");

        jLabel9.setText("9");

        jLabel10.setText("10");

        jLabel11.setText("11");

        jLabel12.setText("12");

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 204, 51));
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jTextArea1.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Librerias");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar session");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jTextField1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pad1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pad2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Pad3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel5)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(Pad7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(63, 63, 63)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Pad8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(Pad9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Pad10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Pad11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(Pad12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pad4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pad5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pad6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pad3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pad1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pad4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pad5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pad6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pad7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pad8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pad9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pad10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pad11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pad12, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pad1ActionPerformed
        play("kick", "nil");
    }//GEN-LAST:event_Pad1ActionPerformed

    private void Pad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pad2ActionPerformed
        play("clap", "nil");
    }//GEN-LAST:event_Pad2ActionPerformed

    private void Pad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pad3ActionPerformed
        play("hat", "nil");
    }//GEN-LAST:event_Pad3ActionPerformed

    private void Pad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pad4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pad4ActionPerformed

    private void Pad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pad5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pad5ActionPerformed

    private void Pad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pad6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pad6ActionPerformed

    private void Pad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pad7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pad7ActionPerformed

    private void Pad8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pad8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pad8ActionPerformed

    private void Pad9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pad9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pad9ActionPerformed

    private void Pad10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pad10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pad10ActionPerformed

    private void Pad11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pad11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pad11ActionPerformed

    private void Pad12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pad12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pad12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Librerias librerias = new Librerias();
        librerias.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
   
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LaunchPadMain ventana1 = new LaunchPadMain();
        LibreriasPremium ventana2 =  new LibreriasPremium();
        Paypal ventana3 =  new Paypal();
        PanelAdmin ventana4 =  new PanelAdmin();
        Librerias librerias = new Librerias();
        LoginAdmin login = new LoginAdmin();
        
        
        ventana1.setVisible(false);
        ventana2.setVisible(false);
        ventana3.setVisible(false);
        ventana4.setVisible(false);
        librerias.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
        
    class Evento implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int codigo = e.getKeyCode();
            String codigoString = Integer.toString(codigo);
            if (codigo == 49) {
                play("1", codigoString);
            }if (codigo == 50) {
                play("2", codigoString);
            }if (codigo == 51) {
                play("3", codigoString);
            }if (codigo == 52) {
                play("4", codigoString);
            }if (codigo == 53) {
                play("5", codigoString);
            }if (codigo == 54) {
                play("6", codigoString);
            }if (codigo == 55) {
                play("7", codigoString);
            }if (codigo == 56) {
                play("8", codigoString);
            }if (codigo == 57) {
                play("9", codigoString);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    public void play(String archivo, String codigo){
        try{
           clip = AudioSystem.getClip();
           clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(jTextField1.getText() + archivo + ".wav"))); 
           clip.start();
        }catch (Exception e){
            
        }  
        jTextArea1.setText("Sonido: " + archivo + "\nCodigo: " + codigo + "\nLibreria: " + jTextField1.getText().toString());
    }
        
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaunchPadMain().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pad1;
    private javax.swing.JButton Pad10;
    private javax.swing.JButton Pad11;
    private javax.swing.JButton Pad12;
    private javax.swing.JButton Pad2;
    private javax.swing.JButton Pad3;
    private javax.swing.JButton Pad4;
    private javax.swing.JButton Pad5;
    private javax.swing.JButton Pad6;
    private javax.swing.JButton Pad7;
    private javax.swing.JButton Pad8;
    private javax.swing.JButton Pad9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
