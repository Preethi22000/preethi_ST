package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preethi\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement electronics = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
		Thread.sleep(2000);
		act.contextClick(electronics).build().perform();
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		Thread.sleep(2000);

		act.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("mobile").build().perform();
		Thread.sleep(2000);
	}

}
