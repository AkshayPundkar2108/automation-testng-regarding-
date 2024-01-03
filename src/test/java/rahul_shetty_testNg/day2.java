package rahul_shetty_testNg;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups={"Smoke"})
	public void p_loan() {
		System.out.println("p_loan testcase-@test");
	}

	@BeforeTest
	public void before_test() {
		System.out.println("before_test");
	}

	@BeforeSuite
	public void before_suite() {
		System.out.println("before_suite");
	}

}
