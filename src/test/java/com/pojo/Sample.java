package com.pojo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {
	
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file = new File("D:\\TestLeaf\\Softwares\\64_bit\\eclipse_64Bit\\eclipse\\mavenworkspace\\APIDay1\\src\\test\\resources\\API1\\Day2Task");
		
		
		ObjectMapper mapper = new ObjectMapper();
		
	
	      TaskVel r = mapper.readValue(file,TaskVel.class );
		
		int page = r.getPage();
	     System.out.println(page);
	     
		int per_page = r.getPer_page();
		System.out.println(per_page);
		
		int total = r.getTotal();
		System.out.println(total);
		
		int totalpages = r.getTotal_pages();
		
		System.out.println(totalpages);
		
		ArrayList<Datum> data = r.getData();
		
		for (Datum dat : data) {
			System.out.println(dat.getId());
			System.out.println(dat.getEmail());
			System.out.println(dat.getFirst_name());
			System.out.println(dat.getLast_name());
			System.out.println(dat.getAvatar());
			
			
			Support support = r.getSupport();
			System.out.println(support.getUrl());
			System.out.println(support.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
