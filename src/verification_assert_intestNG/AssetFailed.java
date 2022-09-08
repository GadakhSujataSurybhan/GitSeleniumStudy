package verification_assert_intestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssetFailed {
  @Test
  public void method() {
	  Reporter.log("hello", true);
	  Assert.fail();
  }
  @Test
  public void method1() {
	  Reporter.log("My name is sujata", true);
	  
  }
}
