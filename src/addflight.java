
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Represents a class for adding new flight records to a database.
 * This class allows airline staff to input flight details, such as flight ID, name, source, departure,
 * departure time, arrival time, and flight charge, and stores them in a database.
 *
 * @author Imaan Ibrar
 * @version 2.0
 * @since 2022-06-20
 */
public class addflight extends javax.swing.JFrame {
	
	

    // Variables for database connection and prepared statement.
    Connection con;
    PreparedStatement pst;

    /**
     * Creates new form addflight
     */
    public addflight() {
    	getContentPane().setBackground(new Color(162, 201, 201));
        initComponents();
        autoID();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtflightid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtflightname = new javax.swing.JTextField();
//        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdtime = new javax.swing.JTextField();
        txtarrtime = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtflightcharge = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtsource = new javax.swing.JComboBox<>();
        txtdepart = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
//        txtdate = new com.toedter.calendar.JDateChooser();
        dtlab = new javax.swing.JLabel();
        atlab = new javax.swing.JLabel();
        fclab = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jPanel1.setBackground(new java.awt.Color(162, 201, 201));

        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 25)); // NOI18N
        jLabel1.setText("Flight ID");

        txtflightid.setFont(new Font("Tahoma", Font.BOLD, 20)); // NOI18N
        txtflightid.setForeground(new java.awt.Color(153, 153, 153));
        txtflightid.setText("Flight ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Flight Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Source");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Departure");

//        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
//        jLabel6.setText("Date");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Departure Time");

        txtdtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtimeActionPerformed(evt);
            }
        });
        txtdtime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdtimeKeyReleased(evt);
            }
        });

        txtarrtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtarrtimeActionPerformed(evt);
            }
        });
        txtarrtime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtarrtimeKeyReleased(evt);
            }
        });


        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Arrival Time");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Flight Charge");

        txtflightcharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtflightchargeActionPerformed(evt);
            }
        });
        txtflightcharge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtflightchargeKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtsource.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pakistan", "Srilanka", "Uk", "Usa", "Canada", "China" }));

        txtdepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pakistan", "Srilanka", "Uk", "Usa", "Canada", "China" }));

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));

        jLabel11.setFont(new Font("Segoe UI", Font.BOLD, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CONTACT US");
        jLabel11.setToolTipText("");

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("+51 789543");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot 2022-07-06 000042.png"))); // NOI18N

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insta.png"))); // NOI18N

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/twit.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7Layout.setHorizontalGroup(
        	jPanel7Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel7Layout.createSequentialGroup()
        			.addComponent(jLabel24)
        			.addGap(203))
        		.addGroup(jPanel7Layout.createSequentialGroup()
        			.addGap(19)
        			.addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel7Layout.createSequentialGroup()
        					.addComponent(jLabel22)
        					.addPreferredGap(ComponentPlacement.RELATED, 784, Short.MAX_VALUE)
        					.addComponent(jLabel21)
        					.addGap(313))
        				.addGroup(jPanel7Layout.createSequentialGroup()
        					.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addComponent(jLabel27)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel26)
        			.addGap(43)
        			.addComponent(jLabel25)
        			.addGap(24))
        );
        jPanel7Layout.setVerticalGroup(
        	jPanel7Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel7Layout.createSequentialGroup()
        			.addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel7Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel21)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel11)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel22))
        				.addGroup(jPanel7Layout.createSequentialGroup()
        					.addComponent(jLabel24)
        					.addGap(23)
        					.addGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel26)
        						.addComponent(jLabel27)
        						.addComponent(jLabel25))))
        			.addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel7.setLayout(jPanel7Layout);

        dtlab.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        dtlab.setForeground(new java.awt.Color(204, 0, 51));
//        dtlab.setText("jLabel12");

        atlab.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        atlab.setForeground(new java.awt.Color(204, 0, 51));
//        atlab.setText("jLabel12");

        fclab.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        fclab.setForeground(new java.awt.Color(204, 0, 51));
//        fclab.setText("jLabel12");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, 1728, Short.MAX_VALUE)
        			.addContainerGap())
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap(113, Short.MAX_VALUE)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        									.addGroup(jPanel1Layout.createSequentialGroup()
        										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        											.addComponent(jLabel5)
        											.addComponent(jLabel4)
        											.addComponent(jLabel8))
        										.addGap(64))
        									.addGroup(jPanel1Layout.createSequentialGroup()
        										.addComponent(jLabel3)
        										.addGap(61)))
        								.addComponent(jLabel7))
        							.addGap(41)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(txtflightname, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtsource, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtdepart, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        										.addComponent(txtdtime, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        										.addComponent(txtflightcharge, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
        										.addComponent(txtarrtime))
        									.addGap(38)
        									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(fclab, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
        										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        											.addComponent(atlab, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        											.addComponent(dtlab, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))))))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel1)
        							.addGap(63)
        							.addComponent(txtflightid))
        						.addComponent(jLabel9)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(622)
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
        			.addGap(31)
        			.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        			.addGap(858))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(35)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(txtflightid))
        			.addGap(46)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel3)
        						.addComponent(txtflightname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtsource, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel4))
        					.addGap(18)
        					.addComponent(txtdepart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(76)
        					.addComponent(jLabel5)))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(txtdtime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(dtlab, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jLabel7))
        			.addGap(21)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8)
        				.addComponent(txtarrtime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(atlab, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        			.addGap(42)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel9)
        				.addComponent(txtflightcharge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(fclab, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
        			.addGap(170)
        			.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1.setLayout(jPanel1Layout);


        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new Font("Segoe UI", Font.BOLD, 35)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ADD FLIGHT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        			.addGap(666)
        			.addComponent(jLabel10)
        			.addContainerGap(673, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        			.addContainerGap(47, Short.MAX_VALUE)
        			.addComponent(jLabel10)
        			.addGap(43))
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 1545, Short.MAX_VALUE)
        				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 1545, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    /**
     * Auto-generates a unique Flight ID and sets it in the "txtflightid" label.
     */
    public void autoID()
    {
        try {
            // Load the MySQL JDBC driver and establish a database connection.
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "1234");

            // Create a statement and execute a query to get the maximum Flight ID.
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select MAX(id) from flight");
            rs.next();
            rs.getString("MAX(id)");

            // If no existing Flight IDs, set the initial ID to "FO001"; otherwise, auto-generate the next ID.
            if (rs.getString("MAX(id)") == null) {
                txtflightid.setText("FO001");
            } else {
                long id = Long.parseLong(rs.getString("MAX(id)").substring(2, rs.getString("MAX(id)").length()));
                id++;
                txtflightid.setText("FO" + String.format("%03d", id));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    /**
     * Action performed when the "Add" button is clicked.
     * This method retrieves information from the input fields, validates the data,
     * and inserts a new flight record into the database.
     *
     * @param evt ActionEvent object representing the button click event.
     * @throws ClassNotFoundException If the MySQL JDBC driver is not found.
     * @throws SQLException           If a SQL exception occurs while interacting with the database.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String id = txtflightid.getText();
        String flightname = txtflightname.getText();
         
        String source = txtsource.getSelectedItem().toString().trim();
        String depart = txtdepart.getSelectedItem().toString().trim();
      
       String departtime = txtdtime.getText();
       String arrtime = txtarrtime.getText();
       String flightcharge = txtflightcharge.getText();

        int fc=Integer.parseInt(flightcharge);
        if (flightname.equals("")||departtime.equals("")||arrtime.equals("")||flightcharge.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter the missing fields");
        }
        else if(departtime.equals(arrtime)|| !departtime.matches("^(2[0-3]|[01]?[0-9]):([0-5]?[0-9])$")){
            JOptionPane.showMessageDialog(this,"Please enter wisely");

        }

        else if(arrtime.equals(departtime)|| !arrtime.matches("^(2[0-3]|[01]?[0-9]):([0-5]?[0-9])$")){
            JOptionPane.showMessageDialog(this,"Please enter wisely");
        }
        else if(source.equals(depart)|| depart.equals(source)){
            JOptionPane.showMessageDialog(this,"Source and Arrival cannot be same");
        }
        else if(fc<15000||fc>200000){
            JOptionPane.showMessageDialog(this,"Invalid Charges");
        }

        else{
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/airline","root","1234");
            pst = con.prepareStatement("insert into flight(id,flightname,source,depart,deptime,arrtime,flightcharge)values(?,?,?,?,?,?,?)");
            
            pst.setString(1, id);
            pst.setString(2, flightname);
            pst.setString(3, source);
            pst.setString(4, depart);
            pst.setString(5, departtime);
            pst.setString(6, arrtime);
            pst.setString(7, flightcharge);
           
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null,"Flight Created");
            jButton1.setEnabled(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addflight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addflight.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Action performed when the "Back" button is clicked.
     * This method closes the current window and returns to the admin domain window.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        A1=new admindomain();
        A1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed



    private void txtdtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtimeActionPerformed
    private void txtarrtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtarrtimeActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_txtarrtimeActionPerformed


    /**
     * Action performed when the departure time field is modified.
     * This method checks if the departure time is in the correct format.
     *
     * @param evt KeyEvent object representing the key release event on the departure time field.
     */
    private void txtdtimeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdtimeKeyReleased
        // TODO add your handling code here:
        String regex="^(2[0-3]|[01]?[0-9]):([0-5]?[0-9])$";
        Pattern patt=Pattern.compile(regex);
        Matcher match=patt.matcher(txtdtime.getText());
        if(!match.matches()){
            dtlab.setText("Format: XX:XX");
        }
        else{
            dtlab.setText(null);

        }
    }//GEN-LAST:event_txtdtimeKeyReleased

    /**
     * Action performed when the arrival time field is modified.
     * This method checks if the arrival time is in the correct format.
     *
     * @param evt KeyEvent object representing the key release event on the arrival time field.
     */
    private void txtarrtimeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtarrtimeKeyReleased
        // TODO add your handling code here:
        String regex="^(2[0-3]|[01]?[0-9]):([0-5]?[0-9])$";
        Pattern patt=Pattern.compile(regex);
        Matcher match=patt.matcher(txtarrtime.getText());
        if(!match.matches()){
            atlab.setText("Format: XX:XX ");
        }
        else{
            atlab.setText(null);

        }
    }//GEN-LAST:event_txtarrtimeKeyReleased


    private void txtflightchargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtflightchargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtflightchargeActionPerformed

    /**
     * Action performed when the flight charge field is modified.
     * This method checks if the flight charge is in the correct format.
     *
     * @param evt KeyEvent object representing the key release event on the flight charge field.
     */
    private void txtflightchargeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtflightchargeKeyReleased
        // TODO add your handling code here:
        String regex="^[0-9]{5,6}$";
        Pattern patt=Pattern.compile(regex);
        Matcher match=patt.matcher(txtflightcharge.getText());
        if(!match.matches()){
            fclab.setText("Min: 15000\n Max:200000");
        }
        else{
            fclab.setText(null);

        }
    }//GEN-LAST:event_txtflightchargeKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atlab;
    private javax.swing.JLabel dtlab;
    private javax.swing.JLabel fclab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtarrtime;
    private javax.swing.JComboBox<String> txtdepart;
    private javax.swing.JTextField txtdtime;
    private javax.swing.JTextField txtflightcharge;
    private javax.swing.JLabel txtflightid;
    private javax.swing.JTextField txtflightname;
    private javax.swing.JComboBox<String> txtsource;
    private admindomain A1;
    // End of variables declaration//GEN-END:variables
}
