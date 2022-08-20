
package com.ui.frame;

import com.bean.AcademicDetailsBean;
import com.client.Client;
import com.daoImpl.FacultyDao;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;


public class FacultyRegistration extends javax.swing.JInternalFrame {

    Blob facultyBlob;
    public FacultyRegistration() {
        initComponents();
        initializeOtherComponents();
        setComponentEnable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pnlBase = new javax.swing.JPanel();
        lblPersonalDetails = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        lblContactNumber = new javax.swing.JLabel();
        tfMiddleName = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        tfContactNumber = new javax.swing.JTextField();
        lblEMail = new javax.swing.JLabel();
        tfEMail = new javax.swing.JTextField();
        lblPermanentAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taPermanentAddress = new javax.swing.JTextArea();
        dtpckrDOB = new org.jdesktop.swingx.JXDatePicker();
        lblDOB = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        lblAgeYear = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        rdbtnMale = new javax.swing.JRadioButton();
        rdbtnFemale = new javax.swing.JRadioButton();
        rdbtnOther = new javax.swing.JRadioButton();
        lblDesability = new javax.swing.JLabel();
        rdbtnYes = new javax.swing.JRadioButton();
        rdbtnNo = new javax.swing.JRadioButton();
        lblAadhaarNumber = new javax.swing.JLabel();
        tfAadharNumber = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taLocalAddress = new javax.swing.JTextArea();
        lblLocalAddress = new javax.swing.JLabel();
        tfDesabilityDetails = new javax.swing.JTextField();
        lblDesabilityDetails = new javax.swing.JLabel();
        btnUploadPhoto = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(32767, 100));
        lbleducationalDetails = new javax.swing.JLabel();
        lblDegree = new javax.swing.JLabel();
        cmbbxDegree = new javax.swing.JComboBox<>();
        lblCollege = new javax.swing.JLabel();
        tfCollege = new javax.swing.JTextField();
        lblUniversity = new javax.swing.JLabel();
        tfUniversity = new javax.swing.JTextField();
        lblSpecialization = new javax.swing.JLabel();
        tfSpecialization = new javax.swing.JTextField();
        lblOtherDetails = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        cmbbxPosition = new javax.swing.JComboBox<>();
        lblPANNumber = new javax.swing.JLabel();
        tfPANNumber = new javax.swing.JTextField();
        lblRemark = new javax.swing.JLabel();
        tfRemark = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnGetDetails = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Faculty Details");

        lblPersonalDetails.setForeground(new java.awt.Color(204, 0, 0));
        lblPersonalDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPersonalDetails.setText("Personal Details:");
        lblPersonalDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(0, 0, 153)));

        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/defaultpic.png"))); // NOI18N
        lblPhoto.setToolTipText("");
        lblPhoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblName.setText("Name                       :");

        lblContactNumber.setText("Contact Number      :");

        lblEMail.setText("e-Mail                      :");

        lblPermanentAddress.setText("Permanent Address:");

        taPermanentAddress.setColumns(20);
        taPermanentAddress.setLineWrap(true);
        taPermanentAddress.setRows(5);
        jScrollPane1.setViewportView(taPermanentAddress);

        dtpckrDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtpckrDOBActionPerformed(evt);
            }
        });

        lblDOB.setText("DOB                         :");

        lblAge.setText("Age:");

        lblAgeYear.setText("yrs");

        lblGender.setText("Gender                    :");

        buttonGroup1.add(rdbtnMale);
        rdbtnMale.setText("Male");

        buttonGroup1.add(rdbtnFemale);
        rdbtnFemale.setText("Female");

        buttonGroup1.add(rdbtnOther);
        rdbtnOther.setText("Other");

        lblDesability.setText("Desability                :");

        buttonGroup2.add(rdbtnYes);
        rdbtnYes.setText("Yes");
        rdbtnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnYesActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdbtnNo);
        rdbtnNo.setText("No");
        rdbtnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNoActionPerformed(evt);
            }
        });

        lblAadhaarNumber.setText("Aadhaar Number     :");

        taLocalAddress.setColumns(20);
        taLocalAddress.setLineWrap(true);
        taLocalAddress.setRows(5);
        jScrollPane2.setViewportView(taLocalAddress);

        lblLocalAddress.setText("Local Address          :");

        lblDesabilityDetails.setText("Details:");

        btnUploadPhoto.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnUploadPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.PNG"))); // NOI18N
        btnUploadPhoto.setText("Upload");
        btnUploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPhotoActionPerformed(evt);
            }
        });

        filler1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbleducationalDetails.setForeground(new java.awt.Color(204, 0, 0));
        lbleducationalDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbleducationalDetails.setText("Educational Details");
        lbleducationalDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(0, 0, 153)));

        lblDegree.setText("Degree                    :");

        cmbbxDegree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select gegree", "Engineering Degree", "Engineering Deploma", "M. E.", "M. Tech", "MSc", "M. A.", "M. Com.", "M. Pharm.", "B. Pharm", "BSc", "B. A.", "B. Com." }));

        lblCollege.setText("College                    :");

        lblUniversity.setText("University                :");

        tfUniversity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUniversityActionPerformed(evt);
            }
        });

        lblSpecialization.setText("Specialization          :");

        lblOtherDetails.setForeground(new java.awt.Color(204, 0, 0));
        lblOtherDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOtherDetails.setText("Other Details");
        lblOtherDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(0, 0, 153)));

        lblPosition.setText("Position                   :");

        cmbbxPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select position", "Professor", "HOD", "Principle", "Accountant", "Clerk", "Librarian", "Lab Assistant" }));

        lblPANNumber.setText("PAN Number            :");

        lblRemark.setText("Remark                    :");

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submit_1 - Copy.png"))); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnGetDetails.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnGetDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PersonDetails_1 - Copy.png"))); // NOI18N
        btnGetDetails.setText("Get");
        btnGetDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPermanentAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLocalAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDesability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAadhaarNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlBaseLayout.createSequentialGroup()
                                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tfContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlBaseLayout.createSequentialGroup()
                                    .addComponent(dtpckrDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblAge)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblAgeYear))
                                .addGroup(pnlBaseLayout.createSequentialGroup()
                                    .addComponent(rdbtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rdbtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rdbtnOther, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tfAadharNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1)
                                .addComponent(jScrollPane2))
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addComponent(rdbtnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbtnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDesabilityDetails)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfDesabilityDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnUploadPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRemark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPANNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbbxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPANNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRemark, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSpecialization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCollege, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDegree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbbxDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOtherDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbleducationalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnGetDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBaseLayout.createSequentialGroup()
                        .addComponent(btnUploadPhoto)
                        .addGap(45, 45, 45)))
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblName)
                                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblContactNumber)
                                    .addComponent(tfContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEMail)
                                    .addComponent(tfEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPermanentAddress)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLocalAddress))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dtpckrDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDOB)
                                    .addComponent(lblAge)
                                    .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAgeYear))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGender)
                                    .addComponent(rdbtnMale)
                                    .addComponent(rdbtnFemale)
                                    .addComponent(rdbtnOther))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDesability)
                                    .addComponent(rdbtnYes)
                                    .addComponent(rdbtnNo)
                                    .addComponent(tfDesabilityDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDesabilityDetails))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAadhaarNumber)
                                    .addComponent(tfAadharNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lbleducationalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDegree)
                                    .addComponent(cmbbxDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSpecialization)
                                    .addComponent(tfSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCollege)
                                    .addComponent(tfCollege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUniversity)
                                    .addComponent(tfUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(lblOtherDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPosition)
                                    .addComponent(cmbbxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPANNumber)
                                    .addComponent(tfPANNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRemark)
                                    .addComponent(tfRemark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnGetDetails)
                                    .addComponent(btnSubmit)
                                    .addComponent(btnCancel))))
                        .addGap(23, 45, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUniversityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUniversityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUniversityActionPerformed

    private void btnUploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPhotoActionPerformed
        System.out.println("\n=========================Inside Upload Student Photo Button method=======================");
        JFileChooser chooseStudentPhoto = new JFileChooser();
        chooseStudentPhoto.setMultiSelectionEnabled(false);
        chooseStudentPhoto.setFileFilter(new FileNameExtensionFilter("JPEG file", "jpg", "jpeg", "jpe", "jfif", "png"));
        
        int returnValue = chooseStudentPhoto.showOpenDialog(this);
        if(returnValue == JFileChooser.APPROVE_OPTION)
        {
            File image = chooseStudentPhoto.getSelectedFile();
            if((image.length())<104500) //102kb
            {
                String filePath = image.getPath();
                try
                {
                    byte[] imageBytes = new byte[(int) image.length()];
                    
                    facultyBlob = Hibernate.getLobCreator(Client.transactionManager.getSessionFactory().openSession()).createBlob(imageBytes);
                        
                        FileInputStream inputStream = new FileInputStream(image);
                        inputStream.read(imageBytes);
                        inputStream.close();
                        
                        facultyBlob.setBytes(1, imageBytes);
                    
                    lblPhoto.setText("");
                    lblPhoto.setIcon(new ImageIcon(new ImageIcon(filePath)
                            .getImage().getScaledInstance(lblPhoto.getWidth()
                                    , lblPhoto.getHeight(), Image.SCALE_SMOOTH)));
                    
                }
                catch(IOException | HibernateException e)
                {
                    System.out.println(e);
                } catch (SQLException ex) {
                    Logger.getLogger(FacultyRegistration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                
                return;
            }
        }
    }//GEN-LAST:event_btnUploadPhotoActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        System.out.println("\n=========================Inside Submit Button method=======================");
        String gender = "";
        String desability = "";
        try
        {
            if(rdbtnMale.isSelected())
                gender = "Male";
            else if(rdbtnFemale.isSelected())
                gender = "Female";
            else
                gender = "Other";

            if(rdbtnYes.isSelected())
                desability = "Yes";
            else
                desability = "No";

            String birthYear = new SimpleDateFormat("YYYY").format(dtpckrDOB.getDate());
            String currentYear = new SimpleDateFormat("YYYY").format(new Date());
            tfAge.setText(""+(Integer.parseInt(currentYear)-Integer.parseInt(birthYear)));
            System.out.println("str1: "+birthYear+"\nstr2: "+currentYear+"\nAge: "+(Integer.parseInt(currentYear)-Integer.parseInt(birthYear)));
            
            String dob = new SimpleDateFormat("dd/MM/YYYY").format(dtpckrDOB.getDate());
            String degree = (String) cmbbxDegree.getSelectedItem();
            String position = (String) cmbbxPosition.getSelectedItem();
            ArrayList list = new ArrayList<Object>();
            list.add(new AcademicDetailsBean("University of Pune", "PCCOE, Pune", "B. E. E&TC", "2014", "75.86"));

            com.bean.FacultyRegistrationBean registerFaculty = new com.bean.FacultyRegistrationBean(
                    Long.parseLong(tfAadharNumber.getText()), (Integer.parseInt(currentYear)-Integer.parseInt(birthYear))
                    , Long.parseLong(tfAadharNumber.getText())
                    , Long.parseLong(tfPANNumber.getText())
                    , Long.parseLong(tfContactNumber.getText())
                    , tfFirstName.getText(), tfMiddleName.getText(), tfLastName.getText()
                    , tfEMail.getText(), taPermanentAddress.getText(), taLocalAddress.getText()
                    , dob, gender, desability, tfDesabilityDetails.getText()
                    , degree, tfSpecialization.getText(), tfCollege.getText(), tfUniversity.getText()
                    , list, position, tfRemark.getText(), facultyBlob);

            new FacultyDao().saveOrUpdateFaculty(registerFaculty);
            JOptionPane.showMessageDialog(this, "Employee record saved ..... !!", "Sved", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnGetDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDetailsActionPerformed
        System.out.println("\n=========================Inside Get Details Button method=======================");
        String id = JOptionPane.showInputDialog(this, "Enter faculty ID .");
        try
        {
            long sid = Long.parseLong(id);
            com.bean.FacultyRegistrationBean fr = new FacultyDao().getById(sid);

            tfFirstName.setText(fr.getFirstName());
            tfMiddleName.setText(fr.getMiddleName());
            tfLastName.setText(fr.getLastName());
            tfContactNumber.setText(""+fr.getContactNumber());
            tfEMail.setText(fr.getEmailId());
            taPermanentAddress.setText(fr.getPermanentAddress());
            taLocalAddress.setText(fr.getLocalAddress());
            tfDesabilityDetails.setText(fr.getDesabilityDetails());
            tfAadharNumber.setText(""+fr.getAadharNumber());
            tfSpecialization.setText(fr.getSpecialization());
            tfCollege.setText(fr.getCollege());
            tfUniversity.setText(fr.getUniversity());
            tfPANNumber.setText(""+fr.getPanNumber());
            tfRemark.setText(fr.getRemark());
            tfAge.setText(""+fr.getAge());
            cmbbxDegree.setModel(new DefaultComboBoxModel<>(new String[]{fr.getDegree()}));
            cmbbxPosition.setModel(new DefaultComboBoxModel<>(new String[]{fr.getPosition()}));
            try {
                dtpckrDOB.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(fr.getDob()));
            } catch (ParseException ex) {
                Logger.getLogger(FacultyRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }


            try {
                Blob image = fr.getImage();
                int imageLength = (int) image.length();
                byte[] imageBytes = image.getBytes(1, imageLength);
                System.out.println("Image lenth: "+imageLength);

                lblPhoto.setIcon(new ImageIcon(new ImageIcon(imageBytes)
                                                .getImage().getScaledInstance(lblPhoto.getWidth()
                                                        , lblPhoto.getHeight(), Image.SCALE_SMOOTH)));


            } catch (SQLException ex) {
                Logger.getLogger(FacultyRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnGetDetailsActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.out.println("\n=========================Inside cancel Button method=======================");
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void dtpckrDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtpckrDOBActionPerformed
        System.out.println("\n=========================Inside DOB date picker=======================");
        String birthYear = new SimpleDateFormat("YYYY").format(dtpckrDOB.getDate());
        String currentYear = new SimpleDateFormat("YYYY").format(new Date());
        tfAge.setText(""+(Integer.parseInt(currentYear)-Integer.parseInt(birthYear)));
    }//GEN-LAST:event_dtpckrDOBActionPerformed

    private void rdbtnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnYesActionPerformed
        System.out.println("\n=========================Inside Yes radio buuton=======================");
        setComponentEnable(true);
    }//GEN-LAST:event_rdbtnYesActionPerformed

    private void rdbtnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNoActionPerformed
        System.out.println("\n=========================Inside No radio buuton=======================");
        setComponentEnable(false);
    }//GEN-LAST:event_rdbtnNoActionPerformed

    public void setComponentEnable(boolean isEnabled)
    {
        lblDesabilityDetails.setEnabled(isEnabled);
        tfDesabilityDetails.setEnabled(isEnabled);
    }

    public void initializeOtherComponents()
    {
        dtpckrDOB.setFormats(new SimpleDateFormat("dd/MM/yyyy"));
        dtpckrDOB.setDate(new Date());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnGetDetails;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUploadPhoto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbbxDegree;
    private javax.swing.JComboBox<String> cmbbxPosition;
    private org.jdesktop.swingx.JXDatePicker dtpckrDOB;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAadhaarNumber;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAgeYear;
    private javax.swing.JLabel lblCollege;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDegree;
    private javax.swing.JLabel lblDesability;
    private javax.swing.JLabel lblDesabilityDetails;
    private javax.swing.JLabel lblEMail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLocalAddress;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOtherDetails;
    private javax.swing.JLabel lblPANNumber;
    private javax.swing.JLabel lblPermanentAddress;
    private javax.swing.JLabel lblPersonalDetails;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblRemark;
    private javax.swing.JLabel lblSpecialization;
    private javax.swing.JLabel lblUniversity;
    private javax.swing.JLabel lbleducationalDetails;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JRadioButton rdbtnFemale;
    private javax.swing.JRadioButton rdbtnMale;
    private javax.swing.JRadioButton rdbtnNo;
    private javax.swing.JRadioButton rdbtnOther;
    private javax.swing.JRadioButton rdbtnYes;
    private javax.swing.JTextArea taLocalAddress;
    private javax.swing.JTextArea taPermanentAddress;
    private javax.swing.JTextField tfAadharNumber;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfCollege;
    private javax.swing.JTextField tfContactNumber;
    private javax.swing.JTextField tfDesabilityDetails;
    private javax.swing.JTextField tfEMail;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfMiddleName;
    private javax.swing.JTextField tfPANNumber;
    private javax.swing.JTextField tfRemark;
    private javax.swing.JTextField tfSpecialization;
    private javax.swing.JTextField tfUniversity;
    // End of variables declaration//GEN-END:variables
}
