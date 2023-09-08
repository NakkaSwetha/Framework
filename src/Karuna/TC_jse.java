package Karuna;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TC_jse {
public static void main(String[] args)throws Exception {
	WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
//driver.get("\"http://127.0.0.1/orangehrm-2.6/login.php");
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//input[@name='textUserName']")).sendKeys("nareshit");
driver.findElement(By.xpath("txtPassword")).sendKeys("nareshit");
//using javascriptExecutor to click on Login btn
WebElement loginbtn=driver.findElement(By.name("Submit"));
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("argument[0].click();",loginbtn);
Thread.sleep(4000);
System.out.println("Login Completed");
WebElement logout=driver.findElement(By.linkText("Logout"));
JavascriptExecutor  executor1=(JavascriptExecutor)driver;
System.out.println("Logout Completed");
driver.close();



		
	
}
}
