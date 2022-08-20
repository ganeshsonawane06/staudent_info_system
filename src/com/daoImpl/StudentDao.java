
package com.daoImpl;

import com.bean.StudentRegistrationBean;
import com.client.Client;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class StudentDao <T, V>
{
    private SessionFactory sessionFactory;

    public StudentDao() {
        sessionFactory = Client.transactionManager.getSessionFactory();
    }
    
    public void saveOrUpdateStudent(StudentRegistrationBean saveOrUpdateStudent)
    {
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(saveOrUpdateStudent);
        transaction.commit();
        session.close();
    }
    
    public StudentRegistrationBean getById(long id)
    {
        //StudentRegistration getStudent = template.get(StudentRegistrationBean.class, id);
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        StudentRegistrationBean getStudent = (StudentRegistrationBean) session.load(StudentRegistrationBean.class, id);
        //System.out.println(getStudent.toString());
        transaction.commit();
        return getStudent;
    }
    
    public List<StudentRegistrationBean> getAll()
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<StudentRegistrationBean> query = builder.createQuery(StudentRegistrationBean.class);
        Root<StudentRegistrationBean> root = query.from(StudentRegistrationBean.class);
        
        List<StudentRegistrationBean> list = session.createQuery(query).getResultList();
        
        transaction.commit();
        session.close();
        return list;
    }
    
   /* public void test(String property)
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Long> query = builder.createQuery(Long.class);
        Root<StudentRegistrationBean> root = query.from(StudentRegistrationBean.class);
                                             //builder.selectCase(builder.max(root.get(property)));
                                             query.select(builder.max(root.get("id").as(Long.class)));
        Long result = session.createQuery(query).getSingleResult();
        System.out.println(result.toString());
        
        transaction.commit();
        session.close();
    }
    
    public static void main(String[] args) {
        new StudentDao().test("id");
    }*/
}
