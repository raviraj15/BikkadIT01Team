package com.BikkadIT.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
	
	
	@GetMapping("/")
	public String Welcome() {
		
		
		
		
		
		return "Welcome";
		
		
	}

	
	public String wellcome()
	{
	System.out.println("WELLCOME TO BIKKAD IT");
		return null;
		
	}
}
