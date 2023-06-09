package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Meta;
import com.Service.MyService;

@RestController
public class MyController {

	@Autowired
	private MyService is;
	
	@GetMapping("/show")
	public List<Meta> showAllEmp() {
		System.out.println("hII");
		return is.showAllEmp();
		
	}
	@PostMapping("/insertemp")
	// Insert Method
	public String InsertEmp(@RequestBody Meta info) {
		return is.InsertEmp(info);
	}
	
	// update
	@PutMapping("/updateEmp")
	public String UpdateEmp(@RequestBody Meta info) {
		return is.UpdateEmp(info);
	}
	
	// delete method
	@DeleteMapping("/deleteemp")
	public String DeleteEmp(Meta info) {
		return is.DeleteEmp(info);
	}
	
}
