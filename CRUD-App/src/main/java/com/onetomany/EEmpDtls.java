package com.onetomany;

import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class EEmpDtls {
	
	@Id
	private int id;
	private String name;
	
	@OneToMany
	private List<AAddress> address;

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

	public List<AAddress> getAddress() {
		return address;
	}

	public void setAddress(List<AAddress> address) {
		this.address = address;
	}


	
	
	
	
	

}
