package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeywordStudy {
  @Test
  public void MethodA() {
	  Reporter.log("TC 1 is running", true);
  }
  @Test (dependsOnMethods = {"MethodA"})
  public void MethodB() {
	  Reporter.log("TC 2 is running", true);
  }
  @Test 
  public void MethodC() {
	  Reporter.log("TC 3 is running", true);
	  
  }
  @Test (timeOut = 3000 ) 
  public void MethodD() throws InterruptedException {
	  Thread.sleep(2000);
	  Reporter.log("TC 4 is running", true);
  }
  public void MethodE() 
  {
	  Reporter.log("TC 5 is running", true);
}
}