package com.pftc.seleniumEasy.StepDefinition;

import com.pftc.seleniumEasy.PageObject.Base;
import com.pftc.seleniumEasy.PageObject.ExamPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class scenarioOutlineStepDef extends Base{

	ExamPage examPage;

@Given("^User navigae to pracvticeselenium webpage$")
public void user_navigae_to_pracvticeselenium_webpage() throws Throwable {
	String URL = prop.getProperty("examApp");
	driver.get(URL);
	examPage=new ExamPage();
	
}

@When("^User click on manu button$")
public void user_click_on_manu_button() throws Throwable {
	examPage.clickMenuButton();
	
}

@Then("^User verify the green tea text$")
public void user_verify_the_green_tea_text() throws Throwable {
	examPage.textCheck();
}

@Then("^User click on checkout button$")
public void user_click_on_checkout_button() throws Throwable {
	examPage.checkOutButton.click();
}

@Then("^user fillup customer \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_fillup_customer_and_and(String arg1, String arg2, String arg3) throws Throwable {

	 examPage.emailAddress.sendKeys(arg1);
	   examPage.customerName.sendKeys(arg2);
	   examPage.customerAddress.sendKeys(arg3);
	 
}

@Then("^payment information$")
public void payment_information() throws Throwable {
	  Select selectCard=new Select(driver.findElement(By.id("card_type")));
	   selectCard.selectByVisibleText("Visa");
	   examPage.customerCardNumber.sendKeys("411111111111111");
	   examPage.cardHolderName.sendKeys("Abcd");
	   examPage.cardVerificationCode.sendKeys("1234");
	   Thread.sleep(5000);
}

@Then("^Click the place order button$")
public void click_the_place_order_button() throws Throwable {
	examPage.placeOrderButton.click(); 
}


}
