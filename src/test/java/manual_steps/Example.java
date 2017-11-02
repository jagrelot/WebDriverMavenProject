package manual_steps;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example {

	@Test
	public void scriptMethod(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jagrelot\\Desktop\\chromedriver.exe");
		WebElement  userName;
		WebElement  passWord;
		WebElement     login;
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://na59.salesforce.com");
		userName = chromeDriver.findElement(By.cssSelector("#username"));
		passWord = chromeDriver.findElement(By.cssSelector("#password"));
		login    = chromeDriver.findElement(By.cssSelector("#Login"));
		userName.sendKeys("jagrelot@orgdemo.com");
		passWord.sendKeys("acumen321");
		login.click();
		chromeDriver.close();
		
	}
	
}
