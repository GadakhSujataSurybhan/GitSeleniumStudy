package verification_assert_intestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void method1() {

	  String test =null;
	  Assert.assertNotNull(test, "test is not null");
  }	  
}
