package Karuna;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;


public class TC_Webhandle {
	//Test steps
public static void main(String args[]) throws Exception{
	WebDriver driver=new EdgeDriver();
driver.get("file:///C:/Users/sowmy/Downloads/multiplewindows.html");
Thread.sleep(3000);
driver.findElement(By.id("btn2")).click();
Thread.sleep(3000);
//3rd wind
ArrayList<String>windinfo=new ArrayList<>(driver.getWindowHandles());
driver.switchTo().window(windinfo.get(0));
Thread.sleep(3000);
//driver.close();
driver.quit();
}
}	
	


