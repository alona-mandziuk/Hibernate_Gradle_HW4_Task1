package org.example;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

class HibernateUtil {
    private static SessionFactory factory;
    static {
        try{
            factory = new AnnotationConfiguration().configure().buildSessionFactory();
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }
    public static SessionFactory getSessionFactory (){
        return factory;
    }
}
