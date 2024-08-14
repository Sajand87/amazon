package com.amazon.lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.utility.Log;

import jxl.Sheet;
import jxl.Workbook;

public class General extends Global {
	
	
	@BeforeTest
	public void openapplication() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		System.out.println("URL OPEN SUCESSFULLY");
		Log.info("Application opened sucessfully");
	}
	@Test
	public void search() throws Exception   {
		FileInputStream st=new FileInputStream("C:\\Users\\bulu9\\Desktop\\data.xls");
		Workbook wb= Workbook.getWorkbook(st);
		Sheet sh=wb.getSheet(0);
		String itemname=sh.getCell(0, 0).getContents();
		driver.findElement(By.id(Search_id)).sendKeys(itemname);
		
		driver.findElement(By.id(Searchbtn_id)).click();
		Reporter.log("ITEM ADDED SUCESSFULLY");
		Log.info("Item searced sucessfully");
	}
	@Test
	public void Title() {
		
		if(driver.getTitle().equals(pagetitle)) {
			System.out.println("Titel verified");
		}
		else {
			System.out.println(driver.getTitle());
		}
		//span[@style='unicode-bidi:isolate; direction:ltr;']
		Log.info("Title Verified");
	}
	@Test
	public void verifylaunguage()
	{
		
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.id(launguage_id))).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.findElement(By.xpath(hindiradiobtn_xpath)).click();
		Reporter.log("Launguage selected sucessfully");
		Log.info("Launguage Verified");
	}
	
	
	
	@AfterTest
	public void closeapplication() {
		
		
		driver.close();
		System.out.println("APPLICATION CLOSEED SUCESSFULLY");
		Log.info("Application closed");
		
	}
	
	
	
	
	
	

}
