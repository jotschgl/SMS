/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CommunicationInterfaces.CompetitionDTO;
import java.awt.CardLayout;
import java.awt.Panel;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Johannes
 */
public class MessageGUI extends javax.swing.JFrame {

    private DefaultListModel list;
    private Object selectedMessage;

    /**
     * Creates new form MessageGUI
     */
    public MessageGUI() {
//        try {
        initComponents();
        list = new DefaultListModel();
        jList1.setModel(list);
        list.removeAllElements();
//            for (Object o : GUIController.getMessageController().getMessages(GUIController.getLoggedInMember().getId() + " ")) {
//                list.addElement(o);
//            }
//        } catch (RemoteException ex) {
//            Logger.getLogger(MessageGUI.class.getName()).log(Level.SEVERE, null, ex);
//        }
        jList1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object o = jList1.getSelectedValue();
                selectedMessage = o;
                changePanel();

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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        panelMessage = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nachrichten:");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");

        panelMessage.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        Object o = jList1.getSelectedValue();
        if (o != selectedMessage) {
            selectedMessage = o;
            changePanel();
        }
    }//GEN-LAST:event_jList1MouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelMessage;
    // End of variables declaration//GEN-END:variables

    void removeMessage(Object message) {
        list.removeElement(message);
    }

    void selectNR1() {
        if (!list.isEmpty()) {
            jList1.setSelectedIndex(0);
        } else {
            panelMessage = new JPanel();
        }
    }

    private void changePanel() {
        CardLayout cl = (CardLayout) panelMessage.getLayout();
        panelMessage.removeAll();

        if (selectedMessage instanceof CompetitionDTO) {
            panelMessage.add(new SportlerMessagePanel(this, (CompetitionDTO) selectedMessage), "");
        }
        cl.next(panelMessage);
        pack();
    }
}
