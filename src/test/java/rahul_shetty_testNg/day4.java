package rahul_shetty_testNg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {
	@Test(groups={"Smoke"})
	public void Web_login_home_loan() {
		System.out.println("Web_login_home_loan-@test");
	}

	@BeforeMethod
	public void before_method() {
		System.out.println("Before_method");
	}

	@Test(groups={"Smoke"})
	public void mobile_login_home_loan() {
		System.out.println("mobile_login_home_loan-@test");
	}

	@Test
	public void api_Login_home_loan() {
		System.out.println("api_Login_home_loan-@test");
	}
}
