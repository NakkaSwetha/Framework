package Karuna;

import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.interactions.Actions;
import java.io.File;




public class Screenshots {


private static final WebElement Element = null;
private static final String FileUtils = null;

public static void main(String[] args)throws Exception {
	WebDriver driver=new EdgeDriver();
	try {
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtuserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("PIM"));
		Actions action = new Actions(driver);
		action.moveToElement(Element).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee12")).click();
		Thread.sleep(3000);
		System.out.println("Clicked on submenu");
		driver.findElement(By.linkText("Logout")).click();
	}
	catch(Exception e) {
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.CopyFile(f1,new File("\"C:\\Adactin\\screen1.png"));
	}
		driver.quit();
}
		
	}
		
		
		
	
		
	
	
	
	


