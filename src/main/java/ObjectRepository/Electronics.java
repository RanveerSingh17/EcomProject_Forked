package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronics {

	public Electronics(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath = "//img[@alt='Picture for category Camera, photo']")
	private WebElement objectElectonics;

	public WebElement getObjectElectonics() {
		return objectElectonics;
	}
	
	public void clickOnElectronics() {
		objectElectonics.click();
	}
}
