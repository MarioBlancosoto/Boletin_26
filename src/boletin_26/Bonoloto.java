/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_26;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Bonoloto extends javax.swing.JFrame {

    ArrayList<JTextField> textos;
    ArrayList<JTextField> campos = new ArrayList<JTextField>();
    boolean aux = false;

    Random rnd = new Random();

    public Bonoloto() {
        initComponents();
    }

    public void cargarTextos() {

        textos.add(campo7);
        textos.add(campo8);
        textos.add(campo9);
        textos.add(campo10);
        textos.add(campo11);
        textos.add(campo12);

    }

    public void recogerNum() {
        boolean control = false;

        campos.add(campo1);
        campos.add(campo2);
        campos.add(campo3);
        campos.add(campo4);
        campos.add(campo5);
        campos.add(campo6);

        for (int i = 0; i < campos.size(); i++) {
            campos.get(i).getText();
            if (campos.get(i).getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debes rellenar los campos");
                break;

            } else if (Integer.parseInt(campos.get(i).getText()) < 1 || Integer.parseInt(campos.get(i).getText()) > 49) {

                JOptionPane.showMessageDialog(null, "Los números deben ser mayor de 0 y menor de 50");
                break;

            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campo5 = new javax.swing.JTextField();
        campo2 = new javax.swing.JTextField();
        campo1 = new javax.swing.JTextField();
        campo6 = new javax.swing.JTextField();
        campo4 = new javax.swing.JTextField();
        campo3 = new javax.swing.JTextField();
        botonXera = new javax.swing.JButton();
        botonXoga1 = new javax.swing.JButton();
        campo7 = new javax.swing.JTextField();
        campo8 = new javax.swing.JTextField();
        campo9 = new javax.swing.JTextField();
        campo10 = new javax.swing.JTextField();
        campo11 = new javax.swing.JTextField();
        campo12 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campo5.setBackground(new java.awt.Color(255, 204, 204));
        campo5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(campo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 50, 104, 44));

        campo2.setBackground(new java.awt.Color(255, 204, 204));
        campo2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 50, 107, 44));

        campo1.setBackground(new java.awt.Color(255, 204, 204));
        campo1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo1ActionPerformed(evt);
            }
        });
        jPanel1.add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 104, 44));

        campo6.setBackground(new java.awt.Color(255, 204, 204));
        campo6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(campo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 50, 104, 44));

        campo4.setBackground(new java.awt.Color(255, 204, 204));
        campo4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(campo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 104, 44));

        campo3.setBackground(new java.awt.Color(255, 204, 204));
        campo3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(campo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 50, 104, 44));

        botonXera.setBackground(new java.awt.Color(51, 255, 102));
        botonXera.setText("XERAR NUMEROS");
        botonXera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonXera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonXeraActionPerformed(evt);
            }
        });
        jPanel1.add(botonXera, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 153, 180, 50));

        botonXoga1.setBackground(new java.awt.Color(255, 51, 51));
        botonXoga1.setText("JUGAR");
        botonXoga1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonXoga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonXoga1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonXoga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 154, 180, 50));

        campo7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(campo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 264, 107, 44));

        campo8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(campo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 264, 107, 44));

        campo9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo9ActionPerformed(evt);
            }
        });
        jPanel1.add(campo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 264, 107, 44));

        campo10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(campo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 264, 107, 44));

        campo11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(campo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 264, 107, 44));

        campo12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo12ActionPerformed(evt);
            }
        });
        jPanel1.add(campo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 264, 107, 44));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("                         BONOWEY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 11, 296, 21));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mario\\Documents\\NetBeansProjects\\Boletin_26\\bonoloto.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 370));

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

    private void botonXeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonXeraActionPerformed
        //String campo;
        //campo = NumberFormat.getInstance().format(aleatorio); 

        textos = new ArrayList<JTextField>();
        this.cargarTextos();
        for (int i = 0; i < textos.size(); i++) {

            textos.get(i).setText(String.valueOf(rnd.nextInt(49) + 1));
        }

        /**
         * campo7.setText(""+rnd.nextInt(49)+1);
         * campo8.setText(""+rnd.nextInt(49)+1);
         * campo9.setText(""+rnd.nextInt(49)+1);
         * campo10.setText(""+rnd.nextInt(49)+1);
         * campo12.setText(""+rnd.nextInt(49)+1);
         * campo11.setText(""+rnd.nextInt(49)+1);
         *
         */
    }//GEN-LAST:event_botonXeraActionPerformed

    private void botonXoga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonXoga1ActionPerformed
        int aciertos = 0;

        this.recogerNum();

        for (int i = 0; i < campos.size(); i++) {
            //campos.get(i).getText();

            for (int j = 0; j < textos.size(); j++) {
                if (campos.get(i).getText().compareTo(textos.get(j).getText()) == 0) {
                    aciertos++;
                }
                if (aciertos == 6) {
                    JOptionPane.showMessageDialog(null, "Premio!!!");
                    break;
                } else {

                }

            }

        }

        JOptionPane.showMessageDialog(null, "Ha acertado " + "" + aciertos);

    }//GEN-LAST:event_botonXoga1ActionPerformed

    private void campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo1ActionPerformed

    private void campo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo9ActionPerformed

    private void campo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo12ActionPerformed

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
            java.util.logging.Logger.getLogger(Bonoloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bonoloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bonoloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bonoloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bonoloto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonXera;
    private javax.swing.JButton botonXoga1;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo10;
    private javax.swing.JTextField campo11;
    private javax.swing.JTextField campo12;
    private javax.swing.JTextField campo2;
    private javax.swing.JTextField campo3;
    private javax.swing.JTextField campo4;
    private javax.swing.JTextField campo5;
    private javax.swing.JTextField campo6;
    private javax.swing.JTextField campo7;
    private javax.swing.JTextField campo8;
    private javax.swing.JTextField campo9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
