package Page_Pkg_PS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;
	By signinlink=By.xpath("//*[contains (text(),'Sign In')]");
	By uname=By.name("username");
	By psd= By.name("password");
	By loginbtn=By.xpath("//*[@id=\"Catalog\"]/form/input");
	By myacct=By.xpath("//*[@id=\"MenuContent\"]/a[3]");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void signin()
	{
		driver.findElement(signinlink).click();
	}
	
	public void setvalues(String Username, String Password )
	{
		driver.findElement(uname).clear();
		driver.findElement(uname).sendKeys(Username);
		driver.findElement(psd).clear();
		driver.findElement(psd).sendKeys(Password);
	}
	
	public void login()
	{
		driver.findElement(loginbtn).click();
	}
	
	public void myactpage()
	{
		driver.findElement(myacct).click();
	}


}
