package com.optionals;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapWithoutOptional {

	public static void main(String[] args) {
		
		Map<String, String> myMap = new HashMap<>();
		myMap.put("Jatin", "Arora");
		myMap.put("Preeti", "Miglani");
		myMap.put("Kapil", "Arora");
		
		String fName = "Preti";
		
		/*
		String lName = myMap.get(fName);
    	lName = lName.toUpperCase();
    	lName = "Dear Mx. " + lName;
    	System.out.println(lName);
		*/

		Optional<Map<String, String>> mapOpt = Optional.of(myMap);
    	
    	mapOpt.map(m -> m.get(fName)).map(m -> m.toUpperCase())
    	.map(m -> "Dear Mx. " + m)
    	.ifPresent(m -> System.out.println(m));
	}
}
