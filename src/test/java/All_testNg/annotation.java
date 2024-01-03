package All_testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {
	@BeforeSuite
	void before_Suite() {
		System.out.println("before_suite");
	}

//*********************************************************
	@BeforeTest
	void before_test() {
		System.out.println("before_test");
	}

//*********************************************************
	@BeforeClass
	void before_class() {
		System.out.println("before_class");
	}

//*********************************************************
	@BeforeMethod
	void before_method() {
		System.out.println("before_method");
	}

//*********************************************************
	@Test
	void test1() {
		System.out.println("test1");
	}

//*********************************************************
//	@Test
//	void test2() {
//		System.out.println("test2");
//	}

//*********************************************************
	@AfterMethod
	void after_method() {
		System.out.println("after_method");
	}

//*********************************************************
	@AfterClass
	void after_class() {
		System.out.println("after_class");
	}

//*********************************************************
	@AfterTest
	void after_test() {
		System.out.println("after_test");
	}

//*********************************************************
	@AfterSuite
	void after_suite() {
		System.out.println("after_suite");
	}
}