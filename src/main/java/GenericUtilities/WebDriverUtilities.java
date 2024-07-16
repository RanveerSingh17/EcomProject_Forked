package GenericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebDriverUtilities {
	

	/**
	 * this is used for maximizing window.
	 * @author Ranveer
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * this is used for Minimize window.
	 * @author Ranveer
	 * @param driver
	 */
	
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	/**
	 * this is used for Implicit window.
	 * @author Ranveer
	 * @param driver
	 */
	public void WaitForElementToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	/**
	 * this is used to close the current active window.
	 * @author Ranveer
	 * @param driver
	 */
	public void close(WebDriver driver) {
		driver.close();
	}
	
	/**
	 * this is used to quit all the windows
	 * @author Ranveer
	 * @param driver
	 */
	public void quit(WebDriver driver) {
		driver.quit();
	}
	
	/**
	 * this is used to Alert Accept popUp.
	 * @author Ranveer
	 * @param driver
	 */
	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * this is used to Alert Dismiss popup.
	 * @author ranveer
	 * @param driver
	 */
	public void alertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public static void takeScreenShots(WebDriver driver) throws Throwable
	{
//		TakesScreenshot takesSceenShot = (TakesScreenshot) driver;
//		File src = takesSceenShot.getScreenshotAs(OutputType.FILE);
//		File dst = new File("./ScreenShots/" + screenShotName +".png");
//		FileUtils.copyFile(src, dst);
//		return dst.getAbsolutePath();
		TakesScreenshot takesSceenShot = (TakesScreenshot) driver;
		File src = takesSceenShot.getScreenshotAs(OutputType.FILE);
		LocalDateTime dateTime = LocalDateTime.now();
		String currentDateTime = dateTime.toString().replace(":", "_").replace(" ", "_");
		File dst = new File("./ScreenShots/" +"screenShotName"+currentDateTime+".png");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return screenShotName;
		
	}
	
public static String takeScreenShot(WebDriver driver, String screenShotName) throws Throwable {
		
		TakesScreenshot takesSceenShot = (TakesScreenshot) driver;
		File src = takesSceenShot.getScreenshotAs(OutputType.FILE);
		File dst = new File("./ScreenShots/" + screenShotName +".png");
		FileUtils.copyFile(src, dst);
		return dst.getAbsolutePath();
}

}
