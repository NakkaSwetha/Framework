package Karuna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TC_KB_WD {
public static void main(String args[])throws Exception {
WebDriver driver=new EdgeDriver();
driver.navigate().to("https://www.google.com/");
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys("Selenium");
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
driver.close();
}
}



