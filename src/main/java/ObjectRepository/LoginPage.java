package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="Email")
	private WebElement userTextField;
	
	@FindBy(name="Password")
	private WebElement passWordTextField;
	
	@FindBy(name ="RememberMe")
	private WebElement rememberMe;
	
	@FindBy(xpath ="//input[@value='Log in']")
	private WebElement loginButon;
	
	
	public WebElement getUserTextField() {
		return userTextField;
	}

	public WebElement getPassWordTextField() {
		return passWordTextField;
	}

	public WebElement getRememberMe() {
		return rememberMe;
	}

	public WebElement getLoginButon() {
		return loginButon;
	}
	
	public void LoginToApp(String email, String password) {
		userTextField.sendKeys(email);
		passWordTextField.sendKeys(password);
		loginButon.click();
	}
}
