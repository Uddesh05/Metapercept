package com.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.MyDao;
import com.Entity.Meta;

@Service
public class MyService {
	@Autowired
	private MyDao ad;
	// create
	public List<Meta> showAllEmp() {
		 return ad.showAllEmp();
	}
	//insert method
public String InsertEmp(Meta info) {
	return ad.InsertEmp(info);
}

// update method
public String UpdateEmp(Meta info) {
	return ad.UpdateEmp(info);
}


// delete method
public String DeleteEmp(Meta info) {
	return ad.DeleteEmp(info);
}
}
