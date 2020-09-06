package Core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class TestBase {
	
	protected WebDriver driver;
	protected final static String base_url = "https://amazon.in";
	
	 private String getBrowserName()
	 {
		String MydefaultBrowser = "chrome";
		String Browsersentfromcommand = System.getProperty("browser");
		
		if (Browsersentfromcommand == null) {
			return MydefaultBrowser;
		}
		else {
			return Browsersentfromcommand;
		} 
	 }
	 
	 @Before
	 public void set_up()
	 {
		 String browser = getBrowserName();
		 try {
			 driver = WebDriverFactory.getRightBrowser(browser);
		 }catch(Exception e) {
			 e.printStackTrace();
	         Assert.fail("Browser Initialization failed. Check the Stack Trace. " + e.getMessage());
 }
		  }
	
     @After
     public void clean()
     {
    	 driver.quit();
     }
}
