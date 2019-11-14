package Pages;

import org.openqa.selenium.By;

import Controls.Label;

public class FinishPage extends BasePage {
	public FinishPage() {
		super(By.cssSelector("//div[contains(text(),'Finish')]"));
	}
	
	public FinishPage(By by) {
		super(by);
	}
	
	public Label FinishLabel() {return new Label(By.xpath("//div[contains(text(),'Finish')]"));}
	public Label ThanksLabel() {return new Label(By.xpath("/html/body/div/div[2]/div[3]/h2"));}
	public Label DispatchedLabel() {return new Label(By.xpath("/html/body/div/div[2]/div[3]/div[1]"));}
	
}
