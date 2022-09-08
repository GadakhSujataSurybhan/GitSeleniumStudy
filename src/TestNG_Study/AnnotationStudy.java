package TestNG_Study;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void test1() {
	  System.out.println(" @test method is running");
  }
  @AfterClass 
  public void test2() {
	  System.out.println("after class method is running");
  }
  @BeforeClass
  public void test3() {
	  System.out.println(" before class method is running");
  }
  @BeforeMethod
  public void test4() {
	  System.out.println(" before method method is running");
  }
  @AfterMethod
  public void test5() {
	  System.out.println(" after method method is running");
  }
  @AfterTest
  public void tes6() {
	  System.out.println("after test method is running");
  }
  @BeforeTest
  public void test7() {
	  System.out.println("before test method is running");
  }
  @AfterSuite
  public void test8() {
	  System.out.println(" after suite method is running");
  }
  @BeforeSuite
  public void test9() {
	  System.out.println("before suite method is running");
  }
}
