package website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import setup.PageObject;

public class ListSmartphonesPage extends PageObject{

	public ListSmartphonesPage(WebDriver driver) throws InterruptedException {
		super(driver);
		
	}
	  
	  @FindBy(how = How.XPATH, using ="//span[contains(text(),'Telefonia')]")
	  protected static WebElement menuPhone;
	  
	  @FindBy(how = How.XPATH, using ="//span[contains(text(),'Smartphones')]")
	  protected static WebElement smartphones;
	  
	  @FindBy(how = How.XPATH, using ="//span[contains(text(),'Ordenar Por')]")
	  protected static WebElement orderBy;
	  
	  @FindBy(how = How.XPATH, using ="//button[contains(text(),'Menor preço')]")
	  protected static WebElement orderByLowPrice;
	  
	  @FindBy(how = How.XPATH, using ="//a[contains(text(),'COMPANHIA')]")
	  protected static WebElement scroll;
	  
	
	  
	
	 
}
