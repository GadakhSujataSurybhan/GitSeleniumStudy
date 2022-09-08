package verification_assert_intestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqual {
  @Test
  public void method() {
	  
	  String a="pune";
	  String b= "pune";
	  Assert.assertNotEquals(a, b, "a and b not matching");
			  
  }
}
