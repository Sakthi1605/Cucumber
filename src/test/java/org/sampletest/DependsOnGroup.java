package org.sampletest;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependsOnGroup {
	
	@Test(groups="@smoke")
	private void tc0() {
      System.out.println("Smoke group");
	}
	
	@Test(groups="@reg",dependsOnGroups="@smoke")
	private void tc1() {
      System.out.println("regression group");
	}
	
	@Test(groups="@reg",dependsOnGroups="@smoke")
	private void tc2() {
      System.out.println("regression group");
	}
	
	@Test(groups="smoke")
	private void tc3() {
      System.out.println("smoke group");
	}
	
	
	
    
	@Test(groups="@smoke",alwaysRun=true)
	private void tc5() {
		
      System.out.println("Smoke group");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
