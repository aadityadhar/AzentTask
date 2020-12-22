package pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	WebDriver driver;
	Logger logger;
	
	public LoginPageObjects(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		logger=Logger.getLogger(this.getClass());
	}
	
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//span[(.)='Login']")
	WebElement loginButton;
	
	@FindBy(xpath="//span[(.)='Login Via OTP']")
	WebElement loginViaOTP;
	
	@FindBy(xpath="//p[(.)='New Account? Sign Up!']")
	WebElement newAccount;
	
	@FindBy(xpath="//p[(.)='Forgot password?']")
	WebElement forgotPassword;
	
	@FindBy(xpath="//button/span[(.)='Send OTP']")
	WebElement sendOTP;
	
	@FindBy(xpath="//p[@id='username-helper-text']")
	WebElement usernameError;
	
	@FindBy(xpath="//p[@id='password-helper-text']")
	WebElement passwordError;
	
	public void clickOnLogin(WebDriver driver) 
	{
		logger.info("clicked on logIn option");
		loginButton.click();
	}
	
	public void clickOnLoginViaOTP(WebDriver driver) 
	{
		logger.info("clicked on loginViaOTP");
		loginViaOTP.click();
	}	

	public void enterEmail(WebDriver driver,String str) 
	{
		logger.info("Email is entered: "+str);
		username.sendKeys(str);
	}
	
	public void enterPassword(WebDriver driver,String str) 
	{
		logger.info("Password is entered: "+str);
		password.sendKeys(str);
	}
	
	public void clickOnNewAccount(WebDriver driver) 
	{
		logger.info("Clicked on New Account");
		newAccount.click();
	}
	
	public void clickOnForgotPassword(WebDriver driver) 
	{
		logger.info("Clicked on Forgot Password");
		forgotPassword.click();
	}
	
	public void clickOnSendOTP(WebDriver driver)
	{
		logger.info("Clicked on Send OTP");
		sendOTP.click();
	}
	
}
