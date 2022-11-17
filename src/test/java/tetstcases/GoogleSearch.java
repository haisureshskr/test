package tetstcases;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.graphbuilder.curve.Point;

import base.TestBase;

public class GoogleSearch extends TestBase {
	@Test
	public void GoogleSearch() {
     driver.get("http://www.google.com");
     Reporter.log("Login to google success");
     WebElement search = driver.findElement(By.name("q"));
     search.sendKeys ("India");
     org.openqa.selenium.Point Location = search.getLocation();
     System.out.println("Location of search field" + Location);
     Reporter.log("Location of search field Success");
     org.openqa.selenium.Dimension size = search.getSize();
     System.out.println("size of the field" + size);
     search.sendKeys(Keys.ENTER);
     WebElement result = driver.findElement(By.id("result-stats"));
     String resultText = result.getText();
     System.out.println("Search values:" + resultText);
     Reporter.log("Serach values Success");
	}
}
