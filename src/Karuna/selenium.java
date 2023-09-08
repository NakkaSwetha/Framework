package Karuna;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sowmy/Downloads/WebTable%20(1).html");
	List<WebElement>ssk	=driver.findElement(By.id("idCourse")).findElements(By.tagName("tr"));
		System.out.println(ssk.size());
		for(int  i=1;i<ssk.size();i++) {
		List<WebElement> psk = ssk.get(i).findElements(By.tagName("td"));
		System.out.println(psk.size());
	    String v	= psk.get(0).getText();
	    String v1	=psk.get(1).getText();
	    String v2	=psk.get(2).getText();
	    String v3	=psk.get(3).getText();
	    System.out.println(v+ "   " + v1+  "    "  +v2+  "     "  +v3);
		System.out.println("******************************");
		
	}

}
}