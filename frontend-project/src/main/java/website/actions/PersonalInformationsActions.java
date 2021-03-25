package website.actions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Utils;
import website.pages.PersonalInformationsPage;

public class PersonalInformationsActions extends PersonalInformationsPage{
	WebDriverWait wait = new WebDriverWait(driver, 50);

	
	public PersonalInformationsActions(WebDriver driver) throws InterruptedException {
		super(driver);
	}
	
	public void fillPersonalInformations(String document,String phone) throws InterruptedException {		
		email.sendKeys(Utils.randomEmail());
		btnEmail.click();
		Utils.sleep(5);
		firstName.sendKeys(Utils.firstName());
		lastName.sendKeys(Utils.lastName());
		documentNumber.sendKeys(document);
		phoneNumber.sendKeys(phone);
		try {
			checkTerms.click();
			checkPolicies.click();
			
		} catch (Exception e) {
			System.out.println("Agreements Terms has not been appeared");
		}
		btnShipping.click();
		Utils.sleep(2);		
	}
	
	public void addressInformation(String document,String phone) throws InterruptedException {		
		email.sendKeys(Utils.randomEmail());
		btnEmail.click();
		Utils.sleep(5);
		firstName.sendKeys(Utils.firstName());
		lastName.sendKeys(Utils.lastName());
		documentNumber.sendKeys(document);
		phoneNumber.sendKeys(phone);
		btnShipping.click();
		Utils.sleep(2);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ship-number")));
		numberHome.sendKeys(Utils.adressNumber());
		reference.sendKeys(Utils.adressReference());
		receiverName.sendKeys(Utils.name());
		Utils.sleep(2);	
		
	}
	
	public void validateFreeShipping() throws InterruptedException {
		btnGoPayment.click();
		Utils.sleep(4);	
		clickBoleto.click();
		Utils.sleep(12);	
		Assert.assertEquals(labelShipping.getText(),"Grátis");
		}
	
	
}
