package com.raghaveni.hibermateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Orders {
	@Id
    @Column(name = "ID")
    private int id;

    @Column(name = "PLATFORM", length = 20)
    private String platform;

    @Column(name = "ADDRESS", length = 30)
    private String address;

    @Column(name = "PAYMENTTYPE", length = 10)
    private String paymentType;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	@Override
	public String toString() {
		return "Orders [Id=" + id + ", platform=" + platform + ", address=" + address + ", paymentType=" + paymentType
				+ "]";
	}
	

}
