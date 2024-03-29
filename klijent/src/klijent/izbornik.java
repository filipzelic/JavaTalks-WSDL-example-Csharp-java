/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package klijent;

import java.util.List;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComboBox;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.basic.*;

/**
 *
 * @author filipzelic
 */
public class izbornik extends javax.swing.JFrame {
    private ServisSoap proxy;
    
    /**
     * Creates new form izbornik
     */
    public izbornik() {
        initComponents();
        
        Servis ws = new Servis();
        this.proxy = ws.getServisSoap();

        
        ArrayOfStudent arrayStudents = proxy.listaSvihStudenata();
        List<Student> listaStudenata = arrayStudents.getStudent();
        for(Student s: listaStudenata) {
          ddlStudenata.addItem(s);
        }
        
        ArrayOfKolegij listOfKolegij = proxy.listaSvihKolegija();
        List<Kolegij> listaKolegija = listOfKolegij.getKolegij();
        for(Kolegij k: listaKolegija) {
          ddlKolegija.addItem(k);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ddlStudenata1 = new javax.swing.JComboBox();
        ddlKolegija = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        label1 = new java.awt.Label();
        label4 = new java.awt.Label();
        ddlStudenata = new javax.swing.JComboBox();

        ddlStudenata1.setName("ddlStudenata"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ddlKolegija.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Odaberi kolegij" }));
        ddlKolegija.setName("ddlKolegija"); // NOI18N
        ddlKolegija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlKolegijaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        label1.setText("ili");

        label4.setName("lblLista"); // NOI18N

        ddlStudenata.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Odaberi studenta" }));
        ddlStudenata.setName("ddlStudenata"); // NOI18N
        ddlStudenata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlStudenataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ddlStudenata, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(ddlKolegija, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ddlKolegija, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ddlStudenata, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ddlStudenataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlStudenataActionPerformed
        Student student = (Student) ddlStudenata.getSelectedItem();
        
        ArrayOfKolegij listOfKolegij = proxy.listaUpisanihKolegijaZaStudenta(student.getIDStudent());
                    
        List<Kolegij> listaKolegija = listOfKolegij.getKolegij();
        DefaultListModel listModel = new DefaultListModel();
        for(Kolegij k: listaKolegija) {
          listModel.addElement(k.getNaziv() + ", " + k.getNositelj() + ", " + k.getECTS());
        }
        jList1.setModel(listModel);
        
        label4.setText("Lista upisanih kolegija za studenta " + student.getIme() + " " + student.getPrezime());
    }//GEN-LAST:event_ddlStudenataActionPerformed

    private void ddlKolegijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlKolegijaActionPerformed
        Kolegij kolegij = (Kolegij) ddlKolegija.getSelectedItem();
        
        ArrayOfStudent listOfStudents = proxy.listaUpisanihStudenataZaKolegij(kolegij.getIDKolegij());
                    
        List<Student> listaStudenata = listOfStudents.getStudent();
        DefaultListModel listModel = new DefaultListModel();
        for(Student s: listaStudenata) {
          listModel.addElement(s.getIme() + " " + s.getPrezime());
        }
        jList1.setModel(listModel);
        
        label4.setText("Lista upisanih studenata za kolegij " + kolegij.getNaziv());
    }//GEN-LAST:event_ddlKolegijaActionPerformed

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
            java.util.logging.Logger.getLogger(izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new izbornik().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ddlKolegija;
    private javax.swing.JComboBox ddlStudenata;
    private javax.swing.JComboBox ddlStudenata1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}
