package rahul_shetty_testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day6 {
	@Parameters({ "Url" })
	@Test
	public void parameterisation(String urlname) {
		System.out.println("parametrisation");
		System.out.println(urlname);
	}

	@Test(dataProvider="getdata")
	public void dataProvider(String Username, String Password)
	{
		System.out.println(Username);
		System.out.println(Password);
	}
	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[3][2];
		// passing the one method for 3 differnt type of data like username and pasword
		// we passed as 3 time with different parameter

		// 1set
		data[0][0] = "first_Username";
		data[0][1] = "first_Password";
		// 2set
		data[1][0] = "second_Username";
		data[1][1] = "second_Password";
		// 3set
		data[2][0] = "third_Username";
		data[2][1] = "third_Password";
		return data;

	}

}
