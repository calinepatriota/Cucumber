package website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import setup.PageObject;

public class PersonalInformationsPage extends PageObject {

	public PersonalInformationsPage(WebDriver driver) throws InterruptedException {
		super(driver);

	}

	@FindBy(how = How.ID, using = "client-pre-email")
	protected static WebElement email;

	@FindBy(how = How.ID, using = "btn-client-pre-email")
	protected static WebElement btnEmail;

	@FindBy(how = How.ID, using = "client-first-name")
	protected static WebElement firstName;

	@FindBy(how = How.ID, using = "client-last-name")
	protected static WebElement lastName;

	@FindBy(how = How.ID, using = "client-document")
	protected static WebElement documentNumber;

	@FindBy(how = How.ID, using = "client-phone")
	protected static WebElement phoneNumber;

	@FindBy(how = How.ID, using = "go-to-shipping")
	protected static WebElement btnShipping;

	@FindBy(how = How.ID, using = "ship-number")
	protected static WebElement numberHome;

	@FindBy(how = How.ID, using = "ship-reference")
	protected static WebElement reference;

	@FindBy(how = How.ID, using = "ship-receiverName")
	protected static WebElement receiverName;

	@FindBy(how = How.ID, using = "btn-go-to-payment")
	protected static WebElement btnGoPayment;

	@FindBy(how = How.XPATH, using = "//div[2]//div[2]//div[2]//div[2]//table//..//tr[3]/td[3]")
	protected static WebElement labelShipping;

	@FindBy(how = How.ID, using = "inputTerm")
	protected static WebElement checkTerms;

	@FindBy(how = How.ID, using = "inputPolitics")
	protected static WebElement checkPolicies;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Boleto bancário']")
	protected static WebElement clickBoleto;
	
	
	

}
