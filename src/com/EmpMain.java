package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session ses=factory.openSession();
		
		  ContractEmp e=new ContractEmp(); e.setId(7890); e.setName("Radha");
		  e.setAddress("Delhi"); e.setContract_duration(4); e.setPay_per_hr(4000);
		  ses.save(e);
		 
		/*
		 * RegEmp e=new RegEmp(); e.setId(108); e.setName("Tandy");
		 * e.setAddress("Nashik"); e.setBonus(4000); e.setSalary(15000); ses.save(e);
		 */
		Transaction tx=ses.beginTransaction();
		tx.commit();
		System.out.println("Success");

		

	}

}
