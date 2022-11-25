package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node010iv8rpp9kunihbkvnxnsz4mj101045.node0");
		Thread.sleep(5000);
		//Inside Frame
		driver.switchTo().frame(0);
		WebElement findElement = driver.findElement(By.id("Click"));
		findElement.click();
		String text = findElement.getText();
		System.out.println(text);
		Thread.sleep(5000);
	//Inside Nested Frame	
		driver.switchTo().defaultContent();
		
	driver.switchTo().frame(2);
	driver.switchTo().frame("frame2");
	WebElement findElement2 = driver.findElement(By.id("Click"));
	findElement2.click();
	Thread.sleep(5000);
	findElement2.getText();
	System.out.println(text);
	
	driver.switchTo().defaultContent();
	List<WebElement> list = driver.findElements(By.tagName("iframe"));
	
	int size = list.size();
	System.out.println(size);
    
	Thread.sleep(2000);
	
	
	
		
	}

}
