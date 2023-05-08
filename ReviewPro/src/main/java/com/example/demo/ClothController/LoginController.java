package com.example.demo.ClothController;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ClothModel.LoginModel;
import com.example.demo.ClothService.LoginService;



@RestController
@RequestMapping("/Clothlover")

public class LoginController {
	@Autowired
	private LoginService loservice;
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=loservice.checkLogin(username,password);
		return result;
	}
	@PostMapping("/ar")
	public LoginModel AddUser(@RequestBody LoginModel cloth)
	{
		return loservice.addUser(cloth);
	}
@GetMapping("/get")
public List<LoginModel> listAll()
{
	return loservice.getUser();
}
}
