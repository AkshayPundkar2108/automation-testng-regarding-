package rahul_shetty_testNg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void first_Test() {
		System.out.println("my first testcase-@test");
		Assert.assertTrue(false);
	}

	@AfterMethod
	public void after_method() {
		System.out.println("after_method");
	}

	@Test(groups={"Smoke"})
	public void second_Test() {
		System.out.println("my second testcase-@test");
	}
}
