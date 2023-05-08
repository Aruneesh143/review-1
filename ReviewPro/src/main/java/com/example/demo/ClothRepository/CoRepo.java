package com.example.demo.ClothRepository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ClothModel.ClothDet;
@Repository

public interface CoRepo extends JpaRepository<ClothDet,Integer>{

//	List<FoodDet> getFood();
	

}
