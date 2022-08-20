
package com.ui.dialog;

import com.bean.LibraryBean;
import com.daoImpl.LibraryDao;
import static com.ui.frame.LoginFrame.DIMENSION;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class LibraryRecord extends javax.swing.JDialog {

    private String[] newRecord = new String[]{"", "", "", "", ""};
    
    public LibraryRecord(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setDialogPosition();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        lblBookID = new javax.swing.JLabel();
        lblBookName = new javax.swing.JLabel();
        lblDateIssued = new javax.swing.JLabel();
        lblDateSubmited = new javax.swing.JLabel();
        lblFine = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfBookID = new javax.swing.JTextField();
        tfBookName = new javax.swing.JTextField();
        dtpckrDateIssued = new org.jdesktop.swingx.JXDatePicker();
        dtpckrDateSubmited = new org.jdesktop.swingx.JXDatePicker();
        tfFine = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Library Record");
        setResizable(false);

        pnlBase.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(51, 51, 51)));

        lblBookID.setLabelFor(tfBookID);
        lblBookID.setText("Book ID");

        lblBookName.setLabelFor(tfBookName);
        lblBookName.setText("Book Name");

        lblDateIssued.setLabelFor(dtpckrDateIssued);
        lblDateIssued.setText("Date Issued");

        lblDateSubmited.setLabelFor(dtpckrDateSubmited);
        lblDateSubmited.setText("Date Submited");

        lblFine.setLabelFor(tfFine);
        lblFine.setText("Fine ( Rs. )");

        jLabel6.setText(":");

        jLabel7.setText(":");

        jLabel8.setText(":");

        jLabel9.setText(":");

        jLabel10.setText(":");

        dtpckrDateIssued.setDate(new Date());
        dtpckrDateIssued.setFormats(new SimpleDateFormat("dd/MM/yyyy"));

        dtpckrDateSubmited.setDate(new Date());
        dtpckrDateSubmited.setFormats(new SimpleDateFormat("dd/MM/yyyy"));

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

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBookID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBookName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDateIssued, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDateSubmited, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(lblFine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfBookName))
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtpckrDateIssued, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtpckrDateSubmited, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfFine))))
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBookID)
                    .addComponent(jLabel6)
                    .addComponent(tfBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBookName)
                    .addComponent(jLabel7)
                    .addComponent(tfBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateIssued)
                    .addComponent(jLabel8)
                    .addComponent(dtpckrDateIssued, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateSubmited)
                    .addComponent(jLabel9)
                    .addComponent(dtpckrDateSubmited, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFine)
                    .addComponent(jLabel10)
                    .addComponent(tfFine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        System.out.println("\n=========================Inside Submit Button=======================");
        try
        {
            if(!tfBookID.getText().equals(""))
            {
                if(!tfBookName.getText().equals(""))
                {
                    String fine = "";
                    
                    if(tfFine.getText().equals(""))
                    {
                        fine = "0";
                    }
                    else
                        fine = tfFine.getText();
                    
                    newRecord[0] = ""+tfBookID.getText();
                    newRecord[1] = ""+tfBookName.getText();
                    newRecord[2] = ""+new SimpleDateFormat("dd/MM/yyyy").format(dtpckrDateIssued.getDate());
                    newRecord[3] = ""+new SimpleDateFormat("dd/MM/yyyy").format(dtpckrDateSubmited.getDate());
                    newRecord[4] = fine;
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Book name is required.", "Required", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Book ID is required.", "Required", JOptionPane.ERROR_MESSAGE);
                return;
            }
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        dispose();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.out.println("\n=========================Inside Cancel Button=======================");
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    public void setRecordtoBeUpdated(long rowDataBaseID)
    {
        try
        {
            if(rowDataBaseID >= 0 )
            {
                LibraryBean bean = new LibraryDao().getById(rowDataBaseID);
                tfBookID.setText(bean.getBookID());
                tfBookName.setText(bean.getBookName());
                tfFine.setText(bean.getFine());
                dtpckrDateIssued.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(bean.getIssueDate()));
                dtpckrDateSubmited.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(bean.getSubmitDate()));
            }
            else
                System.out.println("invalid database row id.");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public String[] getNewRecord() {
        return newRecord;
    }

    public void setNewRecord(String[] newRecord) {
        this.newRecord = newRecord;
    }

    public void setDialogPosition()
    {
        setLocation((DIMENSION.width - this.getWidth())/2, (DIMENSION.height - this.getHeight())/2);
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
            java.util.logging.Logger.getLogger(LibraryRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        /*java.awt.EventQueue.invokeLater(() -> {
            LibraryRecord dialog = new LibraryRecord(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
    private org.jdesktop.swingx.JXDatePicker dtpckrDateIssued;
    private org.jdesktop.swingx.JXDatePicker dtpckrDateSubmited;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBookID;
    private javax.swing.JLabel lblBookName;
    private javax.swing.JLabel lblDateIssued;
    private javax.swing.JLabel lblDateSubmited;
    private javax.swing.JLabel lblFine;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JTextField tfBookID;
    private javax.swing.JTextField tfBookName;
    private javax.swing.JTextField tfFine;
    // End of variables declaration//GEN-END:variables
}
