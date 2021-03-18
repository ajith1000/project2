package org.tcs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing {

	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class...");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class....");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("starts before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("ends after method");
	}

	@Test
	public void tc1() {
		System.out.println("Tc1");
	}

	@Test(priority = -3, invocationCount = 2)
	public void tc2() {
		System.out.println("Tc2");
	}

	@Test(priority = 5)
	public void tc3() {
		System.out.println("Tc3");
	}

	@Test(enabled = false)
	public void tc7() {
		System.out.println("Tc5");
	}

	@Test(invocationCount = 5, priority = 2)
	public void tc10() {
		System.out.println("Tc10");
	}

}
