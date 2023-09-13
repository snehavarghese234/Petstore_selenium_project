package Page_Pkg_PS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerPage {
	WebDriver driver;
	By registerlink=By.xpath("//*[contains(text(),'Register Now!')]");
	By uid=By.name("username");
	By npwd=By.name("password");
	By rpwd=By.name("repeatedPassword");
	
	//ACCOUNT INFO
	By fname=By.name("account.firstName");
	By lname=By.name("account.lastName");
	By email=By.name("account.email");
	By num=By.name("account.phone");
	By address=By.name("account.address1");
	By city=By.name("account.city");
	By state=By.name("account.state");
	By zip=By.name("account.zip");
	By country=By.name("account.country");
	
	By save=By.xpath("//*[@id=\"Catalog\"]/form/input");
	
	public registerPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String id, String pswd,String rpswd, String ftname, String ltname, 
			String mail, String mob, String add, String cty, String stat, String zcode, String ctry)
	{
		driver.findElement(uid).sendKeys(id);
		driver.findElement(npwd).sendKeys(pswd);
		driver.findElement(rpwd).sendKeys(rpswd);
		driver.findElement(fname).sendKeys(ftname);
		driver.findElement(lname).sendKeys(ltname);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(num).sendKeys(mob);
		driver.findElement(address).sendKeys(add);
		driver.findElement(city).sendKeys(cty);
		driver.findElement(state).sendKeys(stat);
		driver.findElement(zip).sendKeys(zcode);
		driver.findElement(country).sendKeys(ctry);

	}
	public void registerclick()
	{
		driver.findElement(registerlink).click();
	}
	public void saveinfo()
	{
		driver.findElement(save).click();
	}
}
