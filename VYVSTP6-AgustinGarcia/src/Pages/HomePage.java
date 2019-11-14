package Pages;

import java.util.ArrayList;
//import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Controls.Button;
import Controls.Label;

public class HomePage extends BasePage {
	
 	
	public HomePage() {
		super(By.cssSelector("//div[contains(text(),'Products')]"));
	}
	
	public HomePage(By by) {
		super(by);
	}
	
	public ArrayList<Button> AllProducts(){
		ArrayList<Button> productsList = new ArrayList<Button>();
		for (int i=0;i<=5;i++) {
			productsList.add(new Button(By.xpath("//div[@class='inventory_list']/div["+i+"]/div[@class='pricebar']/button")));
		}
		
		return productsList;
	}
	
	public Label LabelProduct() {return new Label(By.xpath("//div[contains(text(),'Products')]"));}
	public Button BtnFirstProduct() {return new Button(By.xpath("//div[@class='inventory_list']/div[2]/div[@class='pricebar']/button"));}
	public Button BtnSecondProduct() {return new Button(By.xpath("//div[@class='inventory_list']/div[1]/div[@class='pricebar']/button"));}
	public Button BtnThirdProduct() {return new Button(By.xpath("//div[@class='inventory_list']/div[4]/div[@class='pricebar']/button"));}
	public Button BtnGoToMyCart() {return new Button(By.xpath("//a[@href='./cart.html']"));}
	public WebElement BtnGoToMyCart = this.Driver().findElement(By.xpath("//a[@href='./cart.html']"));


}
