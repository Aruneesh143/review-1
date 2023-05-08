package com.example.demo.ClothModel;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="dressType")
public class ClothDet {
	@Id
	private int id;
	private String dressType;
	private int price;
    private String availability;

	@Override
	public String toString() {
		return "ClothDet [id=" + id + ", dressType=" + dressType + ", price=" + price + ", availability="
				+ availability + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getdressType() {
		return dressType;
	}
	public void setdressType(String DressType) {
		dressType = DressType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}

}
