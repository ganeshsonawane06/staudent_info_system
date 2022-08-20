package com.client;

import com.daoImpl.ConnectionManager;
import com.ui.frame.LoginFrame;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

public class Client {
    
    public static HibernateTransactionManager transactionManager;
    
    
    
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("/com/configuration/xml/bean-mapping.xml");
            
            if(context != null)
            {
                ConnectionManager connectionManager = (ConnectionManager) context.getBean("connectionManager");
                if(connectionManager != null)
                {
                    HibernateTransactionManager transactionManager = connectionManager.getTransactionManager();
                    Client.transactionManager = transactionManager;
                    
                    System.out.println("connectionManager: "+connectionManager.getTransactionManager());
                    
                    java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                            LoginFrame frame = new LoginFrame();
                            frame.setVisible(true);
                        }
                    });
                }
                else
                    System.out.println("connectionManager is null");
            }
            else
                System.out.println("context is null");
            
            /*BeanDefinitionRegistry beanFactory = new DefaultListableBeanFactory();
            XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
            reader.loadBeanDefinitions(new ClassPathResource("/com/configuration/xml/bean-mapping.xml"));*/
            
            /*java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    LoginFrame frame = new LoginFrame();
                    frame.setSize(dimension.width, dimension.height);
                    frame.setVisible(true);
                }
            });*/
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

}
