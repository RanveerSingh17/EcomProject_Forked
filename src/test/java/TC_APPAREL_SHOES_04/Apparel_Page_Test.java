package TC_APPAREL_SHOES_04;

import org.testng.annotations.Listeners;


import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import ObjectRepository.Apparel;
import ObjectRepository.Home_Page;
//@Listeners(GenericUtilities.Ecom_List.class)
@Listeners(GenericUtilities.Ecom_Listener_Implementation.class)
public class Apparel_Page_Test extends BaseClass {
	
	@Test
	public void apparel() throws Throwable {
		
		     Home_Page home = new Home_Page(driver);
		     home.clickApparel();
			 String Apparel = elib.getDataFromExcel("Apparel", 0, 0);
			 Apparel ap= new Apparel(driver);
			 ap.clickOnApprealObj();
			 home.clickCart();
			 System.out.println("Test_Case_Pass :"+Apparel);
			}
}
