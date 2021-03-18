package org.tcs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeClass
	public void beforClass() {
System.out.println("before class ....");
	}
	@AfterClass
	public void afterClass() {
System.out.println("after class...");
	}
	@BeforeMethod
	public void beforeMethod() {
System.out.println("starts before method");
	}
	@AfterMethod
	public void afterMethod() {
System.out.println("ends after Method");
	}
	@Test
	public void tc1() {
System.out.println("Tc1");
	}
	@Test
	public void tc2() {
System.out.println("Tc2");
	}
	@Test
	public void tc3() {
System.out.println("Tc3");
	}
	
	
	
	
	
}
