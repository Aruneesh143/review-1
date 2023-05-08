package com.example.demo.ClothController;

import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ClothModel.ClothDet;
import com.example.demo.ClothModel.ClothDetails;
import com.example.demo.ClothService.ClothService;



@RestController
@RequestMapping("/Cloth")
public class ClothController {
	@Autowired
	ClothService foservice;
	@PostMapping("/value")
	public String create(@RequestBody ClothDetails cloth)
	{
		return foservice.addCloth(cloth);
	}
	@GetMapping("/bro")
	public List<ClothDetails> read()
	{
		return foservice.getCloth();
	}
	@GetMapping("/{id}")
	public Optional<ClothDetails>readById(@PathVariable int id)
	{
		return foservice.getClothById(id);
	}
	@PutMapping("/put")
	public String update(@RequestBody ClothDetails cloth)
	{
		return foservice.updateCloth(cloth);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam("fid") int id)
	{
		foservice.deleteByRequestParam(id);
		return "deleted";
		
	}
	@GetMapping("/{field}")
	public List<ClothDetails>getClothSorted(@PathVariable String field)
	{
		return foservice.getSorted(field);
	}
	@GetMapping("/{offset}/{pagesize}")
	public List<ClothDetails> getFoodPagination(@PathVariable int offset,@PathVariable int pagesize)
	{
		return foservice.getWithPagination(offset,pagesize);
	}
	@PostMapping("/pop")
		public ClothDet saveFoodDet(@RequestBody ClothDet f)
		{
			return foservice.saveClothDet(f);
		}
//	@GetMapping("/bob")
//	public List<FoodDet> getAllFood()
//	{
//		return foservice.getAllFood();
//	}

}
