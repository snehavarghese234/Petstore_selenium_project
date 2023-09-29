package Test_Pkg_PS;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import Base_pkg_PS.StoreHome;
import Page_Pkg_PS.LoginPage;
import Page_Pkg_PS.OpenStorePage;
import Page_Pkg_PS.SearchPage;
import Page_Pkg_PS.ShoppingCart;
import Page_Pkg_PS.SignInPage;
import Page_Pkg_PS.registerPage;
import Utility_Pkg_PS.petStoreUtility;

//LOGIN USING DATADRIVEN TESTING
public class registerAccount extends StoreHome 
{
	@Test(priority=2)
	public void verifyLoginCred() throws Exception 
	{
		OpenStorePage op=new OpenStorePage(driver);
		op.enterstore();
		LoginPage lp=new LoginPage(driver);
		lp.signin();
		String xl="E:\\Pgms\\petstoredata.xlsx";
		String Sheet="Sheet1";
		int rowCount=petStoreUtility.getRowCount(xl,Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=petStoreUtility.getCellValue(xl,Sheet,i,0);
			System.out.println("username---"+UserName);
			String Pwd=petStoreUtility.getCellValue(xl,Sheet,i,1);
			System.out.println("password---"+Pwd);
			lp.setvalues(UserName, Pwd);
			lp.login();
		}
		
		//VERIFICATION OF USER
		lp.myactpage();

		//SCREENSHOT
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("E:\\Pgms/ss2.png"));
		String exp="pet_lover001";
		WebElement m=driver.findElement(By.xpath("//td[contains(text(),'pet_lover001')]"));
		String act=m.getText();
		System.out.println("User ID is:" +act);
		Assert.assertEquals(act, exp);
		driver.navigate().back();	
	
		//SEARCH FUNCTION
		SearchPage s=new SearchPage(driver);
		s.passvalue("Poodle");
		s.searchoptn();
		s.chooseitem();
		s.additem();
		
		
		//ADD TO CART
		ShoppingCart c=new ShoppingCart(driver);
		c.chgqty("2");
		c.updatebtn();
		c.checkoutbtn();
		c.cddetails("MasterCard","0000 1234 5678 234","07/25");
		c.ctnubtn();
		c.logout();	
}
		
	//Register new user
	
		@Test(priority=1)
		public void setup()
		{
			OpenStorePage op=new OpenStorePage(driver);
			op.enterstore();
			SignInPage sp=new SignInPage(driver);
			sp.signin();
			registerPage rs=new registerPage(driver);
			rs.registerclick();
			rs.setvalues("Pet_lover158", "qwerty", "qwerty", "anu", "varghese", "anu@gmail.com", "1234567895", "Address", "kochi", "kerala", "689510", "India");
			rs.saveinfo();
		}	
	/*@Test(priority=2)
		public void screenshot() throws Exception
		{
			File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(ss, new File("E:\\Pgms/ss1.png"));
			
			//WebElement w=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
			//File src1=w.getScreenshotAs(OutputType.FILE);
			//FileHandler.copy(src1, new File("./Screenshot//ss2.png"));
		}*/

	}

