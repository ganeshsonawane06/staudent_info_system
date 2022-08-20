
package com.ui.panel;

import javax.swing.table.DefaultTableModel;


public class ClassTimeTablePanel extends javax.swing.JPanel {

    private DefaultTableModel model;
    
    public ClassTimeTablePanel() {
        initComponents();
        changeSize();
    }

    public void changeSize()
    {
        tblClassTT.setRowHeight(29);
        System.out.println("Row height: "+tblClassTT.getRowHeight());
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }
    
    public void setTableData()
    {
        tblClassTT.setModel(model);
    }
    
    public DefaultTableModel getTableData()
    {
        try
        {
            model = (DefaultTableModel) tblClassTT.getModel();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return model;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblClassTT = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        taInfo = new javax.swing.JTextArea();

        tblClassTT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        tblClassTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Monday", "Teusday", "Wednessday", "Thursday", "Friday", "Saturday"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClassTT);

        taInfo.setEditable(false);
        taInfo.setBackground(new java.awt.Color(204, 204, 255));
        taInfo.setColumns(20);
        taInfo.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        taInfo.setRows(5);
        taInfo.setText("  Note:\n\t\t\t\t\tS1 = Subject#1\t\tS2 = Subject#2\t\tS3 = Subject#3\t\tS4 = Subject#4\n\t\n\t\t\t\t\tS5 = Subject#5\t\tS6 = Subject#1\t\tP1 = Practical#1\t\n\t\n\t\t\t\t\tP2 = Practical#2\tP3 = Practical#3\tP4 = Practical#4");
        taInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jScrollPane2.setViewportView(taInfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taInfo;
    private javax.swing.JTable tblClassTT;
    // End of variables declaration//GEN-END:variables
}
