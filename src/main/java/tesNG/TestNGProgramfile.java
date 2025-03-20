package tesNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGProgramfile extends TestNGlogingpage {

	@BeforeClass
	public static void Enviromentsetup()
	{
	System.out.println("setup envirnment");
	}
	
	@BeforeMethod
	public static void Browserlaunch()
	{
	System.out.println("******************************browser launched**********************************************");
	launchapplication("chrome");
	}

	@Test
	public static void Testcase1_login_submit()
	{
		System.out.println("enterusername and entering password and submit");
		
		EnterEmail("harika@gmail.com");
		
		EnterPassword("12345");
		
		SubmitButtonSignin();
	}
	
	@Test
	public static void Testcase2_login_cancel()
	{
		System.out.println("enterusername abd entering password and cancel");
	}

	@AfterMethod
	public static void browserclose()
	{
		System.out.println("closing the browser");
	}
	
	@AfterClass
	public static void CloseBDconeection()
	{
		System.out.println("closing the BD");
	}
}
