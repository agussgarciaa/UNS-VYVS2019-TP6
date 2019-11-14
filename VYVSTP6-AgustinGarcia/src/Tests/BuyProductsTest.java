package Tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Pages.*;

public class BuyProductsTest extends BaseTest {
	
	private LoginPage loginPage;
	private HomePage homePage;
	
	public BuyProductsTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception{}
	
	@Test
	public void VerifyBuyThreeProducts(){
		loginPage = new LoginPage();
		
		loginPage.InputUserName().Write("standard_user");
		loginPage.InputPassword().Write("secret_sauce");
		loginPage.ButtonLogin().Click();
		
		homePage = new HomePage();
		
		homePage.BtnFirstProduct().Click();
		homePage.BtnSecondProduct().Click();
		homePage.BtnThirdProduct().Click();	
		
		Assert.assertEquals(homePage.BtnGoToMyCart.findElement(By.xpath("//*[@id='shopping_cart_container']/a/span")).getText(),"3");
	}
	
	@After
	public void tearDown()
	{
		this.Finalize();
		
	}
}
