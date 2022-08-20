
package com.daoImpl;

import com.bean.ClassTimeTableBean;
import com.client.Client;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ClassTimeTableDao<T, V> {
    private SessionFactory sessionFactory;

    public ClassTimeTableDao() {
        sessionFactory = Client.transactionManager.getSessionFactory();
    }
    
    public void save(ClassTimeTableBean bean)
    {
        //template.saveOrUpdate(saveOrUpdateClassTT);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(bean);
        transaction.commit();
        session.close();
    }
    
    public void saveOrUpdate(ClassTimeTableBean bean)
    {
        //template.saveOrUpdate(saveOrUpdateClassTT);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(bean);
        transaction.commit();
        session.close();
    }
    
    public ClassTimeTableBean getById(long id)
    {
        //ClassTimeTable getTT = template.get(ClassTimeTableBean.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        ClassTimeTableBean getTT = (ClassTimeTableBean) session.load(ClassTimeTableBean.class, id);
        
        transaction.commit();
        //session.close();
        return getTT;
    }
    
    public List<ClassTimeTableBean> getByProperties(String department, String academicClass)
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<ClassTimeTableBean> authenticate = builder.createQuery(ClassTimeTableBean.class);
        Root<ClassTimeTableBean> root = authenticate.from(ClassTimeTableBean.class);
                                    authenticate.where(
                                            builder.and(
                                                    builder.equal(root.get("department"), department),
                                                    builder.equal(root.get("academicClass"), academicClass)
                                            ));
                                    
        List<ClassTimeTableBean> listTT = session.createQuery(authenticate).getResultList();
        
        transaction.commit();
        session.close();
        return listTT;
    }
    
    public List<ClassTimeTableBean> getAll()
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<ClassTimeTableBean> query = builder.createQuery(ClassTimeTableBean.class);
        Root<ClassTimeTableBean> root = query.from(ClassTimeTableBean.class);
                                        
        List<ClassTimeTableBean> list = session.createQuery(query).getResultList();
        
        transaction.commit();
        session.close();
        return list;
    }
    
    public void updateProperty(long id, String property, V value)
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaUpdate<ClassTimeTableBean> updateQuery = builder.createCriteriaUpdate(ClassTimeTableBean.class);
        Root<ClassTimeTableBean> root = updateQuery.from(ClassTimeTableBean.class);
                                   updateQuery.set(root.get(property), value);
                                   updateQuery.where(
                                                builder.equal(root.get("ID"), id)
                                            );
        session.createQuery(updateQuery).executeUpdate();
        
        transaction.commit();
        session.close();
    }
    
    public Long getMaxID(String property)
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Long> query = builder.createQuery(Long.class);
        Root<ClassTimeTableBean> root = query.from(ClassTimeTableBean.class);
                                        query.select(
                                            builder.max(root.get(property).as(Long.class)
                                            ));
        Long maxID = session.createQuery(query).getSingleResult();
        
        transaction.commit();
        //session.close();
        return  maxID;
    }
    
    /*public List<ClassTimeTableBean> getByAProperty(String property)
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        /*CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<ClassTimeTableBean> authenticate = builder.createQuery(ClassTimeTableBean.class);
        Root<ClassTimeTableBean> root = authenticate.from(ClassTimeTableBean.class);
                                    /*authenticate.where(
                                                    builder.equal(root.get(property), value)
                                                );
                                    List<javax.persistence.criteria.Order> order = new ArrayList();
                                    order.add(javax.persistence.criteria.Order.asc(property));
                                    
                                    authenticate.orderBy(order);
        List<ClassTimeTableBean> listTT = builder.createQuery
        List<ClassTimeTableBean> listTT = session.createQuery(authenticate).getResultList();
        
        List<ClassTimeTableBean> listTT = session.createQuery("select * from classtimetable ctt order by ctt.id", ClassTimeTableBean.class).getResultList();
        transaction.commit();
        session.close();
        return listTT;
    }
    
    public static void main(String[] args) {
        List<ClassTimeTableBean> result = new ClassTimeTableDao().getByAProperty("id");
        for(ClassTimeTableBean bean : result)
            System.out.println(bean.toString());
    }*/
}
