package com.example.JavaComplete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCompleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCompleteApplication.class, args);
		System.out.println("Prajjwal sharma");
		int a=1;// one byte of memory is allocation once it is declared
		System.out.println(a);
		int arr[] = new int[4];
		System.out.println(arr[3]);
	}

}
