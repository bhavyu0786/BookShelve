package test_Cases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.Home_Page;
import test_Base.Base_Class;
 

 
 
public class TS_1  extends Base_Class{
		Home_Page hp;
		
		@BeforeMethod
		public void set1(){
			
			hp=new Home_Page(driver);
		}
		
		@Test(priority=1)
		public void Handle_Popup() throws InterruptedException {
		logger.info("***Starting TS_1 Test ***");
		hp.clickBookShelves();
		logger.info("Clicked on Bookshelves.");
		hp.clickPopup();
		logger.info("Clicked on popup.");
		}
		@Test(priority=3)
		public void Price_Setting() throws InterruptedException {
		hp.Price();
		hp.Slider();
		Thread.sleep(2000);
		logger.info("Price range is Selected By using the slider.");
		}
		
		@Test(priority=5)
		public void Storage_Stock() {
		hp.Hover();
		hp.StorageType();
		logger.info("Storage type open is selected by hovering on Storage type.");
		hp.Stock();
		logger.info("Out of stock products are excluded.");
		}
		
		@Test(priority=8)
		public void BookShelve() throws InterruptedException, IOException {
		hp.BookShelveName();
		logger.info("Getting top three Bookshelves info.");
		logger.info("***TS_1 test case passed successfully.....***");
		System.out.println("*************************************************************************");
		System.out.println("*************************************************************************");
		
		}
	}



