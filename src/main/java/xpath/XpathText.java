package xpath; //package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathText { //class//
	
	
	public static void main(String[] args) throws InterruptedException { //Main//
		
WebDriverManager.chromedriver().setup();
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.get("https://app.hubspot.com/login");
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		
		//XPath Text//
		
		
		WebElement un = odriver.findElement(By.xpath("//i18n-string[text()='Email address']"));
		
		WebElement pd = odriver.findElement(By.xpath("//i18n-string[text()='Password']"));

		String unlabel  = un.getText();
		System.out.println(unlabel);
		
		String pdlabel = pd.getText();
		System.out.println(pdlabel);
		
		Thread.sleep(3000);
		
		odriver.quit();
	}

}
