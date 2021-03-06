/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Communication.CompetitionDTO;
import Communication.DepartmentDTO;
import Communication.CompetitionDTOControllerFactoryRemote;
import Communication.LeagueDTO;
import Communication.SportDTO;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Andreas
 */
public class CreateWettkampfFrame extends javax.swing.JFrame {

    private CompetitionDTOControllerFactoryRemote controller;
    /**
     * Creates new form CreateWettkampfFrame
     */
    private WettkampfFrame _prevFrame;
    private Collection<SportDTO> sports;
    private DepartmentDTO department;

    public CreateWettkampfFrame(WettkampfFrame frame) {

        initComponents();
        this.setLocationRelativeTo(null);
        // this.getAllDepartments();
        this._prevFrame = frame;
        controller = GUIController.getCompetitionController();
        department = GUIController.getDepartmentOfLoggedInDepartmentChief();
        sports = controller.getSportsOfDepartment(department);
        fillSportsCombo();

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
        textWettkampf = new javax.swing.JTextField();
        spinnerGebuehr = new com.toedter.components.JSpinField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateDatum = new com.toedter.calendar.JDateChooser();
        saveWettkampf = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboSport = new javax.swing.JComboBox();
        comboLiga = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Support My Sports - Neuen Wettkampf");
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Allgemeine Informationen");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Wettkampf");

        textWettkampf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        spinnerGebuehr.setPreferredSize(new java.awt.Dimension(29, 25));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Gebühr");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Sport");

        dateDatum.setDate(new Date());
        dateDatum.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        dateDatum.setMinSelectableDate(new Date());
        dateDatum.setPreferredSize(new java.awt.Dimension(87, 25));

        saveWettkampf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        saveWettkampf.setText("Wettkampf erstellen");
        saveWettkampf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveWettkampfMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Datum");

        comboSport.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSportActionPerformed(evt);
            }
        });

        comboLiga.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Liga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                        .addComponent(saveWettkampf, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboSport, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spinnerGebuehr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textWettkampf, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dateDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textWettkampf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spinnerGebuehr, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(comboSport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(saveWettkampf)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveWettkampfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveWettkampfMouseClicked
        // TODO add your handling code here:
        if (!checkInput()) {
            JOptionPane.showMessageDialog(rootPane, errorMess);
        } else {
            System.out.println(department.getDepartmentName());
            String wettkampf = textWettkampf.getText();
            int value = spinnerGebuehr.getValue();
            Date date = dateDatum.getDate();
            SportDTO s = (SportDTO) comboSport.getSelectedItem();
            CompetitionDTO comp = new CompetitionDTO(department, wettkampf, value, date, s, false);
            if (comboLiga.getSelectedItem() instanceof LeagueDTO) {
                comp.setLeague((LeagueDTO) comboLiga.getSelectedItem());
            }
            controller.createNewCompetition(comp);

            this._prevFrame.updateTable();
            this.setVisible(false);


        }
    }//GEN-LAST:event_saveWettkampfMouseClicked

    private void comboSportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSportActionPerformed
        fillLeagueCombo();
    }//GEN-LAST:event_comboSportActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboLiga;
    private javax.swing.JComboBox comboSport;
    private com.toedter.calendar.JDateChooser dateDatum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton saveWettkampf;
    private com.toedter.components.JSpinField spinnerGebuehr;
    private javax.swing.JTextField textWettkampf;
    // End of variables declaration//GEN-END:variables
    private StringBuilder errorMess;

    private boolean checkInput() {
        boolean validate = true;
        errorMess = new StringBuilder("Folgende Fehler\n\n");

        //Name
        if (textWettkampf.getText().equals("")) {
            errorMess.append("Namen");
            validate = false;
        }

        return validate;
    }
//    private void getAllDepartments() {
//        try {
//            controller = GUIController.getCompetitionController();
//
//            for (DepartmentDTO d : controller.getAllDepartments()) {
//                depmap.put(d.getDepartmentName(), d);
//                comboAbteilung.addItem(d.getDepartmentName());
//            }
//
//        } catch (RemoteException ex) {
//            Logger.getLogger(CreateWettkampfFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }

    private void fillSportsCombo() {
        comboSport.removeAllItems();
        for (SportDTO sport : sports) {
            comboSport.addItem(sport);
        }
    }

    private void fillLeagueCombo() {
        comboLiga.removeAllItems();
        comboLiga.addItem("Keine");
        if (comboSport.getSelectedItem() instanceof SportDTO) {
            SportDTO s = ((SportDTO) comboSport.getSelectedItem());
            if (s != null) {
                for (LeagueDTO league : s.getLeagues()) {
                    comboLiga.addItem(league);
                }
            }
        }
    }
}
