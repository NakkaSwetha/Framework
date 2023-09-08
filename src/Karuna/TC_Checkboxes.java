package Karuna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;

public class TC_Checkboxes {
	public static void main(String args[])throws Exception {
	WebDriver driver = new EdgeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(5000);
System.out.println("Login completed");
driver.switchTo().frame("rightMenu");
for(int i=1;i<=10;i=i+2) {
driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td[1]/input")).click();
System.out.println("Clicked on Checkbox of "+i);
Thread.sleep(4000);
}
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(40000);
driver.close();
	}

}
