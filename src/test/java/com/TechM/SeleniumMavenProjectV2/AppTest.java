package com.TechM.SeleniumMavenProjectV2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/*import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;*/

/**
 * Unit test for simple App.
 */
public class AppTest 
    //extends TestCase
{
   /* *//**
     * Create the test case
     *
     * @param testName name of the test case
     *//*
    public AppTest( String testName )
    {
        super( testName );
    }

    *//**
     * @return the suite of tests being tested
     *//*
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    *//**
     * Rigourous Test :-)
     *//*
    public void testApp()
    {
        assertTrue( true );
    }*/
    
	
    public WebDriver driver;
	
	  @org.testng.annotations.Test
	  public void openMyFBPage() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.ie.driver", "F:\\Saradhi.Seshagiri\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();
		  
	  }
	 
	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
}
