
package com.daoImpl;

import com.bean.EventBean;
import com.client.Client;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class EventDao {

    private SessionFactory sessionFactory;

    public EventDao() {
        sessionFactory = Client.transactionManager.getSessionFactory();
    }
    
    
    public void saveOrUpdateStudent(EventBean event)
    {
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(event);
        transaction.commit();
        session.close();
    }
    
    public EventBean getById(long id)
    {
        //StudentRegistration getStudent = template.get(StudentRegistration.class, id);
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        EventBean getDetails = (EventBean) session.load(EventBean.class, id);
        //System.out.println(getStudent.toString());
        transaction.commit();
        return getDetails;
    }
    
    public List<EventBean> getByProperties(String eventType)
    {
        //GuestLectureTT getTT = template.get(GuestLectureTT.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<EventBean> event = builder.createQuery(EventBean.class);
        Root<EventBean> root = event.from(EventBean.class);
                             event.where(
                                builder.and(
                                    builder.equal(root.get("eventType"), eventType)));
        List<EventBean> listEvent = session.createQuery(event).getResultList();
        
        transaction.commit();
        session.close();
        
        return listEvent;
    }
    
    public List<EventBean> getAll()
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<EventBean> event = builder.createQuery(EventBean.class);
        Root<EventBean> root = event.from(EventBean.class);
        
        List<EventBean> listEvent = session.createQuery(event).getResultList();
        
        transaction.commit();
        session.close();
        
        return listEvent;
    }
}
