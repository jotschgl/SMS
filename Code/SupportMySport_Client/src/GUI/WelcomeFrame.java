/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CommunicationInterfaces.RoleRightDTO;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raphaela
 */
public class WelcomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeFrame
     */
    public WelcomeFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        setRoleUseCases();
        checkMessages();
        new MessageChecker();
        //GUIController.initRMI("localhost");
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
        MitgliedverwaltungButton = new javax.swing.JButton();
        WettkampfverwaltungButton = new javax.swing.JButton();
        RollenverwaltungKnopf = new javax.swing.JButton();
        buttonTeammitglierderverwaltung = new javax.swing.JButton();
        buttonMessage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Welcome");

        MitgliedverwaltungButton.setBackground(new java.awt.Color(153, 255, 153));
        MitgliedverwaltungButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        MitgliedverwaltungButton.setText("Mitgliedverwaltung");
        MitgliedverwaltungButton.setMaximumSize(new java.awt.Dimension(187, 25));
        MitgliedverwaltungButton.setMinimumSize(new java.awt.Dimension(187, 25));
        MitgliedverwaltungButton.setPreferredSize(new java.awt.Dimension(187, 25));
        MitgliedverwaltungButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MitgliedverwaltungButtonActionPerformed(evt);
            }
        });

        WettkampfverwaltungButton.setBackground(new java.awt.Color(255, 255, 153));
        WettkampfverwaltungButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        WettkampfverwaltungButton.setText("Wettkampfverwaltung");
        WettkampfverwaltungButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WettkampfverwaltungButtonActionPerformed(evt);
            }
        });

        RollenverwaltungKnopf.setBackground(new java.awt.Color(153, 255, 153));
        RollenverwaltungKnopf.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        RollenverwaltungKnopf.setText("Rollenverwaltung");
        RollenverwaltungKnopf.setMaximumSize(new java.awt.Dimension(187, 25));
        RollenverwaltungKnopf.setMinimumSize(new java.awt.Dimension(187, 25));
        RollenverwaltungKnopf.setPreferredSize(new java.awt.Dimension(187, 25));
        RollenverwaltungKnopf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollenverwaltungKnopfActionPerformed(evt);
            }
        });

        buttonTeammitglierderverwaltung.setBackground(new java.awt.Color(255, 255, 153));
        buttonTeammitglierderverwaltung.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        buttonTeammitglierderverwaltung.setText("Teammitglierderverwaltung");
        buttonTeammitglierderverwaltung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTeammitglierderverwaltungActionPerformed(evt);
            }
        });

        buttonMessage.setText("you have Mail");
        buttonMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMessageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RollenverwaltungKnopf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonTeammitglierderverwaltung))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MitgliedverwaltungButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WettkampfverwaltungButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buttonMessage))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WettkampfverwaltungButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MitgliedverwaltungButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RollenverwaltungKnopf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTeammitglierderverwaltung, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MitgliedverwaltungButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MitgliedverwaltungButtonActionPerformed
        MitgliedverwaltungFrame mv = new MitgliedverwaltungFrame();
        mv.setVisible(true);
    }//GEN-LAST:event_MitgliedverwaltungButtonActionPerformed

    private void WettkampfverwaltungButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WettkampfverwaltungButtonActionPerformed
        WettkampfFrame wF = new WettkampfFrame();
        wF.setVisible(true);

    }//GEN-LAST:event_WettkampfverwaltungButtonActionPerformed

    private void RollenverwaltungKnopfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollenverwaltungKnopfActionPerformed
        // TODO add your handling code here:
        MitgliedRolleZuteilenFrame mf;
        try {
            mf = new MitgliedRolleZuteilenFrame();
            mf.setVisible(true);
        } catch (RemoteException ex) {
            Logger.getLogger(WelcomeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RollenverwaltungKnopfActionPerformed

    private void buttonTeammitglierderverwaltungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTeammitglierderverwaltungActionPerformed
        MitgliederZuTeamFrame mf = new MitgliederZuTeamFrame();
        mf.setVisible(true);

    }//GEN-LAST:event_buttonTeammitglierderverwaltungActionPerformed

    private void buttonMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMessageActionPerformed
        MessageGUI mg = new MessageGUI();
        mg.setVisible(true);
    }//GEN-LAST:event_buttonMessageActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MitgliedverwaltungButton;
    private javax.swing.JButton RollenverwaltungKnopf;
    private javax.swing.JButton WettkampfverwaltungButton;
    private javax.swing.JButton buttonMessage;
    private javax.swing.JButton buttonTeammitglierderverwaltung;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void setRoleUseCases() {
        Collection<RoleRightDTO> rights = GUIController.getRightsOfLoggedinUser();
        boolean memberverwaltung = false;
        boolean competitions = false;
        boolean rollen = false;
        boolean setmembertoteam = false;
        for (RoleRightDTO right : rights) {
            System.out.println(right.getName());
            if (right.getName().equals("createMember")) {
                memberverwaltung = true;
            }
            if (right.getName().equals("createCompetition") || right.getName().equals("changeCompetition")) {
                competitions = true;
            }
            if (right.getName().equals("createCompetition")) {
                setmembertoteam = true;
            }
            if (right.getName().equals("admin")) {
                rollen = true;
            }
        }
        MitgliedverwaltungButton.setVisible(memberverwaltung);
        WettkampfverwaltungButton.setVisible(competitions);
        RollenverwaltungKnopf.setVisible(rollen);
        buttonTeammitglierderverwaltung.setVisible(setmembertoteam);
    }

    private void checkMessages() {
        try {
            GUIController.getMessageController().getMessages(GUIController.getLoggedInMember().getId() + "");
            boolean b = GUIController.getMessageController().hasMessage(GUIController.getLoggedInMember().getId() + "");
            buttonMessage.setVisible(b);
            System.out.println("Got new messages: " + b);
        } catch (RemoteException ex) {
            Logger.getLogger(WelcomeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private class MessageChecker extends Thread {

        public MessageChecker() {
            this.setDaemon(true);
            this.start();
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(3000); //2 Minuten
                    checkMessages();
                } catch (InterruptedException ex) {
                    Logger.getLogger(WelcomeFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
