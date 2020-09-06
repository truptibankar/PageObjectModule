package Testcases;

import org.junit.Test;

import Core.TestBase;
import junit.framework.Assert;

public class Testcase1 extends TestBase {
	
	@Test
	public void check_website_is_working()
	{
		driver.get(base_url);
        String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String Actual = driver.getTitle();
        Assert.assertEquals("Title validation",expected, Actual);
    }
}
