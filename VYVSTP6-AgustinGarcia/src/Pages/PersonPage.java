package Pages;

import org.openqa.selenium.By;

import Controls.Button;
import Controls.Label;

public class PersonPage extends BasePage{
	
	public PersonPage() {
		super(By.xpath("/html/body/div[1]/div/p[1]"));
	}
	
	public Button GenerateButton() {
		return new Button(By.xpath("//*[@id=\"generate\"]"));
	}
	
	public Label NameLabel() {
		return new Label(By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div/div[1]/p/b"));
	}
	
	public Label ZipLabel() {
		return new Label(By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div/div[2]/p[5]/b"));
	}

}
