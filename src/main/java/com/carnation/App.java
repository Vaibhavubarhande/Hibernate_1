package com.carnation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App{
	
    public static void main( String[] args ){
    
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class); //Config utha 
    	
    	SessionFactory sf = cfg.buildSessionFactory(); //Session build kr
    	
    	Session session = sf.openSession(); //session open kr
    	
    	session.beginTransaction(); //session start kr
    	
    	Employee e1 = new Employee();
    	
    	e1.setName("aliya");
    	e1.setAddress("mumbai");
    	e1.setDept("film");
    	
    	session.save(e1); //to save data in database table ....Insert into command
    	
    	Employee e2 = new Employee();
    	
    	e2.setName("ranbir");
    	e2.setAddress("nalasopara");
    	e2.setDept("film");
    	
    	session.save(e2);
    	
    	Employee e3 = new Employee();
    	
    	e3.setName("Akshay");
    	e3.setAddress("Mumbai");
    	e3.setDept("film");
    	
    	session.save(e3);
    	
    	session.getTransaction().commit();
    	session.close(); //session close kr
    	
    }
}
