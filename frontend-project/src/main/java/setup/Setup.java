package setup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utils.Utils;

public class Setup {

	protected static WebDriver driver;
	
	public void before() throws InterruptedException, IOException {
		File f = new File("chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("enable-automation");
		System.setProperty("webdriver.chrome.driver", Utils.getPath(f));
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		

	}

	public  WebDriver getDriver() throws InterruptedException, IOException {
		return driver;
	}

	public void after() {
		driver.quit();
	}

}
