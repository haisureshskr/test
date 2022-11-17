package tetstcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

public class testcase1 extends TestBase {
	@BeforeClass
	public void CreateDBConn()
	{
		System.out.println("DB connected");
		log.debug("DB connected");
	}
	@AfterClass
	public void CloseDBConn()
	{
		System.out.println("DB connection close");
		log.debug("DB connection close");
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("browser launch success");
	}
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("browser close success");
	}
	
	@Test(priority=2)
	public void login()
	{
		System.out.println("login success");
		log.debug("login success");
	}
	@Test(priority=1)
	public void registerUser()
	{
		System.out.println("user registertion");
		log.debug("user registertion");
	}
}
