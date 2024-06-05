package pageObjects;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import test_Base.Base_Class;

//**************************WebDriver Setup*******************************************//
//**************************Actions Class Setup***************************************//
//**************************JavaScriptExecutor Setup**********************************//
//**************************Explicit Wait Declaration*********************************//
 
public class Base_Page extends Base_Class{
	public WebDriver driver;
	public static WebDriverWait wait;	
	public static Actions act;
	public static JavascriptExecutor js;
	public Base_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		act=new Actions(driver);
		js= (JavascriptExecutor)driver;
	}	
}

