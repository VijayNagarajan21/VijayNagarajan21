package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		driver.manage().window().maximize();
		WebElement to = driver.findElement(By.id("form:drop_content"));
		
		WebElement from = driver.findElement(By.id("form:drag_content"));
		
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.clickAndHold(from).moveToElement(to).release(to).build().perform();

		
		
	}

}
