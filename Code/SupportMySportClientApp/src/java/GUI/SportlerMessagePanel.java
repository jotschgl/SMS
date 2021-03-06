/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Communication.CompetitionTeamDTO;
import MessageInterfaces.ICompInvitationMessage;
import java.util.LinkedList;

/**
 *
 * @author Johannes
 */
public class SportlerMessagePanel extends javax.swing.JPanel {

    /**
     * Creates new form MessagePanel
     */
    private MessageGUI prev;
    private ICompInvitationMessage message;

    public SportlerMessagePanel(MessageGUI prev, ICompInvitationMessage message) {
        initComponents();
        this.prev = prev;
        this.message = message;
        textFieldDatum.setText(message.getCompetitionDTO().getDateOfCompetition().toString());
        textFieldWettkampf.setText(message.getCompetitionDTO().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonZusagen = new javax.swing.JButton();
        buttonAbsagen = new javax.swing.JButton();
        textFieldDatum = new javax.swing.JTextField();
        textFieldWettkampf = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Wettkampf:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 10, 0, 0);
        add(jLabel1, gridBagConstraints);

        jLabel2.setText("Datum:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 32, 0, 0);
        add(jLabel2, gridBagConstraints);

        buttonZusagen.setText("Zusagen");
        buttonZusagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZusagenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 11, 0);
        add(buttonZusagen, gridBagConstraints);

        buttonAbsagen.setText("Absagen");
        buttonAbsagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAbsagenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 39, 11, 58);
        add(buttonAbsagen, gridBagConstraints);

        textFieldDatum.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 181;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 58);
        add(textFieldDatum, gridBagConstraints);

        textFieldWettkampf.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 181;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 58);
        add(textFieldWettkampf, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonZusagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZusagenActionPerformed
        prev.removeMessage(message);
        prev.selectNR1();
    }//GEN-LAST:event_buttonZusagenActionPerformed

    private void buttonAbsagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAbsagenActionPerformed

        LinkedList<CompetitionTeamDTO> removeList = new LinkedList<CompetitionTeamDTO>();
        for (CompetitionTeamDTO compTeamDTO : message.getCompetitionDTO().getAllTeamsOfCompetition()) {
            if (compTeamDTO.getClubMember() != null) {
                if ((compTeamDTO.getClubMember().getId() == GUIController.getLoggedInMember().getId()) && (compTeamDTO.getCompetition().getId() == message.getCompetitionDTO().getId())) {
                    removeList.add(compTeamDTO);
                }
            }
        }
        for (CompetitionTeamDTO competitionTeamDTO : removeList) {
            message.getCompetitionDTO().getAllTeamsOfCompetition().remove(competitionTeamDTO);
        }
        GUIController.getCompetitionController().updateCompetition(message.getCompetitionDTO());
        prev.removeMessage(message);
        prev.selectNR1();

    }//GEN-LAST:event_buttonAbsagenActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAbsagen;
    private javax.swing.JButton buttonZusagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textFieldDatum;
    private javax.swing.JTextField textFieldWettkampf;
    // End of variables declaration//GEN-END:variables
}
