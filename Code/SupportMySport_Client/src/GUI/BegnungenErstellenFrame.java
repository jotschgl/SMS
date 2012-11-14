/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CommunicationInterfaces.CompetitionDTO;
import CommunicationInterfaces.ICompetitionDTOControllerFactory;
import CommunicationInterfaces.MeetingDTO;
import CommunicationInterfaces.TeamDTO;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Andreas
 */
public class BegnungenErstellenFrame extends javax.swing.JFrame {

    /**
     * Creates new form BegnungenErstellenFrame
     */
    private WettkampfBearbeitung prevFrame;
    private Collection<TeamDTO> teams;
    private CompetitionDTO competition;
    
    public BegnungenErstellenFrame(WettkampfBearbeitung frame, Collection<TeamDTO> teams, CompetitionDTO competition) throws RemoteException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.prevFrame = frame;
        this.teams = teams;
        this.competition = competition;
        this.fillCombos();
        this.setVisible(true);
    }
    private MeetingDTO meeting;
    //Constructor für Begegnung bearbeiten

    public BegnungenErstellenFrame(WettkampfBearbeitung frame, Collection<TeamDTO> teams, MeetingDTO meeting) throws RemoteException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.prevFrame = frame;
        this.teams = teams;
        this.meeting = meeting;
        this.fillCombos();
        this.selectCombos();
        this.setVisible(true);
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
        jLabel6 = new javax.swing.JLabel();
        comboTeam2 = new javax.swing.JComboBox();
        comboTeam1 = new javax.swing.JComboBox();
        buttonErstellung = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pointsTeam2 = new javax.swing.JSpinner();
        pointsTeam1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Support My Sports - Begegnung erstellen");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Begegnung");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Team 1");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Team 2");

        comboTeam2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        comboTeam1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        buttonErstellung.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        buttonErstellung.setText("Begegnung Speichern");
        buttonErstellung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonErstellungActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Punkte Team 2");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Punkte Team 1");

        pointsTeam2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pointsTeam2.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        pointsTeam1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pointsTeam1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonErstellung, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pointsTeam1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(pointsTeam2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboTeam1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboTeam2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(288, 288, 288))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboTeam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTeam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pointsTeam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointsTeam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addComponent(buttonErstellung)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonErstellungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonErstellungActionPerformed
        if (comboTeam1.getSelectedItem().equals(comboTeam2.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "Andere Teams Wählen!");
        } else {
            try {
                TeamDTO team1 = (TeamDTO) comboTeam1.getSelectedItem();
                TeamDTO team2 = (TeamDTO) comboTeam2.getSelectedItem();
                System.out.println(team1.getTeamName());
                System.out.println(team2.getTeamName());
                if (meeting == null) {
                    MeetingDTO m = new MeetingDTO(competition, team1, team2);
                    m.setPointsA((Integer) pointsTeam1.getValue());
                    m.setPointsB((Integer) pointsTeam2.getValue());
                    GUIController.getCompetitionController().createOrUpdateMeeting(m);
                }
                if (competition == null) {
                    meeting.setTeamByTeamAId(team1);
                    meeting.setTeamByTeamBId(team2);
                    meeting.setPointsA((Integer) pointsTeam1.getValue());
                    meeting.setPointsB((Integer) pointsTeam2.getValue());
                    GUIController.getCompetitionController().createOrUpdateMeeting(meeting);
                }
                prevFrame.updateTableMeeting();
            } catch (RemoteException ex) {
                Logger.getLogger(BegnungenErstellenFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buttonErstellungActionPerformed

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
            java.util.logging.Logger.getLogger(BegnungenErstellenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BegnungenErstellenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BegnungenErstellenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BegnungenErstellenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonErstellung;
    private javax.swing.JComboBox comboTeam1;
    private javax.swing.JComboBox comboTeam2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner pointsTeam1;
    private javax.swing.JSpinner pointsTeam2;
    // End of variables declaration//GEN-END:variables

    private void fillCombos() throws RemoteException {
        for (TeamDTO team : teams) {
            comboTeam1.addItem(team);
            comboTeam2.addItem(team);
        }
    }
    
    private void selectCombos() {
        comboTeam1.setSelectedItem(meeting.getTeamByTeamAId());
        comboTeam2.setSelectedItem(meeting.getTeamByTeamBId());
        pointsTeam1.setValue(meeting.getPointsA() != null ? meeting.getPointsA() : 0);
        pointsTeam2.setValue(meeting.getPointsB() != null ? meeting.getPointsB() : 0);
    }
}