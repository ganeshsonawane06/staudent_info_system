
package com.daoImpl;

import com.bean.PracticalExamScheduleBean;
import com.client.Client;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class PracticalExamDao {
    private SessionFactory sessionFactory;

    public PracticalExamDao() {
        sessionFactory = Client.transactionManager.getSessionFactory();
    }
    
    public void saveOrUpdatePracticalExam(PracticalExamScheduleBean exam)
    {
        //template.saveOrUpdate(exam);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(exam);
        transaction.commit();
        session.close();
    }
    
    public PracticalExamScheduleBean getById(int id)
    {
        //PracticalExamSchedule examTT = template.get(PracticalExamScheduleBean.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        PracticalExamScheduleBean getTT = session.get(PracticalExamScheduleBean.class, id);
        transaction.commit();
        session.close();
        return getTT;
    }
    
    public List<PracticalExamScheduleBean> getByProperties(String department, String academicClass)
    {
        //GuestLectureTT getTT = template.get(GuestLectureTT.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<PracticalExamScheduleBean> authenticate = builder.createQuery(PracticalExamScheduleBean.class);
        Root<PracticalExamScheduleBean> root = authenticate.from(PracticalExamScheduleBean.class);
                                    authenticate.where(
                                            builder.and(
                                            builder.equal(root.get("department"), department),
                                            builder.equal(root.get("academicClass"), academicClass)
                                    ));
        List<PracticalExamScheduleBean> listTT = session.createQuery(authenticate).getResultList();
        
        transaction.commit();
        session.close();
        
        return listTT;
    }
    
    public List<PracticalExamScheduleBean> getAll()
    {
        //GuestLectureTT getTT = template.get(GuestLectureTT.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<PracticalExamScheduleBean> query = builder.createQuery(PracticalExamScheduleBean.class);
        Root<PracticalExamScheduleBean> root = query.from(PracticalExamScheduleBean.class);
        
        List<PracticalExamScheduleBean> list = session.createQuery(query).getResultList();
        
        transaction.commit();
        session.close();
        
        return list;
    }
}
