package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelOne {
	@Test
	private void tc4() {
		System.out.println("tc4 :"+ Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
	}
	@Test
	private void tc5() {
		System.out.println("tc5 :"+ Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/movies");
		driver.manage().window().maximize();
	}
	@Test
	private void tc6() {
		System.out.println("tc6 :"+ Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pnbindia.in/");
		driver.manage().window().maximize();
	}

}
