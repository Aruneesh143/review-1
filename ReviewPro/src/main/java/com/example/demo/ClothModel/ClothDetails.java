package com.example.demo.ClothModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "foodie")

public class ClothDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Type;
	private String Name;
	private int Ratings;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cloth_id")
	private ClothDet clothid;
	@Override
	public String toString() {
		return "ClothDetails [id=" + id + ", Type=" + Type + ", Name=" + Name + ", Ratings=" + Ratings + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRatings() {
		return Ratings;
	}
	public void setRatings(int ratings) {
		Ratings = ratings;
	}
	public ClothDet getClothid() {
		return clothid;
	}
	public void setClothid(ClothDet foodid) {
		this.clothid = foodid;
	}
}
	