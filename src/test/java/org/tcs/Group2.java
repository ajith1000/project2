package org.tcs;

import org.testng.annotations.Test;

public class Group2 {

	@Test(groups="smoke")
	public void tc11() {
System.out.println("Tc 11");
	}
	@Test(groups="regression")
	private void tc22() {
System.out.println("Tc 22");
	}
	@Test(groups="sanity")
	private void tc33() {
System.out.println("Tc 33");
	}
	
	
	
	
	
	
	
	
	
	
	
}
