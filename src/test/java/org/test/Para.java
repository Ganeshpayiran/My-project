package org.test;
import java.util.Date;

import org.mavenBaseclass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Para extends Baseclass {
	//@Parameters({"userName","password"})
	@Parameters({"user","pass"})
	@Test
	//private void tc9(String e , String p) {
	private void tc9(@Optional("abc@gmail.com")String e , @Optional("123456") String p) {
		driver.get("https://en-gb.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(e);
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys(p);
	}
	@BeforeClass
	private void LaunchTheBrowser() {
		launchBrowser();
		windowMaximize();

	}
	@AfterMethod
	private void EndDate() {
		Date d = new Date();
		System.out.println(d);

	}
	

}
