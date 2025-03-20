package tesNG;

import org.openqa.selenium.By;

public class TestNGlogingpage extends TestNGBasePage
{

	public static By Emailid=By.xpath("//input[@id='user_email']");
	  
	  public static By Passwordid=By.xpath("//input[@id='user_password']");
	  
	  public static By SubmitButtonSignin=By.xpath("//input[@name='commit']");
	  
	  public static By invalidErrorMassage=By.xpath("//p[text()='Invalid email or password.']");
	  
	  public static void EnterEmail(String email)
	  {
		  driver.findElement(Emailid).sendKeys(email);
	  }
		
	  public static void EnterPassword(String password)
	  {
		  driver.findElement(Passwordid).sendKeys(password);
	  }

	  public static void SubmitButtonSignin()
	  {
		  driver.findElement(SubmitButtonSignin).click();
	  }
	  
	  public static String captureInvalidErrorMessage()
	  {
		  
		  String text="";
		  
		  text=driver.findElement(invalidErrorMassage).getText();
		  
		  return text;
	  }
}
