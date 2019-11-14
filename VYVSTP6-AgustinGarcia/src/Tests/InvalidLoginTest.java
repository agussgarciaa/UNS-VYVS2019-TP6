package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Pages.InvalidLoginPage;
import Pages.LoginPage;
import junit.framework.Assert;

public class InvalidLoginTest extends BaseTest{

	private LoginPage loginPage;
	private InvalidLoginPage invalidLoginPage;
	
	public InvalidLoginTest() {
		super();
	}
	@Before
	public void setUp() throws Exception{}
	
	@Test
	public void VerifyInvalidLogin() throws Exception
	{		
		loginPage = new LoginPage();
		loginPage.InputUserName().Write("standard_user");
		loginPage.InputPassword().Write("noexiste");
		loginPage.ButtonLogin().Click();		
		
		invalidLoginPage = new InvalidLoginPage();		
		Assert.assertTrue(invalidLoginPage.ErrorMessage().Visible());
	}
	
	@After
	public void tearDown()
	{
		this.Finalize();		
	}

}
