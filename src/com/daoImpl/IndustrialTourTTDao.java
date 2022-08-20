

package com.daoImpl;

import com.bean.IndustrialTourTTBean;
import com.client.Client;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class IndustrialTourTTDao {
    private SessionFactory sessionFactory;

    public IndustrialTourTTDao() {
        sessionFactory = Client.transactionManager.getSessionFactory();
    }
    
    
    public void saveOrUpdateIndustrialTourTT(IndustrialTourTTBean saveOrUpdateIndustrialTourTT)
    {
        //template.saveOrUpdate(saveOrUpdateIndustrialTourTT);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(saveOrUpdateIndustrialTourTT);
        transaction.commit();
        session.close();
    }
    
    public IndustrialTourTTBean getById(int id)
    {
        //IndustrialTourTT getTT = template.get(IndustrialTourTTBean.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        IndustrialTourTTBean getTT = session.get(IndustrialTourTTBean.class, id);
        transaction.commit();
        session.close();
        return getTT;
    }
    
    public List<IndustrialTourTTBean> getByProperties(String department, String academicClass)
    {
        //GuestLectureTT getTT = template.get(GuestLectureTT.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<IndustrialTourTTBean> authenticate = builder.createQuery(IndustrialTourTTBean.class);
        Root<IndustrialTourTTBean> root = authenticate.from(IndustrialTourTTBean.class);
                                    authenticate.where(
                                            builder.and(
                                            builder.equal(root.get("department"), department),
                                            builder.equal(root.get("academicClass"), academicClass)
                                    ));
        List<IndustrialTourTTBean> listTT = session.createQuery(authenticate).getResultList();
        
        transaction.commit();
        session.close();
        
        return listTT;
    }
    
    public List<IndustrialTourTTBean> getAll()
    {
        //GuestLectureTT getTT = template.get(GuestLectureTT.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<IndustrialTourTTBean> query = builder.createQuery(IndustrialTourTTBean.class);
        Root<IndustrialTourTTBean> root = query.from(IndustrialTourTTBean.class);
        
        List<IndustrialTourTTBean> list = session.createQuery(query).getResultList();
        
        transaction.commit();
        session.close();
        
        return list;
    }
}
