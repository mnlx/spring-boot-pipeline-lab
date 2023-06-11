package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import com.opencsv.*;
import java.io.FileReader;
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

// Add the controller
@RestController
class HelloWorldController{
	@GetMapping("/")
	public String hello(){
		FileReader filereader;
		try{
			filereader = new FileReader("test.csv");
			CSVReader reader = new CSVReader(filereader);
			String[] nextLine;
			
			
	
			nextLine = reader.readNext();

			System.out.println(nextLine[1]);
		}
		catch(Exception e){
			System.out.println(e);
		}



		return "Hello World! This is a Spring Boot Application.";
	}
}

