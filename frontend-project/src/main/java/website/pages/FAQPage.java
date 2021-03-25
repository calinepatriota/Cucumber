package website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import setup.PageObject;

public class FAQPage extends PageObject {

	public FAQPage(WebDriver driver) throws InterruptedException {
		super(driver);

	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'FAQ Loja Online')]")
	protected static WebElement faqLink;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Telefonia')]")
	protected static WebElement menuPhone;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Smartphones')]")
	protected static WebElement smartphones;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Entrega')]")
	protected static WebElement faqDelivery;

	@FindBy(how = How.XPATH, using = "//ul[@class='search-content']//li[3]//a//span[1]")
	protected static WebElement thirdQuestion;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='search-content']//li[3]//a//span[2]")
	protected static WebElement printThirdQuestion;

	@FindBy(how = How.XPATH, using = "//li[3]/div/div[1]/span")
	protected static WebElement printAnswerThirdQuestion;

}
