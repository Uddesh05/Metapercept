package com.Dao;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.Meta;



@Repository
public class MyDao {

	@Autowired
	SessionFactory sf;

	// create Method
	public List<Meta> showAllEmp() {
		Session session =sf.openSession();
		Criteria criteria = session.createCriteria(Meta.class);
		List<Meta> list = criteria.list();
		System.out.println("Hello dao");
		System.out.println(list);
		return list;
	}
		
	// Insert method
	public String InsertEmp(Meta info) {
		// hibernate...
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(info);
		tr.commit();
		return "Data Inserted Successfully";
	}
	
	
	//Update Method
	public String UpdateEmp(Meta info) {
		// hibernate...
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(info);
		tr.commit();
		return "Data Updated Successfully";
	}

	
	// delete method
	
	public String DeleteEmp(Meta info) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		// agar koi delete krna hoga to use pahale load krna hoga ..
	    	session.load(info, 3);
		session.delete(info);
		tr.commit();
		return "Data Deleted Successfully";
	}
	
}
