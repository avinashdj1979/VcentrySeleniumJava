package edu.vcentry.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		Map<String, String>  steps = new LinkedHashMap<String, String>();

		steps.put("step1", "Learn Java Basics");
		steps.put("step2", "Learn Selnium");
		steps.put("step3", "Attend Interviews");
		steps.put("step4", "Get Hired");
		
		System.out.println(steps.get("step1"));
		
		//Set<Map.Entry<String, String>>  step1 = steps.entrySet();

		System.out.println(":::::::::: Using Map.Entry ::::::::::");
		for(Map.Entry<String,String> step : steps.entrySet()) {
			System.out.printf("Key:%s~~Value:%s\n", step.getKey(), step.getValue());
		}
		
		System.out.println(":::::::::: Using Lambda ::::::::::");
		steps.forEach((k,v) -> System.out.printf("%s ~~ %s\n", k, v));
		
		System.out.println(steps.get("step5"));
		System.out.println(steps.getOrDefault("step5", "No maching Step"));
		System.out.println(steps.getOrDefault("step2", "No maching Step"));  		
	} 
}
