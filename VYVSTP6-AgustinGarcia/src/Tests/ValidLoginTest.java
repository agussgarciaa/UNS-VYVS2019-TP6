package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import Pages.*;
import junit.framework.Assert;

public class ValidLoginTest extends BaseTest {
	
	private LoginPage loginPage;
	private HomePage homePage;
	
	public ValidLoginTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception{}
	
	
	@Test
	public void verifyLogin() throws Exception
	{
		this.loginPage = new LoginPage();
		
		this.loginPage.InputUserName().Write("standard_user");
		this.loginPage.InputPassword().Write("secret_sauce");
		this.loginPage.ButtonLogin().Click();
		
		this.homePage = new HomePage();
		
		String strProduct = this.homePage.LabelProduct().Text();
		
		Assert.assertTrue(homePage.LabelProduct().Visible());
		Assert.assertEquals(strProduct,"Products");
	}
	
	@After
	public void tearDown()
	{
		this.Finalize();		
	}

}
