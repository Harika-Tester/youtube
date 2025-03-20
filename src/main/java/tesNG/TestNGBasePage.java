package tesNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGBasePage 
{
	public static WebDriver driver;

	public static void launchapplication(String Browser)
	{
		if(Browser.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.get("https:/studio.cucumber.io/users/sign_in");
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void closeBrowser()
	{
		driver.close();
	}

	

}

