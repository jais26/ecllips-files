package First_UI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priorty_Test {
	
	@Test(priority =2, description="this is my 2nd priority")
	public void priority_2() 
	{
		System.out.println("2nd Priority base login");
	}
	
	@Test (priority= 1, description="this is 1st priority")
	public void priority1()
	{
		System.out.println("1 priority base login");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("Aftertest this runs 2nd");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Beforetest this runs 1rst");
	}
	
	@AfterMethod
	public void method2()
	{
		System.out.println(" after method 2 run");
	}
	
	@BeforeMethod
	public void mehtod1()
	{
		System.out.println("before method 1 run");
	}
	

}
