package Base_pkg_PS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class StoreHome {
public WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new FirefoxDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://petstore.octoperf.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
}
