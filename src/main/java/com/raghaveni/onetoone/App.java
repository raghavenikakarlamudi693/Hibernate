package com.raghaveni.onetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyPU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Profile p = em.find(Profile.class, 9);
		if(p==null)
		{
			p=new Profile("Vizag");
		}
		
		User u = em.find(User.class, 8);
		if(u==null)
		{
			u=new User("Varun",p);
			em.persist(u);
		}
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
