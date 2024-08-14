package com.amazon.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	
	
	//variables
	WebDriver driver;
public	String url="https://www.amazon.in";
public String searchitem="iphone";
public String pagetitle="amazon.in";
	
	
	//objects
public String Search_id="twotabsearchtextbox";
	
public String Searchbtn_id="nav-search-submit-button";
public String launguage_id="icp-nav-flyout";
public String hindiradiobtn_xpath="//*[@id=\"nav-flyout-icp\"]/div[2]/a[2]/span/i";
}
