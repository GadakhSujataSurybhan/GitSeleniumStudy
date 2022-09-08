package verification_assert_intestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqual {
  @Test
  public void method1() {
	  
	  String a= "sujata";
	  String b= "sujata";
	  
	  Assert.assertEquals(true, "a and b is not matching" );
	  
  }
}
