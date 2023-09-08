package Karuna;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.co.in/"); 
      
      List<WebElement>ssk=driver.findElements(By.xpath("//a"));
      System.out.println(ssk.size());
      
       for(WebElement v :ssk) {
    	   
    	String s    = v.getText();
    	System.out.println(s);
    	   
       }
      
      
}
}
