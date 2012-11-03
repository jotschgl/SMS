/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Andreas
 */
public class WettkampfFrame extends javax.swing.JFrame {

    /**
     * Creates new form WettkampfFrame
     */
    public WettkampfFrame() {
        initComponents();
        // here's the part where i center the jframe on screen
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        tableWettkampf.setAutoCreateRowSorter(true);
        tableBegnung.setAutoCreateRowSorter(true);
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

        panelLeft = new javax.swing.JPanel();
        lableWettkampf = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableWettkampf = new javax.swing.JTable();
        btnErsteWettkampf = new javax.swing.JButton();
        btnBearbWettkampf = new javax.swing.JButton();
        panelRight = new javax.swing.JPanel();
        labelBegegnungen = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBegnung = new javax.swing.JTable();
        textFieldRowFilter = new javax.swing.JTextField();
        btnBearbBegegnung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Support My Sport - Wettkampf berarbeiten");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(900, 560));
        setResizable(false);

        panelLeft.setPreferredSize(new java.awt.Dimension(445, 0));

        lableWettkampf.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lableWettkampf.setText("Wettkämpfe");

        tableWettkampf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableWettkampf.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableWettkampf);

        btnErsteWettkampf.setText("Wettkampf erstellen");
        btnErsteWettkampf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnErsteWettkampfMouseClicked(evt);
            }
        });
        btnErsteWettkampf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErsteWettkampfActionPerformed(evt);
            }
        });

        btnBearbWettkampf.setText("Wettkampf bearbeiten");
        btnBearbWettkampf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBearbWettkampfMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLeftLayout = new javax.swing.GroupLayout(panelLeft);
        panelLeft.setLayout(panelLeftLayout);
        panelLeftLayout.setHorizontalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lableWettkampf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLeftLayout.createSequentialGroup()
                        .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(panelLeftLayout.createSequentialGroup()
                                .addComponent(btnErsteWettkampf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(btnBearbWettkampf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLeftLayout.setVerticalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lableWettkampf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnErsteWettkampf)
                    .addComponent(btnBearbWettkampf))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRight.setPreferredSize(new java.awt.Dimension(445, 0));

        labelBegegnungen.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        labelBegegnungen.setText("Nächste Begegnungen");
        labelBegegnungen.setMaximumSize(new java.awt.Dimension(129, 32));
        labelBegegnungen.setMinimumSize(new java.awt.Dimension(129, 32));

        tableBegnung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"c", null, null, null, null},
                {"c", null, null, null, null},
                {"b", null, null, null, null},
                {"g", null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Spiel", "Mannschaft 1", "Mannschaft 2", "Ort", "Datum"
            }
        ));
        tableBegnung.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableBegnung);

        textFieldRowFilter.setPreferredSize(new java.awt.Dimension(141, 23));
        textFieldRowFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldRowFilterKeyReleased(evt);
            }
        });

        btnBearbBegegnung.setText("Begegnung bearbeiten");
        btnBearbBegegnung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBearbBegegnungMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRightLayout = new javax.swing.GroupLayout(panelRight);
        panelRight.setLayout(panelRightLayout);
        panelRightLayout.setHorizontalGroup(
            panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBegegnungen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelRightLayout.createSequentialGroup()
                .addGroup(panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRightLayout.createSequentialGroup()
                        .addComponent(textFieldRowFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnBearbBegegnung, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        panelRightLayout.setVerticalGroup(
            panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBegegnungen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldRowFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBearbBegegnung))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRight, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                    .addComponent(panelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnErsteWettkampfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErsteWettkampfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnErsteWettkampfActionPerformed

    private void btnErsteWettkampfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnErsteWettkampfMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableWettkampf.getModel();
        model.addRow(new Object[]{"Bitte hier änder", "", "", ""});
    }//GEN-LAST:event_btnErsteWettkampfMouseClicked

    private void btnBearbWettkampfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBearbWettkampfMouseClicked
        // TODO add your handling code here:
        int[] selectedRows = tableWettkampf.getSelectedRows();

        if (tableWettkampf.getRowCount() == 0) {
            JOptionPane.showMessageDialog(panelLeft, "Keine Wettkämpfe vorhanden");
        } else {
            //keim Wettkampf gewählt
            if (selectedRows.length == 0) {
                JOptionPane.showMessageDialog(panelLeft, "Wählen Sie einen Wettkampf aus!");
            } else {
                //Wenn die Anwtort mit ja bestätigt wird, wird ein neues Fenster aufgehen
                int reply = JOptionPane.showConfirmDialog(panelLeft, "Möchten Sie den markierten Wettkampf bearbeiten", "Nachricht", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    showNewFrame();
                }
            }
        }
    }//GEN-LAST:event_btnBearbWettkampfMouseClicked

    private void btnBearbBegegnungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBearbBegegnungMouseClicked
        int[] selectedRows = tableBegnung.getSelectedRows();

        if (tableWettkampf.getRowCount() == 0) {
            JOptionPane.showMessageDialog(panelRight, "Keine Wettkämpfe vorhanden");
        } else {
            //keim Wettkampf gewählt
            if (selectedRows.length == 0) {
                JOptionPane.showMessageDialog(panelRight, "Wählen Sie einen Wettkampf aus!");
            } else {
                //Wenn die Anwtort mit ja bestätigt wird, wird ein neues Fenster aufgehen
                int reply = JOptionPane.showConfirmDialog(panelRight, "Möchten Sie den markierten Wettkampf bearbeiten", "Nachricht", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    showNewFrame();
                }
            }
        }
    }//GEN-LAST:event_btnBearbBegegnungMouseClicked

    private void textFieldRowFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldRowFilterKeyReleased
        String text = textFieldRowFilter.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(text));
        }
    }//GEN-LAST:event_textFieldRowFilterKeyReleased

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
            java.util.logging.Logger.getLogger(WettkampfFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WettkampfFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WettkampfFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WettkampfFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WettkampfFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBearbBegegnung;
    private javax.swing.JButton btnBearbWettkampf;
    private javax.swing.JButton btnErsteWettkampf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelBegegnungen;
    private javax.swing.JLabel lableWettkampf;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelRight;
    private javax.swing.JTable tableBegnung;
    private javax.swing.JTable tableWettkampf;
    private javax.swing.JTextField textFieldRowFilter;
    // End of variables declaration//GEN-END:variables
    private TableRowSorter<TableModel> sorter;
    private void showNewFrame() {
        WelcomeFrame fr = new WelcomeFrame();
        this.dispose();
        this.setVisible(false);
        fr.setVisible(true);
    }

    private void setRowSorter() {
        TableModel model = tableBegnung.getModel();
        sorter = new TableRowSorter<TableModel>(model);
        tableBegnung.setRowSorter(sorter);
    }
}
