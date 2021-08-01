package com.effectivejava.tutorial.effectivejava.itema62;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestDrive {
	
	public static String getMessage(String payload)
	{
		ObjectMapper mapper = new ObjectMapper();
		String name = "";
		int code = 0;
		try {
			JsonNode node = mapper.readTree(payload);
			name = node.get("name").asText();
			code = node.get("code").asInt();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}
	
	public static void main(String[] args) {
		
		String payload = "{\r\n    \"name\": \"Mr.Sonmez\",\r\n    \"code\": \"1234\"\r\n}";
		System.out.println(getMessage(payload));
		
	}
	
}
