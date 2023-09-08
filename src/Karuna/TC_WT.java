package Karuna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;


public class TC_WT {
public static void main(String[] args)throws Exception {
	WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sowmy/Downloads/WebTable%20(1).html");	
Thread.sleep(3000);
//count
int row=driver.findElements(By.xpath("//*[@id='idCourse\']tbody/tr")).size();
int col=driver.findElements(By.xpath("//*[@id='idCourse\']tbody/tr[1]/td")).size();
int row_col=driver.findElements(By.xpath("//*[@id=\'idCourse\']/tbody/tr/td")).size();
System.out.println("Row Count" + row);
System.out.println("Col count"+col);
System.out.println("Row_Col"+row_col);
//Data
//Data cell
String celldata=driver.findElement(By.
        xpath("//*[@id=\'idCourse\']/tbody/tr[2]/td[2]")).getText();
//Data tables
//DT Var &Vv
for(int i=1;i<=row;i++);{
	

	String data=driver.findElement(By.
	        xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
	System.out.println(data);
	Thread.sleep(3000);
	}
	driver.close();
	}
	}

	


		
		



		


