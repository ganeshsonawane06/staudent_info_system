
package com.ui.frame;

import com.bean.ClassTimeTableBean;
import com.bean.GuestLectureTTBean;
import com.bean.IndustrialTourTTBean;
import com.bean.PracticalExamScheduleBean;
import com.bean.UnitTestScheduleBean;
import com.bean.UniversityExamScheduleBean;
import com.daoImpl.ClassTimeTableDao;
import com.daoImpl.GuestLectureTTDao;
import com.daoImpl.IndustrialTourTTDao;
import com.daoImpl.PracticalExamDao;
import com.daoImpl.UnitTestDao;
import com.daoImpl.UniversityExamDao;
import com.ui.dialog.AcademicClassDialog;
import com.ui.dialog.ExamScheduleDialog;
import com.ui.dialog.GuestLectureDialog;
import com.ui.dialog.IndustrialTourDialog;
import com.ui.panel.ClassTimeTablePanel;
import com.ui.panel.TimeTablePanel;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TimeTable<T> extends javax.swing.JInternalFrame {

   
    private String type="", department="", academicYear="";
    //private LinkedHashMap<String, String> academicClass = new LinkedHashMap<String, String>();
    private String academicClass = "";
    private DefaultTableModel tableModel;
    private ClassTimeTableDao timeTableDao = new ClassTimeTableDao();
    private String[] guestLectureData = {}, industrialTourData = {};
    private String[] examScheduleData = {};
    private TimeTablePanel ttPanel_GL = new TimeTablePanel();
    private ClassTimeTablePanel pnlClassTT = new ClassTimeTablePanel();
    private TimeTablePanel ttPanel_IT = new TimeTablePanel();
    private TimeTablePanel ttPanel_UE = new TimeTablePanel();
    private TimeTablePanel ttPanel_UT = new TimeTablePanel();
    private TimeTablePanel ttPanel_PE = new TimeTablePanel();
    
    private int counter = 0;
    private String previledgeType = "";
    
    public TimeTable() {
        initComponents();
        setComponentsVisibility(false);
        btnNewTT.setEnabled(false);
        btnRefresh.setEnabled(false);
        btnUpdate.setEnabled(false);
        flrVerticalSaperator_01.setEnabled(false);
        setPreviledge(previledgeType);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        lblFrameLabel = new javax.swing.JLabel();
        pnlTimeTableType = new javax.swing.JPanel();
        lblSelectTimeTable = new javax.swing.JLabel();
        cmbbxTimeTableType = new javax.swing.JComboBox<>();
        flrHorizontalSaperator_01 = new javax.swing.Box.Filler(new java.awt.Dimension(400, 0), new java.awt.Dimension(400, 0), new java.awt.Dimension(400, 32767));
        lblTimeTable = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        cmbbxDepartment = new javax.swing.JComboBox<>();
        cmbbxClass = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnNewTT = new javax.swing.JButton();
        flrHorizontalSaperator_02 = new javax.swing.Box.Filler(new java.awt.Dimension(400, 0), new java.awt.Dimension(400, 0), new java.awt.Dimension(400, 32767));
        flrVerticalSaperator_01 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        btnRefresh = new javax.swing.JButton();
        pnlBasePanel4SelectedTT = new javax.swing.JPanel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Time Table");

        lblFrameLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        lblFrameLabel.setForeground(new java.awt.Color(102, 51, 0));
        lblFrameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrameLabel.setText("-: Time Table :-");
        lblFrameLabel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));

        lblSelectTimeTable.setText("Select Type      :");

        cmbbxTimeTableType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select type", "Class", "Guest Lecture", "Industrial Tour" }));
        cmbbxTimeTableType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxTimeTableTypeActionPerformed(evt);
            }
        });

        flrHorizontalSaperator_01.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 255, 0)));

        lblTimeTable.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblTimeTable.setForeground(new java.awt.Color(0, 0, 153));
        lblTimeTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimeTable.setText("Time Table");
        lblTimeTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblDepartment.setText("Department:");

        cmbbxDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select department", "Computer", "IT", "Mechanical", "E&TC", "Civil" }));
        cmbbxDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxDepartmentActionPerformed(evt);
            }
        });

        cmbbxClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select class", "First Year", "Second Year", "Third Year", "Final Year" }));
        cmbbxClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxClassActionPerformed(evt);
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

        btnNewTT.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnNewTT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_1 - Copy.png"))); // NOI18N
        btnNewTT.setText("New");
        btnNewTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTTActionPerformed(evt);
            }
        });

        flrHorizontalSaperator_02.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 255, 0)));

        flrVerticalSaperator_01.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTimeTableTypeLayout = new javax.swing.GroupLayout(pnlTimeTableType);
        pnlTimeTableType.setLayout(pnlTimeTableTypeLayout);
        pnlTimeTableTypeLayout.setHorizontalGroup(
            pnlTimeTableTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(flrHorizontalSaperator_01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlTimeTableTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimeTableTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTimeTableTypeLayout.createSequentialGroup()
                        .addComponent(lblSelectTimeTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbbxTimeTableType, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTimeTableTypeLayout.createSequentialGroup()
                        .addComponent(lblDepartment)
                        .addGap(18, 18, 18)
                        .addComponent(cmbbxDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbbxClass, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(flrVerticalSaperator_01, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewTT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(flrHorizontalSaperator_02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimeTableTypeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTimeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTimeTableTypeLayout.setVerticalGroup(
            pnlTimeTableTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimeTableTypeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTimeTableTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectTimeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbbxTimeTableType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(flrHorizontalSaperator_01, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTimeTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTimeTableTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(flrVerticalSaperator_01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTimeTableTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDepartment)
                        .addComponent(cmbbxDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbbxClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNewTT)
                        .addComponent(btnRefresh)
                        .addComponent(btnUpdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(flrHorizontalSaperator_02, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblTimeTable.getAccessibleContext().setAccessibleName("");
        lblTimeTable.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout pnlBasePanel4SelectedTTLayout = new javax.swing.GroupLayout(pnlBasePanel4SelectedTT);
        pnlBasePanel4SelectedTT.setLayout(pnlBasePanel4SelectedTTLayout);
        pnlBasePanel4SelectedTTLayout.setHorizontalGroup(
            pnlBasePanel4SelectedTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlBasePanel4SelectedTTLayout.setVerticalGroup(
            pnlBasePanel4SelectedTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFrameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTimeTableType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBasePanel4SelectedTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFrameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTimeTableType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBasePanel4SelectedTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void cmbbxTimeTableTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxTimeTableTypeActionPerformed
        System.out.println("\n=========================Inside Select Time Table combobox=======================");
        type = (String) cmbbxTimeTableType.getSelectedItem(); 
        
        if(!type.equals("select type"))
        {
            setComponentsVisibility(true);
            btnNewTT.setEnabled(false);
            btnRefresh.setEnabled(false);
            btnUpdate.setEnabled(false);
            flrVerticalSaperator_01.setEnabled(false);
            setPreviledge(previledgeType);
            
            switch (type) 
            {
                case "Class":   
                                pnlBasePanel4SelectedTT.removeAll();
                                lblTimeTable.setText("Class Time Table");
                                
                            break;
                            
                case "Guest Lecture":
                                pnlBasePanel4SelectedTT.removeAll();
                                lblTimeTable.setText("Guest Lecture Time Table");
                                break;
                                
                case "Industrial Tour":
                                pnlBasePanel4SelectedTT.removeAll();
                                lblTimeTable.setText("Industrial Tour Time Table");
                                break;
                                
                case "University Exam": 
                                pnlBasePanel4SelectedTT.removeAll();
                                lblTimeTable.setText("University Exam Time Table");
                                break;
                                
                case "Unit Test":
                                pnlBasePanel4SelectedTT.removeAll();
                                lblTimeTable.setText("Unit Test Time Table");
                                break;
                                
                case "Practical Exam":
                                pnlBasePanel4SelectedTT.removeAll();
                                lblTimeTable.setText("Practical Exam Time Table");
                                break;
            }
        }
        else
        {
            return;
        }
        
    }//GEN-LAST:event_cmbbxTimeTableTypeActionPerformed

    private void cmbbxDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxDepartmentActionPerformed
        System.out.println("\n=========================Inside Department combobox=======================");
        department = (String) cmbbxDepartment.getSelectedItem();
    }//GEN-LAST:event_cmbbxDepartmentActionPerformed

    private void cmbbxClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxClassActionPerformed
        System.out.println("\n=========================Inside Class combobox=======================");
        academicYear = (String) cmbbxClass.getSelectedItem();
        
        if(!type.equals("") && !type.equals("select type"))
        {
            if(!department.equals("") && !department.equals("select department"))
            {
                if(!academicYear.equals("") && !academicYear.equals("select class"))
                {
                    pnlBasePanel4SelectedTT.removeAll();
                    
                    setComponentsVisibility(true);
                    btnNewTT.setEnabled(true);
                    btnRefresh.setEnabled(true);
                    btnUpdate.setEnabled(true);
                    flrVerticalSaperator_01.setEnabled(true);
                    setPreviledge(previledgeType);
                    
                    databaseRetrieveOperation(type, department, academicYear);
                }  
                else
                {
                    JOptionPane.showMessageDialog(this, "                   Select class ..... !!", "Class", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
                    
            }
            else
            {
                cmbbxClass.setModel(new DefaultComboBoxModel<>(new String[]{"select class", "First Year", "Second Year", "Third Year", "Final Year"}));
                JOptionPane.showMessageDialog(this, "                 Select department ..... !!", "Department", JOptionPane.PLAIN_MESSAGE);
                
                return;
            } 
        }
        else
        {
            cmbbxDepartment.setModel(new DefaultComboBoxModel<>(new String[]{"select department", "Computer", "IT", "Mechanical", "E & TC", "Civil"}));
            JOptionPane.showMessageDialog(this, "                 Select timetable type ..... !!", "Timetable Type", JOptionPane.PLAIN_MESSAGE);
        
            return;
        }
    }//GEN-LAST:event_cmbbxClassActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        System.out.println("\n=========================Inside Refresh Button=======================");
        counter = 0;
        if(!type.equals("") && !type.equals("select type"))
        {
            if(!department.equals("") && !department.equals("select department"))
            {
                if(!academicYear.equals("") && !academicYear.equals("select class"))
                {
                    pnlBasePanel4SelectedTT.removeAll();
                    databaseRetrieveOperation(type, department, academicYear);
                }  
                else
                {
                    JOptionPane.showMessageDialog(this, "                   Select class ..... !!", "Class", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
            }
            else
            {
                cmbbxClass.setModel(new DefaultComboBoxModel<>(new String[]{"select class", "First Year", "Second Year", "Third Year", "Final Year"}));
                JOptionPane.showMessageDialog(this, "                 Select department ..... !!", "Department", JOptionPane.PLAIN_MESSAGE);
                
                return;
            } 
        }
        else
        {
            cmbbxDepartment.setModel(new DefaultComboBoxModel<>(new String[]{"select department", "Computer", "IT", "Mechanical", "E & TC", "Civil"}));
            JOptionPane.showMessageDialog(this, "                 Select timetable type ..... !!", "Timetable Type", JOptionPane.PLAIN_MESSAGE);
        
            return;
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnNewTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTTActionPerformed
        System.out.println("\n=========================Inside NewTT Button=======================");
        counter = 0;
        if(!type.equals("") && !type.equals("select type"))
        {
            if(!department.equals("") && !department.equals("select department"))
            {
                if(!academicYear.equals("") && !academicYear.equals("select class"))
                {
                    databaseAddOperation(type, department, academicYear);
                }  
                else
                {
                    JOptionPane.showMessageDialog(this, "Select class ..... !!", "Class", JOptionPane.PLAIN_MESSAGE);
                
                    return;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Select department ..... !!", "Department", JOptionPane.PLAIN_MESSAGE);
            
                return;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Select timetable type ..... !!", "Timetable Type", JOptionPane.PLAIN_MESSAGE);
    
            return;    
        }
    }//GEN-LAST:event_btnNewTTActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        System.out.println("\n=========================Inside Update Button=======================");
        if(!type.equals("") && !type.equals("select type"))
        {
            if(!department.equals("") && !department.equals("select department"))
            {
                if(!academicYear.equals("") && !academicYear.equals("select class"))
                {
                    //pnlBasePanel4SelectedTT.removeAll();
                    databaseUpdateOperation(type, department, academicYear);
                }  
                else
                {
                    JOptionPane.showMessageDialog(this, "                   Select class ..... !!", "Class", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
            }
            else
            {
                cmbbxClass.setModel(new DefaultComboBoxModel<>(new String[]{"select class", "First Year", "Second Year", "Third Year", "Final Year"}));
                JOptionPane.showMessageDialog(this, "                 Select department ..... !!", "Department", JOptionPane.PLAIN_MESSAGE);
                
                return;
            } 
        }
        else
        {
            cmbbxDepartment.setModel(new DefaultComboBoxModel<>(new String[]{"select department", "Computer", "IT", "Mechanical", "E & TC", "Civil"}));
            JOptionPane.showMessageDialog(this, "                 Select timetable type ..... !!", "Timetable Type", JOptionPane.PLAIN_MESSAGE);
        
            return;
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    public String getPreviledgeType() {
        return previledgeType;
    }

    public void setPreviledgeType(String previledgeType) {
        this.previledgeType = previledgeType;
    }

    
    public void setPreviledge(String type)
    {
        previledgeType = type;
        
        switch(type)
        {
            case "Student" :
                btnNewTT.setEnabled(false);
                btnRefresh.setEnabled(false);
                btnUpdate.setEnabled(false);
                flrVerticalSaperator_01.setEnabled(false);
                break;
                
            /*default:
                btnNewTT.setEnabled(true);
                btnRefresh.setEnabled(true);
                btnUpdate.setEnabled(true);
                flrVerticalSaperator_01.setEnabled(false);
                break;*/
        }
    }
    
    public String[] getExamScheduleDataFromDialog()
    {
        return examScheduleData;
    }
    
    public void setExamScheduleDataFromDialog(String[] examScheduleData)
    {
        this.examScheduleData = examScheduleData;
    }
    
    public String[] getIndustrialTourDataFromDialog()
    {
        return industrialTourData;
    }
    
    public void setIndustrialTourDataFromDialog(String[] industrialTourData)
    {
        this.industrialTourData = industrialTourData;
    }
    
    public String[] getGuestLectDataFromGuestDialog()
    {
        return guestLectureData;
    }
    
    public void setGuestLectDataFromGuestDialog(String[] guestLectureData)
    {
        this.guestLectureData = guestLectureData;
    }
    
    public void databaseAddOperation(String oprationType, String dept, String clss)
    {
        System.out.println("\n=========================Inside databaseAddOperation Method=======================");
        switch (type) 
        {
            case "Class":   
                            try
                            {
                                AcademicClassDialog dialog = new AcademicClassDialog(new javax.swing.JFrame(), true, this);
                                dialog.setVisible(true);
                                
                                tableModel = this.getTableModel();
                                
                                if(tableModel != null)
                                {
                                    int row = tableModel.getRowCount();
                                    int column = tableModel.getColumnCount();
                                    
                                    System.out.println("Row: "+row+"\tColumn: "+column);
                                    
                                    
                                    
                                    if((row != 0) && (column != 0))
                                    {
                                        String value = "";
                                        for(int i=0; i<row; i++)
                                        {
                                            
                                            
                                            for(int j=0; j<column ; j++)
                                            {
                                                if(tableModel.getValueAt(i, j) != null)
                                                {
                                                    value = value.concat(tableModel.getValueAt(i, j)+"!@");
                                                }
                                                else
                                                {
                                                    value = value.concat("--!@");
                                                }
                                                //System.out.print(""+tableModel.getValueAt(i, j)+"  ");
                                            }
                                            
                                            //System.out.println(value);
                                            //System.out.println("\n");
                                        }
                                        System.out.println(value);
                                        //System.out.println(academicClass.entrySet());
                                        //System.out.println(academicClass.values());
                                        
                                        com.bean.ClassTimeTableBean classTimeTable = new com.bean.ClassTimeTableBean(department
                                                                    , academicYear, value);
                                        timeTableDao.save(classTimeTable);
                                        JOptionPane.showMessageDialog(this, "  New time table added ..... !!", "Successful", JOptionPane.INFORMATION_MESSAGE);
                                        
                                    }
                                    else
                                    {
                                        int option = JOptionPane.showConfirmDialog(this, "Time table is not set.  Set it now ...... ?", "UNAVAILABLE", JOptionPane.YES_NO_OPTION);
                                        
                                        if(option == 0)
                                            databaseAddOperation(type, department, academicYear);
                                    }
                                    
                                    pnlBasePanel4SelectedTT.removeAll();
                                    //databaseRetrieveOperation(type, department, academicYear);
                                    
                                    pnlClassTT.setSize(pnlBasePanel4SelectedTT.getWidth(), pnlBasePanel4SelectedTT.getHeight());
                                    pnlClassTT.setVisible(true);
                                    pnlBasePanel4SelectedTT.add(pnlClassTT);
                                    pnlClassTT.updateUI();
                                    
                                    pnlClassTT.setModel(tableModel);
                                    pnlClassTT.setTableData();
                                    
                                    updateUI();
                                }
                                
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                        break;
                        
            case "Guest Lecture":
                            try
                            {
                                GuestLectureDialog dialogGLFrm = new GuestLectureDialog(new javax.swing.JFrame(), true, this);
                                dialogGLFrm.setVisible(true);
                                if((guestLectureData.length) != 0)
                                {
                                    String guestLecture = "Subject\t\t: "+guestLectureData[0]
                                                        +"\nDate\t\t: "+guestLectureData[1]
                                                        +"\nTime\t\t: "+guestLectureData[2]
                                                        +"\nName\t\t: "+guestLectureData[3]
                                                        +"\nOrganization\t: "+guestLectureData[4]
                                                        +"\nDesignation\t: "+guestLectureData[5]
                                                        +"\nExperience\t: "+guestLectureData[6]
                                                        +"\nContact no.\t: "+guestLectureData[7]
                                                        +"\ne-Mail\t\t: "+ guestLectureData[8]
                                                        +"\nAddress\t\t: "+guestLectureData[9]
                                                        +"\nOrganized by\t: "+guestLectureData[10]
                                                        +"\nOrganized for\t: "+guestLectureData[11];

                                    System.out.println(guestLecture);
                                    GuestLectureTTBean glTT = new GuestLectureTTBean(department, academicYear, guestLecture);
                                    new GuestLectureTTDao().saveOrUpdateGuestLectureTT(glTT);

                                    ttPanel_GL.setTextofTextArea(guestLecture);
                                    JOptionPane.showMessageDialog(this, "   Saved ...... !!", "Guest Lecture", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else
                                    return;
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                            
                            break;
                        
            case "Industrial Tour":
                            try
                            {
                                IndustrialTourDialog dialogITFrm = new IndustrialTourDialog(new javax.swing.JFrame(), true, this);
                                dialogITFrm.setVisible(true);
                                if(industrialTourData.length != 0)
                                {
                                    String industrialTour = "Organized by\t: " + industrialTourData[0]
                                                            + "\nOrganized for\t: " + industrialTourData[1]
                                                            + "\nCompany name\t: " + industrialTourData[2]
                                                            + "\nVisite purpose\t: " + industrialTourData[3]
                                                            + "\nVisite date\t: " + industrialTourData[4]
                                                            + "\nVisite time\t: " + industrialTourData[5]
                                                            + "\nCompany Address\t: " + industrialTourData[6];
                                    IndustrialTourTTBean itTT = new IndustrialTourTTBean(department, academicYear, industrialTour);
                                    new IndustrialTourTTDao().saveOrUpdateIndustrialTourTT(itTT);

                                    ttPanel_IT.setTextofTextArea(industrialTour);
                                    JOptionPane.showMessageDialog(this, "   Saved ...... !!", "Industrial Tour", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                            
                        break;
            case "University Exam":
                            try
                            {
                                ExamScheduleDialog dialogUEFrm = new ExamScheduleDialog(new javax.swing.JFrame(), true, this);
                                dialogUEFrm.setVisible(true);
                                if((examScheduleData.length != 0))
                                {
                                    String deptUE = examScheduleData[0];
                                    String classUE = examScheduleData[1];
                                    String scheduleUE = examScheduleData[2];
                                    UniversityExamScheduleBean ueSchedule = new UniversityExamScheduleBean(deptUE, classUE, scheduleUE);
                                    new UniversityExamDao().saveOrUpdateUniversityExam(ueSchedule);

                                    ttPanel_UE.setTextofTextArea(scheduleUE);
                                    JOptionPane.showMessageDialog(this, "   Saved ...... !!", "Unuversity Exam", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                            
                        break;
                        
            case "Unit Test":
                            try
                            {
                                ExamScheduleDialog dialogUTFrm = new ExamScheduleDialog(new javax.swing.JFrame(), true, this);
                                dialogUTFrm.setVisible(true);
                                if((examScheduleData.length != 0))
                                {
                                    String deptUT = examScheduleData[0];
                                    String classUT = examScheduleData[1];
                                    String scheduleUT = examScheduleData[2];
                                    UnitTestScheduleBean utSchedule = new UnitTestScheduleBean(deptUT, classUT, scheduleUT);
                                    new UnitTestDao().saveOrUpdateUnitTest(utSchedule);

                                    ttPanel_UT.setTextofTextArea(scheduleUT);
                                    JOptionPane.showMessageDialog(this, "   Saved ...... !!", "Unit Test", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                            
                        break;
                        
            case "Practical Exam":
                            try
                            {
                                ExamScheduleDialog dialogPEFrm = new ExamScheduleDialog(new javax.swing.JFrame(), true, this);
                                dialogPEFrm.setVisible(true);
                                if((examScheduleData.length != 0))
                                {
                                    String deptPE = examScheduleData[0];
                                    String classPE = examScheduleData[0];
                                    String schedulePE = examScheduleData[0];
                                    PracticalExamScheduleBean peSchedule = new PracticalExamScheduleBean(deptPE, classPE, schedulePE);
                                    new PracticalExamDao().saveOrUpdatePracticalExam(peSchedule);

                                    ttPanel_PE.setTextofTextArea(schedulePE);
                                    JOptionPane.showMessageDialog(this, "   Saved ...... !!", "Practical Exam", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                            
                        break;
            }
    }
    
    public void databaseRetrieveOperation(String oprationType, String dept, String clss)
    {
        System.out.println("\n=========================Inside databaseRetrieveOperation Method=======================");
        switch (oprationType) 
        {
            case "Class":   
                            try
                            {
                                Long maxID = new ClassTimeTableDao().getMaxID("id");
                                if(maxID != null)
                                {
                                    ClassTimeTableBean bean = new ClassTimeTableDao().getById(maxID);

                                    if(bean != null)
                                    {
                                        String data = bean.getClassTimeTable();
                                        DefaultTableModel model = pnlClassTT.getTableData();
                                        
                                        String[] arr = {};
                                        
                                        int counter = 0;
                                        if(data.length() != 0)
                                        {
                                            for(int i=0; i<data.length(); i++)
                                            {
                                                
                                                //for(int j=0; j<7; j++)
                                                //{
                                                    arr = data.split("!@");
                                                    //model.addRow(arr);
                                                //}
                                                
                                            }
                                            for(int i=0; i<9; i++)
                                            {
                                                for(int j=0; j<7; j++)
                                                {
                                                    try
                                                    {
                                                        if((arr[counter]) != null) 
                                                        {
                                                            model.setValueAt(arr[counter], i, j);
                                                            counter++;
                                                        }
                                                        else
                                                        {
                                                            model.setValueAt(" ", i, j);
                                                            counter++;
                                                        }
                                                    }
                                                    catch(ArrayIndexOutOfBoundsException e)
                                                    {
                                                        e.printStackTrace();
                                                    }
                                                }
                                            }
                                                
                                                    
                                            pnlClassTT.setSize(pnlBasePanel4SelectedTT.getWidth(), pnlBasePanel4SelectedTT.getHeight());
                                            pnlClassTT.setVisible(true);
                                            pnlClassTT.setModel(model);
                                            pnlClassTT.setTableData();
                                            pnlBasePanel4SelectedTT.add(pnlClassTT);
                                            pnlClassTT.updateUI();
                                        }
                                        else
                                            System.out.println("empty string");
                                        
                                        //Map timeTable = bean.getClassTimeTable();
                                        
                                       /* Object[] tableData = timeTable.values().toArray();
                                        String [] value = {};
                                        //String
                                        int rows = timeTable.keySet().size();
                                        int columns = tableData.length;
                                        //int counter = 0;
                                        for(Object val : tableData)
                                        {
                                            String str = ""+val;
                                            value = str.split("!@");
                                            for(int j=0; j<value.length; j++)
                                            {
                                                System.out.print(value[j]+"  ");
                                            }
                                            System.out.println("\n");
                                        }*/
                                        //System.out.println("Key set: "+timeTable.keySet().toString());
                                        //System.out.println("Rows: "+rows+"\tColumns: "+columns);
                                    }
                                    else
                                    {
                                        int option = JOptionPane.showConfirmDialog(this, "Time table is not set.  Set it now ...... ?", "UNAVAILABLE", JOptionPane.YES_NO_OPTION);
                                        
                                        if(option == 0)
                                            databaseAddOperation(type, department, academicYear);
                                        
                                        pnlClassTT.setSize(pnlBasePanel4SelectedTT.getWidth(), pnlBasePanel4SelectedTT.getHeight());
                                        pnlClassTT.setVisible(true);
                                        pnlBasePanel4SelectedTT.add(pnlClassTT);
                                        pnlClassTT.updateUI();
                                    }

                                 /* DefaultTableModel model = new DefaultTableModel(data, COLUMNNAMES);
                                    pnlClassTT.setSize(pnlBasePanel4SelectedTT.getWidth(), pnlBasePanel4SelectedTT.getHeight());
                                    pnlClassTT.setVisible(true);
                                    pnlBasePanel4SelectedTT.add(pnlClassTT);
                                    pnlClassTT.updateUI();*/
                                }
                                else
                                {
                                    int option = JOptionPane.showConfirmDialog(this, "Time table is not set.  Set it now ...... ?", "UNAVAILABLE", JOptionPane.YES_NO_OPTION);
                                    
                                    if(option == 0)
                                        databaseAddOperation(type, department, academicYear);
                                    
                                    pnlClassTT.setSize(pnlBasePanel4SelectedTT.getWidth(), pnlBasePanel4SelectedTT.getHeight());
                                    pnlClassTT.setVisible(true);
                                    pnlBasePanel4SelectedTT.add(pnlClassTT);
                                    pnlClassTT.updateUI();
                                }
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                            
                                
                        break;
                        
            case "Guest Lecture":
                            String guestLecture = "";
                            try
                            {
                                List<GuestLectureTTBean> listGL = new GuestLectureTTDao().getByProperties(department, academicYear);
                                if(!listGL.isEmpty())
                                {
                                    Iterator iteratorGL = listGL.iterator();
                                    GuestLectureTTBean strGL = null;
                                    while(iteratorGL.hasNext())
                                    {
                                        strGL = (GuestLectureTTBean) iteratorGL.next();
                                    }
                                    try
                                    {
                                        guestLecture = guestLecture.concat(strGL.getTimeTable());
                                    }
                                    catch(NullPointerException e)
                                    {
                                        e.printStackTrace();
                                    }
                                }
                                else
                                    JOptionPane.showMessageDialog(this, "Record unavailable ..... !!", "No Record", JOptionPane.INFORMATION_MESSAGE);
                                

                                ttPanel_GL.setTextofTextArea(guestLecture);
                                ttPanel_GL.setSize(pnlBasePanel4SelectedTT.getWidth(), pnlBasePanel4SelectedTT.getHeight());
                                ttPanel_GL.setVisible(true);
                                pnlBasePanel4SelectedTT.add(ttPanel_GL);
                                ttPanel_GL.updateUI();
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                            
                        break;
                        
            case "Industrial Tour":
                            String industrialTour = "";
                            try
                            {
                                List<IndustrialTourTTBean> listIT = new IndustrialTourTTDao().getByProperties(department, academicYear);
                                if(!listIT.isEmpty())
                                {
                                    Iterator iteratorIT = listIT.iterator();
                                    IndustrialTourTTBean strIT = null;
                                    while(iteratorIT.hasNext())
                                    {
                                        strIT = (IndustrialTourTTBean) iteratorIT.next();
                                    }
                                    try
                                    {
                                        industrialTour = industrialTour.concat(strIT.getTimeTable());
                                    }
                                    catch(NullPointerException e)
                                    {
                                        e.printStackTrace();
                                    }
                                }
                                else
                                    JOptionPane.showMessageDialog(this, "Record unavailable ..... !!", "No Record", JOptionPane.INFORMATION_MESSAGE);
                                

                                ttPanel_IT.setTextofTextArea(industrialTour);
                                ttPanel_IT.setSize(pnlBasePanel4SelectedTT.getWidth(), pnlBasePanel4SelectedTT.getHeight());
                                ttPanel_IT.setVisible(true);
                                pnlBasePanel4SelectedTT.add(ttPanel_IT);
                                ttPanel_IT.updateUI();
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                            
                        break;
                        
            case "University Exam": 
                            String universityExam = "";
                            try
                            {
                                List<UniversityExamScheduleBean> listUE = new UniversityExamDao().getByProperties(department, academicYear);
                                if(!listUE.isEmpty())
                                {
                                    Iterator iteratorUE = listUE.iterator();
                                    UniversityExamScheduleBean strUE = null;
                                    while(iteratorUE.hasNext())
                                    {
                                        strUE = (UniversityExamScheduleBean) iteratorUE.next();
                                    }
                                    try
                                    {
                                        universityExam = universityExam.concat(strUE.getTimeTable());
                                    }
                                    catch(NullPointerException e)
                                    {
                                        e.printStackTrace();
                                    }
                                }
                                else
                                    JOptionPane.showMessageDialog(this, "Record unavailable ..... !!", "No Record", JOptionPane.INFORMATION_MESSAGE);
                                

                                ttPanel_UE.setTextofTextArea(universityExam);
                                ttPanel_UE.setSize(pnlBasePanel4SelectedTT.getWidth(), pnlBasePanel4SelectedTT.getHeight());
                                ttPanel_UE.setVisible(true);
                                pnlBasePanel4SelectedTT.add(ttPanel_UE);
                                ttPanel_UE.updateUI();
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                            
                        break;
                        
            case "Unit Test":
                            String unitTest = "";
                            try
                            {
                                List<UnitTestScheduleBean> listUT = new UnitTestDao().getByProperties(department, academicYear);
                                if(!listUT.isEmpty())
                                {
                                    Iterator iteratorUT = listUT.iterator();
                                    UnitTestScheduleBean strUT = null;
                                    while(iteratorUT.hasNext())
                                    {
                                        strUT = (UnitTestScheduleBean) iteratorUT.next();
                                    }
                                    try
                                    {
                                        unitTest = unitTest.concat(strUT.getTimeTable());
                                    }
                                    catch(NullPointerException e)
                                    {
                                        e.printStackTrace();
                                    }
                                }
                                else
                                    JOptionPane.showMessageDialog(this, "Record unavailable ..... !!", "No Record", JOptionPane.INFORMATION_MESSAGE);
                                

                                ttPanel_UT.setTextofTextArea(unitTest);
                                ttPanel_UT.setSize(pnlBasePanel4SelectedTT.getWidth(), pnlBasePanel4SelectedTT.getHeight());
                                ttPanel_UT.setVisible(true);
                                pnlBasePanel4SelectedTT.add(ttPanel_UT);
                                ttPanel_UT.updateUI();
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                            
                        break;
                        
            case "Practical Exam":
                            String practicalExam = "";
                            try
                            {
                                List<PracticalExamScheduleBean> listPE = new PracticalExamDao().getByProperties(department, academicYear);
                                if(!listPE.isEmpty()) 
                                {
                                    Iterator iteratorPE = listPE.iterator();
                                    PracticalExamScheduleBean strPE = null;
                                    while(iteratorPE.hasNext())
                                    {
                                        strPE = (PracticalExamScheduleBean) iteratorPE.next();
                                    }
                                    try
                                    {
                                        practicalExam = practicalExam.concat(strPE.getTimeTable());
                                    }
                                    catch(NullPointerException e)
                                    {
                                        e.printStackTrace();
                                    }
                                } 
                                else 
                                    JOptionPane.showMessageDialog(this, "Record unavailable ..... !!", "No Record", JOptionPane.INFORMATION_MESSAGE);
                                

                                ttPanel_PE.setTextofTextArea(practicalExam);
                                ttPanel_PE.setSize(pnlBasePanel4SelectedTT.getWidth(), pnlBasePanel4SelectedTT.getHeight());
                                ttPanel_PE.setVisible(true);
                                pnlBasePanel4SelectedTT.add(ttPanel_PE);
                                ttPanel_PE.updateUI();
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                            
                        break;
            }
    }
    
    public void databaseUpdateOperation(String oprationType, String dept, String clss)
    {
        System.out.println("\n=========================Inside databaseUpdateOperation Method=======================");
        if(counter>0)
        {
            switch (type) 
            {
                case "Class":   
                                try
                                {


                                    DefaultTableModel clssMmodel = pnlClassTT.getTableData();

                                    if(clssMmodel != null)
                                    {
                                        int row = clssMmodel.getRowCount();
                                        int column = clssMmodel.getColumnCount();

                                        System.out.println("Row: "+row+"\tColumn: "+column);



                                        if((row != 0) && (column != 0))
                                        {
                                            String value = "";
                                            for(int i=0; i<row; i++)
                                            {


                                                for(int j=0; j<column ; j++)
                                                {
                                                    if(clssMmodel.getValueAt(i, j) != null)
                                                    {
                                                        value = value.concat(clssMmodel.getValueAt(i, j)+"!@");
                                                    }
                                                    else
                                                    {
                                                        value = value.concat("--!@");
                                                    }
                                                    //System.out.print(""+tableModel.getValueAt(i, j)+"  ");
                                                }

                                                //System.out.println(value);
                                                //System.out.println("\n");
                                            }
                                            System.out.println(value);
                                            //System.out.println(academicClass.entrySet());
                                            //System.out.println(academicClass.values());

                                            com.bean.ClassTimeTableBean classTimeTable = new com.bean.ClassTimeTableBean(department
                                                                        , academicYear, value);
                                            timeTableDao.saveOrUpdate(classTimeTable);
                                            counter = 0;
                                            JOptionPane.showMessageDialog(this, "  Time table is updated ..... !!", "Successful", JOptionPane.INFORMATION_MESSAGE);

                                        }
                                        else
                                        {
                                            counter = 0;
                                        }

                                        pnlBasePanel4SelectedTT.removeAll();
                                        //databaseRetrieveOperation(type, department, academicYear);

                                        pnlClassTT.setSize(pnlBasePanel4SelectedTT.getWidth(), pnlBasePanel4SelectedTT.getHeight());
                                        pnlClassTT.setVisible(true);
                                        pnlBasePanel4SelectedTT.add(pnlClassTT);
                                        pnlClassTT.updateUI();

                                        pnlClassTT.setModel(clssMmodel);
                                        pnlClassTT.setTableData();
                                        counter = 0;
                                        updateUI();
                                    }
                                }
                                catch(Exception e)
                                {
                                    e.printStackTrace();
                                }
                            break;

                case "Guest Lecture":
                                try
                                {
                                    String updateGuestLecture = ttPanel_GL.getTextAreaText();

                                    if(!updateGuestLecture.equals(""))
                                    {
                                        GuestLectureTTBean glTT = new GuestLectureTTBean(department, academicYear, updateGuestLecture);
                                        new GuestLectureTTDao().saveOrUpdateGuestLectureTT(glTT);
                                        
                                        ttPanel_GL.setTextAreaEditable(false);
                                        counter = 0;
                                        ttPanel_GL.updateUI();
                                        //ttPanel_GL.setTextofTextArea(guestLecture);
                                        JOptionPane.showMessageDialog(this, "   Updated ...... !!", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else
                                    {
                                        ttPanel_GL.setTextAreaEditable(false);
                                        counter = 0;
                                        
                                        JOptionPane.showMessageDialog(this, "Can not perform updation.", "ERROR", JOptionPane.ERROR_MESSAGE);
                                        return;
                                    }

                                }
                                catch(Exception e)
                                {
                                    e.printStackTrace();
                                }

                                break;

                case "Industrial Tour":
                                try
                                {
                                    String updateindustrialTour = ttPanel_IT.getTextAreaText();
                                    
                                    if(!updateindustrialTour.equals(""))
                                    {
                                        IndustrialTourTTBean itTT = new IndustrialTourTTBean(department, academicYear, updateindustrialTour);
                                        new IndustrialTourTTDao().saveOrUpdateIndustrialTourTT(itTT);
                                        
                                        ttPanel_IT.setTextAreaEditable(false);
                                        counter = 0;
                                        
                                        //ttPanel_IT.setTextofTextArea(industrialTour);
                                        JOptionPane.showMessageDialog(this, "   Updated ...... !!", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else
                                    {
                                        ttPanel_IT.setTextAreaEditable(false);
                                        counter = 0;
                                        
                                        JOptionPane.showMessageDialog(this, "Can not perform updation.", "ERROR", JOptionPane.ERROR_MESSAGE);
                                        return;
                                    }
                                }
                                catch(Exception e)
                                {
                                    e.printStackTrace();
                                }

                            break;
                case "University Exam":
                                try
                                {
                                    String updateUniversityExam = ttPanel_UE.getTextAreaText();
                                    
                                    if(!updateUniversityExam.equals(""))
                                    {
                                        
                                        UniversityExamScheduleBean ueSchedule = new UniversityExamScheduleBean(department, academicYear, updateUniversityExam);
                                        new UniversityExamDao().saveOrUpdateUniversityExam(ueSchedule);

                                        //ttPanel_UE.setTextofTextArea(scheduleUE);
                                        ttPanel_UE.setTextAreaEditable(false);
                                        counter = 0;
                                        
                                        JOptionPane.showMessageDialog(this, "   Updated ...... !!", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else
                                    {
                                        ttPanel_UE.setTextAreaEditable(false);
                                        counter = 0;
                                        
                                        JOptionPane.showMessageDialog(this, "Can not perform updation.", "ERROR", JOptionPane.ERROR_MESSAGE);
                                        return;
                                    }
                                }
                                catch(Exception e)
                                {
                                    e.printStackTrace();
                                }

                            break;

                case "Unit Test":
                                try
                                {
                                    String updateUnitTest = ttPanel_UT.getTextAreaText();
                                    
                                    if(!updateUnitTest.equals(""))
                                    {
                                        UnitTestScheduleBean utSchedule = new UnitTestScheduleBean(department, academicYear, updateUnitTest);
                                        new UnitTestDao().saveOrUpdateUnitTest(utSchedule);

                                        //ttPanel_UT.setTextofTextArea(scheduleUT);
                                        ttPanel_UT.setTextAreaEditable(false);
                                        counter = 0;
                                        
                                        JOptionPane.showMessageDialog(this, "   Updated ...... !!", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else
                                    {
                                        ttPanel_UT.setTextAreaEditable(false);
                                        counter = 0;
                                        
                                        JOptionPane.showMessageDialog(this, "Can not perform updation.", "ERROR", JOptionPane.ERROR_MESSAGE);
                                        return;
                                    }
                                }
                                catch(Exception e)
                                {
                                    e.printStackTrace();
                                }

                            break;

                case "Practical Exam":
                                try
                                {
                                    String updatePracticalExam = ttPanel_PE.getTextAreaText();
                                    
                                    if(!updatePracticalExam.equals(""))
                                    {
                                        PracticalExamScheduleBean peSchedule = new PracticalExamScheduleBean(department, academicYear, updatePracticalExam);
                                        new PracticalExamDao().saveOrUpdatePracticalExam(peSchedule);

                                        //ttPanel_PE.setTextofTextArea(schedulePE);
                                        ttPanel_PE.setTextAreaEditable(false);
                                        counter = 0;
                                        
                                        JOptionPane.showMessageDialog(this, "   Updated ...... !!", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else
                                    {
                                        ttPanel_PE.setTextAreaEditable(false);
                                        counter = 0;
                                        
                                        JOptionPane.showMessageDialog(this, "Can not perform updation.", "ERROR", JOptionPane.ERROR_MESSAGE);
                                        return;
                                    }
                                }
                                catch(Exception e)
                                {
                                    e.printStackTrace();
                                }

                            break;
                }
        }
        else
        {
            try
            {
                switch (type) 
                {
                    case "Class":   
                                    counter = 1;
                                    JOptionPane.showMessageDialog(this, "Please edit the field then press update button again...... !!", "EDIT", JOptionPane.INFORMATION_MESSAGE);

                                break;

                    case "Guest Lecture":
                                    ttPanel_GL.setTextAreaEditable(true);
                                    ttPanel_GL.updateUI();
                                    counter = 1;
                                    JOptionPane.showMessageDialog(this, "Please edit the text field then press update button again ...... !!", "EDIT", JOptionPane.INFORMATION_MESSAGE);
                                    break;

                    case "Industrial Tour":
                                    ttPanel_IT.setTextAreaEditable(true);
                                    counter = 1;
                                    JOptionPane.showMessageDialog(this, "Please edit the text field then press update button again ...... !!", "EDIT", JOptionPane.INFORMATION_MESSAGE);
                                    break;

                    case "University Exam": 
                                    ttPanel_UE.setTextAreaEditable(true);
                                    counter = 1;
                                    JOptionPane.showMessageDialog(this, "Please edit the text field then press update button again ...... !!", "EDIT", JOptionPane.INFORMATION_MESSAGE);
                                    break;

                    case "Unit Test":
                                    ttPanel_UT.setTextAreaEditable(true);
                                    counter = 1;
                                    JOptionPane.showMessageDialog(this, "Please edit the text field then press update button again ...... !!", "EDIT", JOptionPane.INFORMATION_MESSAGE);
                                    break;

                    case "Practical Exam":
                                    ttPanel_PE.setTextAreaEditable(true);
                                    counter = 1;
                                    JOptionPane.showMessageDialog(this, "Please edit the text field then press update button again ...... !!", "EDIT", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                }
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
            
    }    
    
    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }
    
    public void setComponentsVisibility(boolean depytLabel)
    {
        lblDepartment.setEnabled(depytLabel);
        cmbbxDepartment.setEnabled(depytLabel);
        cmbbxClass.setEnabled(depytLabel);
    }
    
    public void setAccessibleComponentForExamScheduler(String[] itemList, String label_1, String label_2)
    {
        cmbbxTimeTableType.setModel(new DefaultComboBoxModel<>(itemList));
        lblFrameLabel.setText(label_1);
        lblTimeTable.setText(label_2);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewTT;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbbxClass;
    private javax.swing.JComboBox<String> cmbbxDepartment;
    private javax.swing.JComboBox<String> cmbbxTimeTableType;
    private javax.swing.Box.Filler flrHorizontalSaperator_01;
    private javax.swing.Box.Filler flrHorizontalSaperator_02;
    private javax.swing.Box.Filler flrVerticalSaperator_01;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblFrameLabel;
    private javax.swing.JLabel lblSelectTimeTable;
    private javax.swing.JLabel lblTimeTable;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlBasePanel4SelectedTT;
    private javax.swing.JPanel pnlTimeTableType;
    // End of variables declaration//GEN-END:variables
}
