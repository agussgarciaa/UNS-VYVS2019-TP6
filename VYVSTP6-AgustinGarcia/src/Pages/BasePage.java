package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Driver.DriverManager;


public class BasePage {
	protected By by;
	
	public BasePage(By findBy) {
		this.by = findBy;
	}
	
	protected WebDriver Driver() {
		return DriverManager.Instance().Driver();
	}	
	
}
