package com.example.JavaComplete.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heelo")
public class Mycontroller {
@GetMapping("/result")
public String name()
{
return "Prajjwal sharm";
}


	
	
	
	
}