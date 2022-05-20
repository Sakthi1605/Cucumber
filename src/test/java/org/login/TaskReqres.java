package org.login;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TaskReqres {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		
		FileReader reader = new FileReader("D:\\TestLeaf\\Softwares\\64_bit\\eclipse_64Bit\\eclipse\\mavenworkspace\\APIDay1\\src\\test\\resources\\API1\\APItest");
		
		
		
		JSONParser jsonparser = new JSONParser();
		
		
		Object obj = jsonparser.parse(reader);
		
		
		JSONObject j = (JSONObject) obj;
		
		
	      Object dataname = j.get("data");
		
		System.out.println(dataname);
		
		
	Object supportname = j.get("support");
		
		
		System.out.println(supportname);
		
		JSONObject j1 = (JSONObject) supportname;
		
		Object url = j1.get("url");
		
		System.out.println(url);
		
		Object object = j1.get("text");
		
		System.out.println(object);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
