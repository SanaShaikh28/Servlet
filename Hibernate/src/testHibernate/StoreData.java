package testHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {

		// creating configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the configuration file

		// creating session factory object
		SessionFactory factory = cfg.buildSessionFactory();

		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction transaction = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setId(115);
		e1.setFirstName("abc");
		e1.setLastName("xyz");

		session.persist(e1);// persisting the object

		transaction.commit();// transaction is comitted
		session.close();

		System.out.println("successfully saved");

	}

}
