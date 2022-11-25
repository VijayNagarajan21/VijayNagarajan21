package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_demo {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		
		Actions a = new Actions(driver);
		a.contextClick(findElement).build().perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		
		WebElement findElement2 = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		a.contextClick(findElement2).build().perform();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	    Thread.sleep(5000);
	    
	    WebElement findElement3 = driver.findElement(By.xpath("//a[text()='Customer Service']"));
	    
	    a.contextClick(findElement3).build().perform();
	    Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		WebElement findElement4 = driver.findElement(By.xpath("//a[text()='Books']"));
		
		a.contextClick(findElement4).build().perform();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		int size = driver.getWindowHandles().size();
		System.out.println("Total Number of Windows:"+size);
		String windowHandle = driver.getWindowHandle();
		System.out.println("Window ID:"+windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String allwind : windowHandles) {
			
			String title = driver.switchTo().window(allwind).getTitle();
			System.out.println("All Window Title:"+title);
			
			String actual_Title = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
			for (String allwind1 : windowHandles) {
				
				if(driver.switchTo().window(allwind1).getTitle().equals(actual_Title)) {
					break;
				}
				
				WebElement findElement5 = driver.findElement(By.id("twotabsearchtextbox"));
				findElement5.sendKeys("Oppo");
				WebElement findElement6 = driver.findElement(By.id("nav-search-submit-button"));
				findElement6.click();
				Thread.sleep(2000);
				
			}
			
			
		}
		
		
		
	}

}


