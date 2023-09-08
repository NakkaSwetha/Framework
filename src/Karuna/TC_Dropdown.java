package Karuna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
public static void main(String args[]) throws Exception{
	WebDriver driver=new EdgeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
driver.switchTo().frame("rightmenu");
Select st = new Select(driver.findElement(By.name("LOC_code")));
//st.selectByVisibleText("Emp. ID");
//st.selectByIndex(1);
st.selectByValue("0");
Thread.sleep(3000);	
driver.findElement(By.name("Loc_code")).sendKeys("1289");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='Search']")).click();
Thread.sleep(3000);
driver.findElement(By.name("chkLocId[]")).click();
Thread.sleep(3000);
//Exit from frame
driver.findElement(By.xpath("//input[@value='Delete']")).click();
Thread.sleep(3000);
driver.close();
}
}
		



			
	


