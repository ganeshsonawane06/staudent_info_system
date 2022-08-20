
package com.ui.panel;

import com.bean.LibraryBean;
import com.bean.StudentRegistrationBean;
import com.daoImpl.LibraryDao;
import com.daoImpl.StudentDao;
import com.ui.dialog.LibraryRecord;
import com.ui.frame.FacultyRegistration;
import java.awt.Image;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class StudentLibraryDetails extends javax.swing.JPanel {

    private Blob studentPhoto;
    private long studentID = 0, rowDBIDToUpdateRecord = 0;
    private int counter = 0, selectedRow = -1;
    
    public StudentLibraryDetails() {
        initComponents();
    }


    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    
    public void getStudentDetails()
    {
        if(studentID != 0)
        {
            try
            {
                StudentRegistrationBean sr = new StudentDao().getById(studentID);
                System.out.println("Width: "+lblStudentPhoto.getWidth()
                                                            +"\nHight: "+ lblStudentPhoto.getHeight());
                System.out.println("Label bounds: " + lblStudentPhoto.getBounds());
                
                try 
                {
                    if(sr.getImage() != null)
                    {
                        Blob image = sr.getImage();
                        int imageLength = (int) image.length();
                        byte[] imageBytes = image.getBytes(1, imageLength);


                        lblStudentPhoto.setIcon(new ImageIcon(new ImageIcon(imageBytes)
                                                        .getImage().getScaledInstance(115
                                                                , 132, Image.SCALE_SMOOTH)));
                    }
                        
                        
                } catch (SQLException ex) {
                    Logger.getLogger(FacultyRegistration.class.getName()).log(Level.SEVERE, null, ex);
                }

                String setTextAreaText = "\n  Name\t:  " + sr.getsFName()+"  "+sr.getsMName()+"  "+sr.getsLName()
                                         +"\n\n  Department\t:  " + sr.getStream()
                                         +"\t\tID            :  "  + studentID
                                         +"\n\n  Class\t:  " + sr.getClassYear()
                                         +"\t\tR. No.     :  " + sr.getClassYear().substring(0, 1) + sr.getId();
                taStudentDetails.setText(setTextAreaText);
                
                setTableData();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
    }
    
    public void setTableData()
    {
        try
        {
            List<LibraryBean> list = new LibraryDao().getByProperties(studentID);
            if(!list.isEmpty())
            {
                DefaultTableModel model = (DefaultTableModel) tblStudentLibraryDetails.getModel();

                
                Iterator iterator = list.iterator();
                System.out.println("list size: "+list.size());
                LibraryBean lib = null;
                while(iterator.hasNext())
                {
                    lib = (LibraryBean) iterator.next();
                    String[] rowData = {
                                        lib.getBookID(), lib.getBookName()
                                        , lib.getIssueDate(), lib.getSubmitDate(), lib.getFine()
                                       };
                    model.addRow(rowData);
                }
                tblStudentLibraryDetails.setModel(model);
                tblStudentLibraryDetails.setRowHeight(35);
            }
            else
                JOptionPane.showMessageDialog(this, "No student's library found ..... !!", "Record Unavailable", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void addRecord(String[] newRecord)
    {
        try
        {
            if(newRecord.length != 0)
            {
                DefaultTableModel model = (DefaultTableModel) tblStudentLibraryDetails.getModel();
                
                if(newRecord[0] != ""  && newRecord[0] != "")
                {
                    if(rowDBIDToUpdateRecord != 0)
                    {
                        LibraryBean bean = new LibraryBean(rowDBIDToUpdateRecord, ""+studentID, newRecord[0], newRecord[1], newRecord[2], newRecord[3], newRecord[4]);
                        new LibraryDao().saveOrUpdateStudent(bean);

                        if(selectedRow >= 0)
                        {
                            model.removeRow(selectedRow);
                            model.insertRow(selectedRow, newRecord);
                        }

                        JOptionPane.showMessageDialog(this, "Record updated.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        model.addRow(newRecord);
                        LibraryBean bean = new LibraryBean(""+studentID, newRecord[0], newRecord[1], newRecord[2], newRecord[3], newRecord[4]);
                        new LibraryDao().saveOrUpdateStudent(bean);
                        
                        JOptionPane.showMessageDialog(this, "New Record saved.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                else
                    JOptionPane.showMessageDialog(this, "Record not added.\nInvalid entries in the record.", "Unsuccessful", JOptionPane.ERROR_MESSAGE);
                   
                
                tblStudentLibraryDetails.setModel(model);
                
                for(String str : newRecord)
                        System.out.println(str);
                
                tblStudentLibraryDetails.updateUI();
            }
            else
                JOptionPane.showMessageDialog(this, "No new record available.", "ERROR", JOptionPane.ERROR_MESSAGE);
            
            counter = 0;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            
    }
    
    public void saveRecord()
    {
        try
        {
            DefaultTableModel model = (DefaultTableModel) tblStudentLibraryDetails.getModel();
            int row = model.getRowCount();
            int column = model.getColumnCount();
            
            for(int i=0; i<row; i++)
            {
                String[] arr = new String[5];
                for(int j=0; j<column; j++)
                {
                    arr[j] = ""+model.getValueAt(i, j);
                }
                
                LibraryBean bean = new LibraryBean(""+studentID, arr[0], arr[1], arr[2], arr[3], arr[4]);
                new LibraryDao().saveOrUpdateStudent(bean);
            }
            JOptionPane.showMessageDialog(this, "New Record saved.", "Successful", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    /*public void updateStudentData()
    {
        try
        {
            System.out.println(tblStudentLibraryDetails.getSelectedRow());
            int selectedRow = tblStudentLibraryDetails.getSelectedRow();
            
            if(selectedRow >= 0 )
            {
                DefaultTableModel model = (DefaultTableModel) tblStudentLibraryDetails.getModel();
                int column = model.getColumnCount();
                
                String[] arr = new String[column];
                for(int j=0; j<column; j++)
                {
                    if(model.getValueAt(selectedRow, j) != null)
                    {
                        arr[j] = ""+model.getValueAt(selectedRow, j);
                    }
                    else
                    {
                        arr[j] = "--";
                    }
                }
                
            }
            else
                JOptionPane.showMessageDialog(this, "Either row is not selected,\nOr table is empty.", "Successful", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }*/
    
    /*public void selectRowToBeUpdated()
    {   System.out.println("selectRowToBeUpdated()");
        try
        {
            tblStudentLibraryDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentLibraryDetailsMouseClicked(evt);
            }
            });
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }*/
    
    
    public long getRowIDFromDatabase()
    {
        long dbRowID = 0;
        
        try
        {
            int selectedRow = tblStudentLibraryDetails.getSelectedRow();
            if(selectedRow >= 0 )
            {
                //tblStudentLibraryDetails.setEditingRow(selectedRow);
                
                DefaultTableModel model = (DefaultTableModel) tblStudentLibraryDetails.getModel();
                int column = model.getColumnCount();
                
                String[] arr = new String[column];
                for(int j=0; j<column; j++)
                {
                    try
                    {
                        if(model.getValueAt(selectedRow, j) != null)
                        {
                            arr[j] = ""+model.getValueAt(selectedRow, j);
                        }
                        else
                        {
                            arr[j] = "";
                        }
                    }
                    catch(NullPointerException e)
                    {
                        e.printStackTrace();
                    }
                }
                System.out.println(studentID);
                for(String str : arr)
                {
                    System.out.println(str);
                }
                try
                {
                    dbRowID = new LibraryDao().getIDFromProperties(
                                                            "studentID", ""+studentID,
                                                            "bookID", arr[0],
                                                            "bookName", arr[1],
                                                            "issueDate", arr[2],
                                                            "submitDate", arr[3],
                                                            "fine", arr[4]
                                                        );
                        
                    rowDBIDToUpdateRecord = dbRowID;
                }
                catch(Exception e)
                {
                        e.printStackTrace();
               }
            }
            else
                JOptionPane.showMessageDialog(this, "Either row is not selected,\nOr table is empty.", "Successful", JOptionPane.INFORMATION_MESSAGE);
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return dbRowID;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudentLibraryDetails = new javax.swing.JTable();
        pnlStudentDetails = new javax.swing.JPanel();
        lblStudentPhoto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taStudentDetails = new javax.swing.JTextArea();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(400, 0), new java.awt.Dimension(400, 0), new java.awt.Dimension(400, 32767));

        tblStudentLibraryDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        tblStudentLibraryDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Date Issued", "Date Submited", "Fine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudentLibraryDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentLibraryDetailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblStudentLibraryDetails);

        lblStudentPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/defaultpic.png"))); // NOI18N
        lblStudentPhoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        taStudentDetails.setEditable(false);
        taStudentDetails.setBackground(new java.awt.Color(204, 204, 255));
        taStudentDetails.setColumns(20);
        taStudentDetails.setLineWrap(true);
        taStudentDetails.setRows(5);
        taStudentDetails.setText("  Name:\t\n\n  ID:\t\t\tR. NO.:\t\t\n\n  Department:\t\t\tClass:\t");
        taStudentDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jScrollPane1.setViewportView(taStudentDetails);

        javax.swing.GroupLayout pnlStudentDetailsLayout = new javax.swing.GroupLayout(pnlStudentDetails);
        pnlStudentDetails.setLayout(pnlStudentDetailsLayout);
        pnlStudentDetailsLayout.setHorizontalGroup(
            pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStudentPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlStudentDetailsLayout.setVerticalGroup(
            pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(lblStudentPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        filler1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 255, 51)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlStudentDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlStudentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblStudentLibraryDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentLibraryDetailsMouseClicked
        System.out.println("\n=========================Inside Table mouse Clicked event=======================");
        try
        {   System.out.println("Counter: "+counter);
            if(counter > 0)
            {
                int rowNumber = tblStudentLibraryDetails.getSelectedRow();
                long rowDBID = getRowIDFromDatabase();
                
                selectedRow = rowNumber;
                
                System.out.println("rowNumber: "+rowNumber+"\nrowDBID: "+rowDBID);
                
                if(rowNumber >= 0)
                {
                    LibraryRecord dialog = new LibraryRecord(new javax.swing.JFrame(), true);
                    dialog.setRecordtoBeUpdated(rowDBID);
                    dialog.setVisible(true);
                    
                    if(dialog.getNewRecord().length != 0)
                    {
                        if(dialog.getNewRecord()[0] != ""  && dialog.getNewRecord()[0] != "")
                        {
                            for(String str : dialog.getNewRecord())
                                System.out.println(str);
                            addRecord(dialog.getNewRecord());
                        }
                        else
                        JOptionPane.showMessageDialog(this, "Record not added.\nInvalid entries in the record.", "Unsuccessful", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Record not added.", "Unsuccessful", JOptionPane.ERROR_MESSAGE);
        
                }
                else
                    JOptionPane.showMessageDialog(this, "Invalid row selection.", "ERROR", JOptionPane.ERROR_MESSAGE);
                
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            
    }//GEN-LAST:event_tblStudentLibraryDetailsMouseClicked

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblStudentPhoto;
    private javax.swing.JPanel pnlStudentDetails;
    private javax.swing.JTextArea taStudentDetails;
    private javax.swing.JTable tblStudentLibraryDetails;
    // End of variables declaration//GEN-END:variables
}
