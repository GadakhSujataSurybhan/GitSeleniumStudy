package groupingInTestNGxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class grouping2 {
	 @Test(groups="regression")
	  public void test5() 
	  {
		Reporter.log("test5 is running", true);
	  }
	  @Test(groups="regression")
	  public void test6()
	  {
		  Reporter.log("test6 is running", true); 
	  }
	  @Test
	  public void test7()
	  {
		  Reporter.log("test7 is running", true);
	  }
	  @Test(groups="sanity")
	  public void test8() 
	  {
		  Reporter.log("test8 is running", true);  
	  }
}
