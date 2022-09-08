package listners_Study;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Listner_class implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test started sucess", true);
		ITestListener.super.onTestStart(result);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test Skipped please check", true);
		ITestListener.super.onTestSkipped(result);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test failed ", true);
		ITestListener.super.onTestFailure(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test completed sucess", true);
		ITestListener.super.onTestSuccess(result);
	}

  
}
