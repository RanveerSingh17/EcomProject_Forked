package TC_COMPUTER_02;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import ObjectRepository.Computer;
import ObjectRepository.Home_Page;
//@Listeners(GenericUtilities.Ecom_List.class)
@Listeners(GenericUtilities.Ecom_Listener_Implementation.class)
public class Computer_Page_Test extends BaseClass{
	
	@Test
	public void computer() throws Throwable {
		
		     Home_Page home = new Home_Page(driver);
		     home.clickComputers();
		     Computer com = new Computer(driver);
		     com.clickOnComputerObj();
			 String Computer = elib.getDataFromExcel("Computer", 0, 0);
			 System.out.println("Test_Case_Pass :"+Computer);
	}
}
