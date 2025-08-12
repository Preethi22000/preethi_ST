package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class camerin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preethi\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement searchBox = driver.findElement(By.name("q"));

		
		searchBox.sendKeys("https://camerinfolks.com/");
		searchBox.submit();
		Thread.sleep(3000);

		WebElement camerinLink = driver.findElement(By.partialLinkText("camerinfolks.com"));
		camerinLink.click();
		Thread.sleep(5000);

		driver.close();

	}

}
