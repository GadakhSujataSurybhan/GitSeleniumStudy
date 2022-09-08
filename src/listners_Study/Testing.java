package listners_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listners_Study.Listner_class.class)
public class Testing {
	
  @Test
  public void a() {
	  Reporter.log("Running test case a", true);
  }
  @Test
  public void b() {
	  Assert.fail();
	  Reporter.log("Running test case b", true);
  }
  
  @Test(dependsOnMethods = {"b"})
  public void c()
  {
	  Reporter.log("Running test case c", true);
  }
 
}
