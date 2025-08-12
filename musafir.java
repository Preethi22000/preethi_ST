package seleniumProject;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class musafir {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preethi\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.musafir.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000); // Wait for page to load completely

        // Fill 'From' field using name
        WebElement fromInput = driver.findElement(By.name("origin"));
        fromInput.clear();
        fromInput.sendKeys("Kannur, India (CNN)");
        Thread.sleep(1500); // Wait for dropdown
        fromInput.sendKeys(Keys.ENTER);

        // Fill 'To' field
        WebElement toInput = driver.findElement(By.name("destination"));
        toInput.clear();
        toInput.sendKeys("Salalah, Oman (SLL)");
        Thread.sleep(1500); // Wait for dropdown
        toInput.sendKeys(Keys.ENTER);

        // Fill Departure Date
        WebElement departureDate = driver.findElement(By.name("StartDate"));
        departureDate.clear();
        departureDate.sendKeys("10/08/2025");

        // Fill Return Date
        WebElement returnDate = driver.findElement(By.name("EndDate"));
        returnDate.clear();
        returnDate.sendKeys("24/08/2025");

        
        // Set 2 adults
        driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[11]/div[1]/select")).click();

        // Set 3 children
        WebElement childPlus = driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[11]/div[2]/select"));
        for (int i = 0; i < 3; i++) childPlus.click();

        // Set 1 infant
        driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[11]/div[3]/select")).click();

        // Click Done
        driver.findElement(By.xpath("//button[text()='Done']")).click();

        // Click Find Flights
        driver.findElement(By.xpath("//button[contains(text(),'FIND FLIGHTS')]")).click();

        // Optional: wait before closing to see results
        Thread.sleep(5000);
        driver.quit();
        

	}

}
