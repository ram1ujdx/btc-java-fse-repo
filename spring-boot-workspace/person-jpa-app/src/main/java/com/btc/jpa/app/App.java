package com.btc.jpa.app;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.btc.jpa.app.model.Person;

public class App 
{
    public static void main( String[] args )
    {
        
    	EntityManagerFactory factory=Persistence.createEntityManagerFactory("person.pu");
    	EntityManager entityManager=factory.createEntityManager();
    	EntityTransaction tx=entityManager.getTransaction();
    	
    	
    	// Add a new Person
    	
//    	Person person1=new Person(1001,"Rahul","rahul@yahoo.com",LocalDate.of(1995, 5, 25));
//    	Person person2=new Person(1002,"Mahesh","mahesh@yahoo.com",LocalDate.of(1993, 10, 25));
//    	Person person3=new Person(1003,"Gaurav","gaurav@yahoo.com",LocalDate.of(1992, 5, 20));
//    	
//    	tx.begin();
//    	entityManager.persist(person2);
//    	entityManager.persist(person3);
//    	tx.commit();
    	
    	
//    	// Fetching The Data
//    	
//    	Person person=entityManager.find(Person.class, 1001L);
//    	
//    	System.out.println(person);
//    	
//    	
//    	// Update The Data
//    	
//    	person.setEmail("rahul101@gmail.com");
//    	
//    	tx.begin();
//    	entityManager.persist(person);
//    	
//    	tx.commit();
    	
    	
    	// Delete Data
    	
    	
//    	Person person=entityManager.find(Person.class, 1001L);
//    	
//    	tx.begin();
//    	
//    	entityManager.remove(person);
//    	tx.commit();

    	
    	
    }
}
