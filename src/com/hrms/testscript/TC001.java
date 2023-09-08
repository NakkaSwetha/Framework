package com.hrms.testscript;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {
//public static void main(String args[]) {
   @Test
public void TC001	() {
	//test steps
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.enterFrame();
    obj.addNewEmp();
	obj.exitFrame();
	obj.logout();

obj.closeApplication();
	
	
}
}
