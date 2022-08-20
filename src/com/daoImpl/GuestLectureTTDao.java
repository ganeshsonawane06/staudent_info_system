

package com.daoImpl;

import com.bean.GuestLectureTTBean;
import com.client.Client;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class GuestLectureTTDao {
    private SessionFactory sessionFactory;

    public GuestLectureTTDao() {
        sessionFactory = Client.transactionManager.getSessionFactory();
    }
    
    public void saveOrUpdateGuestLectureTT(GuestLectureTTBean saveOrUpdateGuestLectureTT)
    {
        //template.saveOrUpdate(saveOrUpdateGuestLectureTT);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(saveOrUpdateGuestLectureTT);
        transaction.commit();
        session.close();
    }
    
    public GuestLectureTTBean getById(int id)
    {
        //GuestLectureTT getTT = template.get(GuestLectureTTBean.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        GuestLectureTTBean getTT = session.get(GuestLectureTTBean.class, id);
        transaction.commit();
        session.close();
   
        return getTT;
    }
    
    public List<GuestLectureTTBean> getByProperties(String department, String academicClass)
            
    {
        //GuestLectureTT getTT = template.get(GuestLectureTTBean.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<GuestLectureTTBean> authenticate = builder.createQuery(GuestLectureTTBean.class);
        Root<GuestLectureTTBean> root = authenticate.from(GuestLectureTTBean.class);
                                    //authenticate.select(builder.max(root.get("id")));
                                    authenticate.where(
                                            builder.and(
                                            builder.equal(root.get("department"), department),
                                            builder.equal(root.get("academicClass"), academicClass)
                                    ));
        List<GuestLectureTTBean> listTT = session.createQuery(authenticate).getResultList();
        
        transaction.commit();
        session.close();
        
        return listTT;
    }
    
    public List<GuestLectureTTBean> getAll()
            
    {
        //GuestLectureTT getTT = template.get(GuestLectureTTBean.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<GuestLectureTTBean> query = builder.createQuery(GuestLectureTTBean.class);
        Root<GuestLectureTTBean> root = query.from(GuestLectureTTBean.class);
        
        List<GuestLectureTTBean> list = session.createQuery(query).getResultList();
        
        transaction.commit();
        session.close();
        
        return list;
    }
}
