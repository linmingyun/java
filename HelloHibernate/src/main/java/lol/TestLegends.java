package lol;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class TestLegends {

	public static void main(String[] args) {
		Legends legends = new Legends();
		legends.setHeroname("∞¨œ£");
		legends.setHerodesc("∫Æ±˘…‰ ÷");
		legends.setPosition("ADC");
		
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		SessionFactory  sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(legends);
		session.getTransaction().commit();
	}

}
