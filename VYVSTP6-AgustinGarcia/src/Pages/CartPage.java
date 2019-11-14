package Pages;

import org.openqa.selenium.By;

import Controls.Button;
import Controls.Label;

public class CartPage extends BasePage{

	public CartPage() {
		super(By.cssSelector("//div[contains(text(),'Your Cart')]"));
	}
	
	public Label MyFirstProduct() {return new Label(By.xpath("//div[@class='cart_item'][1]"));}
	public Label MySecondProduct() {return new Label(By.xpath("//div[@class='cart_item'][2]"));}
	public Label MyThirdProduct() {return new Label(By.xpath("//div[@class='cart_item'][3]"));}
	public Button CheckOutButton() {return new Button(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]"));}

}
