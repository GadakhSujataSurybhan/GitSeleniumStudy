package SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
	SoftAssert soft = new SoftAssert();
  @Test
  public void mymethod() {
	  String a="Sujata";
	  String b="Sujata1";
	  
	soft.assertEquals(true, "a and b is not matching");
	soft.assertNotNull(b, "b is not null");
	soft.assertAll();
  }
}
