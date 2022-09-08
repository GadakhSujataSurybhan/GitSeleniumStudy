package verification_assert_intestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void method1() {
	  
   String test = null;
   Assert.assertNull(test, "test is not null value");
	  
  }
}
