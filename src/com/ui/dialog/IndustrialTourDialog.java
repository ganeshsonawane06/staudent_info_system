
package com.ui.dialog;

import com.ui.frame.TimeTable;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class IndustrialTourDialog extends javax.swing.JDialog {

    private TimeTable timeTableFrame;
    private String organizedBy="", organizedFor="";
    
    public IndustrialTourDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setWindowPosition();
    }
    
    public IndustrialTourDialog(java.awt.Frame parent, boolean modal, TimeTable timeTableFrame) {
        super(parent, modal);
        initComponents();
        setWindowPosition();
        this.timeTableFrame = timeTableFrame;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlComponents = new javax.swing.JPanel();
        cmbbxOrganizedBy = new javax.swing.JComboBox<>();
        cmbbxOrganizedFor = new javax.swing.JComboBox<>();
        tfCompanyName = new javax.swing.JTextField();
        tfVisitePurpose = new javax.swing.JTextField();
        tfVisiteDate = new javax.swing.JTextField();
        tfVisiteTime = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taCompanyAddress = new javax.swing.JTextArea();
        lblOrganizedBy = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblOrganizedFor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCompanyName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblVisitePurpose = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblVisiteDate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblVisiteTime = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCompanyAddress = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Industrial Tour");
        setLocationByPlatform(true);

        pnlComponents.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));

        cmbbxOrganizedBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select department", "Computer", "IT", "Mechanical", "E&TC", "Civil" }));
        cmbbxOrganizedBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxOrganizedByActionPerformed(evt);
            }
        });

        cmbbxOrganizedFor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select class", "First Year", "Second Year", "Third Year", "Final Year" }));
        cmbbxOrganizedFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxOrganizedForActionPerformed(evt);
            }
        });

        taCompanyAddress.setColumns(20);
        taCompanyAddress.setRows(5);
        jScrollPane1.setViewportView(taCompanyAddress);

        lblOrganizedBy.setText("Organized by");

        jLabel1.setText(":");

        lblOrganizedFor.setText("Organized for");

        jLabel2.setText(":");

        lblCompanyName.setText("Company name");

        jLabel3.setText(":");

        lblVisitePurpose.setText("Visite purpose");

        jLabel4.setText(":");

        lblVisiteDate.setText("Date ( dd/ mm/ yyyy )");

        jLabel5.setText(":");

        lblVisiteTime.setText("Time (hh:mm A)");

        jLabel6.setText(":");

        lblCompanyAddress.setText("Company Address");

        jLabel7.setText(":");

        btnOK.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ok_1 - Copy.png"))); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
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

        javax.swing.GroupLayout pnlComponentsLayout = new javax.swing.GroupLayout(pnlComponents);
        pnlComponents.setLayout(pnlComponentsLayout);
        pnlComponentsLayout.setHorizontalGroup(
            pnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComponentsLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOrganizedBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOrganizedFor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVisitePurpose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVisiteDate, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(lblVisiteTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCompanyAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlComponentsLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfVisiteTime, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlComponentsLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(pnlComponentsLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbbxOrganizedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlComponentsLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbbxOrganizedFor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlComponentsLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlComponentsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfVisitePurpose, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlComponentsLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfVisiteDate, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlComponentsLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        pnlComponentsLayout.setVerticalGroup(
            pnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComponentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbbxOrganizedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrganizedBy)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(pnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbbxOrganizedFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrganizedFor)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(pnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCompanyName)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(pnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfVisitePurpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVisitePurpose)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(pnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfVisiteDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVisiteDate)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfVisiteTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVisiteTime)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(pnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCompanyAddress)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOK))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlComponents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlComponents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        System.out.println("\n=========================Inside OK Button=======================");
        if(!(timeTableFrame == null))
            if(!organizedBy.equals("") && !organizedBy.equals("select department"))
            {
                if(!organizedFor.equals("") && !organizedFor.equals("select class"))
                {
                    timeTableFrame.setIndustrialTourDataFromDialog(
                                                new String[] {
                                                        organizedBy
                                                        , organizedFor
                                                        , tfCompanyName.getText()
                                                        , tfVisitePurpose.getText()
                                                        , tfVisiteDate.getText()
                                                        , tfVisiteTime.getText()
                                                        , taCompanyAddress.getText()
                                                    });
                }
                else
                    JOptionPane.showMessageDialog(this, "Select class ..... !!", "Class", JOptionPane.PLAIN_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(this, "Select department ..... !!", "Department", JOptionPane.PLAIN_MESSAGE);
        
        dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.out.println("\n=========================Inside Cancel Button=======================");
        /*timeTableFrame.setIndustrialTourDataFromDialog(new String[] {
                                                        "" , "", "", "", "", "", ""
                                                    });*/
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cmbbxOrganizedByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxOrganizedByActionPerformed
        System.out.println("\n=========================Inside Organized By combobox=======================");
        organizedBy = (String) cmbbxOrganizedBy.getSelectedItem();
    }//GEN-LAST:event_cmbbxOrganizedByActionPerformed

    private void cmbbxOrganizedForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxOrganizedForActionPerformed
        System.out.println("\n=========================Inside Organized For combobox=======================");
        organizedFor = (String) cmbbxOrganizedFor.getSelectedItem();
    }//GEN-LAST:event_cmbbxOrganizedForActionPerformed

    public void setWindowPosition()
    {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        final int x = ((dimension.width/2) -(this.getWidth()/2));
        final int y = ((dimension.height/2) -(this.getHeight()/2));
        this.setLocation(x, y);
    }
    
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IndustrialTourDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndustrialTourDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndustrialTourDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndustrialTourDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        /*ava.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IndustrialTourDialog dialog = new IndustrialTourDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox<String> cmbbxOrganizedBy;
    private javax.swing.JComboBox<String> cmbbxOrganizedFor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCompanyAddress;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblOrganizedBy;
    private javax.swing.JLabel lblOrganizedFor;
    private javax.swing.JLabel lblVisiteDate;
    private javax.swing.JLabel lblVisitePurpose;
    private javax.swing.JLabel lblVisiteTime;
    private javax.swing.JPanel pnlComponents;
    private javax.swing.JTextArea taCompanyAddress;
    private javax.swing.JTextField tfCompanyName;
    private javax.swing.JTextField tfVisiteDate;
    private javax.swing.JTextField tfVisitePurpose;
    private javax.swing.JTextField tfVisiteTime;
    // End of variables declaration//GEN-END:variables
}
