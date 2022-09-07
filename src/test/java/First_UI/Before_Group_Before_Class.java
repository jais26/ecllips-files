package First_UI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Before_Group_Before_Class {
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Run this before test");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Run this after test");
	}
	
	@BeforeGroups(value  = "regression")
	public void beforegroup()
	{
		System.out.println("Run this method before regression");
	}
	
	@AfterGroups(value  = "regression")
	public void afteregroup()
	
	{
		System.out.println("Run this method after regression");
	}
	
	 @Test(priority =1,description= "this is a logoutt")
	    public void  BlogOutTest()
	    
	    {
	    	System.out.println("logout is successfull");
	    }
	
	 @Test(priority = 2,description= "this is a login test")
		public void ALoginTest()
		
		{
			System.out.println("login is successfull");
		}
	

}
