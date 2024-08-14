package com.amazon.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.amazon.lib.General;

public class TC001 {
	@Test
	public void tc001() throws Exception{
		DOMConfigurator.configure("Log4j.xml");
		
		General ge=new General();
		
		ge.openapplication();
		ge.search();
		ge.closeapplication();
		
		
	}
	

}
