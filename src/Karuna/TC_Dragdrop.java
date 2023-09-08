package Karuna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


public class TC_Dragdrop {
public static void main(String[] args) throws Exception{
	WebDriver driver = new EdgeDriver();
	driver.navigate().to("https://jqueryui.com/droppable/");
	Thread.sleep(3000);
	assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	System.out.println("Title matched");
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	Actions ac = new Actions(driver);
	ac.dragAndDrop(driver.findElement(By.id("draggable")),
	driver.findElement(By.id("droppable"))).build().perform();
	System.out.println("Drag & Drop");
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	driver.close();	
	
	
}
}
