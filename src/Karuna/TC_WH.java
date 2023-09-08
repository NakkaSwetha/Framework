package Karuna;
import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class TC_WH {
public static void main(String args[]) throws Exception{
    //Test Steps
WebDriver driver = new EdgeDriver();
//1st wind
driver.get("file:///C:/Users/sowmy/Downloads/multiplewindows.html	");
Thread.sleep(3000);
//2nd wind
driver.findElement(By.id("btn2")).click();
Thread.sleep(3000);
//3rd wind
driver.findElement(By.id("btn3")).click();
Thread.sleep(3000);
ArrayList<String> windinfo = new ArrayList<>(driver.getWindowHandles());
driver.switchTo().window(windinfo.get(0));
Thread.sleep(3000);
//driver.close();
driver.quit();
}
}
