package com.amazon.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.amazon.lib.General;

public class TC002 {
	
	
	@Test
	public void tc002() {
		DOMConfigurator.configure("Log4j.xml");
		General ge=new General();
		
		ge.openapplication();
		ge.Title();
		ge.verifylaunguage();
		ge.closeapplication();
		
	}
	
	
	
	
	

}
