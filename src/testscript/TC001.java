package testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {
@Test
public void tc001() {
	//public static void main(String[] args) {
		General obj = new General();
		DOMConfigurator.configure("Log4j.xml");
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.addNewEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();

	}

}
