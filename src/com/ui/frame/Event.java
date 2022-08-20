
package com.ui.frame;

import com.bean.EventBean;
import com.daoImpl.EventDao;
import com.ui.dialog.EventDialog;
import com.ui.panel.TimeTablePanel;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class Event extends javax.swing.JInternalFrame {

    private String[] eventDetails = {};
    private String eventType = "";
    private TimeTablePanel ttPanel = new TimeTablePanel();
    
    public Event() {
        initComponents();
    }

    public String[] getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(String[] eventDetails) {
        this.eventDetails = eventDetails;
    }
    
    public void setPreviledge(String type)
    {
        switch(type)
        {
            case "Student" :
                btnNew.setEnabled(false);
                btnRefresh.setEnabled(false);
                btnUpdate.setEnabled(false);
                break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        lblFrame = new javax.swing.JLabel();
        pnlEvent = new javax.swing.JPanel();
        pnlEventType = new javax.swing.JPanel();
        lblEventType = new javax.swing.JLabel();
        cmbbxEventType = new javax.swing.JComboBox<>();
        flrEvent_02 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        flrEvent_01 = new javax.swing.Box.Filler(new java.awt.Dimension(400, 0), new java.awt.Dimension(400, 0), new java.awt.Dimension(400, 32767));

        setClosable(true);
        setMaximizable(true);
        setTitle("Event");

        lblFrame.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        lblFrame.setForeground(new java.awt.Color(102, 51, 0));
        lblFrame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrame.setText("-: EVENT :-");
        lblFrame.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));

        javax.swing.GroupLayout pnlEventLayout = new javax.swing.GroupLayout(pnlEvent);
        pnlEvent.setLayout(pnlEventLayout);
        pnlEventLayout.setHorizontalGroup(
            pnlEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlEventLayout.setVerticalGroup(
            pnlEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        lblEventType.setLabelFor(cmbbxEventType);
        lblEventType.setText("Event Type  :");

        cmbbxEventType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select event", "Annual Gathering", "Annual Days", "Annual Tech Fest", "Ganesh Chaturthi", "Dahi Handi Festival", "Holi Festival" }));
        cmbbxEventType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxEventTypeActionPerformed(evt);
            }
        });

        flrEvent_02.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNew.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_1 - Copy.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
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

        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        flrEvent_01.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 255, 51)));

        javax.swing.GroupLayout pnlEventTypeLayout = new javax.swing.GroupLayout(pnlEventType);
        pnlEventType.setLayout(pnlEventTypeLayout);
        pnlEventTypeLayout.setHorizontalGroup(
            pnlEventTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEventType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbbxEventType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(flrEvent_02, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(flrEvent_01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlEventTypeLayout.setVerticalGroup(
            pnlEventTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEventTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEventType)
                    .addComponent(cmbbxEventType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew)
                    .addComponent(btnUpdate)
                    .addComponent(btnRefresh)
                    .addComponent(flrEvent_02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(flrEvent_01, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlEventType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFrame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlEventType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        System.out.println("\n=========================Inside New Button=======================");
        try
        {
            if(!eventType.equals("") && !eventType.equals("select event"))
            {
                EventDialog dialog = new EventDialog(new javax.swing.JFrame(), true, this);
                dialog.setVisible(true);
                //dialog.setEventFrame(this);
                try
                {
                    if(eventDetails.length != 0)
                    {
                        com.bean.EventBean eventBean = new com.bean.EventBean(
                                                                eventDetails[0]
                                                                , eventDetails[1]
                                                                , eventDetails[2]
                                                                , eventDetails[3]
                                                                , eventDetails[4]
                                                                , eventDetails[5]
                                                                , eventDetails[6]
                                                                , eventDetails[7]
                                                                );
                        new EventDao().saveOrUpdateStudent(eventBean);
                        JOptionPane.showMessageDialog(this, "New event saved successfuly ..... !!", "Successful", JOptionPane.PLAIN_MESSAGE);
                        for(String strr : eventDetails)
                            System.out.println(strr);
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Event not saved ..... !!", "Not Saved", JOptionPane.PLAIN_MESSAGE);
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    e.printStackTrace();
                }
                    
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Select event type ..... !!", "Type", JOptionPane.PLAIN_MESSAGE);
                return;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void cmbbxEventTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxEventTypeActionPerformed
        System.out.println("\n=========================Inside Event Type combobox=======================");
        eventType = (String) cmbbxEventType.getSelectedItem();
        
        pnlEvent.removeAll();
        String str = "-: " + eventType + " :-";
        setLabelDetails(str, new Color(0,0,153), new TitledBorder(""));
        
        ttPanel.setSize(pnlEvent.getWidth(), pnlEvent.getHeight());
        ttPanel.setVisible(true);
        pnlEvent.add(ttPanel);
        ttPanel.updateUI();
        
        try
        {
            retrieveDataFromDB(eventType);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_cmbbxEventTypeActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        System.out.println("\n=========================Inside Exit Button=======================");
        updateEvent();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        System.out.println("\n=========================Inside Refresh Button=======================");
        try
        {
            if(!eventType.equals("") && !eventType.equals("select event"))
            {
                pnlEvent.removeAll();
                setLabelDetails(eventType, new Color(0,0,153), new TitledBorder(""));

                ttPanel.setSize(pnlEvent.getWidth(), pnlEvent.getHeight());
                ttPanel.setVisible(true);
                pnlEvent.add(ttPanel);
                ttPanel.updateUI();
        
                try
                {
                    retrieveDataFromDB(eventType);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            
            else
            {
                JOptionPane.showMessageDialog(this, "Select event type ..... !!", "Type", JOptionPane.PLAIN_MESSAGE);
                return;
            }
                    
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    public void updateEvent()
    {
        System.out.println("\n=========================Inside updateEvent Method=======================");
        try
        {
            if(!eventType.equals("") && !eventType.equals("select event"))
            {
                EventDialog dialog = new EventDialog(new javax.swing.JFrame(), true, this);
                
                //dialog.setEventFrame(this);
                List<com.bean.EventBean> list = eventList();
                
                if(!list.isEmpty())
                {
                    EventBean bean = null;
                    for(EventBean eb : list)
                    {
                        bean = eb;
                    }
                    
                    if(bean != null)
                    {
                            dialog.setFieldData(
                                bean.getEventType()
                                , bean.getEventName()
                                , bean.getOrganizedBy()
                                , bean.getEventDate()
                                , bean.getEventTime()
                                , bean.getParticipatingDepartments()
                                , bean.getDuration()
                                , bean.getLocation()
                             );
                            System.out.println(bean.toString());
                            dialog.setVisible(true);
                        if(eventDetails.length != 0)
                        {
                            com.bean.EventBean eventBean = new com.bean.EventBean(
                                                                    eventDetails[0]
                                                                    , eventDetails[1]
                                                                    , eventDetails[2]
                                                                    , eventDetails[3]
                                                                    , eventDetails[4]
                                                                    , eventDetails[5]
                                                                    , eventDetails[6]
                                                                    , eventDetails[7]
                                                                    );
                                new EventDao().saveOrUpdateStudent(eventBean);
                                JOptionPane.showMessageDialog(this, "Event Updated successfuly ..... !!", "SAVED", JOptionPane.PLAIN_MESSAGE);
                                for(String strr : eventDetails)
                                    System.out.println(strr);
                            }
                            else
                                JOptionPane.showMessageDialog(this, "Problem, Event not updated ..... !!", "UNSUCCESSFUL", JOptionPane.PLAIN_MESSAGE);
                            }
                            else
                                JOptionPane.showMessageDialog(this, "Problem, Event not updated ..... !!", "UNSUCCESSFUL", JOptionPane.PLAIN_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Select event type ..... !!", "ERROR", JOptionPane.PLAIN_MESSAGE);
                        return;
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "No such event scheduled ..... !!", "Unavailable", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
                    
                    
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public List<com.bean.EventBean> eventList()
    {
        try
        {
            List<com.bean.EventBean> list = new EventDao().getByProperties(eventType);
            return list;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
        
        
    }
    
    public void retrieveDataFromDB(String eventType)
    {
        try
        {
            if(!eventType.equals("") && !eventType.equals("select event"))
            {
                String details = "";
                List<com.bean.EventBean> list = eventList();
                
                if(!list.isEmpty())
                {
                    com.bean.EventBean eventBean = null;
                    Iterator iterator = list.iterator();
                    while(iterator.hasNext())
                        eventBean = (com.bean.EventBean) iterator.next();
                    details = "Event type\t\t: " + eventBean.getEventType()
                              +"\nEvent name\t\t: " + eventBean.getEventName()
                              +"\nEvent organizer\t\t: " + eventBean.getOrganizedBy()
                              +"\nEvent date\t\t: " + eventBean.getEventDate()
                              +"\nEvent time\t\t: " + eventBean.getEventTime()
                              +"\nEvent duration\t\t: " + eventBean.getDuration()
                              +"\nParticipating department: " + eventBean.getParticipatingDepartments()
                              +"\nEvent location\t\t: " + eventBean.getLocation();
                    ttPanel.setTextofTextArea(details);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "No such event scheduled ..... !!", "Unavailable", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
                    
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Select event type ..... !!", "Type", JOptionPane.PLAIN_MESSAGE);
                return;
            }
                    
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void setLabelDetails(String text, Color color, Border border)
    {
        lblFrame.setText(text);
        lblFrame.setForeground(color);
        lblFrame.setBorder(border);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbbxEventType;
    private javax.swing.Box.Filler flrEvent_01;
    private javax.swing.Box.Filler flrEvent_02;
    private javax.swing.JLabel lblEventType;
    private javax.swing.JLabel lblFrame;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlEvent;
    private javax.swing.JPanel pnlEventType;
    // End of variables declaration//GEN-END:variables
}
