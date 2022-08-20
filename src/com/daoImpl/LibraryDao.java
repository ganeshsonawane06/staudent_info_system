
package com.daoImpl;

import com.bean.LibraryBean;
import com.client.Client;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class LibraryDao<T, V> {
    
    private SessionFactory sessionFactory;

    public LibraryDao() {
        sessionFactory = Client.transactionManager.getSessionFactory();
    }

    
    public void saveOrUpdateStudent(LibraryBean library)
    {
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(library);
        transaction.commit();
        session.close();
    }
    
    public LibraryBean getById(long id)
    {
        //StudentRegistration getStudent = template.get(StudentRegistration.class, id);
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        LibraryBean getDetails = (LibraryBean) session.load(LibraryBean.class, id);
        //System.out.println(getStudent.toString());
        transaction.commit();
        return getDetails;
    }
    
    public List<LibraryBean> getByProperties(long studentID)
    {
        //GuestLectureTT getTT = template.get(GuestLectureTT.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<LibraryBean> library = builder.createQuery(LibraryBean.class);
        Root<LibraryBean> root = library.from(LibraryBean.class);
                             library.where(
                                builder.and(
                                    builder.equal(root.get("studentID"), studentID)));
        List<LibraryBean> listLibrary = session.createQuery(library).getResultList();
        
        transaction.commit();
        session.close();
        
        return listLibrary;
    }
    
    public List<LibraryBean> getALL()
    {
        //GuestLectureTT getTT = template.get(GuestLectureTT.class, id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<LibraryBean> query = builder.createQuery(LibraryBean.class);
        Root<LibraryBean> root = query.from(LibraryBean.class);
        
        List<LibraryBean> list = session.createQuery(query).getResultList();
        
        transaction.commit();
        session.close();
        
        return list;
    }
    
    public long getIDFromProperties(
                                String property_1, V value_1, 
                                String property_2, V value_2, 
                                String property_3, V value_3, 
                                String property_4, V value_4, 
                                String property_5, V value_5,
                                String property_6, V value_6)
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Long> query = builder.createQuery(Long.class);
        Root<LibraryBean> root = query.from(LibraryBean.class);
        
                                query.select(root.get("id"));
                                query.where(
                                        builder.equal(root.get(property_1),value_1),
                                        builder.equal(root.get(property_2),value_2),
                                        builder.equal(root.get(property_3),value_3),
                                        builder.equal(root.get(property_4),value_4),
                                        builder.equal(root.get(property_5),value_5),
                                        builder.equal(root.get(property_6),value_6)
                                    );
                                
        long id = session.createQuery(query).getSingleResult();
        transaction.commit();
        session.close();
        
        return id;
    }
    
    /*public static void main(String[] args) {
        System.out.println(new LibraryDao().getIDFromProperties(
                "studentID", "2498487984849",
                "bookID", "GTD7856",
                "bookName", "Object Opriented Programing",
                "issueDate", "01/03/2017",
                "submitDate", "25/03/2017",
                "fine", "0"
        ));
    }*/
}
