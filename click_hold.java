package seleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class click_hold {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preethi\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		WebElement clickHoldBox = driver.findElement(By.id("click-box"));
		Actions actions = new Actions(driver);
        actions.clickAndHold(clickHoldBox).pause(2000).release().perform();
        System.out.println("Box text after click and hold: " + clickHoldBox.getText());
        Thread.sleep(2000);
        driver.quit();
    }

	}


