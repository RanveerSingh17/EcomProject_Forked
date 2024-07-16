package TC_ELECTRONIC_03;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericUtilities.BaseClass;
import ObjectRepository.Electronics;
import ObjectRepository.Home_Page;
//@Listeners(GenericUtilities.Ecom_List.class)
@Listeners(GenericUtilities.Ecom_Listener_Implementation.class)
public class Electronic_Page_Test extends BaseClass{

	@Test
	public void electronic() throws Throwable {
		
		     Home_Page home = new Home_Page(driver);
		     home.clickElectronics();
		     Electronics el = new Electronics(driver);
		     el.clickOnElectronics();
			 String Electronics = elib.getDataFromExcel("Electronics", 0, 0);
			 System.out.println("Test_Case_Pass :"+Electronics);
		}
}
