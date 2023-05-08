package com.example.demo.ClothService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ClothModel.LoginModel;

import com.example.demo.ClothModel.ClothDet;
import com.example.demo.ClothRepository.ClothRepo;

@Service

public class LoginService {
	@Autowired
	private ClothRepo repository;
	public String checkLogin(String username,String password)
	{
		ClothDet user=repository.findByusername(username);
		if(user==null)
		{
			return "no user found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return"Login Succesfull";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public LoginModel addUser(LoginModel cloth)
	{
		return repository.save(cloth);
	}
	public List<LoginModel> getUser()
	{
		return repository.findAll();
	}

}
