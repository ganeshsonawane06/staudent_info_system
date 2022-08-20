
package com.ui.frame;

import com.client.Client;
import com.daoImpl.ConnectionManager;
import com.daoImpl.StudentDao;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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


public class StudentRegistration extends javax.swing.JInternalFrame {

    Blob studentBlob;
    String number = "";
    
    public StudentRegistration() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pnlBase = new javax.swing.JPanel();
        lblStudentPhoto = new javax.swing.JLabel();
        btnUploadStudentPhoto = new javax.swing.JButton();
        lblStudentPersonalDetails = new javax.swing.JLabel();
        lblStudentName = new javax.swing.JLabel();
        tfStudentFirstName = new javax.swing.JTextField();
        tfStudentMiddleName = new javax.swing.JTextField();
        tfStudentLastName = new javax.swing.JTextField();
        lblStudentFatherName = new javax.swing.JLabel();
        tfFatherFirstName = new javax.swing.JTextField();
        tfFatherMiddleName = new javax.swing.JTextField();
        tfFatherLastName = new javax.swing.JTextField();
        lblStudentMotherName = new javax.swing.JLabel();
        tfMotherFirstName = new javax.swing.JTextField();
        lblStudentContactNumber = new javax.swing.JLabel();
        tfContactNumber = new javax.swing.JTextField();
        lblStudentPermanentAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taPermanantAddress = new javax.swing.JTextArea();
        dtpckrDOB = new org.jdesktop.swingx.JXDatePicker();
        lblStudentDOB = new javax.swing.JLabel();
        lblStudentGender = new javax.swing.JLabel();
        rdbtnMale = new javax.swing.JRadioButton();
        rdbtnFemale = new javax.swing.JRadioButton();
        rdbtnOther = new javax.swing.JRadioButton();
        lblStudentAge = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        lblStudentReligion = new javax.swing.JLabel();
        cmbbxReligion = new javax.swing.JComboBox<>();
        lblStudentCatagory = new javax.swing.JLabel();
        tfCatagory = new javax.swing.JTextField();
        lblStudentDesability = new javax.swing.JLabel();
        rdbtnYes = new javax.swing.JRadioButton();
        rdbtnNo = new javax.swing.JRadioButton();
        lblStudentAadhaarCarNumber = new javax.swing.JLabel();
        tfAadhaarNumber = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 58), new java.awt.Dimension(0, 58), new java.awt.Dimension(32767, 58));
        lblStudentEducationalDetails = new javax.swing.JLabel();
        lblStudentLastInstitute = new javax.swing.JLabel();
        tfLastSchoolOrCollege = new javax.swing.JTextField();
        lblStudentUniversity = new javax.swing.JLabel();
        tfBoardOrUniversity = new javax.swing.JTextField();
        lblStudentAdmissionDate = new javax.swing.JLabel();
        dtpckrAddmissionDate = new org.jdesktop.swingx.JXDatePicker();
        lblStudentBeneficiary = new javax.swing.JLabel();
        cmbbcBenificiary = new javax.swing.JComboBox<>();
        lblStudentCourse = new javax.swing.JLabel();
        cmbbxCourse = new javax.swing.JComboBox<>();
        lblStudentStream = new javax.swing.JLabel();
        cmbbxStream = new javax.swing.JComboBox<>();
        lblStudentClass = new javax.swing.JLabel();
        cmbbxClass = new javax.swing.JComboBox<>();
        lblStudentOtherDetails = new javax.swing.JLabel();
        lblStudentEmergencyContactNum = new javax.swing.JLabel();
        lblStudentEmergencyContactNum_01 = new javax.swing.JLabel();
        tfEmergencyContactNum_01 = new javax.swing.JTextField();
        lblStudentEmergencyContactNum_02 = new javax.swing.JLabel();
        tfEmergencyContactNum_02 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        talocalAddress = new javax.swing.JTextArea();
        lblStudentLocalAddress = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(32767, 100));
        lblStudentAgeYear = new javax.swing.JLabel();
        lblStudentEMail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        btnGetDetails = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Student Details");

        lblStudentPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/defaultpic.png"))); // NOI18N
        lblStudentPhoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnUploadStudentPhoto.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnUploadStudentPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.PNG"))); // NOI18N
        btnUploadStudentPhoto.setText("Upload");
        btnUploadStudentPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadStudentPhotoActionPerformed(evt);
            }
        });

        lblStudentPersonalDetails.setForeground(new java.awt.Color(204, 0, 0));
        lblStudentPersonalDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentPersonalDetails.setText("Personal Details:");
        lblStudentPersonalDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(0, 0, 153)));

        lblStudentName.setText("Student Name          :");

        tfStudentFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStudentFirstNameActionPerformed(evt);
            }
        });

        lblStudentFatherName.setText("Father Name            :");

        lblStudentMotherName.setText("Mother Name           :");

        lblStudentContactNumber.setText("Contact number      :");

        tfContactNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfContactNumberKeyTyped(evt);
            }
        });

        lblStudentPermanentAddress.setText("Address                    :");

        taPermanantAddress.setColumns(20);
        taPermanantAddress.setLineWrap(true);
        taPermanantAddress.setRows(5);
        jScrollPane1.setViewportView(taPermanantAddress);

        dtpckrDOB.setDate(new Date());
        dtpckrDOB.setFormats(new SimpleDateFormat("dd/MM/yyyy"));
        dtpckrDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtpckrDOBActionPerformed(evt);
            }
        });

        lblStudentDOB.setText("DOB                          :");

        lblStudentGender.setText("Gender                     :");

        buttonGroup1.add(rdbtnMale);
        rdbtnMale.setText("Male");

        buttonGroup1.add(rdbtnFemale);
        rdbtnFemale.setText("Female");

        buttonGroup1.add(rdbtnOther);
        rdbtnOther.setText("Other");

        lblStudentAge.setText("Age:");

        lblStudentReligion.setText("Religion                  :");

        cmbbxReligion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select religion", "Hindu", "Islam", "Sikh", "Christian", "Buddhist", "Jain" }));

        lblStudentCatagory.setText("Catagory                  :");

        lblStudentDesability.setText("Desability                :");

        buttonGroup2.add(rdbtnYes);
        rdbtnYes.setText("Yes");

        buttonGroup2.add(rdbtnNo);
        rdbtnNo.setText("No");

        lblStudentAadhaarCarNumber.setText("Aadhaar Number   :");

        lblStudentEducationalDetails.setForeground(new java.awt.Color(204, 0, 0));
        lblStudentEducationalDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentEducationalDetails.setText("Educational Details:");
        lblStudentEducationalDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(0, 0, 153)));

        lblStudentLastInstitute.setText(" Last college/School :");

        lblStudentUniversity.setText("Board/University      :");

        lblStudentAdmissionDate.setText("Addmission Date      :");

        dtpckrAddmissionDate.setDate(new Date());
        dtpckrAddmissionDate.setFormats(new SimpleDateFormat("dd/MM/yyyy"));

        lblStudentBeneficiary.setText("Beneficiary               :");

        cmbbcBenificiary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select beneficiary", "Open", "OBC", "EBC", "SC", "NT-A", "NT-B", "NT-C", "NT-D", "" }));
        cmbbcBenificiary.setToolTipText("");

        lblStudentCourse.setText("Course                     :");

        cmbbxCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select course", "Engineering Degree", "Engineering Deploma", "M. E.", "M. Tech", "MSc", "M. A.", "M. Com.", "M. Pharm.", "B. Pharm", "BSc", "B. A.", "B. Com." }));

        lblStudentStream.setText("Stream                     :");

        cmbbxStream.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select stream", "Computer", "Mechanical", "IT", "E & TC", "Civil", "Electrical", "Phisics", "Mathematics", "Botany", "Zoology", "Literature", "History", "Geography", "Social Science", "Trade", "Insurance", "Banking", "Plain Pharmacy" }));

        lblStudentClass.setText("Class                        :");

        cmbbxClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select class", "First Year", "Second Year", "Third Year", "Final Year" }));

        lblStudentOtherDetails.setForeground(new java.awt.Color(204, 0, 0));
        lblStudentOtherDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentOtherDetails.setText("Other Details:");
        lblStudentOtherDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(0, 0, 153)));

        lblStudentEmergencyContactNum.setText("Emergency Contact No.:");

        lblStudentEmergencyContactNum_01.setText("1)");

        lblStudentEmergencyContactNum_02.setText("2)");

        talocalAddress.setColumns(20);
        talocalAddress.setLineWrap(true);
        talocalAddress.setRows(5);
        jScrollPane2.setViewportView(talocalAddress);

        lblStudentLocalAddress.setText("Local Address               :");

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

        filler2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStudentAgeYear.setText("yrs");

        lblStudentEMail.setText("e-Mail                       :");

        btnGetDetails.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnGetDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PersonDetails_1 - Copy.png"))); // NOI18N
        btnGetDetails.setText("Get Detail");
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
                .addContainerGap()
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addComponent(lblStudentPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnUploadStudentPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStudentPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblStudentEMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStudentDesability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStudentCatagory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStudentPermanentAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStudentMotherName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStudentFatherName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStudentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStudentDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStudentGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStudentReligion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStudentContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStudentAadhaarCarNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfMotherFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1)
                                    .addGroup(pnlBaseLayout.createSequentialGroup()
                                        .addComponent(dtpckrDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblStudentAge)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblStudentAgeYear))
                                    .addGroup(pnlBaseLayout.createSequentialGroup()
                                        .addComponent(rdbtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdbtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdbtnOther, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlBaseLayout.createSequentialGroup()
                                        .addComponent(rdbtnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdbtnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfAadhaarNumber)
                                    .addComponent(tfCatagory)
                                    .addComponent(cmbbxReligion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlBaseLayout.createSequentialGroup()
                                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfContactNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfStudentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfFatherFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfStudentMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfFatherMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfFatherLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfStudentLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStudentEducationalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStudentOtherDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlBaseLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(lblStudentEmergencyContactNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblStudentLocalAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(pnlBaseLayout.createSequentialGroup()
                                                        .addComponent(lblStudentEmergencyContactNum_01)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(tfEmergencyContactNum_01, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lblStudentEmergencyContactNum_02)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(tfEmergencyContactNum_02, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(lblStudentClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                    .addComponent(lblStudentStream, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                    .addComponent(lblStudentCourse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                    .addComponent(lblStudentBeneficiary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                    .addComponent(lblStudentAdmissionDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                    .addComponent(lblStudentUniversity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                    .addComponent(lblStudentLastInstitute, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfLastSchoolOrCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfBoardOrUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(dtpckrAddmissionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cmbbxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cmbbxStream, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(cmbbcBenificiary, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cmbbxClass, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)))))))
                                .addGap(25, 25, 25))
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(btnGetDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblStudentPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnUploadStudentPhoto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addComponent(lblStudentPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentName)
                            .addComponent(tfStudentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStudentMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStudentLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentFatherName)
                            .addComponent(tfFatherFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFatherMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFatherLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentMotherName)
                            .addComponent(tfMotherFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentContactNumber)
                            .addComponent(tfContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentEMail)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStudentPermanentAddress)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dtpckrDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStudentDOB)
                            .addComponent(lblStudentAge)
                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStudentAgeYear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentGender)
                            .addComponent(rdbtnMale)
                            .addComponent(rdbtnFemale)
                            .addComponent(rdbtnOther))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentDesability)
                            .addComponent(rdbtnYes)
                            .addComponent(rdbtnNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentAadhaarCarNumber)
                            .addComponent(tfAadhaarNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentReligion)
                            .addComponent(cmbbxReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentCatagory)
                            .addComponent(tfCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addComponent(lblStudentEducationalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentLastInstitute)
                                    .addComponent(tfLastSchoolOrCollege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentUniversity)
                                    .addComponent(tfBoardOrUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentAdmissionDate)
                                    .addComponent(dtpckrAddmissionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentCourse)
                                    .addComponent(cmbbxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentStream)
                                    .addComponent(cmbbxStream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentClass)
                                    .addComponent(cmbbxClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentBeneficiary)
                                    .addComponent(cmbbcBenificiary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(lblStudentOtherDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentEmergencyContactNum)
                                    .addComponent(lblStudentEmergencyContactNum_01)
                                    .addComponent(tfEmergencyContactNum_01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStudentEmergencyContactNum_02)
                                    .addComponent(tfEmergencyContactNum_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStudentLocalAddress)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGetDetails)
                                    .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSubmit)
                                        .addComponent(btnCancel)))
                                .addGap(0, 12, Short.MAX_VALUE))
                            .addComponent(filler2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filler1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            String admssndate = new SimpleDateFormat("dd/MM/YYYY").format(dtpckrAddmissionDate.getDate());
            String religion = (String) cmbbxReligion.getSelectedItem();
            String courseEnrolled = (String) cmbbxCourse.getSelectedItem();
            String stream = (String) cmbbxStream.getSelectedItem();
            String classYear = (String) cmbbxClass.getSelectedItem();
            String benificiary = (String) cmbbcBenificiary.getSelectedItem();

            com.bean.StudentRegistrationBean registerStudent = new com.bean.StudentRegistrationBean
                        (Long.parseLong(tfAadhaarNumber.getText()), tfStudentFirstName.getText()
                                , tfStudentMiddleName.getText(), tfStudentLastName.getText()
                                , tfFatherFirstName.getText(), tfFatherMiddleName.getText()
                                , tfFatherLastName.getText(), tfMotherFirstName.getText()
                                , Long.parseLong(tfContactNumber.getText()), Long.parseLong(tfEmergencyContactNum_01.getText())
                                , Long.parseLong(tfEmergencyContactNum_02.getText())
                                , Long.parseLong(tfAadhaarNumber.getText()), (Integer.parseInt(currentYear)-Integer.parseInt(birthYear))
                                , tfEmail.getText(), taPermanantAddress.getText(), talocalAddress.getText()
                                , dob, gender, desability, religion, tfCatagory.getText()
                                , tfBoardOrUniversity.getText(), tfLastSchoolOrCollege.getText()
                                , admssndate, courseEnrolled, stream, classYear, benificiary
                                , studentBlob);
            /*HibernateTemplate ht = new HibernateTemplateConnection().getTemplate();
            ht.saveOrUpdate(registerStudent);*/
            StudentDao stddso  = new StudentDao();
            stddso.saveOrUpdateStudent(registerStudent);
            JOptionPane.showMessageDialog(this, "Student record saved ..... !!", "Sved", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void tfStudentFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStudentFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStudentFirstNameActionPerformed

    private void btnUploadStudentPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadStudentPhotoActionPerformed
        System.out.println("\n=========================Inside Upload Student Photo Button method=======================");
        try
        {
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

                        studentBlob = Hibernate.getLobCreator(Client.transactionManager.getSessionFactory().openSession()).createBlob(imageBytes);
                        
                        FileInputStream inputStream = new FileInputStream(image);
                        inputStream.read(imageBytes);
                        inputStream.close();
                        
                        studentBlob.setBytes(1, imageBytes);
                        
                        lblStudentPhoto.setText("");
                        lblStudentPhoto.setIcon(new ImageIcon(new ImageIcon(filePath)
                                .getImage().getScaledInstance(lblStudentPhoto.getWidth()
                                        , lblStudentPhoto.getHeight(), Image.SCALE_SMOOTH)));

                    }
                    catch(HibernateException e)
                    {
                        System.out.println(e);
                    }
                }
                else
                {

                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            
        
    }//GEN-LAST:event_btnUploadStudentPhotoActionPerformed

    private void btnGetDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDetailsActionPerformed
        System.out.println("\n=========================Inside Get Details Button method=======================");
        String id = JOptionPane.showInputDialog(this, "Enter student ID .");
        try
        {
            long sid = Long.parseLong(id);
            com.bean.StudentRegistrationBean sr = new StudentDao().getById(sid);
            if(sr != null)
            {
                tfStudentFirstName.setText(sr.getsFName());
                tfStudentMiddleName.setText(sr.getsMName());
                tfStudentLastName.setText(sr.getsLName());
                tfFatherFirstName.setText(sr.getfFName());
                tfFatherMiddleName.setText(sr.getfMName());
                tfFatherLastName.setText(sr.getfLName());
                tfMotherFirstName.setText(sr.getmFName());
                tfContactNumber.setText(""+sr.getContactNumber());
                tfEmail.setText(sr.getEmail());
                taPermanantAddress.setText(sr.getPermanentAddress());
                talocalAddress.setText(sr.getLocalAddress());
                try {
                    dtpckrDOB.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(sr.getDob()));
                    dtpckrAddmissionDate.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(sr.getAdmissionDate()));
                } catch (ParseException ex) {
                    Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
                }
                tfAge.setText(""+sr.getAge());
                tfAadhaarNumber.setText(""+sr.getAadhaarNumber());
                tfCatagory.setText(sr.getCatagory());
                tfLastSchoolOrCollege.setText(sr.getPreviousInstitution());
                tfBoardOrUniversity.setText(sr.getUniversityOrBoard());
                tfEmergencyContactNum_01.setText(""+sr.getEmergencyContact_1());
                tfEmergencyContactNum_02.setText(""+sr.getEmergencyContact_2());
                cmbbxReligion.setModel(new DefaultComboBoxModel<>(new String[]{sr.getReligion()}));
                cmbbxCourse.setModel(new DefaultComboBoxModel(new String[]{sr.getCourseEnrolled()}));
                cmbbxStream.setModel(new DefaultComboBoxModel(new String[]{sr.getStream()}));
                cmbbxClass.setModel(new DefaultComboBoxModel(new String[]{sr.getClassYear()}));
                cmbbcBenificiary.setModel(new DefaultComboBoxModel(new String[]{sr.getBenificiary()}));
                if(sr.getGender().equals("Male"))
                    rdbtnMale.setSelected(true);


                try {
                    if(sr.getImage() != null)
                    {
                        Blob image = sr.getImage();
                        int imageLength = (int) image.length();
                        System.out.println("Image length: "+imageLength);
                        byte[] imageBytes = image.getBytes(1, imageLength);

                        
                        lblStudentPhoto.setIcon(new ImageIcon(new ImageIcon(imageBytes)
                                                        .getImage().getScaledInstance(lblStudentPhoto.getWidth()
                                                                , lblStudentPhoto.getHeight(), Image.SCALE_SMOOTH)));
                    }
                    else
                        System.out.println("Empty image.");
                    
                } catch (SQLException ex) {
                    Logger.getLogger(FacultyRegistration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
                JOptionPane.showMessageDialog(this, "Student record not available .... !!", "No Record", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btnGetDetailsActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.out.println("\n=========================Inside Cancel Button method=======================");
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tfContactNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfContactNumberKeyTyped
        System.out.println("\n=========================Inside Contact Number Key Typed method=======================");
        
        /*String digit = tfContactNumber.getText();
        if(ValidatorClass.validateMobileNumber(digit))
        {
            number = number.concat(digit);
            tfContactNumber.setText(number);
            System.out.println("Number : "+number);
        }
        else
        {
            tfContactNumber.setText(number);
        }*/
    }//GEN-LAST:event_tfContactNumberKeyTyped

    private void dtpckrDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtpckrDOBActionPerformed
        System.out.println("\n=========================Inside DOB date picker=======================");
        String birthYear = new SimpleDateFormat("YYYY").format(dtpckrDOB.getDate());
        String currentYear = new SimpleDateFormat("YYYY").format(new Date());
        tfAge.setText(""+(Integer.parseInt(currentYear)-Integer.parseInt(birthYear)));
    }//GEN-LAST:event_dtpckrDOBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnGetDetails;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUploadStudentPhoto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbbcBenificiary;
    private javax.swing.JComboBox<String> cmbbxClass;
    private javax.swing.JComboBox<String> cmbbxCourse;
    private javax.swing.JComboBox<String> cmbbxReligion;
    private javax.swing.JComboBox<String> cmbbxStream;
    private org.jdesktop.swingx.JXDatePicker dtpckrAddmissionDate;
    private org.jdesktop.swingx.JXDatePicker dtpckrDOB;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblStudentAadhaarCarNumber;
    private javax.swing.JLabel lblStudentAdmissionDate;
    private javax.swing.JLabel lblStudentAge;
    private javax.swing.JLabel lblStudentAgeYear;
    private javax.swing.JLabel lblStudentBeneficiary;
    private javax.swing.JLabel lblStudentCatagory;
    private javax.swing.JLabel lblStudentClass;
    private javax.swing.JLabel lblStudentContactNumber;
    private javax.swing.JLabel lblStudentCourse;
    private javax.swing.JLabel lblStudentDOB;
    private javax.swing.JLabel lblStudentDesability;
    private javax.swing.JLabel lblStudentEMail;
    private javax.swing.JLabel lblStudentEducationalDetails;
    private javax.swing.JLabel lblStudentEmergencyContactNum;
    private javax.swing.JLabel lblStudentEmergencyContactNum_01;
    private javax.swing.JLabel lblStudentEmergencyContactNum_02;
    private javax.swing.JLabel lblStudentFatherName;
    private javax.swing.JLabel lblStudentGender;
    private javax.swing.JLabel lblStudentLastInstitute;
    private javax.swing.JLabel lblStudentLocalAddress;
    private javax.swing.JLabel lblStudentMotherName;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JLabel lblStudentOtherDetails;
    private javax.swing.JLabel lblStudentPermanentAddress;
    private javax.swing.JLabel lblStudentPersonalDetails;
    private javax.swing.JLabel lblStudentPhoto;
    private javax.swing.JLabel lblStudentReligion;
    private javax.swing.JLabel lblStudentStream;
    private javax.swing.JLabel lblStudentUniversity;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JRadioButton rdbtnFemale;
    private javax.swing.JRadioButton rdbtnMale;
    private javax.swing.JRadioButton rdbtnNo;
    private javax.swing.JRadioButton rdbtnOther;
    private javax.swing.JRadioButton rdbtnYes;
    private javax.swing.JTextArea taPermanantAddress;
    private javax.swing.JTextArea talocalAddress;
    private javax.swing.JTextField tfAadhaarNumber;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfBoardOrUniversity;
    private javax.swing.JTextField tfCatagory;
    private javax.swing.JTextField tfContactNumber;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEmergencyContactNum_01;
    private javax.swing.JTextField tfEmergencyContactNum_02;
    private javax.swing.JTextField tfFatherFirstName;
    private javax.swing.JTextField tfFatherLastName;
    private javax.swing.JTextField tfFatherMiddleName;
    private javax.swing.JTextField tfLastSchoolOrCollege;
    private javax.swing.JTextField tfMotherFirstName;
    private javax.swing.JTextField tfStudentFirstName;
    private javax.swing.JTextField tfStudentLastName;
    private javax.swing.JTextField tfStudentMiddleName;
    // End of variables declaration//GEN-END:variables
}
