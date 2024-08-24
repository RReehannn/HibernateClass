package com.prog;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	@Column(name="coll_name")
	private String collagename;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollagename() {
		return collagename;
	}
	public void setCollagename(String collagename) {
		this.collagename = collagename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", collagename=" + collagename
				+ ", email=" + email + ", getId()=" + getId() + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getCollagename()=" + getCollagename() + ", getEmail()=" + getEmail()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public Student(int id, String name, String address, String collagename, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.collagename = collagename;
		this.email = email;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
