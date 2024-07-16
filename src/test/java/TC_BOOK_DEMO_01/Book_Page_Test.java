package TC_BOOK_DEMO_01;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import ObjectRepository.Home_Page;
//@Listeners(GenericUtilities.Ecom_List.class)
@Listeners(GenericUtilities.Ecom_Listener_Implementation.class)
public class Book_Page_Test extends BaseClass {

	@Test
	public void book() throws Throwable {
	 
		Home_Page home = new Home_Page(driver);
		home.getBooks();
		String BookPage = elib.getDataFromExcel("Book", 1, 1);
		home.getAddToCartBooks();
		home.getClickOnCart();
		System.out.println("Test_Case_Pass :"+BookPage);
	}
}
