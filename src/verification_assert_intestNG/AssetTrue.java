package verification_assert_intestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssetTrue {
  @Test
  public void test1() {
	  
	  boolean result = true;
	    
	  Assert.assertTrue(result, "result is false");
	  
  }
 // @Test
  //public void test2() {
	  
	//  boolean result1 = true;
	    
	//  Assert.assertFalse(result1, "result1 is false");
	  
//  }
  
}
