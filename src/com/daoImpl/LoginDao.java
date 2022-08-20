
package com.daoImpl;

import com.bean.LoginBean;
import com.client.Client;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


public class LoginDao<T, V> {
    
    private SessionFactory sessionFactory;
    
    public LoginDao() {
        sessionFactory = Client.transactionManager.getSessionFactory();
    }

    
    public void saveOrUpdate(LoginBean bean)
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.saveOrUpdate(bean);
        
        transaction.commit();
        session.close();
    }
    
    
    public void save(LoginBean bean)
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(bean);
        
        transaction.commit();
        session.close();
    }
    
    @Transactional
    public List<LoginBean> getByConditionalProperties(
                                            String property_1, V value_1
                                            , String property_2, V value_2
                                            , String property_3, V value_3
                                        )
    {
        
        
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<LoginBean> query = builder.createQuery(LoginBean.class);
        Root<LoginBean> root = query.from(LoginBean.class);
                                   query.where(
                                           builder.and(
                                                    (
                                                        builder.and(
                                                            builder.equal(root.get(property_1), value_1)
                                                            , builder.equal(
                                                                root.get(property_2), value_2))
                                                    )
                                                        , builder.equal(root.get(property_3), value_3))
                                                   );
        
        List<LoginBean> list = session.createQuery(query).getResultList();
        
        transaction.commit();
        session.close();
        return list;
    }
}
