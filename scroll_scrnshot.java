package seleniumProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_scrnshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preethi\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		String loc="C:\\Users\\Preethi\\Desktop";
		File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   //this is for take screenshot//
	    FileUtils.copyFile(file1,new File(loc+"top_jpg.jpg"));  //this is for save the screenshot in defined location ( loc )// 
	    Thread.sleep(3000);
	   
	                 //javascript executer is used to access the browser features
	                    JavascriptExecutor js= (JavascriptExecutor)driver;
	                    		js.executeScript("scrollBy(0,2500)");    //this is for scroll downwords the screen. 0 and 2500 are the X and Y co-ordinates.
	                   Thread.sleep(5000);
	                   File file2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	                   FileUtils.copyFile(file2, new File(loc+"middle_jpg.jpg"));
	    
	                   JavascriptExecutor js1= (JavascriptExecutor)driver;
		                  js1.executeScript("scrollBy(0,5000)");
		                  Thread.sleep(5000);
		                  File file3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		               	  FileUtils.copyFile(file3, new File(loc+"bottom_jpg.jpg"));


	}

}
