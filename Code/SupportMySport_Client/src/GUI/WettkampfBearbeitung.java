/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CommunicationInterfaces.CompetitionDTO;
import CommunicationInterfaces.CompetitionTeamDTO;
import CommunicationInterfaces.ICompetitionDTOControllerFactory;
import CommunicationInterfaces.MeetingDTO;
import CommunicationInterfaces.TeamDTO;
import java.awt.Frame;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andreas
 */
public class WettkampfBearbeitung extends javax.swing.JFrame {

    /**
     * Creates new form WettkampfErstellung
     */
    private CompetitionDTO curCompetition;
    private ICompetitionDTOControllerFactory controller;
    private Collection<TeamDTO> angemeldeteTeams = new LinkedList<TeamDTO>();
    private HashMap<Integer, MeetingDTO> meetings = new HashMap<Integer, MeetingDTO>();

    public WettkampfBearbeitung(CompetitionDTO comptetition) throws RemoteException {
        initComponents();
        this.setLocationRelativeTo(null);
        setVisible(true);
        this.controller = GUIController.getCompetitionController();
        this.curCompetition = comptetition;
        fillMeetingTable();
        fillGeneralInformation();
        fillTableCompTeams();
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
        buttonChangeBegegnung = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBegegnungen = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        wettkampfFee = new javax.swing.JLabel();
        wettkampfName = new javax.swing.JLabel();
        wettkampfDate = new javax.swing.JLabel();
        wettkampfAbteilung = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCompTeams = new javax.swing.JTable();
        buttonAddTeam = new javax.swing.JButton();
        buttonRemoveTeam = new javax.swing.JButton();
        buttonAddPlayers = new javax.swing.JButton();
        buttonBegegnung1 = new javax.swing.JButton();
        buttonDeleteMeeting = new javax.swing.JButton();

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

        buttonChangeBegegnung.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        buttonChangeBegegnung.setText("Begegnung bearbeiten");
        buttonChangeBegegnung.setPreferredSize(new java.awt.Dimension(73, 25));
        buttonChangeBegegnung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangeBegegnungActionPerformed(evt);
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

        wettkampfName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        wettkampfDate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        wettkampfAbteilung.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Begegnungen");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Angemeldete Mannschaften");

        tableCompTeams.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nr", "Name", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableCompTeams);

        buttonAddTeam.setText("Mannschaft hinzufügen");
        buttonAddTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddTeamActionPerformed(evt);
            }
        });

        buttonRemoveTeam.setText("Mannschaft entfernen");
        buttonRemoveTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveTeamActionPerformed(evt);
            }
        });

        buttonAddPlayers.setText("Spieler zu Mannschaft hinzufügen / entfernen");

        buttonBegegnung1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        buttonBegegnung1.setText("Begegnung hinzufügen");
        buttonBegegnung1.setPreferredSize(new java.awt.Dimension(73, 25));
        buttonBegegnung1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBegegnung1ActionPerformed(evt);
            }
        });

        buttonDeleteMeeting.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        buttonDeleteMeeting.setText("Begegnung löschen");
        buttonDeleteMeeting.setPreferredSize(new java.awt.Dimension(73, 25));
        buttonDeleteMeeting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteMeetingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(wettkampfFee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(wettkampfDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(wettkampfName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(wettkampfAbteilung, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonAddTeam)
                                .addGap(53, 53, 53)
                                .addComponent(buttonRemoveTeam))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(buttonAddPlayers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonBegegnung1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonChangeBegegnung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonDeleteMeeting, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddTeam)
                    .addComponent(buttonRemoveTeam))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAddPlayers)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonChangeBegegnung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBegegnung1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeleteMeeting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonChangeBegegnungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeBegegnungActionPerformed
        if (tableBegegnungen.getSelectedRows().length == 0) {
            JOptionPane.showMessageDialog(this, "Begegnung auswählen!");
        } else {
            BegnungenErstellenFrame f;
            try {
                f = new BegnungenErstellenFrame(this, angemeldeteTeams, meetings.get(tableBegegnungen.convertRowIndexToModel(tableBegegnungen.getSelectedRow())));
                f.setVisible(true);
            } catch (RemoteException ex) {
                Logger.getLogger(WettkampfBearbeitung.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buttonChangeBegegnungActionPerformed

    private void buttonAddTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddTeamActionPerformed
        Frame f = new AddTeamToCompetitionFrame(curCompetition, this);
        f.setVisible(true);
    }//GEN-LAST:event_buttonAddTeamActionPerformed

    private void buttonRemoveTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveTeamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRemoveTeamActionPerformed

    private void buttonBegegnung1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBegegnung1ActionPerformed
        BegnungenErstellenFrame f;
        try {
            f = new BegnungenErstellenFrame(this, angemeldeteTeams, curCompetition);
            f.setVisible(true);
        } catch (RemoteException ex) {
            Logger.getLogger(WettkampfBearbeitung.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonBegegnung1ActionPerformed

    private void buttonDeleteMeetingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteMeetingActionPerformed
        if (tableBegegnungen.getSelectedRows().length == 0) {
            JOptionPane.showMessageDialog(this, "Begegnung auswählen!");
        } else {
            int i = JOptionPane.showConfirmDialog(this, "Wirklich löschen?");
            if (i == JOptionPane.OK_OPTION) {
                try {
                    GUIController.getCompetitionController().deleteMeeting(meetings.remove(tableBegegnungen.convertRowIndexToModel(tableBegegnungen.getSelectedRow())));
                    updateTableMeeting();
                } catch (RemoteException ex) {
                    Logger.getLogger(WettkampfBearbeitung.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_buttonDeleteMeetingActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddPlayers;
    private javax.swing.JButton buttonAddTeam;
    private javax.swing.JButton buttonBegegnung1;
    private javax.swing.JButton buttonChangeBegegnung;
    private javax.swing.JButton buttonDeleteMeeting;
    private javax.swing.JButton buttonRemoveTeam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableBegegnungen;
    private javax.swing.JTable tableCompTeams;
    private javax.swing.JLabel wettkampfAbteilung;
    private javax.swing.JLabel wettkampfDate;
    private javax.swing.JLabel wettkampfFee;
    private javax.swing.JLabel wettkampfName;
    // End of variables declaration//GEN-END:variables

    void updateTableMeeting() throws RemoteException {
        curCompetition = GUIController.getCompetitionController().getCompetitionByID(curCompetition.getId());
        fillMeetingTable();
    }

    private void fillMeetingTable() {

        DefaultTableModel tablemodel = (DefaultTableModel) tableBegegnungen.getModel();
        tablemodel.setRowCount(0);
        meetings.clear();
        int i = 0;
        for (MeetingDTO m : curCompetition.getAllCompetitionMeetings()) {
            if (m != null) {
                meetings.put(i++, m);
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

    public void fillTableCompTeams() throws RemoteException {
        Collection<CompetitionTeamDTO> compTeams = controller.getTeamsAndClubMembersOfCompetition(curCompetition.getId());
        DefaultTableModel model = (DefaultTableModel) tableCompTeams.getModel();
        model.setRowCount(0);
        int i = 0;
        for (CompetitionTeamDTO comp : compTeams) {
            angemeldeteTeams.add(comp.getTeam());
            model.addRow(new Object[]{++i, comp.getTeam().getTeamName(), (comp.getAllClubMembersOfCompetitionTeam().size() > 0 ? "intern" : "extern")});
        }
    }
}