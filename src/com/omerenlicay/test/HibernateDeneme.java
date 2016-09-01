package com.omerenlicay.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.omerenlicay.personel;

public class HibernateDeneme {
	
	public static void main(String[] args) {
		
		personel personel1 =new personel();
		
		//personel1.setPersonelid(1);
		personel1.setPersonelAdi("büþra");
		personel1.setPersonelSoyadi("bacak");
		//--------------------------------------
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session =sessionFactory.openSession();
		
		
		session.beginTransaction();
		session.save(personel1);
		session.getTransaction().commit();
	
		
	
	}
}
