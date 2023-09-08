package Karuna;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.By;

public class TC_Verify {
public static void main(String args[]) throws Exception{
   
WebDriver driver = new EdgeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println("Application opened");

if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
System.out.println("Title matched");    
}
else {
System.out.println("Title not matched");
System.out.println(driver.getTitle());
}
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");

Thread.sleep(4000);
driver.findElement(By.name("Submit")).click();				
Thread.sleep(4000);
System.out.println("Login completed");

if(driver.getTitle().equals("OrangeHRM")) {
System.out.println("Title matched");    
}
else {
System.out.println("Title not matched");
System.out.println(driver.getTitle());
}
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(4000);
System.out.println("Logout completed");
driver.close();
}
}
