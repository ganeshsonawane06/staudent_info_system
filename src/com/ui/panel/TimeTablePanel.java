
package com.ui.panel;


public class TimeTablePanel extends javax.swing.JPanel {

   
    public TimeTablePanel() {
        initComponents();
    }

    public String getTextAreaText()
    {
        return taDetails.getText();
    }
    
    public void setTextAreaEditable(boolean isEditable)
    {
        taDetails.setEditable(isEditable);
    }
    
    public void setTextofTextArea(String taData)
    {
        taDetails.setText(taData);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taDetails = new javax.swing.JTextArea();

        taDetails.setEditable(false);
        taDetails.setBackground(new java.awt.Color(204, 204, 255));
        taDetails.setColumns(20);
        taDetails.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        taDetails.setLineWrap(true);
        taDetails.setRows(5);
        taDetails.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jScrollPane1.setViewportView(taDetails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taDetails;
    // End of variables declaration//GEN-END:variables
}
