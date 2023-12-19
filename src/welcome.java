import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * Represents the welcome window of the application.
 * Allows the user to choose between the admin and passenger domains.
 * Also provides contact information.
 * 
 * @author Imaan Ibrar
 * @version 1.0
 * @since 2023-11-21
 */

public class welcome extends javax.swing.JFrame {

    /**
     * Creates new form welcome
     * Initializes the form components and sets up the user interface.
     */
    public welcome() {
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

        backgroundPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        footerPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        contactUsLabel = new javax.swing.JLabel();
        phoneNoLabel = new javax.swing.JLabel();
        instaIcon = new javax.swing.JLabel();
        linkedInIcon = new javax.swing.JLabel();
        homeImage = new javax.swing.JLabel();
        homeImage.setHorizontalAlignment(SwingConstants.CENTER);
        jSeparator1 = new javax.swing.JSeparator();
        adminButton = new javax.swing.JButton();
        passengerButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(151, 190, 190));

        headerPanel.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout gl_headerPanel = new javax.swing.GroupLayout(headerPanel);
        gl_headerPanel.setHorizontalGroup(
        	gl_headerPanel.createParallelGroup(Alignment.TRAILING)
        		.addGap(0, 1576, Short.MAX_VALUE)
        );
        gl_headerPanel.setVerticalGroup(
        	gl_headerPanel.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 72, Short.MAX_VALUE)
        );
        headerPanel.setLayout(gl_headerPanel);

        footerPanel.setBackground(new java.awt.Color(0, 102, 102));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        worldClassIcon = new javax.swing.JLabel();
        
                worldClassIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldclass.png"))); // NOI18N
                worldClassIcon.setText("jLabel6");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4Layout.setHorizontalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap(22, Short.MAX_VALUE)
        			.addComponent(worldClassIcon, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
        			.addContainerGap(12, Short.MAX_VALUE)
        			.addComponent(worldClassIcon, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
        );
        jPanel4.setLayout(jPanel4Layout);

        contactUsLabel.setFont(new Font("Segoe UI", Font.BOLD, 17)); // NOI18N
        contactUsLabel.setForeground(new java.awt.Color(255, 255, 255));
        contactUsLabel.setText("CONTACT US");
        contactUsLabel.setToolTipText("");

        phoneNoLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 17)); // NOI18N
        phoneNoLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneNoLabel.setText("+51 789543");

        instaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insta.png"))); // NOI18N

        linkedInIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/twit.png"))); // NOI18N
        linkedInIcon.setToolTipText("");

        javax.swing.GroupLayout gl_footerPanel = new javax.swing.GroupLayout(footerPanel);
        gl_footerPanel.setHorizontalGroup(
        	gl_footerPanel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_footerPanel.createSequentialGroup()
        			.addGap(24)
        			.addGroup(gl_footerPanel.createParallelGroup(Alignment.LEADING)
        				.addComponent(phoneNoLabel)
        				.addComponent(contactUsLabel, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
        			.addGap(33)
        			.addComponent(instaIcon)
        			.addGap(41)
        			.addComponent(linkedInIcon, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        			.addGap(614)
        			.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        			.addGap(38))
        );
        gl_footerPanel.setVerticalGroup(
        	gl_footerPanel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_footerPanel.createSequentialGroup()
        			.addGroup(gl_footerPanel.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_footerPanel.createSequentialGroup()
        					.addGap(14)
        					.addGroup(gl_footerPanel.createParallelGroup(Alignment.LEADING)
        						.addComponent(instaIcon)
        						.addGroup(gl_footerPanel.createSequentialGroup()
        							.addComponent(contactUsLabel)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(phoneNoLabel))
        						.addComponent(linkedInIcon, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(gl_footerPanel.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(51, Short.MAX_VALUE))
        );
        footerPanel.setLayout(gl_footerPanel);

        homeImage.setIcon(new ImageIcon(welcome.class.getResource("/classes/blur.png")));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        adminButton.setBackground(new java.awt.Color(0, 51, 51));
        adminButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminButton.setForeground(new java.awt.Color(255, 255, 255));
        adminButton.setText("ADMIN");
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        passengerButton.setBackground(new java.awt.Color(0, 51, 51));
        passengerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passengerButton.setForeground(new java.awt.Color(255, 255, 255));
        passengerButton.setText("PASSENGER");
        passengerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(0, 51, 51));
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gl_backgroundPanel = new javax.swing.GroupLayout(backgroundPanel);
        gl_backgroundPanel.setHorizontalGroup(
        	gl_backgroundPanel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_backgroundPanel.createSequentialGroup()
        			.addGroup(gl_backgroundPanel.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_backgroundPanel.createSequentialGroup()
        					.addGroup(gl_backgroundPanel.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(gl_backgroundPanel.createSequentialGroup()
        							.addGap(298)
        							.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
        						.addGroup(gl_backgroundPanel.createSequentialGroup()
        							.addGap(450)
        							.addComponent(adminButton, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
        							.addGap(88)
        							.addComponent(passengerButton, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
        							.addGap(92)
        							.addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)))
        					.addGap(527))
        				.addGroup(gl_backgroundPanel.createParallelGroup(Alignment.TRAILING, false)
        					.addComponent(homeImage, 0, 0, Short.MAX_VALUE)
        					.addComponent(footerPanel, GroupLayout.DEFAULT_SIZE, 1543, Short.MAX_VALUE))
        				.addComponent(headerPanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1596, Short.MAX_VALUE))
        			.addContainerGap())
        );
        gl_backgroundPanel.setVerticalGroup(
        	gl_backgroundPanel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_backgroundPanel.createSequentialGroup()
        			.addComponent(headerPanel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(homeImage, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_backgroundPanel.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_backgroundPanel.createSequentialGroup()
        					.addGap(9)
        					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(gl_backgroundPanel.createSequentialGroup()
        					.addGap(67)
        					.addGroup(gl_backgroundPanel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
        						.addComponent(passengerButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
        						.addComponent(adminButton, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))))
        			.addGap(66)
        			.addComponent(footerPanel, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
        			.addGap(238))
        );
        backgroundPanel.setLayout(gl_backgroundPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(backgroundPanel, GroupLayout.PREFERRED_SIZE, 1606, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addComponent(backgroundPanel, GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }
    // </editor-fold>//GEN-END:initComponents

    /**
     * Handles the action event when the 'Admin' button is clicked.
     * Closes the current window and opens the 'Login' window.
     * 
     * @param evt The action event.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        super.dispose();
        L1 = new Login();
        L1.setVisible(true);

    }

    /**
     * Handles the action event when the 'Passenger' button is clicked.
     * Closes the current window and opens the 'cusdomain' window.
     * 
     * @param evt The action event.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        super.dispose();
        C1 = new cusdomain();
        C1.setVisible(true);
    }

    /**
     * Handles the action event when the 'Exit' button is clicked.
     * Closes the current window.
     * 
     * @param evt The action event.
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        super.dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton;
    private javax.swing.JButton passengerButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel contactUsLabel;
    private javax.swing.JLabel phoneNoLabel;
    private javax.swing.JLabel homeImage;
    private javax.swing.JLabel instaIcon;
    private javax.swing.JLabel linkedInIcon;
    private javax.swing.JLabel worldClassIcon;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private cusdomain C1;
    private Login L1;
    // End of variables declaration//GEN-END:variables
}
