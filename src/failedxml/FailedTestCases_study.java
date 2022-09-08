package failedxml;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTestCases_study {
  @Test
  public void test1() 
  {
	Reporter.log("test1 is running", true);
  }
  @Test
  public void test2()
  {
	  Reporter.log("test2 is running", true); 
  }
  @Test
  public void test3()
  {
	  Reporter.log("test3 is running", true);
  }
  @Test
  public void test4() 
  {
	  
	  Reporter.log("test4 is running", true);  
  }
  @Test
  public void test5() 
  {
	
	  Reporter.log("test5 is running", true);  
  }
  @Test(timeOut =200)
  public void test6() throws InterruptedException 
  {
	  Thread.sleep(500);
	  Reporter.log("test6 is running", true);  
  }
  @Test
  public void test7() 
  {
	
	  Reporter.log("test7 is running", true);  
  }
}
