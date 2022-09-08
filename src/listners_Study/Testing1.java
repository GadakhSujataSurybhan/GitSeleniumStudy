package listners_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {
	
		@Test
		  public void p() 
		  {
			  Reporter.log("TC p is runing",true);
		  }
		  
		  @Test
		  public void q() 
		  {
			  Assert.fail();
			  Reporter.log("TC q is runing",true);
		  }
		  @Test(dependsOnMethods = {"q"})
		  public void r() 
		  {
			  Reporter.log("TC r is runing",true);
		  }
}
