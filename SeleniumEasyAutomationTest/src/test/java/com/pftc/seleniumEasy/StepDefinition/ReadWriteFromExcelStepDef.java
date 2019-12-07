package com.pftc.seleniumEasy.StepDefinition;

import org.openqa.selenium.By;

import com.pftc.seleniumEasy.PageObject.Base;

import cucumber.api.java.en.Given;
import utilities.ReadWriteFromExcel;

public class ReadWriteFromExcelStepDef extends Base{

	
	ReadWriteFromExcel readWriteFromExcel=new ReadWriteFromExcel();
	
	
	
	@Given("^User Read data form Excel File$")
	public void user_Read_data_form_Excel_File() throws Throwable {
		
		for(int i=0;i<4;i++) {
		for(int j=1;j<3;j++){
		
		         
		String user= readWriteFromExcel.readExcel("TestData.xlsx",0,j,0);
		String pass= readWriteFromExcel.readExcel("TestData.xlsx",0,j,1);
		//readWriteFromExcel.readExcel("TestData2.xlsx",0,j,i);
		driver.findElement(By.id("test")).sendKeys(user);
		
		driver.findElement(By.id("test")).sendKeys(pass);
		
		
		}

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
