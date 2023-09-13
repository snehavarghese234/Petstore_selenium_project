package Page_Pkg_PS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	WebDriver driver;
	By signinlink=By.xpath("//*[contains (text(),'Sign In')]");
	
	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void signin()
	{
		driver.findElement(signinlink).click();
	}
	


}
