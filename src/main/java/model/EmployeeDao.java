package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EmployeeDao {

    private Configuration configuration;
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;
    public void saveData(Employee employee) {


        configuration = new Configuration().configure("hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();

        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        session.persist(employee);
        transaction.commit();

    }

    public List displayData() {

        configuration = new Configuration().configure("hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();

        session = sessionFactory.openSession();

        transaction = session.beginTransaction()    ;
        List list = session.createQuery("from  Employee ").list();

        return list;



    }
}
