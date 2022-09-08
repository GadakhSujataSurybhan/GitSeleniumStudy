package groupingInTestNGxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class grouping1 {
  @Test(groups="sanity")
  public void test1() 
  {
	Reporter.log("test1 is running", true);
  }
  @Test(groups="regression")
  public void test2()
  {
	  Reporter.log("test2 is running", true); 
  }
  @Test(groups="sanity")
  public void test3()
  {
	  Reporter.log("test3 is running", true);
  }
  @Test
  public void test4() 
  {
	  Reporter.log("test4 is running", true);  
  }
  
}
