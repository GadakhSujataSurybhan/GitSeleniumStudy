package verification_assert_intestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfalse {
  @Test
  public void test1() {
	  boolean result = true;
	  Assert.assertFalse(result,"result is false");
  }
}
