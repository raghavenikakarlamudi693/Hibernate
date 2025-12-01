package com.raghaveni.onetoone;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="app_user")
public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="profile_id")
	private Profile profile;
	
	public int getId() {
		return id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, Profile profile) {
		super();
		this.name = name;
		this.profile = profile;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	

}
