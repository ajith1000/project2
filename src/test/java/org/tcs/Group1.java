package org.tcs;

import org.testng.annotations.Test;

public class Group1 {

@Test(groups="sanity")
	public void tc1() {
System.out.println("Tc 1");
	}
	@Test(groups="retesting")
	public void tc2() {
System.out.println("Tc 2");
	}
	@Test(groups="smoke")
	public void tc3() {
System.out.println("Tc 3");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
