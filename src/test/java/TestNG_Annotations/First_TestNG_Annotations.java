package TestNG_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First_TestNG_Annotations {

	// precedence wise execution
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("This is before suite annotations");
	}
	
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("This is before Test annotations");
	}
	
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("This is before class annotations");
	}
	
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("This is before Method annotations");
	}
	
	
	@Test
	public void Testcase()
	{
		System.out.println("This is Test case");
		
	}
	
	@Test
	public void Testcase2()
	{
		System.out.println("This is test case 2");
	}
	
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("This is After method annotations");
	}
	
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("This is after clas annotations");
	}
	
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("This is after test annotations");
	}
	
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("This is after suite annotations");
	}
	
	
	
	
	
}
