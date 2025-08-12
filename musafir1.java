package seleniumProject;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class musafir1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preethi\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.musafir.com/");
		driver.manage().window().maximize();
		 Thread.sleep(2000); // wait for page load
		 WebElement roundTripTab = driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[1]/ul[2]/li[2]/label"));
	        roundTripTab.click();
	        Thread.sleep(1000);

	        // Use XPath to find 'From' field using placeholder
	        WebElement fromInput = driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[2]/input"));
	        fromInput.click(); // click to activate
	        fromInput.sendKeys("Kochi, India (COK)");

	        Thread.sleep(2000); // wait for dropdown suggestions

	        fromInput.sendKeys(Keys.ARROW_DOWN);
	        Thread.sleep(1000);
	        fromInput.sendKeys(Keys.ENTER);
	        Thread.sleep(2000);
	        
	     
	        WebElement fromto = driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[3]/input"));
	        fromto.click(); // click to activate
	        fromto.sendKeys("Dubai International");

	        Thread.sleep(2000); // wait for dropdown suggestions

	        fromto.sendKeys(Keys.ARROW_DOWN);
	        Thread.sleep(1000);
	        fromto.sendKeys(Keys.ENTER);
	        Thread.sleep(2000);
	        
	        WebElement date=driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[9]/input"));
		    date.click();
		    
			
	       

	        
		       
	       
	        
	        String aMonth=driver.findElement(By.xpath("//*[@id=\"calendar\"]/div/div/h3")).getText();
			String aYear=driver.findElement(By.xpath("//*[@id=\"calendar\"]/div/div/h3")).getText();
			while(!(aMonth.equals("may") && aYear.equals("2025")))

			{
			driver.findElement(By.xpath("//*[@id=\"calendar\"]/div/div/a[3]")).click();
			aMonth=driver.findElement(By.xpath("//*[@id=\"calendar\"]/div/div/h3")).getText();
			aYear=driver.findElement(By.xpath("//*[@id=\"calendar\"]/div/div/h3")).getText();
			driver.findElement(By.xpath("//*[@id=\"calendar\"]/div/ul[2]/li[15]")).click();
			}

			date.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
	       
	        
	        // Select 2 adults
	        WebElement adultsDropdown = driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[11]/div[1]/select"));
	        Select selectAdults = new Select(adultsDropdown);
	        selectAdults.selectByVisibleText("2 adults");
	        
	        // Select 3 children
	        WebElement childrenDropdown = driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[11]/div[2]/select"));
	        Select selectChildren = new Select(childrenDropdown);
	        selectChildren.selectByVisibleText("3 children");
	        
	        // Select 1 infant
	        WebElement infantDropdown = driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[11]/div[3]/select"));
	        Select selectInfants = new Select(infantDropdown);
	        selectInfants.selectByVisibleText("1 infant");
	        Thread.sleep(2000);

	     // Locate the "FIND FLIGHTS" button using XPath and click it
	        WebElement findFlightsButton = driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[13]/a[2]/i"));
	        findFlightsButton.click();
	     
	       
			 
	    
	        
	       

	     
	}

}
