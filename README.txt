	
	Problem Statement : Display Bookshelves
	Website : "https://www.urbanladder.com/"
	---------------------------------------------------------------------
	 
	 MODULES OF PROJECT
	 
	 1) Verify Login Functionality :
	 
	 	* Verify Login functionality by providing Invalid Credentials.
	 	* Verify Login functionality by providing Valid Credentials.
	 	
	 2) Display the names and price of Bookshelves
	 
	    * Take first 3 Book-Shelf names and price below Rs. 15000. 
	    * Keeping Storage type as open.
	    * Excluding out of stock.
	               
	   
	 3) Display the Book shelf names of brand home decors and Sub-Menus of Collections 
	 
	 	* Display the Book Shelf names  under @HomeDecor.
	 	* Display all the sub menus of Collections.
	 
	 4) Verify the error message from the ‘Gift Cards’ page.
	 
	 	* Display error message after providing invalid phone number.
	 	 
	 	 
	 	 	
	Technology/Automation Tools Used
	-------------------------------------------------------------------------
	1) Selenium Webdriver and it's concepts.
	2) Maven for project management and dependency handling.
	3) TestNG framework and it's concepts.
	4) Data Driven approach (Apache Framework).
	5) Page Object Model.
	6) Extent Report.
	7) Excel and Property file concepts.
	8) Multiple Browser testing concepts
	9) Logger.
	10)Java Concepts.
	11)Cucumber ( Sign Up Test Case) .
	12)Git & GitHub.
	
	 
	Project Structure (Hybrid Framework)
	----------------------------------------------------------------------
	 1) src/test/java
	
	       i)   test_Base
	       			-Base_Class.java
	           
	       ii)  pageObjects
					-Base_Page.java
					-Gift_page.java
					-Home_Page.java
					-Login_Page.java
					
	       iii) test_Cases
	            	-TS_Login.java
	            	-TS_1.java
	            	-TS_2.java
	            	-TS_3.java
	            	
	       iv)  utilities
	       			-ExcelUtils.java
	       			-ExtentReportManager.java
	
	           
	 2) src/test/resources
	 
	 		i) config.properties
	 		
	 		ii) log4j2.xml
	 		
	 3) logs (logger files)
	 
	 4) reports (extent reports)
	 
	 5) Screenshots (All the requires Screenshots saved here )
	 
	 6) testData
	 
	 		i)sheet1.xlsx 
	 		
	 7) crossBrowser.xml
	 
	 8) oneBrowser.xml
	 
	 9) pom.xml
	 
	 
	 Steps of the Procedure:
	----------------------------------------------------------------------
	 
	1)  Launch any browser (In this code we have used Chrome browser and Microsoft Edge browser).
	2)  Goto “https://www.urbanladder.com/”.
	3)  Goto Login Page and enter invalid , valid credetentials.
	4)  Scroll the page and click on ‘Bookshelves’ option. (It will take user to ‘Bookshelves’ page).
	5)  Drag and drop the ‘price’ slider to Rs.15000.
	6)  Choose ‘Storage Type’ as ‘Open’ and Select the ‘Exclude Out Of Stock’ checkbox field.
	7)  Take the list of first 3 bookshelves and print it on the console.
	8)  Select the ‘By the home decor’ from the ‘Brand’ menu option.
	9)  Take the list of all the bookshelves under 'By the home dekor' and print it on the console.
	10) Scroll the page up and click on ‘Gift Cards’ Option. (It will take user to ‘Gift Cards’ page).
	11) Click on the ‘Birthday/Anniversary’ option.
	12) In the ‘Amount’ textbox, enter the amount.
	13) Click ‘NEXT’ Button.
	14) Fill all the mandatory fields except ‘Recipient’s mobile no.’ textbox.
	15) Enter invalid value in the ‘Recipient’s mobile no.’ textbox.
	16) Click ‘CONFIRM’ Button.
	17) Check whether error message is displayed.
	18) Display the error message on the console.
	
	
	Negative and Positive Testing Concepts
	----------------------------------------------------------------------- 
	
	1)Negative Testing
	
	* Invalid Login Id and Password.
	* Invalid Phone Number.
	* Invalid Amount.
	
	2)Positive Testing
	
	* Valid Login Id and Password.
	* Valid Amount as 50000.
	
	 
	Data Driven Concepts
	-----------------------------------------------------------------------
	1) Properties File (Reading Data)
	 
	* (config.properties)- This properties file conists of login id , password  and URL value.
	
	2) Random String Utils Class
	
	* Provided Random Sting and Numeric Values to form by using Random util class methods.  
	 
	3) Excel File (Writing data)
	 
	   1. (sheet.xlsx)- This Excel file consist   
	 
	      * The bookshelves name and price below 15000 after applying appropriate filters.
	      * The bookshelves name under brand 'By the home decor' .
	      * All the sub-menus of Collections.
	 
	  
	Key Automation Scope
	-------------------------------------------------------------------------
	 
	-> Handling drag & drop.
	-> Popup Handling
	-> Checkboxes Handling.
	-> Slider Handling by DragAndDropBy Method
	-> Locating elements precisely.
	-> Using appropriate synchronization technique.
	-> Scrolling up and down in web page by using JavaScript Executor.
	-> Filling form (in different objects in web page).
	-> Capture warning message.
	-> Taking Screenshots.
	-> KeyBoard Actions , Mouse Actions and Hover.


	Challenges Faced
	-------------------------------------------------------------------------
	-> Synchronization issue.
	-> Dynamic Xpath issue.
	-> Various Exceptipons (No such element , Element click intercepted , Stale Element , Timeout Exceptions)
	
	
	Runs and Pushed Project on Remote and Local Repository
	-------------------------------------------------------------------------
	1) By Using Normal Eclipse.
	2) By Using XML File.
	3) By Using POM.XML.
	4) By Using Git Repository.
	5) By Using GitHub Repository.
	