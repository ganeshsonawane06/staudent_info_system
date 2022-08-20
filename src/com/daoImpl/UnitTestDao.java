
package com.daoImpl;

import com.bean.UnitTestScheduleBean;
import com.client.Client;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class UnitTestDao {
    private SessionFactory sessionFactory;

    public UnitTestDao() {
        sessionFactory = Client.transactionManager.getSessionFactory();
    }
    
    public void saveOrUpdateUnitTest(UnitTestScheduleBean exam)
    {
        //template.saveOrUpdate(exam);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(exam);
        transaction.commit();
        session.close();
    }
    
    public UnitTestScheduleBean getById(int id)
    {
        //UnitTestSchedule examTT = template.get(UnitTestScheduleBean.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        UnitTestScheduleBean getTT = session.get(UnitTestScheduleBean.class, id);
        transaction.commit();
        session.close();
        return getTT;
    }
    
    public List<UnitTestScheduleBean> getByProperties(String department, String academicClass)
    {
        //GuestLectureTT getTT = template.get(GuestLectureTT.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<UnitTestScheduleBean> authenticate = builder.createQuery(UnitTestScheduleBean.class);
        Root<UnitTestScheduleBean> root = authenticate.from(UnitTestScheduleBean.class);
                                    authenticate.where(
                                            builder.and(
                                            builder.equal(root.get("department"), department),
                                            builder.equal(root.get("academicClass"), academicClass)
                                    ));
        List<UnitTestScheduleBean> listTT = session.createQuery(authenticate).getResultList();
        
        transaction.commit();
        session.close();
        
        return listTT;
    }
    
    public List<UnitTestScheduleBean> getAll()
    {
        //GuestLectureTT getTT = template.get(GuestLectureTT.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<UnitTestScheduleBean> query = builder.createQuery(UnitTestScheduleBean.class);
        Root<UnitTestScheduleBean> root = query.from(UnitTestScheduleBean.class);
        
        List<UnitTestScheduleBean> list = session.createQuery(query).getResultList();
        
        transaction.commit();
        session.close();
        
        return list;
    }
}
