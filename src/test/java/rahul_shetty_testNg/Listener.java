package rahul_shetty_testNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("");
	}	

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("my all test case is getting pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
//		System.out.println("Write the code for screen shot ");
		System.out.println("testcase getting fail and which testcase:-"+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("");
	}

}
