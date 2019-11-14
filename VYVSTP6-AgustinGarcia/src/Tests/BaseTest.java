package Tests;

import org.openqa.selenium.WebDriver;

import Driver.DriverManager;

public class BaseTest {
	private WebDriver driver;
	
	public BaseTest() {
		this.driver = DriverManager.Instance().Driver();
		this.driver.get("https://www.saucedemo.com/");
	}
	
	protected WebDriver Driver() {
		return this.driver;
	}
	
	protected void Finalize() {
		DriverManager.Instance().CloseDriver();
	}
}
