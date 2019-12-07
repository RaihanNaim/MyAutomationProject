package com.pftc.seleniumEasy.StepDefinition;

import com.pftc.seleniumEasy.PageObject.Base;
import com.pftc.seleniumEasy.PageObject.ExamPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class Exam extends Base {

	ExamPage examPage;
	
	@Given("^User Click on Menu button$")
	public void user_Click_on_Menu_button() throws Throwable {
	String URL = prop.getProperty("examApp");
		driver.get(URL);
		examPage=new ExamPage();
		examPage.clickMenuButton();
		examPage.textCheck();
	}

	@When("^User Click on Check out button$")
	public void user_Click_on_Check_out_button() throws Throwable {
		examPage.checkOutButton.click();
		
		Thread.sleep(5000);
	}

	@Then("^User Fill up all the information file$")
	public void user_Fill_up_all_the_information_file() throws Throwable {
	   examPage.emailAddress.sendKeys("abc@gmail.com");
	   examPage.customerName.sendKeys("Raihan");
	   examPage.customerAddress.sendKeys("100 Mass");
	   Select selectCard=new Select(driver.findElement(By.id("card_type")));
	   selectCard.selectByVisibleText("Visa");
	   examPage.customerCardNumber.sendKeys("411111111111111");
	   examPage.cardHolderName.sendKeys("Abcd");
	   examPage.cardVerificationCode.sendKeys("1234");
	   Thread.sleep(5000);
	}

	@Then("^User Click on Place order button$")
	public void user_Click_on_Place_order_button() throws Throwable {
	    	examPage.placeOrderButton.click();   
	}
	
	
	
	
}
