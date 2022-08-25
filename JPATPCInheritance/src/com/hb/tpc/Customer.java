package com.hb.tpc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Customer {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//Employee
		EmployeeFirst employee = new EmployeeFirst();
		employee.setName("Riya");
		employee.setSalary(10000);
		em.persist(employee);
		
		//Manager
		ManagerFirst mgr = new ManagerFirst();
		mgr.setName("Meera");
		mgr.setSalary(25000);
		mgr.setDepartmentName("Sales");
		em.persist(mgr);
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database");
		em.close();
		factory.close();
		
	}

}
