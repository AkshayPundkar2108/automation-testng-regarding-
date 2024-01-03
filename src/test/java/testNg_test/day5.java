package testNg_test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day5 {
	@BeforeClass
	public void Before_class() {
		System.out.println("before-class");
	}

	@AfterClass
	public void after_class() {
		System.out.println("after_class");
	}

	@BeforeMethod
	public void before_method() {
		System.out.println("before_method");
	}

	@Test
	public void test1() {
		System.out.println("my test-1");
	}

	@Test
	public void test2() {
		System.out.println("my test-2");
	}

	@Test
	public void test3() {
		System.out.println("my test-3");
	}

	@Test
	public void test4() {
		System.out.println("my test-4");
	}

	@Test
	public void test5() {
		System.out.println("my test-5");
	}

	@AfterMethod
	public void after_method() {
		System.out.println("after_method");
	}

}
