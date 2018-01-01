package lol;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class LegendsTest {

	public static void main(String[] args) {
		Legends legends = new Legends();
		legends.setHeroname("�������");
		legends.setHerodesc("������־");
		legends.setPosition("�ϵ�");
		
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(serviceRegistry).addAnnotatedClass(Legends.class).getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(legends);
		session.getTransaction().commit();
	}

}
