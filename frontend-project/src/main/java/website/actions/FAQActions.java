package website.actions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import utils.Utils;
import website.pages.FAQPage;

public class FAQActions extends FAQPage {


	public FAQActions(WebDriver driver) throws InterruptedException {
		super(driver);
	}

	public void clickLinkFAQ() throws InterruptedException {
		Utils.sleep(4);
		driver.get("https://www.samsung.com/br/");
		Utils.sleep(4);
		Utils.scrollPage(driver);
		faqLink.click();
		Utils.sleep(4);
	}

	public void faqEntrega() throws InterruptedException {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Utils.sleep(4);
		driver.switchTo().frame(0);
		faqDelivery.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);

	}

	public void faqPrintThridQuestion() throws InterruptedException {
		Utils.sleep(4);
		thirdQuestion.click();
		System.out.println(printThirdQuestion.getText()+"\n");
		System.out.println(printAnswerThirdQuestion.getText());
	}

}