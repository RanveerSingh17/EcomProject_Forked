package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computer {

	public Computer(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath = "//img[@src='https://demowebshop.tricentis.com/content/images/thumbs/0000003_desktops_125.jpg']")
	private WebElement objectComputer;

	public WebElement getObjectComputer() {
		return objectComputer;
	}

	public void clickOnComputerObj() {
		objectComputer.click();
	}
	
}
