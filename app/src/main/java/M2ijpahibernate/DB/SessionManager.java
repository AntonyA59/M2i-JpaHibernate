package M2ijpahibernate.DB;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager {
    public static Session session;

    public static Session openSession() {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        return session;
    }

}
