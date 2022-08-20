
package com.ui.dialog;

import com.ui.frame.TimeTable;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;


public class AcademicClassDialog extends javax.swing.JDialog {

    private DefaultTableModel tableModel;
    private TimeTable timeTableFrame;
    
    public AcademicClassDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        changeSize();
        setWindowPosition();
    }

    public AcademicClassDialog(java.awt.Frame parent, boolean modal, TimeTable timeTableFrame) {
        super(parent, modal);
        initComponents();
        changeSize();
        setWindowPosition();
        this.timeTableFrame = timeTableFrame;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTimetable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTimeTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        taTimeTable = new javax.swing.JTextArea();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 32767));
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Academic Class");
        setLocationByPlatform(true);

        lblTimetable.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        lblTimetable.setForeground(new java.awt.Color(102, 51, 0));
        lblTimetable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimetable.setText("Time Table");
        lblTimetable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblTimeTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 51)));
        tblTimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"09:00 - 10:00 AM", null, null, null, null, null, null},
                {"10:00 - 11:00 AM", null, null, null, null, null, null},
                {"11:00 - 11:15 AM", "Recess", "Recess", "Recess", "Recess", "Recess", "Recess"},
                {"11:15 - 12:15 PM", null, null, null, null, null, null},
                {"12:15 - 01:15 PM", null, null, null, null, null, null},
                {"01:15 - 02:00 PM", "Lunch Break", "Lunch Break", "Lunch Break", "Lunch Break", "Lunch Break", "Lunch Break"},
                {"02:00 - 03:00 PM", null, null, null, null, null, null},
                {"03:00 - 04:00 PM", null, null, null, null, null, null},
                {"04:00 - 05:00 PM", null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Monday", "Tuesday", "Wednessday", "Thursday", "Friday", "Saturday"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTimeTable);
        if (tblTimeTable.getColumnModel().getColumnCount() > 0) {
            tblTimeTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            tblTimeTable.getColumnModel().getColumn(0).setMaxWidth(120);
        }

        taTimeTable.setEditable(false);
        taTimeTable.setBackground(new java.awt.Color(204, 204, 255));
        taTimeTable.setColumns(20);
        taTimeTable.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        taTimeTable.setLineWrap(true);
        taTimeTable.setRows(5);
        taTimeTable.setText("  Note:\t\tS1 = Subject#1\t\tS2 = Subject#2\t\tS3 = Subject#3\n\n\t\tS4 = Subject#4\t\tS5 = Subject#5\t\tS6 = Subject#6\n\n\t\tP1 = Practical#1\tP2 = Practical#2\tP3 = Practical#3");
        taTimeTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 51)));
        jScrollPane2.setViewportView(taTimeTable);

        filler1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        filler2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOK.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ok_1 - Copy.png"))); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTimetable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTimetable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnOK)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        System.out.println("\n=========================Inside OK Button=======================");
        if(!(timeTableFrame == null))
        {
            DefaultTableModel model = (DefaultTableModel) tblTimeTable.getModel();
            timeTableFrame.setTableModel(model);
        }
        else
            return;
        
        dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    public DefaultTableModel getTableModel()
    {
        return tableModel;
    }
    
    public void setTableModel(DefaultTableModel tableModel)
    {
        this.tableModel = tableModel;
    }
    public void changeSize()
    {
        tblTimeTable.setRowHeight(24);
    }
    
    public void setWindowPosition()
    {
        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        final int x = ((int) (screenSize.getWidth()/2 - this.getWidth()/2));
        final int y = ((int) (screenSize.getHeight()/2 - this.getHeight()/2));
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
            java.util.logging.Logger.getLogger(AcademicClassDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcademicClassDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcademicClassDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcademicClassDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AcademicClassDialog dialog = new AcademicClassDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnOK;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTimetable;
    private javax.swing.JTextArea taTimeTable;
    private javax.swing.JTable tblTimeTable;
    // End of variables declaration//GEN-END:variables
}
