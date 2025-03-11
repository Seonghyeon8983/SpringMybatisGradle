package data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SawonController {
	@GetMapping({"/","/list"})
	public String sawonList() 
	{
		return "sawon/sawonlist";
	}
	
	
	
}
