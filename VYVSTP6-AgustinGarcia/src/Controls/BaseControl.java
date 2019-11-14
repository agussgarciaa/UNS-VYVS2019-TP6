package Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Driver.DriverWrapper;

public class BaseControl {
	
	protected By by;
	
	public BaseControl (By findBy) {
		this.by=findBy;
	}
	protected WebDriver Driver() {
		return DriverWrapper.Driver();
	}
	
	protected WebElement Element() {
		try {
			return this.Driver().findElement(this.by);
		} catch(NoSuchElementException e) {
			return null;
		}
	}
	
	public String Identifier() {
		return this.by.toString().substring(3);
	} 
	
	public boolean Visible() {
		try {
			return DriverWrapper.IsVisible(this.by);
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean Enabled() {
		try {
			return DriverWrapper.IsEnabled(this.by);
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public String GetAtributte(String Name) {
		try {
			return this.Driver().findElement(this.by).getAttribute(Name);
		} catch(NoSuchElementException e) {
			return null;
		}
	}

}
