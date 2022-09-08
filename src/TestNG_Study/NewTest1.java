package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void test1() {
	  System.out.println("this is test1 method is running");
  }
  @Test
  public void test2() {
	  Reporter.log("this is test2 method is running");
  }
  @Test
  public void test3() {
	  Reporter.log("this is test3 method is running");
  }
}
