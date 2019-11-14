package Pages;

import org.openqa.selenium.By;

import Controls.Button;
import Controls.Input;
import Controls.Label;

public class InfoPage extends BasePage{
	
	public InfoPage() {
		super(By.cssSelector("//div[contains(text(),'Checkout: Your Information')]"));
	}
	
	public InfoPage(By by) {
		super(by);
	}

	public Label LabelInfo() {return new Label(By.xpath("//div[contains(text(),'Checkout: Your Information')]"));}
	public Input InputFirstName() {return new Input(By.id("first-name"));}
	public Input InputLastName() {return new Input(By.id("last-name"));}
	public Input InputPostalCode() {return new Input(By.id("postal-code"));}
	public Button ContinueButton() {return new Button(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input"));}
}
