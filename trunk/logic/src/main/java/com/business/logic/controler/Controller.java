package com.business.logic.controler;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prajjwal")
public class Controller {

@GetMapping("/timecomp")

public String timetaken() {
	
	Date t= new Date();
	System.out.println(t);
	Long n= 100000000L;
	for(Long i=0L;i<n;i++)
	{
		
	}
	System.out.println("");
	Date g= new Date();
	System.out.println(g);
	return "1";
	
}
	
}


