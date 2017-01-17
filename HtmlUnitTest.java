import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;	

public class HtmlUnitTest {
	public static void main(String[] args) {
		File file = new File("/home/parimal/Downloads/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
		System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		
		WebDriver driver = new PhantomJSDriver();
        
		     // Navigate to Google		
        driver.get("http://www.google.com");					

		 // Locate the searchbox using its name		
        WebElement element = driver.findElement(By.name("q"));	
        
       // Enter a search query		
       element.sendKeys("Guru99");	
      
       // Submit the query. Webdriver searches for the form using the text input element automatically		
       // No need to locate/find the submit button		
       element.submit();			
       
		// This code will print the page title		
       System.out.println("Page title is: " + driver.getTitle());		
       
       driver.quit();		
	}
}
