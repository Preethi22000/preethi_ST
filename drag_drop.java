package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preethi\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		WebElement from=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p/b"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		act.dragAndDrop(from, to).build().perform();

	}

}
