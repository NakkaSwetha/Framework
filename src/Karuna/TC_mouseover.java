package Karuna;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC_mouseover {
public static void main(String args[]) throws Exception{
    //Test Steps
WebDriver driver = new EdgeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("Login completed");
//mouseover
Actions ac = new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
System.out.println("Mouseover completed");
Thread.sleep(3000);
//click on addemp submneu
driver.findElement(By.linkText("Add Employee")).click();
Thread.sleep(3000);
System.out.println("Clicked on submenu");
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("Logout completed");
driver.close();
}
}