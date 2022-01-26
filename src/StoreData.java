import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		 Metadata data = new MetadataSources(ssr).getMetadataBuilder().build();
		 
		 SessionFactory factory = data.getSessionFactoryBuilder().build();
		 Session session = factory.openSession();
		 Transaction t = session.beginTransaction();
		 
		 Employee e = new Employee();
		 e.setId(1);
		 e.setFirstName("ak");
		 e.setLastName("ak");
	}

}
