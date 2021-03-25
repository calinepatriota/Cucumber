package website.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import setup.PageObject;

public class HomePage extends PageObject {

	public HomePage(WebDriver driver) throws InterruptedException {
		super(driver);

	}

	@FindBy(how = How.XPATH, using = "//a[contains(@class,'gnb__logo')]")
	protected static WebElement homeLogo;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'mobile-menu')]//a[contains(@class,'search-btn')]")
	protected static WebElement searchButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'ProductTipBarButton')]")
	protected static WebElement buyButton;

	@FindBy(how = How.XPATH, using = "//button[@id='shipping-calculate-link']")
	protected static WebElement buyCalculator;

	@FindBy(how = How.ID, using = "ship-postalCode")
	protected static WebElement postalCode;

	@FindBy(how = How.ID, using = "cart-to-orderform")
	protected static WebElement btnFinishOrder;

	@FindBy(how = How.ID, using = "downshift-1-input")
	protected static WebElement inputSearchProduct;

	@FindBy(how = How.XPATH, using = "//*[@id=\"hyper-modal-wrapper_component_id\"]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/div/section/section/ul/li[1]/section/a/article")
	protected static By product;

	@FindBy(how = How.XPATH, using = "//section//section//ul//li")
	protected static By listProducts;

	@FindBy(how = How.XPATH, using = "//div[@class='slidedown-body-message']")
	protected static WebElement popUp;

	@FindBy(how = How.ID, using = "onesignal-slidedown-cancel-button")
	protected static WebElement btnCancelPopUp;

}
