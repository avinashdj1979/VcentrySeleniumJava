package edu.vcentry.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		//Insertion order will be maintained.
		Map<String, String>  steps = new LinkedHashMap<String, String>();
		steps.put("step1", "Learn Java Basics");
		steps.put("step2", "Learn Selnium");
		steps.put("step3", "Attend Interviews");
		steps.put("step4", "Get Hired");
		
		System.out.println(":::::::::: Using For Each Element loop ::::::::::");
		for(Map.Entry<String, String> step : steps.entrySet()) {
			System.out.printf("%s :: %s\n", step.getKey(), step.getValue());
		}
		
		System.out.println(":::::::::: Using Lambda ::::::::::");
		steps.forEach((k,v) -> System.out.printf("%s :: %s\n", k, v));
	}
}
