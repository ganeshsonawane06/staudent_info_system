
package com.daoImpl;

import org.springframework.orm.hibernate5.HibernateTransactionManager;


public class ConnectionManager {
    public HibernateTransactionManager transactionManager;

    public HibernateTransactionManager getTransactionManager() {
        return transactionManager;
    }

    public void setTransactionManager(HibernateTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    
}
