package com.example.demo.ClothService;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.ClothModel.ClothDet;
import com.example.demo.ClothModel.ClothDetails;
import com.example.demo.ClothRepository.ClothRepo;
import com.example.demo.ClothRepository.CoRepo;

@Service

public class ClothService {
	@Autowired
	ClothRepo repository;
	@Autowired
	CoRepo repos;
	public String addCloth(ClothDetails cloth)
	{
		repository.save(cloth);
		return "Added";
	}
	public List<ClothDetails> getCloth()
	{
		return repository.findAll();
	}
	public Optional<ClothDetails> getClothById(int id)
	{
		return repository.findById(id);
	}
	public String updateCloth(ClothDetails cloth)
	{
		repository.save(cloth);
		return "Updated";
	}
	public void deleteByRequestParam(int id)
	{
		repository.deleteById(id);
}
	public List<ClothDetails> getSorted(String field)
	{
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public List<ClothDetails>getWithPagination(int offset,int pagesize)
	{
        Page<ClothDetails> fo=repository.findAll(PageRequest.of(offset,pagesize));
        	return fo.getContent();
	}
	public ClothDet saveClothDet(ClothDet f)
	{
		return repos.save(f);
	}
//	public List<FoodDet> getAllFood()
//	{
//		return repos.getFood();
//	}
	
}
