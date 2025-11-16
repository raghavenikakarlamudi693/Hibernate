package com.raghaveni.hibermateDemo;

import java.util.List;

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
    	
    	//Delete the row
    	
    	Students s = em.find(Students.class, 2);
    	if(s!=null)
    		em.remove(s);
    	
    	System.out.println("Row is deleted successfully");
    	
    	
    	em.getTransaction().commit();
    	
    	
    	em.close();
    	emf.close();
    	
    	//System.out.println("Students inserted successfully!");
    }
}
