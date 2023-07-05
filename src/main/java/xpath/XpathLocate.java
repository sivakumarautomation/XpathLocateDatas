package xpath; //package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocate { //class//
	
	public static void main(String[] args) throws InterruptedException { //Main//
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.get("https://app.hubspot.com/login");
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		
		//XPath//--->TYpe-1
		
		//Syntax//
		//TagName[@attribute name='value']//
		
		   WebElement username = odriver.findElement(By.xpath("//input[@id='username']"));
		   username.sendKeys("admin");
		   
		   WebElement pass = odriver.findElement(By.xpath("//input[@id='password']"));
		   pass.sendKeys("1234");
		   
		   Thread.sleep(3000);
		   
		   odriver.quit();
		
	}

}
