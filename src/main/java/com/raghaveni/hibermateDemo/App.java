package com.raghaveni.hibermateDemo;

import java.util.List;

import com.raghaveni.onetoone.Profile;
import com.raghaveni.onetoone.User;

import jakarta.persistence.EntityManager;




import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyPU");
    	EntityManager em = emf.createEntityManager();
    	
    	
    	//Students s4 = new Students("Sandhya","Civil");
    	
    	em.getTransaction().begin();
    	
    	//Students s = em.find(Students.class, 2); // Select the student with ID
    	//em.persist(s4); // Insert a row to table students 
    	
    	/*
    	//Select all Students 
    	
    	TypedQuery<Students> q = em.createQuery("SELECT s FROM Students s", Students.class);
    	List<Students> students = q.getResultList();
    	for(Students s: students)
    	{
    		System.out.println(s);
    	}
    	*/
    	
    	/*
    	//Update the table 
    	
    	Students s = em.find(Students.class, 9);
    	s.setBranch("Mech");
    	System.out.println(s);
    	*/
    	
    	/*Delete the row
    	
    	Students s = em.find(Students.class, 2);
    	if(s!=null)
    		em.remove(s);
    	
    	System.out.println("Row is deleted successfully");*/
    	
    	
    	
    	
    	Profile p = em.find(Profile.class, 8);
    	if(p==null)
    	{
    		p=new Profile("Ongole");
    	}
		
		
		User u = em.find(User.class, 7);
		if(u==null)
		{
			u=new User("Niharika",p);
			em.persist(u);
		
			
		}
		
		
		em.getTransaction().commit();
		
		
		
    	
    	em.close();
    	emf.close();
    	
    	System.out.println("Complted");
    	
    	//System.out.println("Students inserted successfully!");
    }
}
