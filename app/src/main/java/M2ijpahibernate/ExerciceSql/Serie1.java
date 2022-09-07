package M2ijpahibernate.ExerciceSql;

import java.util.List;

import org.hibernate.Session;

import M2ijpahibernate.DB.SessionManager;
import M2ijpahibernate.Entity.Inventory;
import jakarta.persistence.TypedQuery;

public class Serie1 {
    
    public static void Exercice1() {
        Session session = SessionManager.openSession();
        TypedQuery<Object> query = session.createNamedQuery("S1E1", Object.class);

        List<Object> languages = query.getResultList();

        for (Object language : languages) {
            System.out.println(language);
        }
    }
    public static void Exercice2(){
        Session session = SessionManager.openSession();
        TypedQuery<Object[]> query = session.createNamedQuery("S1E2", Object[].class);

        List<Object[]> results = query.getResultList();

        for (Object[] result : results) {
            String address = (String) result[0];
            String district = (String)result[1];
            System.out.println(address + " - " + district);
        }
        System.out.println(results.size());
    }

    public static void Exercice3() {
        Session session = SessionManager.openSession();
        TypedQuery<Inventory> query = session.createNativeQuery("SELECT * FROM inventory", Inventory.class);
        List<Inventory> results = query.getResultList();

        for (Inventory inventory : results) {
            System.out.println(inventory.getInventoryId());
            System.out.println(inventory.getFilmId().getFilmId());
            System.out.println(inventory.getStoreId().getStoreID());
            System.out.println(inventory.getLastUpdate());
        }
        System.out.println(results.size());
        
    }
}
