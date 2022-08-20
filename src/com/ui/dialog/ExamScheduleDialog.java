
package com.ui.dialog;

import com.ui.frame.TimeTable;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;


public class ExamScheduleDialog extends javax.swing.JDialog {

    private TimeTable timeTableFrame;
    private String department="", academicClass="";
    
    public ExamScheduleDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setWindowPosition();
        changeSize();
    }
    
    public ExamScheduleDialog(java.awt.Frame parent, boolean modal, TimeTable timeTableFrame) {
        super(parent, modal);
        initComponents();
        setWindowPosition();
        changeSize();
        this.timeTableFrame = timeTableFrame;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDepartment = new javax.swing.JPanel();
        lblExamSchedule = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        cmbbxDepartment = new javax.swing.JComboBox<>();
        cmbbxAcademicClass = new javax.swing.JComboBox<>();
        lblAcademicClass = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(400, 0), new java.awt.Dimension(400, 0), new java.awt.Dimension(400, 32767));
        jSeparator1 = new javax.swing.JSeparator();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExamSchedule = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exam Schedule");

        lblExamSchedule.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        lblExamSchedule.setForeground(new java.awt.Color(102, 51, 0));
        lblExamSchedule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExamSchedule.setText("Exam Schedule");
        lblExamSchedule.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblDepartment.setText("Departmen           :");

        cmbbxDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select department", "Computer", "IT", "Mechanical", "E&TC", "Civil" }));
        cmbbxDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxDepartmentActionPerformed(evt);
            }
        });

        cmbbxAcademicClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select class", "First Year", "Second Year", "Third Year", "Final Year" }));
        cmbbxAcademicClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxAcademicClassActionPerformed(evt);
            }
        });

        lblAcademicClass.setText("Class                    :");

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

        filler1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 204, 51)));

        jSeparator1.setBorder(new javax.swing.border.MatteBorder(null));

        filler2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlDepartmentLayout = new javax.swing.GroupLayout(pnlDepartment);
        pnlDepartment.setLayout(pnlDepartmentLayout);
        pnlDepartmentLayout.setHorizontalGroup(
            pnlDepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExamSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlDepartmentLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlDepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAcademicClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlDepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbbxDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDepartmentLayout.createSequentialGroup()
                        .addComponent(cmbbxAcademicClass, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlDepartmentLayout.createSequentialGroup()
                .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        pnlDepartmentLayout.setVerticalGroup(
            pnlDepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDepartmentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExamSchedule)
                .addGap(18, 18, 18)
                .addGroup(pnlDepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDepartment)
                    .addComponent(cmbbxDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filler2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnOK)
                        .addComponent(btnCancel)
                        .addComponent(lblAcademicClass)
                        .addComponent(cmbbxAcademicClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblExamSchedule.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51)));
        tblExamSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Subject #1", "Subject #2", "Subject #3", "Subject #4", "Subject #5", "Subject #6"
            }
        ));
        jScrollPane1.setViewportView(tblExamSchedule);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        System.out.println("\n=========================Inside OK Button=======================");
        if(!(timeTableFrame == null))
        if(!department.equals("") && !department.equals("select department"))
            {
                if(!academicClass.equals("") && !academicClass.equals("select class"))
                {
                    String schedule = "Date\t\t\t"+"Sub#1\t\t"+"Sub#2\t\t"+"Sub#3\t\t"+"Sub#4\t\t"+"Sub#5\t\t"+"Sub#6"+"\n\n";
                    TableModel model = tblExamSchedule.getModel();
                    int row = model.getRowCount();
                    int column = model.getColumnCount();
                    for(int i=0; i<row; i++)
                    {
                        for(int j=0; j<column; j++)
                        {
                            if(model.getValueAt(i, j) != null)
                            {
                                schedule = schedule.concat(""+model.getValueAt(i, j).toString()+"\t\t");
                            }
                            else
                            {
                                schedule = schedule.concat(" " + "\t\t");
                            }
                        }
                        schedule = schedule.concat("\n\n");
                    }
                    timeTableFrame.setExamScheduleDataFromDialog(new String[] {department, academicClass, schedule});
                    System.out.println(schedule);
                    dispose();
                }  
                else
                    JOptionPane.showMessageDialog(this, "Select class ..... !!", "Class", JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Select department ..... !!", "Department", JOptionPane.PLAIN_MESSAGE);
            }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.out.println("\n=========================Inside Cancel Button=======================");
        //timeTableFrame.setExamScheduleDataFromDialog(new String[] {"", "", ""});
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cmbbxDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxDepartmentActionPerformed
        System.out.println("\n=========================Inside Department combox=======================");
        department = (String) cmbbxDepartment.getSelectedItem();
    }//GEN-LAST:event_cmbbxDepartmentActionPerformed

    private void cmbbxAcademicClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxAcademicClassActionPerformed
        System.out.println("\n=========================Inside Academic Class combobox=======================");
        academicClass = (String) cmbbxAcademicClass.getSelectedItem();
    }//GEN-LAST:event_cmbbxAcademicClassActionPerformed

    public void changeSize()
    {
        tblExamSchedule.setRowHeight(38);
    }
    
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
            java.util.logging.Logger.getLogger(ExamScheduleDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamScheduleDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamScheduleDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamScheduleDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ExamScheduleDialog dialog = new ExamScheduleDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbbxAcademicClass;
    private javax.swing.JComboBox<String> cmbbxDepartment;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAcademicClass;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblExamSchedule;
    private javax.swing.JPanel pnlDepartment;
    private javax.swing.JTable tblExamSchedule;
    // End of variables declaration//GEN-END:variables
}
