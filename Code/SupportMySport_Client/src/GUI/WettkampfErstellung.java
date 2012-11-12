/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CommunicationInterfaces.CompetitionDTO;
import CommunicationInterfaces.ICompetitionDTOControllerFactory;
import CommunicationInterfaces.MeetingDTO;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andreas
 */
public class WettkampfErstellung extends javax.swing.JFrame {

    /**
     * Creates new form WettkampfErstellung
     */
    private CompetitionDTO curCompetition;
    private ICompetitionDTOControllerFactory controller;

    public WettkampfErstellung(CompetitionDTO comptetition) throws RemoteException {
        initComponents();
        this.setLocationRelativeTo(null);
        setVisible(true);
        this.controller = GUIController.getCompetitionController();
        this.curCompetition = comptetition;
        fillTableWithCompetitions();
        fillGeneralInformation();
        tableBegegnungen.setAutoCreateRowSorter(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonBegegnung = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBegegnungen = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        wettkampfFee = new javax.swing.JLabel();
        wettkampfName2 = new javax.swing.JLabel();
        wettkampfName = new javax.swing.JLabel();
        wettkampfDate = new javax.swing.JLabel();
        wettkampfAbteilung = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Suppor My Sprts - Wettkampf bearbeiten");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Allgemeine Informationen");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Wettkampf");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Datum");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Abteilung");
        jLabel5.setMaximumSize(new java.awt.Dimension(59, 25));
        jLabel5.setMinimumSize(new java.awt.Dimension(59, 25));
        jLabel5.setPreferredSize(new java.awt.Dimension(59, 25));

        buttonBegegnung.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        buttonBegegnung.setText("Begegnung hinzufügen");
        buttonBegegnung.setPreferredSize(new java.awt.Dimension(73, 25));
        buttonBegegnung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBegegnungMouseClicked(evt);
            }
        });
        buttonBegegnung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBegegnungActionPerformed(evt);
            }
        });

        tableBegegnungen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableBegegnungen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team 1", "Team 2", "Punkte Team 1", "Punkte Team 2", "Datum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableBegegnungen.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableBegegnungen);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Gebühr");

        wettkampfFee.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        wettkampfName2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        wettkampfName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        wettkampfDate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        wettkampfAbteilung.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBegegnung, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(wettkampfName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(wettkampfFee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(wettkampfDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(wettkampfName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(wettkampfAbteilung, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                                .addGap(385, 385, 385)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wettkampfName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wettkampfFee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wettkampfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(wettkampfAbteilung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(18, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonBegegnung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(wettkampfName2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBegegnungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBegegnungMouseClicked
        // TODO add your handling code here:
        BegnungenErstellenFrame f = new BegnungenErstellenFrame(this);
        f.setVisible(true);
    }//GEN-LAST:event_buttonBegegnungMouseClicked

    private void buttonBegegnungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBegegnungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBegegnungActionPerformed

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
            java.util.logging.Logger.getLogger(WettkampfErstellung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WettkampfErstellung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WettkampfErstellung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WettkampfErstellung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new WettkampfErstellung(null).setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(WettkampfErstellung.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBegegnung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBegegnungen;
    private javax.swing.JLabel wettkampfAbteilung;
    private javax.swing.JLabel wettkampfDate;
    private javax.swing.JLabel wettkampfFee;
    private javax.swing.JLabel wettkampfName;
    private javax.swing.JLabel wettkampfName2;
    // End of variables declaration//GEN-END:variables

    private void fillTableWithCompetitions() throws RemoteException {

        DefaultTableModel tablemodel = (DefaultTableModel) tableBegegnungen.getModel();

        for (MeetingDTO m : curCompetition.getAllCompetitionMeetings()) {
            if (m != null) {
                tablemodel.addRow(new Object[]{m.getTeamByTeamAId().getTeamName(), m.getTeamByTeamBId().getTeamName(), m.getPointsA(), m.getPointsB(), m.getCompetition().getDateOfCompetition()});
            } else {
                System.out.println("NO MEETINGS FOR THESE COMPETITION");
            }
        }
    }

    private void fillGeneralInformation() throws RemoteException {
        System.out.println("FOUND COMPETITION");
        wettkampfName.setText(curCompetition.getName());
        wettkampfFee.setText(String.valueOf(curCompetition.getCompetitionfee()));
        wettkampfDate.setText(curCompetition.getDateOfCompetition().toString());
        wettkampfAbteilung.setText(curCompetition.getDepartment().getDepartmentName());
    }
}