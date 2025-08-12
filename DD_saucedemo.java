package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD_saucedemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preethi\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.saucedemo.com/");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				WebElement user=driver.findElement(By.id("user-name"));
				//user.click();
				user.sendKeys("standard_user");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
				//driver.navigate().back();
				//driver.navigate().forward();
				WebElement list=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
				Thread.sleep(2000);
				Select obj=new Select(list);
				obj.selectByIndex(2);
				//obj.selectByValue("za");
				//obj.selectByVisibleText("Price(low to high)");
		

	}

}
