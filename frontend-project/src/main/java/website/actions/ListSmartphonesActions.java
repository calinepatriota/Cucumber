package website.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Utils;
import website.pages.ListSmartphonesPage;

public class ListSmartphonesActions extends ListSmartphonesPage {

	int count;
	WebDriverWait wait = new WebDriverWait(driver, 60);
	Actions action = new Actions(driver);

	public ListSmartphonesActions(WebDriver driver) throws InterruptedException {
		super(driver);
	}

	public void menuTelefonia() throws InterruptedException {
		action.moveToElement(menuPhone).perform();
		Utils.sleep(6);
		action.moveToElement(smartphones).perform();
		Utils.sleep(2);
		smartphones.click();
		Utils.sleep(4);
	}

	public void orderBy() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Ordenar Por')]")));
		orderBy.click();
		action.moveToElement(orderByLowPrice).perform();
		Utils.sleep(4);
		orderByLowPrice.click();
		Utils.sleep(4);
	}
	
	public void printSmartphones() throws InterruptedException {
		Utils.scrollPage(driver);
		List<WebElement> products = driver
				.findElements(By.xpath("//div[contains(@class,'resultGallery')]//div//section//a//article//h3"));
		count = products.size();
		System.out.println("Total: " + count+ "\n");
		for (int i = 1; i < count; i++) {
			System.out.println(driver
					.findElement(By
							.xpath("//div[contains(@class,'resultGallery')]//div[" + i + "]//section//a//article//h3"))
					.getText() + "\n");

		}


}
}