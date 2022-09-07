package First_UI;

import org.testng.annotations.Test;

@Test(groups ="user-registration")
public class Third_Group_Test_Cases {

	@Test(priority=0, groups="regression")
	public void A_Test_1()
	{
		System.out.println("Test 1");
	}
	
	@Test(priority=1, groups = "regression")
	public void B_Test_2()
	{
		System.out.println("Test 2");
	}
	
	@Test(groups= {"regression","bvt"})
	public void C_Test_3()
	{
		System.out.println("Test 3");
    }

	@Test(groups="bvt")
	public void D_Test_4()
	{
		System.out.println("Test 4");
	}
}
