package Pages;

import org.openqa.selenium.By;

import Controls.Label;

public class InvalidLoginPage extends LoginPage{
	public InvalidLoginPage() {
		super(By.cssSelector("//input[@value='LOGIN']"));
	}
	
	public InvalidLoginPage(By by) {
		super(by);
	}

	public Label ErrorMessage() {return new Label(By.className("error-button"));}
}
