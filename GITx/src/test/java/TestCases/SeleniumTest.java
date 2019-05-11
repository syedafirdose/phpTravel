package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.dominos.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\'_dpz\']/header/nav[1]/div[1]/ul/li[2]/a")).click();

		driver.findElement(By.xpath("//*[@id=\'locationSearchForm\']/div/div[1]/label[2]/span[2]")).click();

		driver.findElement(By.xpath("//div[@class='grid__cell--custom__address-zip']/div/input")).sendKeys("77642");

		driver.findElement(By.cssSelector("button[type='submit']")).click();

		driver.findElement(By.xpath("//*[@id='locationsResultsPage']/div/div[2]/div[1]/div[2]/div/div[2]/a")).click();

	}

}
