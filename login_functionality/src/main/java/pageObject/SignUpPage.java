package pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	WebDriver driver;
	Logger logger;
	
	public SignUpPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		logger=Logger.getLogger(this.getClass());
	}
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;

	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='mobile']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@id='password-1']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='password-2']")
	WebElement reEnterPassword;
	
	@FindBy(xpath="//span[(.)='Signup']")
	WebElement signUpButton;
	
	@FindBy(xpath="//p[@id='firstName-helper-text']")
	WebElement firstNameError;
	
	@FindBy(xpath="//p[@id='lastName-helper-text']")
	WebElement lastNameError;
	
	@FindBy(xpath="//p[@id='email-helper-text']")
	WebElement emailNameError;
	
	@FindBy(xpath="//p[@id='mobile-helper-text']")
	WebElement mobileError;
	
	@FindBy(xpath="//p[@id='password-1-helper-text']")
	WebElement passwordError;
	
	@FindBy(xpath="//p[@id='password-2-helper-text']")
	WebElement reEnterPasswordError;
	
	public void enterFirstName(WebDriver driver, String str) 
	{
		logger.info("First Name is entered: " +str);
		firstName.sendKeys(str);
	}
	
	public void enterLastName(WebDriver driver, String str) 
	{
		logger.info("Last Name is entered: " +str);
		lastName.sendKeys(str);
	}
	
	public void enterEmail(WebDriver driver, String str) 
	{
		logger.info("Email is entered: " +str);
		email.sendKeys(str);
	}
	
	public void enterPassword(WebDriver driver, String str) 
	{
		logger.info("Password is entered: " +str);
		password.sendKeys(str);
	}
	
	public void reEnterPassword(WebDriver driver, String str) 
	{
		logger.info("Password is verified: " +str);
		reEnterPassword.sendKeys(str);
	}
	
	public void enterMobile(WebDriver driver, String str) 
	{
		logger.info("Mobile is entered: " +str);
		mobile.sendKeys(str);
	}
	
	public void clickOnSignUpButton(WebDriver driver) 
	{
		logger.info("Clicked on Sign Up Button");
		signUpButton.click();
	}
	
}
