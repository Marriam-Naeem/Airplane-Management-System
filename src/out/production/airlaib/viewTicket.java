/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package out.production.airlaib;

import javax.swing.*;

import java.sql.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;

/**
 * Represents the view ticket window of the application.
 * Allows the user to view their ticket details by entering the ticket ID.
 * If the ticket ID is valid, it proceeds to the billing window.
 *
 * @author Abdullah Tahir
 * @version 1.0
 * @since 2023-11-21
 */
public class viewTicket extends javax.swing.JFrame {

        /**
         * Creates new form viewTicket.
         * Initializes the form components and sets up the user interface.
         */
        public viewTicket() {
                initComponents();
                setExtendedState(JFrame.MAXIMIZED_BOTH);

        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                panel1 = new javax.swing.JPanel();
                panel2 = new javax.swing.JPanel();
                viewTicketLabel = new javax.swing.JLabel();
                panel7 = new javax.swing.JPanel();
                contactUsLabel = new javax.swing.JLabel();
                numberLabel = new javax.swing.JLabel();
                backgroundAdjustLabel2 = new javax.swing.JLabel();
                backgroundAdjustLabel3 = new javax.swing.JLabel();
                jskyIcon = new javax.swing.JLabel();
                instaIcon = new javax.swing.JLabel();
                linkedInIcon = new javax.swing.JLabel();
                instructionLabel = new javax.swing.JLabel();
                ticketText = new javax.swing.JTextField();
                proceedBtn = new javax.swing.JButton();
                backgroundAdjustLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                panel1.setBackground(new java.awt.Color(162, 209, 209));

                panel2.setBackground(new java.awt.Color(0, 102, 102));

                viewTicketLabel.setFont(new Font("Segoe UI", Font.BOLD, 35)); // NOI18N
                viewTicketLabel.setForeground(new java.awt.Color(255, 255, 255));
                viewTicketLabel.setText("VIEW TICKET");

                backgroundAdjustLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                backgroundAdjustLabel1.setForeground(new java.awt.Color(255, 255, 255));

                javax.swing.GroupLayout groupLayoutPanel2 = new javax.swing.GroupLayout(panel2);
                groupLayoutPanel2.setHorizontalGroup(
                                groupLayoutPanel2.createParallelGroup(Alignment.TRAILING)
                                                .addGroup(groupLayoutPanel2.createSequentialGroup()
                                                                .addContainerGap(652, Short.MAX_VALUE)
                                                                .addComponent(viewTicketLabel,
                                                                                GroupLayout.PREFERRED_SIZE, 260,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addGap(630)));
                groupLayoutPanel2.setVerticalGroup(
                                groupLayoutPanel2.createParallelGroup(Alignment.TRAILING)
                                                .addGroup(groupLayoutPanel2.createSequentialGroup()
                                                                .addContainerGap(32, Short.MAX_VALUE)
                                                                .addComponent(viewTicketLabel)
                                                                .addGap(26)));
                panel2.setLayout(groupLayoutPanel2);

                panel7.setBackground(new java.awt.Color(0, 102, 102));

                contactUsLabel.setFont(new Font("Segoe UI", Font.BOLD, 20)); // NOI18N
                contactUsLabel.setForeground(new java.awt.Color(255, 255, 255));
                contactUsLabel.setText("CONTACT US");
                contactUsLabel.setToolTipText("");

                numberLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
                numberLabel.setForeground(new java.awt.Color(255, 255, 255));
                numberLabel.setText("+51 789543");

                jskyIcon.setIcon(
                                new javax.swing.ImageIcon(getClass().getResource("/Screenshot 2022-07-06 000042.png"))); // NOI18N

                instaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insta.png"))); // NOI18N

                linkedInIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/twit.png"))); // NOI18N

                javax.swing.GroupLayout groupLayoutPanel7 = new javax.swing.GroupLayout(panel7);
                groupLayoutPanel7.setHorizontalGroup(
                                groupLayoutPanel7.createParallelGroup(Alignment.LEADING)
                                                .addGroup(groupLayoutPanel7.createSequentialGroup()
                                                                .addGap(19)
                                                                .addGroup(groupLayoutPanel7
                                                                                .createParallelGroup(Alignment.LEADING)
                                                                                .addGroup(groupLayoutPanel7
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(numberLabel)
                                                                                                .addPreferredGap(
                                                                                                                ComponentPlacement.RELATED,
                                                                                                                597,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(groupLayoutPanel7
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(contactUsLabel,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                581,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGap(90)))
                                                                .addGroup(groupLayoutPanel7
                                                                                .createParallelGroup(Alignment.TRAILING)
                                                                                .addGroup(groupLayoutPanel7
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(backgroundAdjustLabel2)
                                                                                                .addGap(581))
                                                                                .addGroup(groupLayoutPanel7
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(linkedInIcon)
                                                                                                .addGap(18)))
                                                                .addComponent(instaIcon)
                                                                .addGap(18)
                                                                .addGroup(groupLayoutPanel7
                                                                                .createParallelGroup(Alignment.LEADING)
                                                                                .addComponent(backgroundAdjustLabel3)
                                                                                .addComponent(jskyIcon))
                                                                .addGap(32)));
                groupLayoutPanel7.setVerticalGroup(
                                groupLayoutPanel7.createParallelGroup(Alignment.LEADING)
                                                .addGroup(groupLayoutPanel7.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(backgroundAdjustLabel2)
                                                                .addPreferredGap(ComponentPlacement.RELATED, 12,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(contactUsLabel)
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addComponent(numberLabel)
                                                                .addContainerGap(15, Short.MAX_VALUE))
                                                .addGroup(groupLayoutPanel7.createSequentialGroup()
                                                                .addComponent(backgroundAdjustLabel3)
                                                                .addContainerGap(18, Short.MAX_VALUE))
                                                .addGroup(Alignment.TRAILING, groupLayoutPanel7.createSequentialGroup()
                                                                .addContainerGap(25, Short.MAX_VALUE)
                                                                .addGroup(groupLayoutPanel7
                                                                                .createParallelGroup(Alignment.LEADING)
                                                                                .addComponent(jskyIcon)
                                                                                .addGroup(groupLayoutPanel7
                                                                                                .createParallelGroup(
                                                                                                                Alignment.TRAILING)
                                                                                                .addComponent(linkedInIcon)
                                                                                                .addComponent(instaIcon)))
                                                                .addContainerGap()));
                panel7.setLayout(groupLayoutPanel7);

                instructionLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                instructionLabel.setText("PLEASE ENTER YOUR ID:");

                proceedBtn.setBackground(new java.awt.Color(0, 51, 51));
                proceedBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                proceedBtn.setForeground(new java.awt.Color(255, 255, 255));
                proceedBtn.setText("PROCEED");
                proceedBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                proceedBtnAction(evt);
                        }
                });
                backBtn = new javax.swing.JButton();

                backBtn.setBackground(new java.awt.Color(0, 51, 51));
                backBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                backBtn.setForeground(new java.awt.Color(255, 255, 255));
                backBtn.setText("BACK");
                backBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backBtnAction(evt);
                        }
                });

                javax.swing.GroupLayout groupLayoutPanel1 = new javax.swing.GroupLayout(panel1);
                groupLayoutPanel1.setHorizontalGroup(
                                groupLayoutPanel1.createParallelGroup(Alignment.LEADING)
                                                .addComponent(panel2, GroupLayout.PREFERRED_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(panel7, GroupLayout.PREFERRED_SIZE, 1542, Short.MAX_VALUE)
                                                .addGroup(groupLayoutPanel1.createSequentialGroup()
                                                                .addGap(560)
                                                                .addComponent(instructionLabel,
                                                                                GroupLayout.PREFERRED_SIZE, 222,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18)
                                                                .addComponent(ticketText, GroupLayout.PREFERRED_SIZE,
                                                                                132, GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(608, Short.MAX_VALUE))
                                                .addGroup(groupLayoutPanel1.createSequentialGroup()
                                                                .addGap(210)
                                                                .addComponent(backgroundAdjustLabel1,
                                                                                GroupLayout.PREFERRED_SIZE, 400,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addComponent(proceedBtn, GroupLayout.PREFERRED_SIZE,
                                                                                142, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(54)
                                                                .addComponent(backBtn, GroupLayout.PREFERRED_SIZE, 142,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));
                groupLayoutPanel1.setVerticalGroup(
                                groupLayoutPanel1.createParallelGroup(Alignment.LEADING)
                                                .addGroup(groupLayoutPanel1.createSequentialGroup()
                                                                .addComponent(panel2, GroupLayout.PREFERRED_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addGap(157)
                                                                .addGroup(groupLayoutPanel1
                                                                                .createParallelGroup(Alignment.BASELINE)
                                                                                .addComponent(instructionLabel)
                                                                                .addComponent(ticketText,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(groupLayoutPanel1
                                                                                .createParallelGroup(Alignment.LEADING)
                                                                                .addGroup(groupLayoutPanel1
                                                                                                .createSequentialGroup()
                                                                                                .addGap(93)
                                                                                                .addComponent(backgroundAdjustLabel1))
                                                                                .addGroup(groupLayoutPanel1
                                                                                                .createSequentialGroup()
                                                                                                .addGap(64)
                                                                                                .addGroup(groupLayoutPanel1
                                                                                                                .createParallelGroup(
                                                                                                                                Alignment.BASELINE)
                                                                                                                .addComponent(backBtn,
                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                40,
                                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(proceedBtn,
                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                40,
                                                                                                                                GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(ComponentPlacement.RELATED, 245,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(panel7, GroupLayout.PREFERRED_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.PREFERRED_SIZE)));
                panel1.setLayout(groupLayoutPanel1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                layout.setHorizontalGroup(
                                layout.createParallelGroup(Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 1542,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(Alignment.LEADING)
                                                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE));
                getContentPane().setLayout(layout);

                pack();
        }// </editor-fold>//GEN-END:initComponents

        /**
         * Event handler for the "BACK" button.
         * Disposes of the current frame and opens a new instance of the cusdomain
         * class.
         * 
         * @param evt The ActionEvent generated by the button click.
         * @return None.
         */
        public void backBtnAction(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtnAction
                super.dispose();
                cusdomainObj = new cusdomain();
                cusdomainObj.setVisible(true);
        }

        /**
         * Event handler for the "PROCEED" button.
         * Retrieves a ticket ID from a text field, queries a MySQL database for ticket
         * information,
         * and opens a new billing window (bill class) if the ticket is found.
         * 
         * @param evt The ActionEvent generated by the button click.
         * @return None.
         */
        public void proceedBtnAction(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_proceedBtnAction
                Connection con = null;
                PreparedStatement pst = null;
                String ticketid = ticketText.getText();
                try {
                        con = connectionManager.getConnection();
                        pst = con.prepareStatement("select * from ticket where id = ?");
                        pst.setString(1, ticketid);
                        ResultSet rs = pst.executeQuery();
                        if (!rs.next()) {
                                JOptionPane.showMessageDialog(this, "Record not Found");
                        } else {
                                String custid = rs.getString("custid");
                                super.dispose();
                                billObj = new bill(custid, ticketid);
                                billObj.setVisible(true);
                        }
                } catch (SQLException excep) {
                        excep.printStackTrace();
                } catch (Exception excep) {
                        excep.printStackTrace();
                } finally {
                        try {
                                // Close the connection and other resources
                                if (pst != null) {
                                        pst.close();
                                }
                                if (con != null) {
                                        con.close();
                                }
                        } catch (SQLException ex) {
                                ex.printStackTrace();
                        }
                }

        }

        // GEN-LAST:event_proceedBtnAction

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton proceedBtn;
        private javax.swing.JButton backBtn;
        private javax.swing.JLabel viewTicketLabel;
        private javax.swing.JLabel contactUsLabel;
        private javax.swing.JLabel instructionLabel;
        private javax.swing.JLabel backgroundAdjustLabel2;
        private javax.swing.JLabel numberLabel;
        private javax.swing.JLabel backgroundAdjustLabel3;
        private javax.swing.JLabel jskyIcon;
        private javax.swing.JLabel instaIcon;
        private javax.swing.JLabel linkedInIcon;
        private javax.swing.JLabel backgroundAdjustLabel1;
        private javax.swing.JPanel panel1;
        private javax.swing.JPanel panel2;
        private javax.swing.JPanel panel7;
        private javax.swing.JTextField ticketText;
        private cusdomain cusdomainObj;
        private bill billObj;

        // End of variables declaration//GEN-END:variables
        public void setConnection(Connection mockConnection) throws SQLException {
                mockConnection = connectionManager.getConnection();

        }

        public javax.swing.JTextField getTicketText() {
                // TODO Auto-generated method stub
                return ticketText;
        }

        public void setCusdomainObj(cusdomain cusdomainMock) {
                this.cusdomainObj = cusdomainMock;
        }

        /**
         * Gets the value of the showMessageDialogMessage field.
         *
         * @return The value of the showMessageDialogMessage field.
         */
        public Object getShowMessageDialogMessage() {
                // TODO: Implement the logic to return the value of showMessageDialogMessage
                return "Record not Found"; // Placeholder, replace with actual logic
        }

        /**
         * @return the billObj
         */
        public bill getBillObj() {
                return billObj;
        }

        /**
         * @param billObj the billObj to set
         */
        public void setBillObj(bill billObj) {
                this.billObj = billObj;
        }

}
