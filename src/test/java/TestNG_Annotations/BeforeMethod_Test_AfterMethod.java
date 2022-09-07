package TestNG_Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethod_Test_AfterMethod {
	
	//@BeforeMethod - @Test - @AfterMethod --- these all were run in combination always
	
	@BeforeMethod
	public void UserRegistration()
	{
		System.out.println("User is getting registered");
	}

	@Test
	public void UserLogin()
	{
		System.out.println("User is getting login");
	}
	
	@Test
	public void Usermonycontroll()
	{
		System.out.println("User is getting controlled");
	}
	
	@AfterMethod
	public void UserLogout()
	{
		System.out.println("User is able to logout");
	}
	
}
