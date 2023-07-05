package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathType1 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.get("https://app.hubspot.com/login");
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		
		By un = By.xpath("//input[@id='username']");
		By pd = By.xpath("//input[@id='password']");
		By utext = By.xpath("//i18n-string[text()='Email address']");
		By ptext = By.xpath("//i18n-string[text()='Password']");
		By show = By.xpath("//span[text()='Show Password']");

		WebElement Unlabel = odriver.findElement(un);
		WebElement Pdlabel = odriver.findElement(pd);
		WebElement Utext = odriver.findElement(utext);
		WebElement Ptext = odriver.findElement(ptext);
		WebElement Show = odriver.findElement(show);

		Unlabel.sendKeys("admin");
		Pdlabel.sendKeys("1234");
		
		String Utextlabel = Utext.getText();
		System.out.println(Utextlabel);
		
		String Ptextlabel = Ptext.getText();
		System.out.println(Ptextlabel);

		String Showlabel = Show.getText();
		System.out.println(Showlabel);
		
		Thread.sleep(3000);

		odriver.quit();
	}

}
