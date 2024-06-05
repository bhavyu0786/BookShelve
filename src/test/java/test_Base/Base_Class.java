package test_Base;

import java.io.File;
import java.io.FileReader;

import org.openqa.selenium.OutputType;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;

import org.openqa.selenium.TakesScreenshot;

import org.testng.annotations.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
 
public class Base_Class  {
 
	public static WebDriver driver;
	public  Logger logger;
	public Properties p;	
	
	@BeforeClass
	@Parameters({"browser"})
	public void setup(String br) throws IOException
	{
		
		//********************Config properties Initialization***********************//
		
		FileReader file=new FileReader("C:\\Users\\2318425\\eclipse-workspace\\BookShelves\\src\\test\\resources\\config.properties");
		 p=new Properties();
		 p.load(file);
		 
		 
		switch(br.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver(); 
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		default:
			return;
		}
		
		//driver=new ChromeDriver();

		
		
		//*************************Loading log4j2 file *****************************//
		
		logger = LogManager.getLogger(this.getClass()); // <this.getclass> returns current class.
		
		
		//***************************Applying Implicit Wait***************************//
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		//****************************Opening the webPage*******************************//
		
		driver.get(p.getProperty("appURL"));
		
		//******************************Maximizing the window***************************//
		
		driver.manage().window().maximize();
	}

	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

// ***************************Methods for generating Random String**************************//
	
	public static String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}

// **************************Method for generating Random Number*****************************//
	
	public static String randomeNumber(int i)
	{
		String generatedString=RandomStringUtils.randomNumeric(i);
		return generatedString;
	}
	
// *****************************Method for generating Emails**********************************//

	public static String randomAlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(3);
		String num=RandomStringUtils.randomNumeric(3);
		
		return (str+"@"+num);
	}
	
//	*****************************Method for Capturing ScreenShots******************************//
	
	public String captureScreen(String tname) throws IOException {
		 
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String targetFilePath=System.getProperty("user.dir")+"\\Screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		sourceFile.renameTo(targetFile);
		return targetFilePath;
	}
	
	
}
