package database.hibernet;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * created by ravibhushan.k on 06/02/19
 */
public class SimpleDataRead {
    public static SessionFactory factory;
    public static void main(String[] main) throws Exception{
        factory = new Configuration()
                .configure()
                .addPackage("hibernate.cfg.xml")
                .addAnnotatedClass(House.class)
                .buildSessionFactory();
        SimpleDataRead simpleDataRead = new SimpleDataRead();
        simpleDataRead.listEmployees();
        System.out.println("Ravi Done");
        simpleDataRead.listEmployees();
        System.out.println("Ravi Done.");
    }

    public void listEmployees() {
        Session session = factory.openSession();
        Transaction tx =null;

        try{
            tx = session.beginTransaction();
            List<House> houses = session.createQuery("FROM House").list();
            for(House house:houses) {
                System.out.println(house.toString());
            }
            session.flush();
            session.clear();
        } catch (HibernateException e) {
            if(tx != null) {
                tx.rollback();
                e.printStackTrace();
            }
        } finally {
            session.close();
        }
    }
}
