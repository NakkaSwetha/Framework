package Testngexamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_WD_Testng {
    WebDriver driver;
@BeforeClass
public void startUp() {
   driver = new FirefoxDriver();
}
@AfterClass
public void tearDown() {
driver.close();
}
@Test
public void tc001() throws Exception{
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php&quot");    
Reporter.log("Application opened");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Reporter.log("Login completed");
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();
Reporter.log("Logout completed");
}
}



