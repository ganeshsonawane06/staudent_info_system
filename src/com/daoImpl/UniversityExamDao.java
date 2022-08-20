
package com.daoImpl;

import com.bean.UniversityExamScheduleBean;
import com.client.Client;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class UniversityExamDao {
    private SessionFactory sessionFactory;

    public UniversityExamDao() {
        sessionFactory = Client.transactionManager.getSessionFactory();
    }
    
    public void saveOrUpdateUniversityExam(UniversityExamScheduleBean exam)
    {
        //template.saveOrUpdate(exam);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(exam);
        transaction.commit();
        session.close();
    }
    
    public UniversityExamScheduleBean getById(int id)
    {
        //UniversityExamSchedule examTT = template.get(UniversityExamScheduleBean.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        UniversityExamScheduleBean getTT = session.get(UniversityExamScheduleBean.class, id);
        transaction.commit();
        session.close();
        return getTT;
    }
    
    public List<UniversityExamScheduleBean> getByProperties(String department, String academicClass)
    {
        //GuestLectureTT getTT = template.get(GuestLectureTT.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<UniversityExamScheduleBean> authenticate = builder.createQuery(UniversityExamScheduleBean.class);
        Root<UniversityExamScheduleBean> root = authenticate.from(UniversityExamScheduleBean.class);
                                    authenticate.where(
                                            builder.and(
                                            builder.equal(root.get("department"), department),
                                            builder.equal(root.get("academicClass"), academicClass)
                                    ));
        List<UniversityExamScheduleBean> listTT = session.createQuery(authenticate).getResultList();
        
        transaction.commit();
        session.close();
        
        return listTT;
    }
    
    public List<UniversityExamScheduleBean> getAll()
    {
        //GuestLectureTT getTT = template.get(GuestLectureTT.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<UniversityExamScheduleBean> query = builder.createQuery(UniversityExamScheduleBean.class);
        Root<UniversityExamScheduleBean> root = query.from(UniversityExamScheduleBean.class);
        
        List<UniversityExamScheduleBean> list = session.createQuery(query).getResultList();
        
        transaction.commit();
        session.close();
        
        return list;
    }
}
