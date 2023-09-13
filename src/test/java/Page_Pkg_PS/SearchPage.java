package Page_Pkg_PS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	WebDriver driver;
	By seachbox=By.name("keyword");
	By searchbtn=By.name("searchProducts");
	By item=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
	By add=By.xpath("//*[contains(text(),'Add to Cart')]");
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void passvalue(String Keywords)
	{
		driver.findElement(seachbox).sendKeys(Keywords);
	}
	
	public void searchoptn()
	{
		driver.findElement(searchbtn).click();
	}
	public void chooseitem()
	{
		driver.findElement(item).click();
	}
	public void additem()
	{
		driver.findElement(add).click();
	}

}
