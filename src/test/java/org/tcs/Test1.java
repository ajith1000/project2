package org.tcs;

import org.testng.annotations.Test;

public class Test1 {

	@Test(priority=-5)
	public void tc1() {
		System.out.println("tc1");
	}
	
	@Test(priority=5)
	public void tc2() {
		System.out.println("tc2");
	}
	
	@Test(priority=-2)
	public void tc31() {
		System.out.println("tc3");
	}
	
}
