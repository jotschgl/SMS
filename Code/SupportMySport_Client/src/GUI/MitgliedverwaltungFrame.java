/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Communication.ClubMemberDTO;
import Communication.interfaces.IUseCaseControllerFactory;
import Controller.interfaces.IClubMemberController;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Raphaela
 */
public class MitgliedverwaltungFrame extends javax.swing.JFrame {

    /**
     * Creates new form MitgliedverwaltungFrame
     */
    public MitgliedverwaltungFrame() {
        initComponents();
        fillTable();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        tableMitglied.setAutoCreateRowSorter(true);
        this.setRowSorter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        memberSearch = new javax.swing.JTextField();
        NeuesMitgliedButton = new javax.swing.JButton();
        AenderungenSpeichernButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMitglied = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Support My Sports - MitgliederVerwaltung");
        setPreferredSize(new java.awt.Dimension(520, 380));
        setResizable(false);

        memberSearch.setMinimumSize(new java.awt.Dimension(6, 25));
        memberSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberSearchActionPerformed(evt);
            }
        });
        memberSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                memberSearchKeyReleased(evt);
            }
        });

        NeuesMitgliedButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NeuesMitgliedButton.setText("Neues Mitglied anlegen");
        NeuesMitgliedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeuesMitgliedButtonActionPerformed(evt);
            }
        });

        AenderungenSpeichernButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        AenderungenSpeichernButton.setText("Änderungen speichern");
        AenderungenSpeichernButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AenderungenSpeichernButtonMouseClicked(evt);
            }
        });

        tableMitglied.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vorname", "Nachname", "Land", "Stadt", "E-Mail", "Geburtstag"
            }
        ));
        jScrollPane1.setViewportView(tableMitglied);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(NeuesMitgliedButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AenderungenSpeichernButton))
                    .addComponent(memberSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(memberSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NeuesMitgliedButton)
                    .addComponent(AenderungenSpeichernButton))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memberSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberSearchActionPerformed

    private void NeuesMitgliedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NeuesMitgliedButtonActionPerformed
        // TODO add your handling code here:
        MitgliedFrame mf = new MitgliedFrame(this);
        mf.setVisible(true);
    }//GEN-LAST:event_NeuesMitgliedButtonActionPerformed

    private void AenderungenSpeichernButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AenderungenSpeichernButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AenderungenSpeichernButtonMouseClicked

    private void memberSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memberSearchKeyReleased
        // TODO add your handling code here:
        String text = memberSearch.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        }
    }//GEN-LAST:event_memberSearchKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MitgliedverwaltungFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MitgliedverwaltungFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MitgliedverwaltungFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MitgliedverwaltungFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MitgliedverwaltungFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AenderungenSpeichernButton;
    private javax.swing.JButton NeuesMitgliedButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField memberSearch;
    private javax.swing.JTable tableMitglied;
    // End of variables declaration//GEN-END:variables
    private TableRowSorter<TableModel> sorter;
    
    private void showFrame() {
        WelcomeFrame fr = new WelcomeFrame();
        this.dispose();
        this.setVisible(false);
        fr.setVisible(true);
    }

    private void setRowSorter() {
        TableModel model = tableMitglied.getModel();
        sorter = new TableRowSorter<TableModel>(model);
        tableMitglied.setRowSorter(sorter);
    }

    private void fillTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tableMitglied.getModel();
            
            IClubMemberController cmc = GUIController.getClubMemberController();
            for (ClubMemberDTO member : cmc.getAllClubMembers()) {
                model.addRow(new Object[]{member.getFirstname(), member.getLastname(), member.getCountry(), member.getCity(), member.getMail(), member.getBirthday().toString()});
            }
        } catch (RemoteException ex) {
            Logger.getLogger(MitgliedverwaltungFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateTable() {
        fillTable();
    }
}
