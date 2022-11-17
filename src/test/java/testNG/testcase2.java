package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testcase2 {

	@Test
	public void ValidateTitle() 
	{
		SoftAssert softassert = new SoftAssert();	
		String expected_title = "yahoo.com";
		String actual_title = "gmail.com";
		if (expected_title.equals(actual_title))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
			//Assert.fail("compare failed");
		}
		//Assert.assertEquals(actual_title, expected_title);
		softassert.assertEquals(actual_title, expected_title);
		softassert.assertEquals(true, false,"file not present");
	}
}
