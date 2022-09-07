package First_UI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First_Login_Test{
	
	@AfterTest
	public void loginToApplication()
	{
		System.out.println("login to applicaton");
	}
	

    @Test(priority = 2,description= "this is a login test")
	public void ALoginTest()
	
	{
		System.out.println("login is successfull");
	}
	
	@BeforeTest
	public void logOutFromApplication()
	{
		System.out.println("Logout from applicationn");
		
	}
	
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB Connected");
	}
	
	@AfterMethod
	public void DisConnectToDB()
	{
		System.out.println("DisConnect  DB ");
		
	}

    @Test(priority =1,description= "this is a logoutt")
    public void  BlogOutTest()
    
    {
    	System.out.println("logout is successfull");
    }
}


