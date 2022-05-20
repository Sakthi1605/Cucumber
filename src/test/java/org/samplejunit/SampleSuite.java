package org.samplejunit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({JunitFb.class})

public class SampleSuite {
	
	
	public static void main(String[] args) {
		
		
		Result r = JUnitCore.runClasses(JunitFb.class);
		
		
		int runCount = r.getRunCount();
		System.out.println(runCount);
		
		
		int igc = r.getIgnoreCount();
		System.out.println(igc);
		
		int fc = r.getFailureCount();
		System.out.println(fc);
		
		List<Failure> failures = r.getFailures();
		for (int i = 0; i < failures.size(); i++) {
			Failure failure = failures.get(i);
			System.out.println(failure);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
