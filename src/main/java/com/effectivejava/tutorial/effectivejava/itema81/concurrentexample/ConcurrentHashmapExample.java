package com.effectivejava.tutorial.effectivejava.itema81.concurrentexample;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapExample {
	
	public static void main(String[] args) {

		Map<String, String> cityTemperatureMap = new ConcurrentHashMap<String, String>();
		cityTemperatureMap.put("Delhi", "24");
		cityTemperatureMap.put("Mumbai", "32");
		cityTemperatureMap.put("Chennai", "35");
		cityTemperatureMap.put("Bangalore", "22");
		
		for (Map.Entry<String, String> entry : cityTemperatureMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
			if (entry.getKey().equals("Delhi")) {
				cityTemperatureMap.remove(entry.getKey());
			}
		}
		
		
		System.out.println("----------------------------------------");
		
		for (String key : cityTemperatureMap.keySet()) {
			System.out.println(key + ":" + cityTemperatureMap.get(key));
		}
		
		System.out.println("----------------------------------------");
		
		Iterator<Map.Entry<String, String>> iterator = cityTemperatureMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());

		}
		
	}


}
