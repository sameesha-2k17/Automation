package testscript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
@BeforeMethod
public void beforeMethod() {
	System.out.println("before method");
}

@BeforeTest
public void beforeTest() {
	System.out.println("before test");
}
@BeforeClass
public void beforeClass() {
	System.out.println("before class");
}
@BeforeSuite
public void beforeSuite() {
	System.out.println("before suite");
}
@Test
public void testcase() {
	System.out.println("test case");
}
@AfterMethod
public void afterMethod() {
	System.out.println("after method");
}
@AfterTest
public void afterTest() {
	System.out.println("after test");
}
@AfterClass
public void afterClass() {
	System.out.println("after class");
}
@AfterSuite
public void afterSuite() {
	System.out.println("after suite");
}
}



