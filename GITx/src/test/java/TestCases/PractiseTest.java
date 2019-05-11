package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PractiseTest {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hgvdgcwgsv");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("1236");
		driver.findElement(By.name("Login")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

	}

}
