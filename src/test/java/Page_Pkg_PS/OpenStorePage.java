package Page_Pkg_PS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenStorePage {
	public WebDriver driver;
	By storelink=By.xpath("//*[@id=\"Content\"]/p[1]/a");
	public OpenStorePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterstore()
	{
		driver.findElement(storelink).click();
	}


}
