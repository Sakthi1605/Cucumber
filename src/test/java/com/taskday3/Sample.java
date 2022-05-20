package com.taskday3;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {
	
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		
		File file = new File("D:\\TestLeaf\\Softwares\\64_bit\\eclipse_64Bit\\eclipse\\mavenworkspace\\APIDay1\\src\\test\\resources\\API1\\Day3");
		
		ObjectMapper mapper = new ObjectMapper();
		
		ArrayList<Datum> details = new ArrayList<Datum>();
	    
		
		Datum d1 = new Datum(2, "vj12@gmail.com", "sakthi", "vj","robot");
		Datum d2 = new Datum(3, "sak23@gmail.com", "saran", "jk", "anniyan");
		Datum d3 = new Datum(4, "abu@12gmail.com", "dinesh", "pq", "endhiran");
		
		details.add(d1);
		details.add(d2);
		details.add(d3);
		
		
		SupportDay3 spd = new SupportDay3("www.facebook.com", "Annapoorani");
		
		
		TaskVelu3 tsk3 = new TaskVelu3(2, 54, 110, 166,details, spd);
		
		mapper.writeValue(file, tsk3);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
