package Tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Pages.*;


public class MyCartTest extends BaseTest{
	
	public LoginPage loginPage;
	public HomePage homePage;
	public CartPage cartPage;
	
	public MyCartTest() {
		super();
	}

	
	@Before
	public void setUp() throws Exception{}
	
	@Test
	public void VerifyMyCart(){
		loginPage = new LoginPage();
		
		loginPage.InputUserName().Write("standard_user");
		loginPage.InputPassword().Write("secret_sauce");
		loginPage.ButtonLogin().Click();
		
		homePage = new HomePage();
		
		homePage.BtnFirstProduct().Click();
		homePage.BtnSecondProduct().Click();
		homePage.BtnThirdProduct().Click();	
		
		homePage.BtnGoToMyCart().Click();
		
		cartPage = new CartPage();
		
		Assert.assertTrue(cartPage.MyFirstProduct().Visible());
		Assert.assertTrue(cartPage.MySecondProduct().Visible());
		Assert.assertTrue(cartPage.MyThirdProduct().Visible());
		
	}
	@After
	public void tearDown()
	{
		this.Finalize();
		
	}
}
