package Karuna;

import java.time.Duration;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_Waitstmt {
public static void main(String[] args) throws Exception{
	WebDriver driver=new EdgeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(4));
wait.until(ExpectedConditions.
        elementToBeClickable(driver.findElement(By.name("Submit"))));
driver.findElement(By.name("Submit")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( 5));
System.out.println("Login Completed");
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(4000);
driver.close();
}
}







	
	


