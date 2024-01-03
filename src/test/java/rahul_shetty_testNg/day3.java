package rahul_shetty_testNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day3 {
	@Test
	public void Web_login_car_loan() {
		System.out.println("Web_login_car_loan-@test");
	}

	@AfterSuite
	public void after_suite() {
		System.out.println("After_Suite");
	}

	@Test
	public void mobile_login_car_loan() {
		System.out.println("mobile_login_car_loan 0-@test");
	}

	@Test
	public void mobile_login_car_loan1() {
		System.out.println("mobile_login_car_loan 1-@test");
	}

	@Test
	public void mobile_login_car_loan2() {
		System.out.println("mobile_login_car_loan 2-@test");
	}

	@Test
	public void mobile_login_car_loan3() {
		System.out.println("mobile_login_car_loan 3-@test");
	}

	@Test
	public void mobile_login_car_loan4() {
		System.out.println("mobile_login_car_loan 4-@test");
	}

	@Test
	public void api_Login_car_loan() {
		System.out.println("api_Login_car_loan-@test");
	}

	@AfterTest
	public void after_test() {
		System.out.println("after_test");
	}

}
