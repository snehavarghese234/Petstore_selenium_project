package Page_Pkg_PS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCart {
	WebDriver driver;
	By qty=By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[5]/input");
	By updatebtn=By.name("updateCartQuantities");
	By checkout=By.xpath("//*[@id=\"Cart\"]/a");
	By cardtype=By.xpath("//*[@id=\"Catalog\"]/form/table/tbody/tr[2]/td[2]/select");
	By cardnum=By.name("order.creditCard");
	By date=By.name("order.expiryDate");
	By ctnue=By.name("newOrder");
	By confirm=By.xpath("//*[@id=\"Catalog\"]/a");
	By bck=By.xpath("//*[@id=\"BackLink\"]/a");
	By logoutact=By.xpath("//*[@id=\"MenuContent\"]/a[2]");
	
	public ShoppingCart(WebDriver driver)
	{ 
		this.driver=driver;
	}
	public void chgqty(String count)
	{
		driver.findElement(qty).clear();
		driver.findElement(qty).sendKeys(count);
	}
	public void updatebtn()
	{
		driver.findElement(updatebtn).click();
	}
	public void checkoutbtn()
	{
		driver.findElement(checkout).click();
	}
	public void cddetails(String type, String cno, String edate)
	{
		WebElement crd=driver.findElement(cardtype);
		Select m=new Select(crd);
		m.selectByValue(type);
		driver.findElement(cardnum).clear();
		driver.findElement(cardnum).sendKeys(cno);
		driver.findElement(date).clear();
		driver.findElement(date).sendKeys(edate);
	}
	public void ctnubtn()
	{
		driver.findElement(ctnue).click();
		driver.findElement(confirm).click();
		driver.findElement(bck).click();
	}
	public void logout()
	{
		driver.findElement(logoutact).click();
	}
	

}
