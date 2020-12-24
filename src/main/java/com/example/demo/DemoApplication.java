package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
//public class DemoApplication {
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello");
		//logger.info("hello from logger");
		String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
		ObjectMapper mapper = new ObjectMapper();
		Map<String,String> map = mapper.readValue(json,HashMap.class);	
		Car car = mapper.readValue(json,Car.class);

		System.out.println("[Main run]::map => " + map);
		System.out.println("[Main run]::car => " + car);
		System.out.println("[Main run]::car.color => " + car.color);
		System.out.println("[Main run]::car.getType() => " + car.getType());

	}

//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}

}
