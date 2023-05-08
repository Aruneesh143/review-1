package com.example.demo.ClothRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.ClothModel.ClothDetails;
@Repository

public interface ClothRepo extends JpaRepository<ClothDetails,Integer> {

}
