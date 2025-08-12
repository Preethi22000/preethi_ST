package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copy_paste {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preethi\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		//enter the full name
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("preethi Balan");
		//enter the email
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("preethibalan22@gmail.com");
		//enter the current address
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("Athipotta po,Alathur,Palakkad");
		
		currentAddress.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		currentAddress.sendKeys(Keys.CONTROL + "c");
		Thread.sleep(2000);
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		permanentAddress.sendKeys(Keys.CONTROL + "v");
		Thread.sleep(2000);
		
	}

}
