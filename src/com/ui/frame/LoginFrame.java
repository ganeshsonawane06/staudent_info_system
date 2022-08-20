
package com.ui.frame;

import com.bean.LoginBean;
import com.daoImpl.LoginDao;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;


public class LoginFrame extends javax.swing.JFrame {
    
    
    public static final Dimension DIMENSION = Toolkit.getDefaultToolkit().getScreenSize();
    private int counter = 0;
    
    public LoginFrame() {
        setLookAndFeel();
        initComponents();
        setDimensions();
        lblUserFullName_1.setVisible(false);
        lblUserFullName_2.setVisible(false);
        tfUserFullName.setVisible(false);
        
        tfUsername.setText("username");
        pfPassword.setText("password");
        cmbbxUser.setSelectedItem("Director");
    }

    public void setDimensions()
    {
        final int x = ((int) (DIMENSION.getWidth()/2 - this.getWidth()/2));
        final int y = ((int) (DIMENSION.getHeight()/2 - this.getHeight()/2));
        this.setLocation(x, y);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        lblLoginFrame = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 32767));
        pnlLoginComponents = new javax.swing.JPanel();
        lblUserFullName_1 = new javax.swing.JLabel();
        lblUserFullName_2 = new javax.swing.JLabel();
        tfUserFullName = new javax.swing.JTextField();
        lblUsername_1 = new javax.swing.JLabel();
        lblUsername_2 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        lblPassword_1 = new javax.swing.JLabel();
        lblPassword_2 = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        lblUserType_1 = new javax.swing.JLabel();
        lblUserType_2 = new javax.swing.JLabel();
        cmbbxUser = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login: College Management");
        setResizable(false);

        lblLoginFrame.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        lblLoginFrame.setForeground(new java.awt.Color(0, 153, 153));
        lblLoginFrame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginFrame.setText("Login College Management");
        lblLoginFrame.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        filler1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 102, 0)));

        filler2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 102, 0)));

        pnlLoginComponents.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 0, 153), new java.awt.Color(153, 0, 51)));

        lblUserFullName_1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUserFullName_1.setLabelFor(tfUserFullName);
        lblUserFullName_1.setText("Name");

        lblUserFullName_2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUserFullName_2.setLabelFor(tfUserFullName);
        lblUserFullName_2.setText(":");

        tfUserFullName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfUserFullName.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblUsername_1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUsername_1.setLabelFor(tfUsername);
        lblUsername_1.setText("Username");

        lblUsername_2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUsername_2.setLabelFor(tfUsername);
        lblUsername_2.setText(":");

        tfUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblPassword_1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPassword_1.setLabelFor(pfPassword);
        lblPassword_1.setText("Password");

        lblPassword_2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPassword_2.setLabelFor(pfPassword);
        lblPassword_2.setText(":");

        pfPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pfPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblUserType_1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUserType_1.setLabelFor(cmbbxUser);
        lblUserType_1.setText("User");

        lblUserType_2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUserType_2.setLabelFor(cmbbxUser);
        lblUserType_2.setText(":");

        cmbbxUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbbxUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select user", "Director", "Principal", "Student", "Professor", "Accountant", "Librarian", "Office Staff" }));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_1 - Copy.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_1 - Copy.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSignup.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submit_1 - Copy.png"))); // NOI18N
        btnSignup.setText("Signup");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginComponentsLayout = new javax.swing.GroupLayout(pnlLoginComponents);
        pnlLoginComponents.setLayout(pnlLoginComponentsLayout);
        pnlLoginComponentsLayout.setHorizontalGroup(
            pnlLoginComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginComponentsLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(pnlLoginComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsername_1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(lblUserFullName_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPassword_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUserType_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLoginComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginComponentsLayout.createSequentialGroup()
                        .addComponent(lblUserFullName_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUserFullName))
                    .addGroup(pnlLoginComponentsLayout.createSequentialGroup()
                        .addGroup(pnlLoginComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername_2)
                            .addComponent(lblPassword_2)
                            .addComponent(lblUserType_2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLoginComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pfPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUsername)
                            .addComponent(cmbbxUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(136, 136, 136))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginComponentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        pnlLoginComponentsLayout.setVerticalGroup(
            pnlLoginComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginComponentsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlLoginComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserFullName_1)
                    .addComponent(lblUserFullName_2)
                    .addComponent(tfUserFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername_1)
                    .addComponent(lblUsername_2)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword_1)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword_2))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbbxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserType_2)
                    .addComponent(lblUserType_1))
                .addGap(45, 45, 45)
                .addGroup(pnlLoginComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnLogin)
                    .addComponent(btnSignup))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlLoginComponents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblLoginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLoginFrame))
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLoginComponents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        System.out.println("\n=========================Inside Login Button=======================");
        
        try
        {
            String username = tfUsername.getText();
            char[] pass = pfPassword.getPassword();
            String userType = cmbbxUser.getSelectedItem().toString();
            
            String password = "";
            for(char chr : pass)
            {
                password = password.concat(chr+"");
            }
            System.out.println("UN: "+username+"\nPS: "+password+"\nUser: "+userType);
            
            List<LoginBean> loginList = new LoginDao()
                                .getByConditionalProperties(
                                        "username", username
                                        , "password", password
                                        , "userType", userType
                                    );
            
            if(!loginList.isEmpty())
            {
                if(loginList.size() == 1)
                {
                    
                    JOptionPane.showMessageDialog(this, "Login successful.", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                    
                    nextWindow(userType);
                    
                    dispose();
                }
                else
                    JOptionPane.showMessageDialog(this, "Duplicate user.\nLogin not possible.", "UNSUCCESSFUL", JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(this, "Credentials doesn't match.", "UNSUCCESSFUL", JOptionPane.ERROR_MESSAGE);
                
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Unable to login.", "UNSUCCESSFUL", JOptionPane.ERROR_MESSAGE);
        }
        
        tfUserFullName.setText("");
        tfUsername.setText("");
        pfPassword.setText("");
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.out.println("\n=========================Inside Cancel Button=======================");
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        System.out.println("\n=========================Inside Signup Button=======================");
        
        if(counter>0)
            {
                try
                {
                    
                    String fullName = tfUserFullName.getText();
                    String username = tfUsername.getText();
                    char[] pass = pfPassword.getPassword();
                    String userType = cmbbxUser.getSelectedItem().toString();

                    String password = "";
                    for(char chr : pass)
                    {
                        password = password.concat(chr+"");
                    }
                    if(!fullName.equals(""))
                    {
                        if(!username.equals(""))
                        {
                            if((pass.length != 0))
                            {
                                if(!userType.equals("") && !userType.equals("select user"))
                                {
                                    LoginBean bean = new LoginBean(username.toLowerCase(), fullName, userType, password);
                                    new LoginDao().save(bean);
                                    
                                    counter = 0;
                                    JOptionPane.showMessageDialog(this, "New user is registered.\nPlease signin.", "SAVED", JOptionPane.INFORMATION_MESSAGE);
                                    
                                    tfUserFullName.setText("");
                                    tfUsername.setText("");
                                    pfPassword.setText("");
                                    
                                    lblUserFullName_1.setVisible(false);
                                    lblUserFullName_2.setVisible(false);
                                    tfUserFullName.setVisible(false);
                                    btnLogin.setEnabled(true);
                                    btnCancel.setEnabled(true);
                                }
                                else
                                    JOptionPane.showMessageDialog(this, "Select user type.", "REQUIRED", JOptionPane.ERROR_MESSAGE);
                            }
                            else
                                JOptionPane.showMessageDialog(this, "Enter password.", "REQUIRED", JOptionPane.ERROR_MESSAGE);
                        }
                        else
                            JOptionPane.showMessageDialog(this, "Enter username.", "REQUIRED", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Enter full name.", "REQUIRED", JOptionPane.ERROR_MESSAGE);

                    //System.out.println((pfPassword.getPassword())+" <-----> "+(cmbbxUser.getSelectedItem().toString()));
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, "Already registered ...... !!", "OLD USER", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                    
                    tfUserFullName.setText("");
                    tfUsername.setText("");
                    pfPassword.setText("");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please fillup the details ...... !!", "NEW USER", JOptionPane.INFORMATION_MESSAGE);
                lblUserFullName_1.setVisible(true);
                lblUserFullName_2.setVisible(true);
                tfUserFullName.setVisible(true);
                btnLogin.setEnabled(false);
                btnCancel.setEnabled(false);
                counter = 1;
            }
            
    }//GEN-LAST:event_btnSignupActionPerformed

    public void nextWindow(String type)
    {
        try
        {
            java.awt.EventQueue.invokeLater(() -> {
                                        MainFrame frame = new MainFrame();
                                        frame.setSize(LoginFrame.DIMENSION.width, LoginFrame.DIMENSION.height);
                                        frame.setVisible(true);
                                        
                                        frame.setAccessibleComponents(type);
                                    });
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
    public void setLookAndFeel()
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //context = new ClassPathXmlApplicationContext("/com/configuration/xml/bean-mapping.xml");
        
        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JComboBox<String> cmbbxUser;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel lblLoginFrame;
    private javax.swing.JLabel lblPassword_1;
    private javax.swing.JLabel lblPassword_2;
    private javax.swing.JLabel lblUserFullName_1;
    private javax.swing.JLabel lblUserFullName_2;
    private javax.swing.JLabel lblUserType_1;
    private javax.swing.JLabel lblUserType_2;
    private javax.swing.JLabel lblUsername_1;
    private javax.swing.JLabel lblUsername_2;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlLoginComponents;
    private javax.swing.JTextField tfUserFullName;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
