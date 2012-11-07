/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Communication.ClubMemberDTO;
import Controller.interfaces.IClubMemberController;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Raphaela
 */
public class MitgliedFrame extends javax.swing.JFrame {

    /**
     * Creates new form MitgliedFrame
     */
    private MitgliedverwaltungFrame _prevframe;
    public MitgliedFrame(MitgliedverwaltungFrame frame) {
        initComponents();
        this.setLocationRelativeTo(null);
        this._prevframe = frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegristierungLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textVorname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textNachname = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        textUsername = new javax.swing.JTextField();
        StraßeLabel = new javax.swing.JLabel();
        textStraße = new javax.swing.JTextField();
        textStadt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textPLZ = new javax.swing.JTextField();
        PostleitzahlLabel = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TelefonLabel = new javax.swing.JLabel();
        GeschlechtLabel = new javax.swing.JLabel();
        GeburtstagLabel = new javax.swing.JLabel();
        SpeichernButton = new javax.swing.JButton();
        textTelefon = new javax.swing.JTextField();
        dateGeb = new com.toedter.calendar.JDateChooser();
        comboGender = new javax.swing.JComboBox();
        GeburtstagLabel1 = new javax.swing.JLabel();
        textLand = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Support My Sports - Neues Mitglied erstellen");
        setPreferredSize(new java.awt.Dimension(461, 500));
        setResizable(false);

        RegristierungLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RegristierungLabel.setText("Regristierung");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Vorname:");

        textVorname.setMaximumSize(new java.awt.Dimension(100, 25));
        textVorname.setMinimumSize(new java.awt.Dimension(100, 25));
        textVorname.setPreferredSize(new java.awt.Dimension(100, 25));
        textVorname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textVornameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nachname:");

        textNachname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNachnameActionPerformed(evt);
            }
        });

        UsernameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        UsernameLabel.setText("Username:");

        StraßeLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        StraßeLabel.setText("Straße:");

        textStraße.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStraßeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Stadt:");

        PostleitzahlLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        PostleitzahlLabel.setText("PLZ:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("E-Mail:");

        TelefonLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TelefonLabel.setText("Telefon:");

        GeschlechtLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        GeschlechtLabel.setText("Geschlecht:");

        GeburtstagLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        GeburtstagLabel.setText("Geburtstag:");

        SpeichernButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        SpeichernButton.setText("Speichern");
        SpeichernButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeichernButtonActionPerformed(evt);
            }
        });

        dateGeb.setDate(new Date());
        dateGeb.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        dateGeb.setMaxSelectableDate(new Date());
        dateGeb.setPreferredSize(new java.awt.Dimension(87, 25));

        comboGender.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        comboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Männlich", "Weiblich" }));
        comboGender.setPreferredSize(new java.awt.Dimension(56, 25));

        GeburtstagLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        GeburtstagLabel1.setText("Land:");

        textLand.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SpeichernButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(UsernameLabel)
                            .addComponent(StraßeLabel)
                            .addComponent(GeschlechtLabel)
                            .addComponent(jLabel3)
                            .addComponent(PostleitzahlLabel)
                            .addComponent(jLabel4)
                            .addComponent(TelefonLabel)
                            .addComponent(GeburtstagLabel)
                            .addComponent(GeburtstagLabel1)
                            .addComponent(RegristierungLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dateGeb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textPLZ, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textVorname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNachname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textStraße, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textStadt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(textTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(comboGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textLand, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(RegristierungLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textVorname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNachname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StraßeLabel)
                    .addComponent(textStraße, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textStadt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPLZ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PostleitzahlLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonLabel)
                    .addComponent(textTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GeschlechtLabel)
                    .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GeburtstagLabel)
                    .addComponent(dateGeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GeburtstagLabel1)
                    .addComponent(textLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(SpeichernButton)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textVornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textVornameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textVornameActionPerformed

    private void textNachnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNachnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNachnameActionPerformed

    private void SpeichernButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeichernButtonActionPerformed
        // TODO add your handling code here:
        if (!checkInput()) {
            JOptionPane.showMessageDialog(rootPane, errorMEssage);
        } else {
            IClubMemberController cont = GUIController.getClubMemberController();
            try {
                cont.createOrUpdateClubMember(new ClubMemberDTO(textVorname.getText(), textNachname.getText(), textUsername.getText(), textStraße.getText(), textStadt.getText(), textLand.getText(), textPLZ.getText(), textEmail.getText(), textTelefon.getText(), (comboGender.getSelectedItem().toString().startsWith("W") ? 'f' : 'm'), dateGeb.getDate()));
                
                this._prevframe.updateTable();
                this.setVisible(false);
            } catch (RemoteException ex) {
                Logger.getLogger(MitgliedFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        //TODO: new MemberAction
    }//GEN-LAST:event_SpeichernButtonActionPerformed

    private void textStraßeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStraßeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStraßeActionPerformed

    private void textLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLandActionPerformed

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
            java.util.logging.Logger.getLogger(MitgliedFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MitgliedFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MitgliedFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MitgliedFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MitgliedFrame(null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GeburtstagLabel;
    private javax.swing.JLabel GeburtstagLabel1;
    private javax.swing.JLabel GeschlechtLabel;
    private javax.swing.JLabel PostleitzahlLabel;
    private javax.swing.JLabel RegristierungLabel;
    private javax.swing.JButton SpeichernButton;
    private javax.swing.JLabel StraßeLabel;
    private javax.swing.JLabel TelefonLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JComboBox comboGender;
    private com.toedter.calendar.JDateChooser dateGeb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textLand;
    private javax.swing.JTextField textNachname;
    private javax.swing.JTextField textPLZ;
    private javax.swing.JTextField textStadt;
    private javax.swing.JTextField textStraße;
    private javax.swing.JTextField textTelefon;
    private javax.swing.JTextField textUsername;
    private javax.swing.JTextField textVorname;
    // End of variables declaration//GEN-END:variables
    private StringBuilder errorMEssage;

    private boolean checkInput() {
        boolean validate = true;
        errorMEssage = new StringBuilder("Folgende Fehler\n\n");

        //Vorname
        if (textVorname.getText().equals("")) {
            errorMEssage.append("Vorname\n");
            validate = false;
        }
        //Nachname
        if (textNachname.getText().equals("")) {
            errorMEssage.append("Nachname\n");
            validate = false;
        }
        //User
        if (textUsername.getText().equals("")) {
            errorMEssage.append("Username\n");
            validate = false;
        }
        //Email
        if (textEmail.getText().equals("")) {
            errorMEssage.append("Email\n");
            validate = false;
        }
        //Straße
        if (textStraße.getText().equals("")) {
            errorMEssage.append("Straße\n");
            validate = false;
        }
        //Stadt
        if (textStadt.getText().equals("")) {
            errorMEssage.append("Stadt\n");
            validate = false;
        }
        //PLZS
        if (textPLZ.getText().equals("")) {
            errorMEssage.append("PLZ\n");
            validate = false;
        }
        //Telefon
        if (textTelefon.getText().equals("")) {
            errorMEssage.append("Telefon\n");
            validate = false;
        }
        //LAnd
        if (textLand.getText().equals("")) {
            errorMEssage.append("Land\n");
            validate = false;
        }
        return validate;
    }
}
