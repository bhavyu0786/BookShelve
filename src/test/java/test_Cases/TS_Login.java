package test_Cases;
import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Login_Page;
import test_Base.Base_Class;
public class TS_Login extends Base_Class{
	Login_Page lp;
	@BeforeMethod
	public void set() {
		lp=new Login_Page(driver);
	}
	@Test(priority=1)
	public void LoginClick() throws InterruptedException {
		lp.Icon();
		logger.info("***Starting Login Test ***");
		lp.Login();
		logger.info("Clicking on login.... ");
	}

	@Test(priority=2 , dependsOnMethods="LoginClick")
	public void InvalidLogin() throws InterruptedException, IOException {
		lp.Email();
		logger.info("Providing email id...");
		lp.Password();
		logger.info("Providing password...");
		lp.Login_Btn();
		logger.info("Login successful....");
		
		
		}

	@Test(priority=3 , dependsOnMethods="InvalidLogin")
	public void Error_Navigate() throws InterruptedException {
		lp.ErrorMess();
		logger.info("Error Message Printed");
		driver.navigate().back();
//		Thread.sleep(3000);
	}
	
	@Test(priority=4 )
	public void LoginClickNew() throws InterruptedException {
		lp.Icon();
		logger.info("***Starting Login Test ***");
		lp.Login();
		logger.info("Clicking on login.... ");
	}
	
	@Test(priority=5 , dependsOnMethods="LoginClickNew")
	public void ValidLogin() throws InterruptedException, IOException {
		lp.Emailnew();
		lp.Passwordnew();
		lp.Login_Btn();
		System.out.println("Login Successfully Completed");
		System.out.println("*************************************************************************");
		System.out.println("*************************************************************************");
	}

}
