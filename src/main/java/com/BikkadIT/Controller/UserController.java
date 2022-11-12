package com.BikkadIT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.BikkadIT.Service.ServiceI;
import com.BikkadIT.modul.User;

@Controller
public class UserController {
    
	@Autowired
	private ServiceI servicei;
	

	@GetMapping("/welcome")
	public String LoadFrom() {
		
		return "registration";
	}
	@PostMapping("/reg")
	public String userRegistration(User user,Model model) {
		System.err.println("Controller layer Method");
		System.out.println(user);
		User user2 = servicei.saveuser(user);
		
		model.addAttribute("ID",user2);
		return "userSuccess";
	}
}
