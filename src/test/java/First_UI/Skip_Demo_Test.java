package First_UI;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skip_Demo_Test {

	Boolean datasetup=true;
	
	@Test(enabled=false)
	public void skip_Test_1()
	{
		System.out.println("skipping this test as it is not complete 1");
	}
	
    @Test
	public void skip_Test_2()
	{
		System.out.println("skipping this test forcefully 2");
		throw new SkipException("skipping this test");
	}
	
    @Test
	public void skip_Test_3()
	{
		System.out.println("skipping this test based on condition 3");
		
		if(datasetup==true)
		{
			System.out.println("Execute the test");
		}
		else
		{
			System.out.println("Do not execute further steps");
			throw new SkipException("do not execute further steps");
		}
	}
}
