package website.actions;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Utils;
import website.pages.HomePage;

public class HomeActions extends HomePage{
	

	int count; 
	WebDriverWait wait = new WebDriverWait(driver, 60);

	 
	public HomeActions(WebDriver driver) throws InterruptedException, IOException {
		super(driver);
	}

	public void validateHomePage() throws InterruptedException {
		Utils.sleep(20);
		if (popUp.isDisplayed()) {
			btnCancelPopUp.click();
		}
		 homeLogo.isDisplayed();
	}
	
	public void searchProduct(String product,String zipCode) throws InterruptedException {		
		Utils.clickJavaScriptExecutor(driver, searchButton);
		inputSearchProduct.click();
		inputSearchProduct.sendKeys(product);
		Utils.sleep(5);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'"+product+"')]")));
		driver.findElement(By.xpath("//span[contains(text(),'"+product+"')]")).click();
		Utils.sleep(2);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'ProductTipBarButton')]")));
		 Utils.sleep(2);
		 buyButton.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='shipping-calculate-link']")));
		buyCalculator.click();
		postalCode.sendKeys(zipCode);
		Utils.sleep(10);
		btnFinishOrder.click();
		
		
	}
	
}
