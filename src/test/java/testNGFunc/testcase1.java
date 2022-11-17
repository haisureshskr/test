package testNGFunc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcase1 {
	@BeforeClass
	public void CreateDBConn()
	{
		System.out.println("DB connected Func1");
	}
	@AfterClass
	public void CloseDBConn()
	{
		System.out.println("DB connection close Func1");
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("browser launch success Func1");
	}
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("browser close success Func1");
	}
	
	@Test(priority=2)
	public void login()
	{
		System.out.println("login success Func1");
	}
	@Test(priority=1)
	public void registerUser()
	{
		System.out.println("user registertion Func1");
	}
}
