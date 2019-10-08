package com.denizturkmen.Client;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.denizturkmen.Entity.Person;
import com.denizturkmen.Util.HibernateUtil;

public class TestClient {
	public static void main(String[] args) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			Person person1 = new Person();
			person1.setName("Deniz TÜRKMEN");
			person1.setEmail("turkmen@gmail.com");
			
			Person person2 = new Person();
			person2.setName("Eren TÜRKMEN");
			person2.setEmail("turkmens@gmail.com");
			
			Person person3 = new Person();
			
			person3.setEmail("turkmens@gmails.com");
			
			session.beginTransaction();
			session.save(person1);
			session.save(person2);
			session.save(person3);
			session.getTransaction().commit();
			
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}
}