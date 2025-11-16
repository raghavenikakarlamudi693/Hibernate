package com.raghaveni.hibermateDemo;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	private int Id;
	private String NAME;
	private String EMAIL;
	private String ADDRESS;
	private String COUNTRY;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getCOUNTRY() {
		return COUNTRY;
	}
	
	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", NAME=" + NAME + ", EMAIL=" + EMAIL + ", ADDRESS=" + ADDRESS + ", COUNTRY="
				+ COUNTRY + "]";
	}
	
	

}
