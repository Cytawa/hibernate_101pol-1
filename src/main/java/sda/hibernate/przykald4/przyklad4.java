package sda.hibernate.przykald4;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import sda.hibernate.model.Country;
import sda.hibernate.util.HibernateUtil;

public class przyklad4 {

    public static void main(String[] args) {

        Session session= HibernateUtil.getSessionFactory().openSession();

        NativeQuery<Country> nativeQuery=session.createNativeQuery(
                "select * from Country ",
                Country.class);

        nativeQuery.getResultList().forEach(country -> System.out.println(country));





    }
}
