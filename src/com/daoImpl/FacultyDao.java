
package com.daoImpl;

import com.bean.FacultyRegistrationBean;
import com.client.Client;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class FacultyDao {
    private SessionFactory sessionFactory;

    public FacultyDao() {
        sessionFactory = Client.transactionManager.getSessionFactory();
    }
    
    
    public void saveOrUpdateFaculty(FacultyRegistrationBean saveOrUpdateFaculty)
    {
        //template.saveOrUpdate(saveOrUpdateFaculty);
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(saveOrUpdateFaculty);
        transaction.commit();
    }
    
    public FacultyRegistrationBean getById(long id)
    {
        //FacultyRegistration getfaculty = template.get(FacultyRegistrationBean.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        FacultyRegistrationBean getfaculty = (FacultyRegistrationBean) session.load(FacultyRegistrationBean.class, id);
        System.out.println(getfaculty.toString());
        transaction.commit();
        return getfaculty;
    }
    
    public List<FacultyRegistrationBean> getAll()
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<FacultyRegistrationBean> query = builder.createQuery(FacultyRegistrationBean.class);
        Root<FacultyRegistrationBean> root = query.from(FacultyRegistrationBean.class);
        
        List<FacultyRegistrationBean> list = session.createQuery(query).getResultList();
        
        transaction.commit();
        session.close();
        
        return list;
    }
}
