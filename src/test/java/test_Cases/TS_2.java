package test_Cases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

//import java.time.Duration;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Durations;
import pageObjects.Home_Page;
import test_Base.Base_Class;

public class TS_2 extends Base_Class {
	
	Home_Page hp;
	@BeforeMethod
	public void set2() {
		
		hp=new Home_Page(driver);
	}
	
	@Test(priority=1)
	public void Popup_Handling() throws InterruptedException {
		logger.info("***Starting TS_2 Test ***");
		hp.clickBookShelves();
		logger.info("Clicked on Bookshelves.");
		hp.clickPopup();
		logger.info("Clicked on popup.");
		
	}
	
	@Test(priority=2)
	public void hover_price() throws InterruptedException {
		hp.Price();
		hp.Slider();
		Thread.sleep(2000);
		logger.info("Price range is Selected By using the slider.");
	}
	
	@Test(priority=3)
	public void Storage_Stock() {
		hp.Hover();
		hp.StorageType();
		logger.info("Storage type open is selected by hovering on Storage type.");
		hp.Stock();
		logger.info("Out of stack products are excluded.");
	}
	
		@Test(priority=4)
		public void select_Home_dkr() throws InterruptedException{
		hp.Brand();
//		Thread.sleep(2000);
		hp.Home();
		logger.info("Brand by \"The Home Dekor\" is selected.");
		}
		
		@Test(priority=5)
		public void Print_Book2() throws InterruptedException, IOException {
		int n=hp.no_of_item();
		hp.print_item(n);
		logger.info("All the available options in bookshelf is printed after applying the filters.***");
		}
		
		@Test(priority=6)
		public void print_collection() throws InterruptedException, IOException {
		hp.Trending();
		int size=hp.size_of_collection();
		hp.Collections(size);
		
		logger.info("All the sub-menus under collections is printed.");
		logger.info("***TS_2 test case passed successfully.....***");
		System.out.println("*************************************************************************");
		System.out.println("*************************************************************************");
		}
	}


