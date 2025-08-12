package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnyFileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preethi\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement choose=driver.findElement(By.id("file-upload"));
		choose.sendKeys("C:\\Users\\Preethi\\Desktop\\abcd.png");
		Thread.sleep(3000);
		WebElement upload=driver.findElement(By.id("file-submit"));
		upload.click();
		
	}

}
