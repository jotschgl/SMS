/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CommunicationInterfaces.CompetitionDTO;
import CommunicationInterfaces.CompetitionTeamDTO;
import CommunicationInterfaces.ICompetitionDTOControllerFactory;
import CommunicationInterfaces.MeetingDTO;
import java.rmi.RemoteException;
import java.security.spec.MGF1ParameterSpec;
import java.util.Collection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andreas
 */
public class AllCompetitionsAndResults extends javax.swing.JFrame {

    /**
     * Creates new form AllCompetitionsAndResults
     */
    private ICompetitionDTOControllerFactory competitionController;
    private HashMap<Integer, CompetitionDTO> _competitions = new HashMap<Integer, CompetitionDTO>();
    private int lastSelectedRow;

    public AllCompetitionsAndResults() {
        initComponents();
        setLocationRelativeTo(null);
        tableWettkampf.setAutoCreateRowSorter(true);
        tableMatches.setAutoCreateRowSorter(true);
        try {
            filltWettkampfTable();
        } catch (RemoteException ex) {
            Logger.getLogger(AllCompetitionsAndResults.class.getName()).log(Level.SEVERE, null, ex);
        }

        ListSelectionModel cellSelectionmodel = tableWettkampf.getSelectionModel();
        cellSelectionmodel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableWettkampf.setRowSelectionAllowed(true);

        cellSelectionmodel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                lastSelectedRow = tableWettkampf.getSelectedRow();
                if (lastSelectedRow >= 0) {
                    System.out.println(lastSelectedRow);
                    System.out.println(_competitions.get(tableWettkampf.convertRowIndexToModel(lastSelectedRow)).getName());
                    fillMettingTable(_competitions.get(tableWettkampf.convertRowIndexToModel(lastSelectedRow)).getAllCompetitionMeetings());
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableWettkampf = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMatches = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Support My Sports - Alle Wettkämpfe anzeigen");
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Wettkämpfe");

        tableWettkampf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableWettkampf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Wettkampf", "Datum"
            }
        ));
        jScrollPane1.setViewportView(tableWettkampf);

        tableMatches.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableMatches.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Match", "Team 1", "Team 2", "Punkte Team 1", "Punkte Team 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableMatches);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AllCompetitionsAndResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllCompetitionsAndResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllCompetitionsAndResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllCompetitionsAndResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllCompetitionsAndResults().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableMatches;
    private javax.swing.JTable tableWettkampf;
    // End of variables declaration//GEN-END:variables

    private void filltWettkampfTable() throws RemoteException {
        competitionController = GUIController.getCompetitionController();
        DefaultTableModel wettkModel = (DefaultTableModel) tableWettkampf.getModel();

        int i = 0;
        wettkModel.setRowCount(0);
        for (CompetitionDTO competition : competitionController.getAllCompetitions()) {
            wettkModel.addRow(new Object[]{competition.getName(), competition.getDateOfCompetition().toString()});
            _competitions.put(i++, competition);
        }
    }

    private void fillMettingTable(Collection<MeetingDTO> allMeetingOfCompetition) {
        DefaultTableModel meetingModel = (DefaultTableModel) tableMatches.getModel();
        
        meetingModel.setRowCount(0);
        int i = 1;
        for(MeetingDTO m : allMeetingOfCompetition){
            meetingModel.addRow(new Object[]{i++, m.getTeamByTeamAId().getTeamName(), m.getTeamByTeamBId().getTeamName(), m.getPointsA(), m.getPointsB()});
        }
    }
}
