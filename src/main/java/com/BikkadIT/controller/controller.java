package com.BikkadIT.controller;

<<<<<<< HEAD


=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
>>>>>>> d343ad0a1980c6492fd56fb190fa9e30c8fc508b
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
