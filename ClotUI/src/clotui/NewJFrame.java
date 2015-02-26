/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clotui;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rahul
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        groupButton();
    }
    private void groupButton(){
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblCity = new javax.swing.JLabel();
        cvxBloodGroup = new javax.swing.JComboBox();
        txtCity = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtNearestRailwayStation = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        LblAge = new javax.swing.JLabel();
        txtEmergencyNo = new javax.swing.JTextField();
        lblBloodGroup = new javax.swing.JLabel();
        lblPhoneNo = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmergencyNo = new javax.swing.JLabel();
        lblNearestRailwayStation = new javax.swing.JLabel();
        btnAddDonor = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblBloodGroup1 = new javax.swing.JLabel();
        txtEmergencyContactNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbxBloodGroup = new javax.swing.JComboBox();
        txtNearestRailwayStation1 = new javax.swing.JTextField();
        lblContactPreference = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblage2 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        txtName1 = new javax.swing.JTextField();
        txtEmergencyContactName = new javax.swing.JTextField();
        lblage = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAge1 = new javax.swing.JTextField();
        btnAddRequestor = new javax.swing.JButton();
        txtHospName = new javax.swing.JTextField();
        lblHospName = new javax.swing.JLabel();
        cbxContPref = new javax.swing.JComboBox();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCity.setBackground(new java.awt.Color(204, 204, 255));
        lblCity.setText("City");

        cvxBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtNearestRailwayStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNearestRailwayStationActionPerformed(evt);
            }
        });

        lblName.setBackground(new java.awt.Color(204, 204, 255));
        lblName.setText("Name");

        txtPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNoActionPerformed(evt);
            }
        });

        LblAge.setBackground(new java.awt.Color(204, 204, 255));
        LblAge.setText("Age");

        txtEmergencyNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmergencyNoActionPerformed(evt);
            }
        });

        lblBloodGroup.setBackground(new java.awt.Color(204, 204, 255));
        lblBloodGroup.setText("Blood Group");

        lblPhoneNo.setBackground(new java.awt.Color(204, 204, 255));
        lblPhoneNo.setText("Phone No.");

        lblAddress.setBackground(new java.awt.Color(204, 204, 255));
        lblAddress.setText("Address");

        lblEmergencyNo.setBackground(new java.awt.Color(204, 204, 255));
        lblEmergencyNo.setText("Emergency No.");

        lblNearestRailwayStation.setBackground(new java.awt.Color(204, 204, 255));
        lblNearestRailwayStation.setText("Nearest Railway Station");

        btnAddDonor.setText("Add Donor");
        btnAddDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDonorActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNearestRailwayStation)
                                    .addComponent(lblBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge)
                                    .addComponent(txtName)
                                    .addComponent(cvxBloodGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAddress)
                                            .addComponent(txtNearestRailwayStation, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(btnAddDonor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEmergencyNo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtEmergencyNo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblAge))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodGroup)
                    .addComponent(cvxBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNearestRailwayStation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity)
                            .addComponent(txtEmergencyNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmergencyNo)))
                    .addComponent(txtNearestRailwayStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhoneNo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddDonor)
                            .addComponent(btnReset))
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Add donor", jPanel2);

        lblBloodGroup1.setText("Blood Group");

        txtEmergencyContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmergencyContactNumberActionPerformed(evt);
            }
        });

        jLabel1.setText("Nearest Railway Station");

        cbxBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        cbxBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBloodGroupActionPerformed(evt);
            }
        });

        txtNearestRailwayStation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNearestRailwayStation1ActionPerformed(evt);
            }
        });

        lblContactPreference.setText("Contact Preference");

        lblContact.setText("Contact");

        lblage2.setText("Emergency Contact Name");

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });

        txtName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName1ActionPerformed(evt);
            }
        });

        lblage.setText("Age");

        lblName1.setText("Name :");

        jLabel2.setText("Emergency Contact Number");

        btnAddRequestor.setText("Add Requestor");
        btnAddRequestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRequestorActionPerformed(evt);
            }
        });

        txtHospName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospNameActionPerformed(evt);
            }
        });

        lblHospName.setText("Hospital Name");

        cbxContPref.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OneSelf", "EmergencyContact" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName1)
                            .addComponent(lblage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmergencyContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmergencyContactName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxContPref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 36, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBloodGroup1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblContact)
                        .addGap(18, 18, 18)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHospName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblage2)
                            .addComponent(lblContactPreference))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbxBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNearestRailwayStation1)
                            .addComponent(txtHospName))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddRequestor)
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName1)
                    .addComponent(lblBloodGroup1)
                    .addComponent(cbxBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblage)
                    .addComponent(txtAge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtNearestRailwayStation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHospName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHospName)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblage2)
                    .addComponent(txtEmergencyContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmergencyContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactPreference)
                    .addComponent(cbxContPref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddRequestor)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Requestor", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHospNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospNameActionPerformed

    private void btnAddRequestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRequestorActionPerformed
        // TODO add your handling code here:

        String name=txtName1.getText();
        int age = 0;
        try{
            age = Integer.parseInt(txtAge1.getText());
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        String bloodGrp=(String)cbxBloodGroup.getSelectedItem();
        String contPref=(String)cbxContPref.getSelectedItem();
        int conpref = 0;
        if(null != contPref)
        switch (contPref) {
            case "OneSelf":
            conpref=1;
            break;
            case "Emergency":
            conpref=2;
            break;
        }
        System.out.println(contPref);
        String address=txtAddress.getText();
        String NRS=txtNearestRailwayStation1.getText();
        String city=txtCity.getText();
        String phno=txtContact.getText();
        String emerName=txtEmergencyContactName.getText();
        String emerNo=txtEmergencyContactNumber.getText();
        String hospName= txtHospName.getText();

        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost/cmf";

        //  Database credentials
        final String USER = "root";
        final String PASS = "";

        Connection conn;
        conn = null;
        Statement stmt;
        stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            stmt = conn.createStatement();/*

            String sql = "INSERT INTO donor(Name,BloodGroup,Age,Address,NRS,City,PhoneNo,EmergencyNo) VALUES('"+name+"','"+BloodGroup+"',"+age+",'"+address+"','"+NRS+"','"+city+"','"+PhNo+"','"+EmNo+"')";
            String sql2 = "SELECT * FROM donor";
            System.out.print(sql);

            stmt.executeUpdate(sql);*/

            stmt = conn.createStatement();

            String sql3 = "insert into requestor(Name,BloodGroup,Age,NRS,Contact,HName,ECNa,ECNo,ConPre,HAddress) VALUES('"+name+"','"+bloodGrp+"',"+age+",'"+NRS+"','"+phno+"','"+hospName+"','"+emerName+"','"+emerNo+"',"+conpref+",'hello');";
            System.out.println(sql3);
            try{
                stmt.executeUpdate(sql3);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println(sql3);

        }catch(SQLException e){} catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        RequestorDetails newFrame=new RequestorDetails();
        newFrame.setVisible(true);
        
    }//GEN-LAST:event_btnAddRequestorActionPerformed

    private void txtName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName1ActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtNearestRailwayStation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNearestRailwayStation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNearestRailwayStation1ActionPerformed

    private void cbxBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBloodGroupActionPerformed

    private void txtEmergencyContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmergencyContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmergencyContactNumberActionPerformed

    private void btnAddDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDonorActionPerformed

        // TODO add your handling code here:

        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost/cmf";

        //  Database credentials
        final String USER = "root";
        final String PASS = "";

        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            String name = txtName.getText();
            String BloodGroup =(String) cvxBloodGroup.getSelectedItem();
            int age = parseInt(txtAge.getText());
            String address = txtAddress.getText();
            String NRS = txtNearestRailwayStation.getText();
            String city = txtCity.getText();
            String PhNo = txtPhoneNo.getText();
            String EmNo = txtEmergencyNo.getText();

            stmt = conn.createStatement();

            String sql = "INSERT INTO donor(Name,BloodGroup,Age,Address,NRS,City,PhoneNo,EmergencyNo) VALUES('"+name+"','"+BloodGroup+"',"+age+",'"+address+"','"+NRS+"','"+city+"','"+PhNo+"','"+EmNo+"')";
            String sql2 = "SELECT * FROM donor";
            System.out.print(sql);

            stmt.executeUpdate(sql);

        }
        catch(SQLException e)
        {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       /* String BldGrp;
        String NRailStn;
        public String getUsername(){
        
        }*/
    }//GEN-LAST:event_btnAddDonorActionPerformed

    private void txtEmergencyNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmergencyNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmergencyNoActionPerformed

    private void txtPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNoActionPerformed

    private void txtNearestRailwayStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNearestRailwayStationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNearestRailwayStationActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblAge;
    private javax.swing.JButton btnAddDonor;
    private javax.swing.JButton btnAddRequestor;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox cbxBloodGroup;
    private javax.swing.JComboBox cbxContPref;
    private javax.swing.JComboBox cvxBloodGroup;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBloodGroup;
    private javax.swing.JLabel lblBloodGroup1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblContactPreference;
    private javax.swing.JLabel lblEmergencyNo;
    private javax.swing.JLabel lblHospName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblNearestRailwayStation;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblage2;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAge1;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmergencyContactName;
    private javax.swing.JTextField txtEmergencyContactNumber;
    private javax.swing.JTextField txtEmergencyNo;
    private javax.swing.JTextField txtHospName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtNearestRailwayStation;
    private javax.swing.JTextField txtNearestRailwayStation1;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables
}
