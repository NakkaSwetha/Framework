package Karuna;


	
	import org.openqa.selenium.WebDriver;
	
	
	
	import org.openqa.selenium.edge.EdgeDriver;
	
	import org.openqa.selenium.By;

	public class TC001_Login_Logout {
	public static void main(String args[]) throws Exception{
	    //Test Steps
	WebDriver driver = new EdgeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(4000); //Wait sometime
	driver.close();
	   
	}
	}

