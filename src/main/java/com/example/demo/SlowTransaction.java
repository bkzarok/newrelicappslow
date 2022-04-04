package com.example.demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.*;


@RestController
public class SlowTransaction {

	@GetMapping("/getdata")
	public Object[] getData()
	{
		List<String> list = new ArrayList<String>();
	
		Random rand = new Random();	
		String[] array = new String[5000];
		String[] words = {"Kuir Arok", "Spring Boot", "New Relic", "Perfomance Monitoring", "Java"};
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0; i< 5000; i++ )
		{
			list.add(words[rand.nextInt(5)]);
		}
		
		return list.toArray();
	}
	
	

}