package Karuna;

import java.awt.Robot;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc_KB_RC {
public static void main(String args[]) throws Exception{
WebDriver driver = new EdgeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtpassword")).sendKeys("nareshit");
Thread.sleep(4000);
Robot r = new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(4000);
System.out.println("TAB");
r.keyPress(KeyEvent.VK_ENTER);
r.keyPress(KeyEvent.VK_ENTER);
System.out.println("enter");
Thread.sleep(4000);
System.out.println("Login completed");
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.close();
}
}










