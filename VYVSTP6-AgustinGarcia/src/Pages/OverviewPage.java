package Pages;

import org.openqa.selenium.By;

import Controls.Button;
import Controls.Label;

public class OverviewPage extends BasePage{		
		public OverviewPage() {
			super(By.cssSelector("//div[contains(text(),'Checkout: Overview')]"));
		}
		
		public OverviewPage(By by) {
			super(by);
		}
		
		public Label LabelOverview() {return new Label(By.xpath("//div[contains(text(),'Checkout: Overview')]"));}
		public Button FinishButton() {return new Button(By.cssSelector(".btn_action"));}
		
}
