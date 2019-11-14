package Tests;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Pages.*;
import java.util.concurrent.TimeUnit ;

public class BigTest extends BaseTest {
	
	private LoginPage loginPage;
	private HomePage homePage;
	private CartPage cartPage;
	private InfoPage infoPage;
	private PersonPage personPage;
	private OverviewPage overviewPage;
	private FinishPage finishPage;
	
	public BigTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception{}
	
	@Test
	public void VerifyBuyRandomProductSuccessfully() throws InterruptedException {
		
		this.Driver().get("https://www.fakepersongenerator.com/Index/generate");
		TimeUnit.SECONDS.sleep(1);
	
		personPage = new PersonPage();
		personPage.GenerateButton().Click();
		String[] bothnames = personPage.NameLabel().Text().split(" ");
		String[] zipandmore = personPage.ZipLabel().Text().split(",");
		
		this.Driver().get("https://www.saucedemo.com/");
		TimeUnit.SECONDS.sleep(1);
		
		loginPage = new LoginPage();		
		loginPage.InputUserName().Write("standard_user");
		loginPage.InputPassword().Write("secret_sauce");
		loginPage.ButtonLogin().Click();
		TimeUnit.SECONDS.sleep(1);
		
		homePage = new HomePage();
		Random rnd = new Random();
		homePage.AllProducts().get(rnd.nextInt(5)).Click();
		TimeUnit.SECONDS.sleep(1);
		homePage.BtnGoToMyCart().Click();
		
		cartPage = new CartPage();
		TimeUnit.SECONDS.sleep(1);
		cartPage.CheckOutButton().Click();
		
		
		infoPage = new InfoPage();
		infoPage.InputFirstName().Write(bothnames[0]);
		infoPage.InputLastName().Write(bothnames[2]);
		infoPage.InputPostalCode().Write(zipandmore[2]);
		TimeUnit.SECONDS.sleep(1);
		infoPage.ContinueButton().Click();
		
		overviewPage = new OverviewPage();
		TimeUnit.SECONDS.sleep(1);
		overviewPage.FinishButton().Click();
		
		finishPage = new FinishPage();
		TimeUnit.SECONDS.sleep(1);
		Assert.assertEquals(finishPage.ThanksLabel().Text(),"THANK YOU FOR YOUR ORDER");
		Assert.assertEquals(finishPage.DispatchedLabel().Text(),"Your order has been dispatched, and will arrive just as fast as the pony can get there!");
		
	}
	
	@After
	public void tearDown() {
		this.Finalize();
	}
}
