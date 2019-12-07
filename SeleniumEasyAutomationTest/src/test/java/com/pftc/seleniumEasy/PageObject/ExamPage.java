package com.pftc.seleniumEasy.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class ExamPage extends Base {

	public ExamPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Menu")
	public WebElement manuButton;
	
	@FindBy(xpath="//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
	public WebElement checkOutButton;
	@FindBy(css="#wsb-element-00000000-0000-0000-0000-000453230000 > div > p > span > span > strong")
	public WebElement textCheck;
	@FindBy(id="email")
	public WebElement emailAddress;
	@FindBy(id="name")
	public WebElement customerName;
	@FindBy(id="address")
	public WebElement customerAddress;
	@FindBy(id="card_type")
	public WebElement cardTypeDropDown;
	@FindBy(id="card_number")
	public WebElement customerCardNumber;
	@FindBy(id="cardholder_name")
	public WebElement cardHolderName;
	@FindBy(id="verification_code")
	public WebElement cardVerificationCode;
	@FindBy(xpath="//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")
	public WebElement placeOrderButton;
	public void clickMenuButton() {
		manuButton.click();
	}

	public void textCheck() {
		String expectedValue="Green Tea";
		String actualValue=textCheck.getText();
		Assert.assertEquals(expectedValue, actualValue);
		
	}
	

//	public void selectCardType() {
//		Select cardType = new Select(driver.findElement(By.id("card_type")));
//		cardType.selectByVisibleText("Visa");
//		
//	}

}
