package utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

public class Utils {

	public static String getPath(File file) {

		return file.getAbsolutePath();
	}

	public static void sleep(int time) throws InterruptedException {
		TimeUnit.SECONDS.sleep(time);

	}

	public static void clickJavaScriptExecutor(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}

	public static String randomEmail() {
		Faker faker = new Faker();
		return faker.internet().emailAddress();
	}

	public static String name() {
		Faker faker = new Faker();
		return faker.gameOfThrones().character();
	}

	public static String firstName() {
		Faker faker = new Faker();
		return faker.name().firstName();
	}

	public static String lastName() {
		Faker faker = new Faker();
		return faker.name().lastName();
	}

	public static String number() {
		Faker faker = new Faker();
		return faker.number().digits(4);
	}

	public static String adressNumber() {
		Faker faker = new Faker();
		return faker.address().buildingNumber();
	}

	public static String adress() {
		Faker faker = new Faker();
		return faker.address().fullAddress();
	}

	public static String adressReference() {
		Faker faker = new Faker();
		return faker.address().streetName();
	}
	
	
	public static void scrollPage(WebDriver driver) {

		try {
		    long lastHeight =  (Long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

		    while (true) {
		        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		        Thread.sleep(10000);

		        long newHeight = (Long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
		        if (newHeight == lastHeight) {
		            break;
		        }
		        lastHeight = newHeight;
		    }
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	}

}
