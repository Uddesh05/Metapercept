package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;
@Repository
@Entity
public class Meta {

@Id
private int id;
private String fname;
private String lname;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
@Override
public String toString() {
	return "Entity [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
}



}
