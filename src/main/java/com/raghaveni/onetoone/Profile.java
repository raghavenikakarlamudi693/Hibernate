package com.raghaveni.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="profile")
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	public int getId() {
		return id;
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Profile(String address) {
		super();
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Profile [id=" + id + ", address=" + address + "]";
	}
	

}
