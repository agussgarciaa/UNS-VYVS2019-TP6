package Driver;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DriverWrapper {

	public static WebDriver Driver() {
		return DriverManager.Instance().Driver();
	}
	
	public static boolean IsVisible(By by) {
		try {
			return ExpectedConditions.visibilityOfElementLocated(by)!=null;
		} catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public static boolean IsEnabled(By by) {
		try {
			return Driver().findElement(by).isEnabled();
		} catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public static boolean IsClickable(By by) {
		try {
			return IsVisible(by) && ExpectedConditions.elementToBeClickable(by)!=null;
		} catch(NoSuchElementException e) {
			return false;
		}
	}
}
