package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "Apparel & Shoes")
	private WebElement appreal;
	
	public WebElement getAppreal() {
		return appreal;
	}
	public void clickApparel() {
		appreal.click();
	}
	
	
	@FindBy(linkText = "Books")
	private WebElement books;
	
	public WebElement getBooks() {
		return books;
	}
	public void clickBook() {
		books.click();
	}
	
	
	@FindBy(linkText = "Computers")
	private WebElement computers;
	
	public WebElement getComputers() {
		return computers;
	}
	public void clickComputers() {
		computers.click();
	}
	
	
	
	@FindBy(linkText = "Electronics")
	private WebElement electronics;
	
	public WebElement getElectronics() {
		return electronics;
	}
	public void clickElectronics() {
		electronics.click();
	}
	
	
	
	@FindBy(linkText = "Shopping cart")
	private WebElement clickOnCart;
	
	public WebElement getClickOnCart() {
		return clickOnCart;
	}
	public void clickCart() {
		clickOnCart.click();
	}
	
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	private WebElement addToCartBooks;
	
	public WebElement getAddToCartBooks() {
		return addToCartBooks;
	}
	public void clickAddToCartBooks() {
		addToCartBooks.click();
	}


	
	@FindBy(linkText = "Log out")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}
	public void logoutFromApp() {
		logout.click();
	}

}
