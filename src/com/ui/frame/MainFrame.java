
package com.ui.frame;


public class MainFrame extends javax.swing.JFrame {
    
    public static String user = "";
    
    public MainFrame() {
        initComponents();
        setHomeScreenImageSize();
        setBounds(0, 0, LoginFrame.DIMENSION.width, LoginFrame.DIMENSION.height);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        mnbrTop = new javax.swing.JMenuBar();
        mnuHome = new javax.swing.JMenu();
        mnuFile = new javax.swing.JMenu();
        mnuitmTimeTable = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuitmExamSchedule = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuitmClose = new javax.swing.JMenuItem();
        mnuRegister = new javax.swing.JMenu();
        mnuitmStudentRegistration = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuitmFacultyRegistration = new javax.swing.JMenuItem();
        mnuEvent = new javax.swing.JMenu();
        mnuitmEventDetails = new javax.swing.JMenuItem();
        mnuLibrary = new javax.swing.JMenu();
        mnuitmLibraryDetails = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuitmHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("School Manegement");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("MainFrame"); // NOI18N

        lblWelcome.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(153, 0, 0));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home Screen wallpaper 02.jpg"))); // NOI18N
        lblWelcome.setMaximumSize(new java.awt.Dimension(720, 550));
        lblWelcome.setMinimumSize(new java.awt.Dimension(720, 550));

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 699, Short.MAX_VALUE)
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        mnbrTop.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuHome.setBorder(null);
        mnuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        mnuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuHomeMouseClicked(evt);
            }
        });
        mnuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHomeActionPerformed(evt);
            }
        });
        mnbrTop.add(mnuHome);

        mnuFile.setForeground(new java.awt.Color(153, 51, 0));
        mnuFile.setText("     File");
        mnuFile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuitmTimeTable.setAction(mnuitmTimeTable.getAction());
        mnuitmTimeTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/schedreport.PNG"))); // NOI18N
        mnuitmTimeTable.setText("Time Table");
        mnuitmTimeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmTimeTableActionPerformed(evt);
            }
        });
        mnuFile.add(mnuitmTimeTable);
        mnuFile.add(jSeparator2);

        mnuitmExamSchedule.setAction(mnuitmExamSchedule.getAction());
        mnuitmExamSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busreport.PNG"))); // NOI18N
        mnuitmExamSchedule.setText("Exam Schedule");
        mnuitmExamSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmExamScheduleActionPerformed(evt);
            }
        });
        mnuFile.add(mnuitmExamSchedule);
        mnuFile.add(jSeparator3);

        mnuitmClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        mnuitmClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        mnuitmClose.setText("Close");
        mnuitmClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmCloseActionPerformed(evt);
            }
        });
        mnuFile.add(mnuitmClose);

        mnbrTop.add(mnuFile);

        mnuRegister.setForeground(new java.awt.Color(153, 51, 0));
        mnuRegister.setText("Register");
        mnuRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuitmStudentRegistration.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        mnuitmStudentRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users.png"))); // NOI18N
        mnuitmStudentRegistration.setText("Student");
        mnuitmStudentRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmStudentRegistrationActionPerformed(evt);
            }
        });
        mnuRegister.add(mnuitmStudentRegistration);
        mnuRegister.add(jSeparator1);

        mnuitmFacultyRegistration.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        mnuitmFacultyRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emps.png"))); // NOI18N
        mnuitmFacultyRegistration.setText("Faculty");
        mnuitmFacultyRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmFacultyRegistrationActionPerformed(evt);
            }
        });
        mnuRegister.add(mnuitmFacultyRegistration);

        mnbrTop.add(mnuRegister);

        mnuEvent.setForeground(new java.awt.Color(153, 51, 0));
        mnuEvent.setText("Event");
        mnuEvent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuitmEventDetails.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        mnuitmEventDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        mnuitmEventDetails.setText("Details");
        mnuitmEventDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmEventDetailsActionPerformed(evt);
            }
        });
        mnuEvent.add(mnuitmEventDetails);

        mnbrTop.add(mnuEvent);

        mnuLibrary.setForeground(new java.awt.Color(153, 51, 0));
        mnuLibrary.setText("Library");
        mnuLibrary.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuitmLibraryDetails.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        mnuitmLibraryDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit Person - Copy.png"))); // NOI18N
        mnuitmLibraryDetails.setText("Details");
        mnuitmLibraryDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmLibraryDetailsActionPerformed(evt);
            }
        });
        mnuLibrary.add(mnuitmLibraryDetails);

        mnbrTop.add(mnuLibrary);

        mnuHelp.setForeground(new java.awt.Color(153, 51, 0));
        mnuHelp.setText("Help");
        mnuHelp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuitmHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        mnuitmHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        mnuitmHelp.setText("Select");
        mnuitmHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmHelpActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuitmHelp);

        mnbrTop.add(mnuHelp);

        setJMenuBar(mnbrTop);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuitmFacultyRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmFacultyRegistrationActionPerformed
        System.out.println("\n=========================Inside Faculty Registratio method=======================");
        try
        {
            //this.remove(lblWelcome);
            pnlBase.setVisible(false);
            FacultyRegistration facultyRegistration = new FacultyRegistration();
            facultyRegistration.setSize(LoginFrame.DIMENSION.width, (LoginFrame.DIMENSION.height-94));
            facultyRegistration.setVisible(true);
            this.add(facultyRegistration);
            facultyRegistration.updateUI();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_mnuitmFacultyRegistrationActionPerformed

    private void mnuitmStudentRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmStudentRegistrationActionPerformed
        System.out.println("\n=========================Inside Student Registration method=======================");
        try
        {
            //this.remove(lblWelcome);
            pnlBase.setVisible(false);
            StudentRegistration studentRegistration = new StudentRegistration();
            studentRegistration.setSize(LoginFrame.DIMENSION.width, (LoginFrame.DIMENSION.height-94));
            studentRegistration.setVisible(true);
            this.add(studentRegistration);
            studentRegistration.updateUI();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_mnuitmStudentRegistrationActionPerformed

    private void mnuitmTimeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmTimeTableActionPerformed
        System.out.println("\n=========================Inside Time Table method=======================");
        try
        {
            //this.remove(lblWelcome);
            pnlBase.setVisible(false);
            TimeTable timeTable = new TimeTable();
            timeTable.setSize(LoginFrame.DIMENSION.width, (LoginFrame.DIMENSION.height-94));
            timeTable.setPreviledge(user);
            timeTable.setPreviledgeType(user);
            timeTable.setVisible(true);
            this.add(timeTable);
            timeTable.updateUI();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_mnuitmTimeTableActionPerformed

    private void mnuitmExamScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmExamScheduleActionPerformed
        System.out.println("\n=========================Inside Exam Schedule method=======================");
        try
        {
            //this.remove(lblWelcome);
            pnlBase.setVisible(false);
            
            TimeTable timeTable = new TimeTable();
            timeTable.setAccessibleComponentForExamScheduler(new String[]{
                    "select type", "University Exam", "Unit Test", "Practical Exam"}
                    , "-: Exam Schedule :-", "Exam Time Table"
                    );
            timeTable.setSize(LoginFrame.DIMENSION.width, (LoginFrame.DIMENSION.height-94));
            timeTable.setPreviledge(user);
            timeTable.setPreviledgeType(user);
            timeTable.setVisible(true);
            this.add(timeTable);
            timeTable.updateUI();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        /*int count = getComponentCount();
        //System.out.println("Compo at: "+getComponentAt(100, 100)+"\tbounds: "+getBounds());
        for(int i=0; i<count; i++)
        {
            Component component = getComponent(i);
            System.out.println("name: "+component.getName()+"\tComp at: "+component.getComponentAt(100, 100));
        }*/
    }//GEN-LAST:event_mnuitmExamScheduleActionPerformed

    private void mnuitmCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmCloseActionPerformed
           System.out.println("\n=========================Inside Close method=======================");
           System.exit(0);
    }//GEN-LAST:event_mnuitmCloseActionPerformed

    private void mnuitmEventDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmEventDetailsActionPerformed
        System.out.println("\n=========================Inside Event Details method=======================");
        try
        {
            //this.remove(lblWelcome);
            pnlBase.setVisible(false);
            Event event = new Event();
            event.setSize(LoginFrame.DIMENSION.width, (LoginFrame.DIMENSION.height-94));
            event.setPreviledge(user);
            event.setVisible(true);
            
            this.add(event);
            event.updateUI();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_mnuitmEventDetailsActionPerformed

    private void mnuitmLibraryDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmLibraryDetailsActionPerformed
        System.out.println("\n=========================Inside Library Details method=======================");
        try
        {
            //this.remove(lblWelcome);
            pnlBase.setVisible(false);
            Library library = new Library();
            library.setSize(LoginFrame.DIMENSION.width, (LoginFrame.DIMENSION.height-94));
            library.setVisible(true);
            this.add(library);
            library.updateUI();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_mnuitmLibraryDetailsActionPerformed

    private void mnuitmHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmHelpActionPerformed
        System.out.println("\n=========================Inside Help method=======================");
        try
        {
            //this.remove(lblWelcome);
            pnlBase.setVisible(false);
            Help help = new Help();
            help.setSize(LoginFrame.DIMENSION.width, (LoginFrame.DIMENSION.height-94));
            help.setVisible(true);
            this.add(help);
            help.updateUI();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_mnuitmHelpActionPerformed

    private void mnuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHomeActionPerformed
        System.out.println("\n=========================Inside Home method=======================");
        try
        {
            this.add(lblWelcome);
            lblWelcome.updateUI();
            lblWelcome.repaint();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_mnuHomeActionPerformed

    private void mnuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuHomeMouseClicked
        System.out.println("\n=========================Inside Home Mouse Clicked method=======================");
        try
        {
            /*Component[] component = this.getComponents();
            for(Component cmpnt : component)
            {
                System.out.println(cmpnt.getName());
                if((cmpnt instanceof TimeTable)
                        | (cmpnt instanceof Event)
                        | (cmpnt instanceof ExamSchedule)
                        | (cmpnt instanceof FacultyRegistration)
                        | (cmpnt instanceof Help)
                        | (cmpnt instanceof Library)
                        | (cmpnt instanceof StudentRegistration) )
                {
                    this.remove(cmpnt);
                    System.out.print("* ");
                }
            }*/
            //this.add(lblWelcome);
            //lblWelcome.updateUI();
            //lblWelcome.repaint();
            
            //System.out.println(this.findComponentAt(100, 0));
            pnlBase.setVisible(true);
            pnlBase.updateUI();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_mnuHomeMouseClicked

public void setHomeScreenImageSize()
{
    lblWelcome.setSize(pnlBase.getWidth(), pnlBase.getHeight());
}

public void setAccessibleComponents(String type)
{
    try
    {
        if(!type.equals(""))
        {
            switch(type)
            {
                case "Student":
                            mnuitmLibraryDetails.setEnabled(false);
                            mnuitmStudentRegistration.setEnabled(false);
                            mnuitmFacultyRegistration.setEnabled(false);
                            user = type;
                        break;

                case "Professor":
                            mnuitmLibraryDetails.setEnabled(false);
                            user = type;
                        break;

                case "Accountant":
                            mnuitmLibraryDetails.setEnabled(false);
                            mnuitmExamSchedule.setEnabled(false);
                            mnuitmTimeTable.setEnabled(false);
                            user = type;
                        break;

                case "Librarian":
                            
                            mnuitmExamSchedule.setEnabled(false);
                            mnuitmTimeTable.setEnabled(false);
                            mnuitmStudentRegistration.setEnabled(false);
                            mnuitmFacultyRegistration.setEnabled(false);
                            mnuitmEventDetails.setEnabled(false);
                            user = type;
                        break;

                case "Office Staff":
                            mnuitmLibraryDetails.setEnabled(false);
                            user = type;
                        break;    
            }
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    
}


    /*public static void main(String args[]) {
        try
        {
            //LoginFrame.context = new ClassPathXmlApplicationContext("/com/configuration/xml/bean-mapping.xml");
            
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
                java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }*/
            //</editor-fold>

            /* Create and display the form */
            /*java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    MainFrame frame = new MainFrame();
                    frame.setSize(LoginFrame.DIMENSION.width, LoginFrame.DIMENSION.height);
                    frame.setVisible(true);
                }
            });
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JMenuBar mnbrTop;
    private javax.swing.JMenu mnuEvent;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuHome;
    private javax.swing.JMenu mnuLibrary;
    private javax.swing.JMenu mnuRegister;
    private javax.swing.JMenuItem mnuitmClose;
    private javax.swing.JMenuItem mnuitmEventDetails;
    private javax.swing.JMenuItem mnuitmExamSchedule;
    private javax.swing.JMenuItem mnuitmFacultyRegistration;
    private javax.swing.JMenuItem mnuitmHelp;
    private javax.swing.JMenuItem mnuitmLibraryDetails;
    private javax.swing.JMenuItem mnuitmStudentRegistration;
    private javax.swing.JMenuItem mnuitmTimeTable;
    private javax.swing.JPanel pnlBase;
    // End of variables declaration//GEN-END:variables
}
