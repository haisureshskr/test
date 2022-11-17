package testNG;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import utilities.TestLogs;
public class testcase1 {
	
	public static Logger log = Logger.getLogger(testcase1.class.getName());
	@BeforeClass
	
	public void CreateDBConn()
	{
		PropertyConfigurator.configure("./src/test/resources/properties/log4j_Testng.properties");
		System.out.println("DB connected");
		log.info("test_db connected");
	}
	@AfterClass
	public void CloseDBConn()
	{
		System.out.println("DB connection close");
		log.info("test_DB closed");
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		log.debug("browser is launched");
		System.out.println("browser launch success");
	}
	@AfterMethod
	public void closeBrowser()
	{
		log.assertLog(false, "browser did not close");
		log.getLoggerRepository();
		System.out.println("browser close success");
	}
	
	@Test(priority=2)
	public void login()
	{
		System.out.println("login success");
	}
	@Test(priority=1)
	public void registerUser()
	{
		System.out.println("user registertion");
	}
	@Test(priority=3)
	public void logout()
	{
		System.out.println("logout");
	}
	
}
