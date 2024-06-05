package test_Cases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.Gift_page;
import pageObjects.Home_Page;
import test_Base.Base_Class;

public class TS_3 extends Base_Class{
       
		Home_Page hp;
		Gift_page gp;
		@BeforeMethod
		public void set3() {
			
			hp=new Home_Page(driver);
			gp=new Gift_page(driver);
		}
		@Test(priority=1)
		public void click_gift_card() {
		
		logger.info("***Starting TS_3 Test ***");
		logger.info("Navigating to homepage.");
		hp.click_giftCard();
		logger.info("Navigating to giftCards page.");
		}
	    @Test(priority=2)
	    public void click_bNa() {

		gp.click_bNa();
		logger.info("Clicking on Birthday And Anniversary Option.");
	    }
	    @Test(priority=3)
	    public void gift_info() throws InterruptedException {
		gp.InvalidAmount();
		logger.info("Invalid Amount Entered");
		gp.validAmount();
		logger.info("Amount is Entered.");
		
		gp.SelectMonth();
		gp.SelectDate();
		logger.info("Date is Selected.");
		
		gp.Next();
		logger.info("Next button is Selected.");
	    }
	    
	    
	    @Test(priority=4)
	    public void recipient_info() {
		gp.fill_rname();
		gp.fill_rEmail();
		gp.fill_rMobileNum();
		logger.info("All the input boxes of 'To' field is filled.");
	    }
	    
	    
	    @Test(priority=5)
	    public void senders_info() {
		gp.fill_yname();
		gp.fill_yEmail();
		gp.fill_yMobileNum();
		gp.fill_yAddress();
		gp.fill_pin();
		logger.info("All the input boxes of 'From' field is Selected.");

		gp.click_confirm();
		logger.info("Confirm button is Selected.");
	    }
	    
	    
	    @Test(priority=6)
	    public void error_info() {
		gp.getErrorMsg();
		logger.info("Error message is printed on console.");
		
		logger.info("***TS_3 test case passed successfully. ***");
		System.out.println("*************************************************************************");
		System.out.println("*************************************************************************");

	}

}
