package Pages;

import org.openqa.selenium.By;
import Controls.Button;
import Controls.Input;

public class LoginPage extends BasePage{

	public LoginPage() {
		super(By.cssSelector("//input[@value='LOGIN']"));
	}
	
	public LoginPage(By by) {
		super(by);
	}
	

	public Input InputUserName() {return new Input(By.id("user-name"));}
	
	public Input InputPassword() {return new Input(By.id("password"));}
	
	public Button ButtonLogin() {return new Button(By.xpath("//input[@value='LOGIN']"));}

}
