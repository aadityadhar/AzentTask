package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import java.util.concurrent.TimeUnit;

import baseTests.BaseClass;
import utilities.Utilities;


public class AzentTests extends BaseClass {
	
	Utilities util=new Utilities();

	@Test(priority=1)
	public void verifyInvalidLogin() throws Exception //verify invalid login - no input
	{
		loginPageObject.clickOnLogin(driver);
		testInfo.log(Status.INFO,"Clicking on Sign in Button");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='username-helper-text']")).getText().contains("Please Enter Your Email / Phone Number"));
		testInfo.log(Status.INFO,"Email needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='password-helper-text']")).getText().contains("Please Enter Your Password"));
		testInfo.log(Status.INFO,"Password needs to be entered");
		
	}
	
	@Test(priority=2)
	public void verifyInvalidLoginWOP() throws Exception //verify invalid login - WithoutPassword
	{
		loginPageObject.enterEmail(driver,read.getEmail());
		testInfo.log(Status.INFO,"Entering email: "+read.getEmail());
		
		loginPageObject.clickOnLogin(driver);
		testInfo.log(Status.INFO,"Clicking on Sign in Button");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='password-helper-text']")).getText().contains("Please Enter Your Password"));
		testInfo.log(Status.INFO,"Password needs to be entered");
		
	}
	
	@Test(priority=3)
	public void verifyInvalidLoginWOU() throws Exception //verify invalid login - WithoutUserName
	{
		loginPageObject.enterPassword(driver, read.getPassword());
		testInfo.log(Status.INFO,"Entering password: "+read.getPassword());
		
		loginPageObject.clickOnLogin(driver);
		testInfo.log(Status.INFO,"Clicking on Sign in Button");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='username-helper-text']")).getText().contains("Please Enter Your Email / Phone Number"));
		testInfo.log(Status.INFO,"Email needs to be entered");
	}
	
	@Test(priority=4)
	public void verifyInvalidSignUp() throws Exception //verify invalid signup - no input
	{
		loginPageObject.clickOnNewAccount(driver);
		testInfo.log(Status.INFO, "Clicking on New Account");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		signUpPage.clickOnSignUpButton(driver);
		testInfo.log(Status.INFO,"Clicking on Sign Up Button");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='firstName-helper-text']")).getText().contains("Please Enter Your First Name"));
		testInfo.log(Status.INFO,"First Name needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='lastName-helper-text']")).getText().contains("Please Enter Your Last Name"));
		testInfo.log(Status.INFO,"Last Name needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='mobile-helper-text']")).getText().contains("Please Enter Your Phone Number"));
		testInfo.log(Status.INFO,"Mobile needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='email-helper-text']")).getText().contains("Please Enter Your Email"));
		testInfo.log(Status.INFO,"Email needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='password-1-helper-text']")).getText().contains("Please Enter Your New Password"));
		testInfo.log(Status.INFO,"Password needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='password-2-helper-text']")).getText().contains("Please Re-Enter Your New Password"));
		testInfo.log(Status.INFO,"Re Enter Password needs to be entered");
	}
	
	@Test(priority=5)
	public void verifyInvalidSignUpWOne() throws Exception //verify invalid signup - With One Input - First Name
	{
		loginPageObject.clickOnNewAccount(driver);
		testInfo.log(Status.INFO, "Clicking on New Account");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		signUpPage.enterEmail(driver, read.getFirstName());
		testInfo.log(Status.INFO, "Entering First Name: " +read.getFirstName());
		
		signUpPage.clickOnSignUpButton(driver);
		testInfo.log(Status.INFO,"Clicking on Sign Up Button");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='lastName-helper-text']")).getText().contains("Please Enter Your Last Name"));
		testInfo.log(Status.INFO,"Last Name needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='mobile-helper-text']")).getText().contains("Please Enter Your Phone Number"));
		testInfo.log(Status.INFO,"Mobile needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='email-helper-text']")).getText().contains("Please Enter Your Email"));
		testInfo.log(Status.INFO,"Email needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='password-1-helper-text']")).getText().contains("Please Enter Your New Password"));
		testInfo.log(Status.INFO,"Password needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='password-2-helper-text']")).getText().contains("Please Re-Enter Your New Password"));
		testInfo.log(Status.INFO,"Re Enter Password needs to be entered");
	}
	
	@Test(priority=6)
	public void verifyInvalidSignUpWTwo() throws Exception //verify invalid signup - With Two Inputs - First & Last Name
	{
		loginPageObject.clickOnNewAccount(driver);
		testInfo.log(Status.INFO, "Clicking on New Account");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		signUpPage.enterEmail(driver, read.getFirstName());
		testInfo.log(Status.INFO, "Entering First Name: " +read.getFirstName());

		signUpPage.enterEmail(driver, read.getLastName());
		testInfo.log(Status.INFO, "Entering Last Name: " +read.getLastName());
		
		signUpPage.clickOnSignUpButton(driver);
		testInfo.log(Status.INFO,"Clicking on Sign Up Button");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='mobile-helper-text']")).getText().contains("Please Enter Your Phone Number"));
		testInfo.log(Status.INFO,"Mobile needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='email-helper-text']")).getText().contains("Please Enter Your Email"));
		testInfo.log(Status.INFO,"Email needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='password-1-helper-text']")).getText().contains("Please Enter Your New Password"));
		testInfo.log(Status.INFO,"Password needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='password-2-helper-text']")).getText().contains("Please Re-Enter Your New Password"));
		testInfo.log(Status.INFO,"Re Enter Password needs to be entered");
	}
	
	@Test(priority=7)
	public void verifyInvalidSignUpWThree() throws Exception //verify invalid signup - With Three Inputs - First & Last Name, Mobile
	{
		loginPageObject.clickOnNewAccount(driver);
		testInfo.log(Status.INFO, "Clicking on New Account");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		signUpPage.enterEmail(driver, read.getFirstName());
		testInfo.log(Status.INFO, "Entering First Name: " +read.getFirstName());

		signUpPage.enterEmail(driver, read.getLastName());
		testInfo.log(Status.INFO, "Entering Last Name: " +read.getLastName());
		
		signUpPage.enterEmail(driver, read.getMobile());
		testInfo.log(Status.INFO, "Entering Mobile: " +read.getMobile());
		
		signUpPage.clickOnSignUpButton(driver);
		testInfo.log(Status.INFO,"Clicking on Sign Up Button");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='email-helper-text']")).getText().contains("Please Enter Your Email"));
		testInfo.log(Status.INFO,"Email needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='password-1-helper-text']")).getText().contains("Please Enter Your New Password"));
		testInfo.log(Status.INFO,"Password needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='password-2-helper-text']")).getText().contains("Please Re-Enter Your New Password"));
		testInfo.log(Status.INFO,"Re Enter Password needs to be entered");
	}
	
	@Test(priority=8)
	public void verifyInvalidSignUpWFour() throws Exception //verify invalid signup - With Four Inputs - First & Last Name, Mobile & Email
	{
		loginPageObject.clickOnNewAccount(driver);
		testInfo.log(Status.INFO, "Clicking on New Account");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		signUpPage.enterEmail(driver, read.getFirstName());
		testInfo.log(Status.INFO, "Entering First Name: " +read.getFirstName());

		signUpPage.enterEmail(driver, read.getLastName());
		testInfo.log(Status.INFO, "Entering Last Name: " +read.getLastName());
		
		signUpPage.enterEmail(driver, read.getMobile());
		testInfo.log(Status.INFO, "Entering Mobile: " +read.getMobile());
		
		signUpPage.enterEmail(driver, read.getEmail());
		testInfo.log(Status.INFO, "Entering Email: " +read.getEmail());
		
		signUpPage.clickOnSignUpButton(driver);
		testInfo.log(Status.INFO,"Clicking on Sign Up Button");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='password-1-helper-text']")).getText().contains("Please Enter Your New Password"));
		testInfo.log(Status.INFO,"Password needs to be entered");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='password-2-helper-text']")).getText().contains("Please Re-Enter Your New Password"));
		testInfo.log(Status.INFO,"Re Enter Password needs to be entered");
	}
	
	@Test(priority=9)
	public void verifyInvalidSignUpWFive() throws Exception //verify invalid signup - With Five Inputs - First & Last Name, Mobile & Email & Password
	{
		loginPageObject.clickOnNewAccount(driver);
		testInfo.log(Status.INFO, "Clicking on New Account");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		signUpPage.enterEmail(driver, read.getFirstName());
		testInfo.log(Status.INFO, "Entering First Name: " +read.getFirstName());

		signUpPage.enterEmail(driver, read.getLastName());
		testInfo.log(Status.INFO, "Entering Last Name: " +read.getLastName());
		
		signUpPage.enterEmail(driver, read.getMobile());
		testInfo.log(Status.INFO, "Entering Mobile: " +read.getMobile());
		
		signUpPage.enterEmail(driver, read.getEmailSignUp());
		testInfo.log(Status.INFO, "Entering Email: " +read.getEmailSignUp());
		
		signUpPage.enterEmail(driver, read.getPasswordSignUp());
		testInfo.log(Status.INFO, "Entering Password: " +read.getPasswordSignUp());
		
		signUpPage.clickOnSignUpButton(driver);
		testInfo.log(Status.INFO,"Clicking on Sign Up Button");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='password-2-helper-text']")).getText().contains("Please Re-Enter Your New Password"));
		testInfo.log(Status.INFO,"Re Enter Password needs to be entered");
	}
	
	@Test(priority=10)
	public void verifyInvalidSignUpWI() throws Exception //verify invalid signup - With Wrong Inputs - alphabet for mobile
	{
		loginPageObject.clickOnNewAccount(driver);
		testInfo.log(Status.INFO, "Clicking on New Account");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		signUpPage.enterEmail(driver, read.getFirstName());
		testInfo.log(Status.INFO, "Entering First Name: " +read.getFirstName());

		signUpPage.enterEmail(driver, read.getLastName());
		testInfo.log(Status.INFO, "Entering Last Name: " +read.getLastName());
		
		signUpPage.enterEmail(driver, read.getMobileOff());
		testInfo.log(Status.INFO, "Entering Mobile: " +read.getMobileOff());
		
		signUpPage.enterEmail(driver, read.getEmailSignUp());
		testInfo.log(Status.INFO, "Entering Email: " +read.getEmailSignUp());
		
		signUpPage.enterEmail(driver, read.getPasswordSignUp());
		testInfo.log(Status.INFO, "Entering Password: " +read.getPasswordSignUp());
		
		signUpPage.enterEmail(driver, read.getPasswordSignUp());
		testInfo.log(Status.INFO, "Entering Re Enter Password: " +read.getPasswordSignUp());
		
		signUpPage.clickOnSignUpButton(driver);
		testInfo.log(Status.INFO,"Clicking on Sign Up Button");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='mobile-helper-text']")).getText().contains("Please Enter Your Phone Number"));
		testInfo.log(Status.INFO,"Mobile needs to be entered");
	}
	
	@Test(priority=11)
	public void verifyValidLogin() throws Exception //verify valid login
	{
		loginPageObject.enterEmail(driver,read.getEmail());
		testInfo.log(Status.INFO,"Entering email: "+read.getEmail());
		
		loginPageObject.enterPassword(driver, read.getPassword());
		testInfo.log(Status.INFO,"Entering password: "+read.getPassword());
		
		loginPageObject.clickOnLogin(driver);	
		testInfo.log(Status.INFO,"Clicking on login button");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Assert.assertTrue(driver.findElement(By.xpath("//div/h6[(.)='Contact']")).getText().contains("Contact"));
		testInfo.log(Status.INFO,"User is logged In");
	}
	
	@Test(priority=12)
	public void verifyValidSignUp() throws Exception //verify valid signup
	{
		loginPageObject.clickOnNewAccount(driver);
		testInfo.log(Status.INFO, "Clicking on New Account");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		signUpPage.enterEmail(driver, read.getFirstName());
		testInfo.log(Status.INFO, "Entering First Name: " +read.getFirstName());

		signUpPage.enterEmail(driver, read.getLastName());
		testInfo.log(Status.INFO, "Entering Last Name: " +read.getLastName());
		
		signUpPage.enterEmail(driver, read.getMobile());
		testInfo.log(Status.INFO, "Entering Mobile: " +read.getMobile());
		
		signUpPage.enterEmail(driver, read.getEmailSignUp());
		testInfo.log(Status.INFO, "Entering Email: " +read.getEmailSignUp());
		
		signUpPage.enterEmail(driver, read.getPasswordSignUp());
		testInfo.log(Status.INFO, "Entering Password: " +read.getPasswordSignUp());
		
		signUpPage.enterEmail(driver, read.getPasswordSignUp());
		testInfo.log(Status.INFO, "Entering Re Enter Password: " +read.getPasswordSignUp());
		
		signUpPage.clickOnSignUpButton(driver);
		testInfo.log(Status.INFO,"Clicking on Sign Up Button");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Assert.assertTrue(driver.findElement(By.xpath("//div/p[contains((.),'Some error occured')]")).getText().contains("Some error occured, Please check your network settings and try again."));
		testInfo.log(Status.INFO,"Expected Result is here");
	}
	
	@Test(priority=13)
	public void verifyLoginViaOTPWOE() throws Exception //verify loginViaOTP Without Email
	{
		loginPageObject.clickOnLoginViaOTP(driver);
		testInfo.log(Status.INFO, "Clicking on Login Via OTP");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		loginPageObject.clickOnSendOTP(driver);
		testInfo.log(Status.INFO,"Clicking on Send OTP");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='username-helper-text']")).getText().contains("Please Enter Your Email / Phone Number"));
		testInfo.log(Status.INFO,"Email needs to be entered");	
	}
	
	@Test(priority=14)
	public void verifyLoginViaOTPWE() throws Exception //verify loginViaOTP With Email
	{
		loginPageObject.clickOnLoginViaOTP(driver);
		testInfo.log(Status.INFO, "Clicking on Login Via OTP");
		
		loginPageObject.enterEmail(driver,read.getEmail());
		testInfo.log(Status.INFO,"Entering email: "+read.getEmail());
		
		loginPageObject.clickOnSendOTP(driver);
		testInfo.log(Status.INFO,"Clicking on Send OTP");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Assert.assertTrue(driver.findElement(By.xpath("//div/p[contains((.),'Some error occured')]")).getText().contains("Some error occured, Please check your network settings and try again."));
		testInfo.log(Status.INFO,"Expected Result is here");	
	}
	
	@Test(priority=13)
	public void verifyForgotPasswordWOE() throws Exception //verify forgotPassword Without Email
	{
		loginPageObject.clickOnForgotPassword(driver);
		testInfo.log(Status.INFO, "Clicking on Forgot Password");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		loginPageObject.clickOnSendOTP(driver);
		testInfo.log(Status.INFO,"Clicking on Send OTP");
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id='username-helper-text']")).getText().contains("Please Enter Your Email / Phone Number"));
		testInfo.log(Status.INFO,"Email needs to be entered");	
	}
	
	@Test(priority=15)
	public void verifyForgotPasswordWE() throws Exception //verify forgotPassword With Email
	{
		loginPageObject.clickOnForgotPassword(driver);
		testInfo.log(Status.INFO, "Clicking on Forgot Password");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		loginPageObject.enterEmail(driver,read.getEmail());
		testInfo.log(Status.INFO,"Entering email: "+read.getEmail());
		
		loginPageObject.clickOnSendOTP(driver);
		testInfo.log(Status.INFO,"Clicking on Send OTP");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Assert.assertTrue(driver.findElement(By.xpath("//div/p[contains((.),'Some error occured')]")).getText().contains("Some error occured, Please check your network settings and try again."));
		testInfo.log(Status.INFO,"Expected Result is here");	
	}
}
