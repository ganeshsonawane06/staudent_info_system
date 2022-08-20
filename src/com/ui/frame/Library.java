
package com.ui.frame;

import com.ui.dialog.LibraryRecord;
import com.ui.panel.StudentLibraryDetails;
import javax.swing.JOptionPane;


public class Library extends javax.swing.JInternalFrame {

    StudentLibraryDetails studLibDetails = new StudentLibraryDetails();
    private int counter = 0;
    
    public Library() {
        initComponents();
        setComponentsEnable(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        lblLibraryCard = new javax.swing.JLabel();
        pnlStudent = new javax.swing.JPanel();
        lblStudentID = new javax.swing.JLabel();
        tfStudentID = new javax.swing.JTextField();
        btnShow = new javax.swing.JButton();
        lblStudentLibraryCard = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        flrLibrary_01 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        flrLibrary_02 = new javax.swing.Box.Filler(new java.awt.Dimension(600, 0), new java.awt.Dimension(600, 0), new java.awt.Dimension(600, 32767));
        btnAddNewRecord = new javax.swing.JButton();
        pnlDetails = new javax.swing.JPanel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Library");

        lblLibraryCard.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        lblLibraryCard.setForeground(new java.awt.Color(102, 51, 0));
        lblLibraryCard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLibraryCard.setText("-: Library Card :-");
        lblLibraryCard.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));

        lblStudentID.setLabelFor(tfStudentID);
        lblStudentID.setText("Student ID   :");

        btnShow.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/personDetails_2 - Copy.png"))); // NOI18N
        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        lblStudentLibraryCard.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblStudentLibraryCard.setForeground(new java.awt.Color(0, 0, 153));
        lblStudentLibraryCard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentLibraryCard.setText("Student Library Card");
        lblStudentLibraryCard.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit_1 - Copy.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        flrLibrary_01.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        flrLibrary_02.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 255, 51)));

        btnAddNewRecord.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnAddNewRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_1.png"))); // NOI18N
        btnAddNewRecord.setText("Record");
        btnAddNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStudentLayout = new javax.swing.GroupLayout(pnlStudent);
        pnlStudent.setLayout(pnlStudentLayout);
        pnlStudentLayout.setHorizontalGroup(
            pnlStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStudentID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(flrLibrary_01, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAddNewRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(flrLibrary_02, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStudentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStudentLibraryCard, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlStudentLayout.setVerticalGroup(
            pnlStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStudentLibraryCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentID)
                    .addComponent(tfStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShow)
                    .addComponent(btnRefresh)
                    .addComponent(btnUpdate)
                    .addComponent(flrLibrary_01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddNewRecord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(flrLibrary_02, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLibraryCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLibraryCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        System.out.println("\n=========================Inside Refresh Button=======================");
        try
        {
            pnlDetails.removeAll();
            StudentLibraryDetails sld = new StudentLibraryDetails();
            
            sld.setStudentID(Long.parseLong(tfStudentID.getText()));
            sld.getStudentDetails();
            sld.setSize(pnlDetails.getWidth(), pnlDetails.getHeight());
            sld.setVisible(true);
            pnlDetails.add(studLibDetails);
            sld.updateUI();
            
            counter = 0;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        System.out.println("\n=========================Inside Show Button=======================");
        try
        {
            pnlDetails.removeAll();
            
            if(studLibDetails != null)
            {
                studLibDetails.setStudentID(Long.parseLong(tfStudentID.getText()));
                studLibDetails.getStudentDetails();
                studLibDetails.setSize(pnlDetails.getWidth(), pnlDetails.getHeight());
                studLibDetails.setVisible(true);
                pnlDetails.add(studLibDetails);
                setComponentsEnable(true);
                studLibDetails.updateUI();
            }
            else
                JOptionPane.showMessageDialog(this, "Error occured ...... !!", "ERROR", JOptionPane.ERROR_MESSAGE);
            counter = 0;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        System.out.println("\n=========================Inside Update Button=======================");
        try
        {
            JOptionPane.showMessageDialog(this, "Select the row to be edited.", "Update Operation", JOptionPane.INFORMATION_MESSAGE);
            counter = 1;
            System.out.println("Before call \"updateRecord();\" Counter: " +counter);
            updateRecord();
            //counter = 0;
            System.out.println("After returning \"updateRecord();\" Counter: " +counter);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewRecordActionPerformed
        System.out.println("\n=========================Inside Add New Record Button=======================");
        try
        {
            LibraryRecord dialog = new LibraryRecord(new javax.swing.JFrame(), true);
            dialog.setVisible(true);
            dialog.getNewRecord();
            
            
            if(dialog.getNewRecord().length != 0)
            {
                if(dialog.getNewRecord()[0] != ""  && dialog.getNewRecord()[0] != "")
                {
                    //for(String str : dialog.getNewRecord())
                    //    System.out.println(str);
                    studLibDetails.addRecord(dialog.getNewRecord());
                }
                else
                JOptionPane.showMessageDialog(this, "Record not added.\nInvalid entries in the record.", "Unsuccessful", JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(this, "Record not added.", "Unsuccessful", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        counter = 0;
    }//GEN-LAST:event_btnAddNewRecordActionPerformed

    public void updateRecord()
    {
        if(counter > 0)
        {
            try
            {
                studLibDetails.setCounter(counter);
                System.out.println("Befor call selectRowToBeUpdated Counter set to: " +counter);
                //studLibDetails.selectRowToBeUpdated();
                studLibDetails.setVisible(true);
                //studLibDetails.updateStudentData();
                System.out.println("After call selectRowToBeUpdated Counter is: " +counter);
                //studLibDetails.setCounter(0);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
            
    }
    public void setComponentsEnable(boolean isEnabled)
    {
        btnRefresh.setEnabled(isEnabled);
        btnUpdate.setEnabled(isEnabled);
        btnAddNewRecord.setEnabled(isEnabled);
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewRecord;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnUpdate;
    private javax.swing.Box.Filler flrLibrary_01;
    private javax.swing.Box.Filler flrLibrary_02;
    private javax.swing.JLabel lblLibraryCard;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JLabel lblStudentLibraryCard;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlStudent;
    private javax.swing.JTextField tfStudentID;
    // End of variables declaration//GEN-END:variables
}
