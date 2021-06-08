package com.btc.jpa.app;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.btc.jpa.app.model.Laptop;
import com.btc.jpa.app.model.Person;

public class App 
{
    public static void main( String[] args )
    {
        
    	EntityManagerFactory factory=Persistence.createEntityManagerFactory("person.pu");
    	EntityManager entityManager=factory.createEntityManager();
    	EntityTransaction tx=entityManager.getTransaction();
    	
    	
    	// Add a new Person
    	
//    	Person person1=new Person("Rahul","rahul@yahoo.com",LocalDate.of(1995, 5, 25));
//    	Person person2=new Person(1002,"Mahesh","mahesh@yahoo.com",LocalDate.of(1993, 10, 25));
//    	Person person3=new Person(1003,"Gaurav","gaurav@yahoo.com",LocalDate.of(1992, 5, 20));
//    	
//    	tx.begin();
//    	entityManager.persist(person1);
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

    	//	Fetch all Persons
    	
//    	TypedQuery<Person> findAll=entityManager.createQuery("from Person",Person.class);
//    	List<Person> persons=findAll.getResultList();
//    	
//    	persons.forEach(p->System.out.println(p));
    	
    	// Typed Query
    	
//    	TypedQuery<Person> findByName=entityManager.createQuery("from Person where personName=:person_name",Person.class);
//    	findByName.setParameter("person_name", "Mahesh");
//    	Person person=findByName.getSingleResult();
//    	
//    	System.out.println(person);
    	
    	// Native Query
    	
//      Query findByName=entityManager.createNativeQuery("select * from person_info where person_name=:person_name",Person.class);
//    	findByName.setParameter("person_name", "Mahesh");
//    	Person person=(Person)findByName.getSingleResult();
//    	
//    	System.out.println(person);
    	
//    	TypedQuery<Person> findByEmail=entityManager.createNamedQuery("findByEmail",Person.class);
//    	findByEmail.setParameter("email", "mahesh@yahoo.com");
//    	Person person=findByEmail.getSingleResult();
//    	System.out.println(person);
    	
    	
    	
    	// JPA Mappings
    	
//    	Person person2=new Person("Mahesh","mahesh@yahoo.com",LocalDate.of(1993, 10, 25));
//    	Person person3=new Person("Gaurav","gaurav@yahoo.com",LocalDate.of(1992, 5, 20));
//    	Laptop laptop1=new Laptop("HP", 8);
//    	Laptop laptop2=new Laptop("Apple", 8);
//    	Laptop laptop3=new Laptop("Dell", 16);
//    	Laptop laptop4=new Laptop("Acer", 16);
//    	
//    	person2.setLaptop(Arrays.asList(laptop1,laptop2));
//    	person3.setLaptop(Arrays.asList(laptop4,laptop3));
//    	laptop1.setPerson(person3);
//    	laptop2.setPerson(person3);
//    	laptop3.setPerson(person2);
//    	laptop4.setPerson(person2);
//    	
//    	tx.begin();
//    	entityManager.persist(person2);
//    	entityManager.persist(person3);
//    	entityManager.persist(laptop2);
//    	entityManager.persist(laptop1);
//    	entityManager.persist(laptop4);
//    	entityManager.persist(laptop3);
//    	
//    	tx.commit();
//    	
//    	
    	
    	// Fetch a person
//    	
    	Person person=entityManager.find(Person.class, 1L);
    	
    	System.out.println(person);
    	
    	
    	
    }
}
