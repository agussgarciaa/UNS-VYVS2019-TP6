package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Pages.LoginPage;
import junit.framework.Assert;

public class LoginAllElementsTest extends BaseTest {
	
	private LoginPage loginPage;
	
	public LoginAllElementsTest() {
		super();
	}	
	
	@Before
	public void setUp() throws Exception{}
	
	@Test
	public void verifyVisibilityOfAllElements() throws Exception
	{
		loginPage = new LoginPage();
		
		Assert.assertTrue(this.loginPage.InputUserName().Visible());
		Assert.assertEquals(this.loginPage.InputUserName().GetAtributte("placeholder"),"Username");
		Assert.assertTrue(this.loginPage.InputPassword().Visible());
		Assert.assertEquals(this.loginPage.InputPassword().GetAtributte("placeholder"),"Password");
		Assert.assertTrue(this.loginPage.ButtonLogin().Visible());		
	}
	
	@After
	public void tearDown()
	{
		this.Finalize();
		
	}
}
