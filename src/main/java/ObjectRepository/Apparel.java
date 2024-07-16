package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Apparel {

	public Apparel(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[3]")
	private WebElement objectApparel;
	

	public WebElement getObjectApparel() {
		return objectApparel;
	}

	public void clickOnApprealObj() {
		objectApparel.click();
	}
}
