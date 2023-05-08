package com.example.demo.ClothRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ClothModel.LoginModel;



public interface LoginRepo extends JpaRepository<LoginModel,Integer>{
	LoginModel findByusername(String username);

}
