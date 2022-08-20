
package com.ui.dialog;

import com.ui.frame.Event;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class EventDialog extends javax.swing.JDialog {

    private Event eventFrame;
    private String organizedBy="", eventLocation = "";
    private String eventType = "";
    
    public EventDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setWindowPosition();
    }
    
    public EventDialog(java.awt.Frame parent, boolean modal, Event eventFrame) {
        super(parent, modal);
        initComponents();
        setWindowPosition();
        this.eventFrame = eventFrame;
    }
    
    
    public Event getEventFrame() {
        return eventFrame;
    }

    public void setEventFrame(Event eventFrame) {
        this.eventFrame = eventFrame;
    }
    
    public void setWindowPosition()
    {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        final int x = ((dimension.width/2) -(this.getWidth()/2));
        final int y = ((dimension.height/2) -(this.getHeight()/2));
        this.setLocation(x, y);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblEventName = new javax.swing.JLabel();
        tfEventName = new javax.swing.JTextField();
        lblOrganizedBy = new javax.swing.JLabel();
        cmbbxOrganizedBy = new javax.swing.JComboBox<>();
        lblEventDate = new javax.swing.JLabel();
        tfEventDate = new javax.swing.JTextField();
        lblEventTime = new javax.swing.JLabel();
        tfEventTime = new javax.swing.JTextField();
        lblParticipatingDepartments = new javax.swing.JLabel();
        tfParticipatingDepartments = new javax.swing.JTextField();
        lblEventLocation = new javax.swing.JLabel();
        cmbbxEventLocation = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblEventType = new javax.swing.JLabel();
        cmbbxEventType = new javax.swing.JComboBox<>();
        lblEventDuration = new javax.swing.JLabel();
        tfEventDuration = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Event");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(102, 102, 102)));

        lblEventName.setText("Event name");

        lblOrganizedBy.setText("Organizer");

        cmbbxOrganizedBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "College Management", "Computer", "IT", "Mechanical", "E&TC", "Civil" }));
        cmbbxOrganizedBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxOrganizedByActionPerformed(evt);
            }
        });

        lblEventDate.setText("Date ( dd/ mm/ yyyy )");

        lblEventTime.setText("Time ( hh:mm A )");

        lblParticipatingDepartments.setText("Participating Depts.");

        lblEventLocation.setText("Event location");

        cmbbxEventLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select location", "College Campus", "Caffeteria", "Respective Department", "Assembly Hall", "Sports Ground" }));
        cmbbxEventLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxEventLocationActionPerformed(evt);
            }
        });

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

        lblEventType.setText("Event type");

        cmbbxEventType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select event", "Annual Gathering", "Annual Days", "Annual Tech Fest", "Ganesh Chaturthi", "Dahi Handi Festival", "Holi Festival" }));
        cmbbxEventType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxEventTypeActionPerformed(evt);
            }
        });

        lblEventDuration.setText("Duration");

        jLabel1.setText(":");

        jLabel2.setText(":");

        jLabel3.setText(":");

        jLabel4.setText(":");

        jLabel5.setText(":");

        jLabel6.setText(":");

        jLabel7.setText(":");

        jLabel8.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEventDuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEventType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblParticipatingDepartments, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEventDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEventName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOrganizedBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEventTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEventLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addComponent(jLabel6))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfParticipatingDepartments, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEventTime, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEventDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbbxOrganizedBy, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfEventName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbbxEventLocation, 0, 243, Short.MAX_VALUE)
                            .addComponent(cmbbxEventType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfEventDuration, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEventType)
                    .addComponent(cmbbxEventType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEventName)
                    .addComponent(tfEventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganizedBy)
                    .addComponent(cmbbxOrganizedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEventDate)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfEventDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEventTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEventTime)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParticipatingDepartments)
                    .addComponent(tfParticipatingDepartments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEventDuration)
                    .addComponent(tfEventDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEventLocation)
                    .addComponent(cmbbxEventLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        System.out.println("\n=========================Inside Submit Button=======================");
        try
        {
            if(eventFrame != null)
                if(!eventType.equals("") && !eventType.equals("select event"))
                {
                    if(!organizedBy.equals("") && !organizedBy.equals("select department"))
                    {
                        if(!eventLocation.equals("") && !eventLocation.equals("select class"))
                        {
                            String[] eventDetails = new String[]{
                                                            eventType
                                                            , tfEventName.getText()
                                                            , organizedBy
                                                            , tfEventDate.getText()
                                                            , tfEventTime.getText()
                                                            , tfParticipatingDepartments.getText()
                                                            , tfEventDuration.getText()
                                                            , eventLocation
                                                            };
                            if(eventFrame != null)
                            {
                                eventFrame.setEventDetails(eventDetails);
                            }
                            dispose();
                        }
                        else
                            JOptionPane.showMessageDialog(this, "Select event location ..... !!", "Location", JOptionPane.PLAIN_MESSAGE);
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Select event organizer ..... !!", "Organizer", JOptionPane.PLAIN_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(this, "Select event type ..... !!", "Type", JOptionPane.PLAIN_MESSAGE);
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.out.println("\n=========================Inside Cancel Button=======================");
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cmbbxOrganizedByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxOrganizedByActionPerformed
        System.out.println("\n=========================Inside Organized By combobox=======================");
        organizedBy = (String) cmbbxOrganizedBy.getSelectedItem();
    }//GEN-LAST:event_cmbbxOrganizedByActionPerformed

    private void cmbbxEventLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxEventLocationActionPerformed
        System.out.println("\n=========================Inside Event Location combobox=======================");
        eventLocation = (String) cmbbxEventLocation.getSelectedItem();
    }//GEN-LAST:event_cmbbxEventLocationActionPerformed

    private void cmbbxEventTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxEventTypeActionPerformed
        System.out.println("\n=========================Inside Event Type combobox=======================");
        eventType = (String) cmbbxEventType.getSelectedItem();
    }//GEN-LAST:event_cmbbxEventTypeActionPerformed

    public void setFieldData(String eventType, String eventName
            , String organizedBy, String eventDate, String eventTime, String participatingDepts,
            String duration,String evtLocation)
    {
        cmbbxEventType.setSelectedItem(eventType);
        tfEventName.setText(eventName);
        cmbbxOrganizedBy.setSelectedItem(organizedBy);
        tfEventDate.setText(eventDate);
        tfEventTime.setText(eventTime);
        tfParticipatingDepartments.setText(participatingDepts);
        tfEventDuration.setText(duration);
        cmbbxEventLocation.setSelectedItem(evtLocation);
        
        repaint();
        
        System.out.println("Dialog: "+eventType+"\t"+ eventName);
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
            java.util.logging.Logger.getLogger(EventDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EventDialog dialog = new EventDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbbxEventLocation;
    private javax.swing.JComboBox<String> cmbbxEventType;
    private javax.swing.JComboBox<String> cmbbxOrganizedBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEventDate;
    private javax.swing.JLabel lblEventDuration;
    private javax.swing.JLabel lblEventLocation;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblEventTime;
    private javax.swing.JLabel lblEventType;
    private javax.swing.JLabel lblOrganizedBy;
    private javax.swing.JLabel lblParticipatingDepartments;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JTextField tfEventDate;
    private javax.swing.JTextField tfEventDuration;
    private javax.swing.JTextField tfEventName;
    private javax.swing.JTextField tfEventTime;
    private javax.swing.JTextField tfParticipatingDepartments;
    // End of variables declaration//GEN-END:variables
}
