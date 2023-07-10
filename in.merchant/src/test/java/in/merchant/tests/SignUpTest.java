package in.merchant.tests;

import org.testng.annotations.Test;

import in.merchant.base.Base;
import in.merchant.pages.SignUpPage;
import in.merchant.utilities.Excel;

public class SignUpTest extends Base {
	SignUpPage signuppage;
	Excel excel = new Excel();

	@Test
	public void verify_Add_NewMerchant() {

		excel.setExcelFile("MerchantDetails", "MerchantInformations");
		String shopName = excel.getCellData(0, 0);
		String ownerName = excel.getCellData(0, 1);
		String phoneNumber = excel.getCellData(0, 2);
		String email = excel.getCellData(0, 3);
		String Password1 = excel.getCellData(0, 4);
		String passWord = excel.getCellData(0, 5);
		//String channel = excel.getCellData(0, 6);
		//String Sales = excel.getCellData(0, 7);
		String postal = excel.getCellData(0, 8);
		signuppage = new SignUpPage(driver);
		signuppage.Create_Merchant(shopName, ownerName, phoneNumber, email, Password1, passWord,
				postal);

	}
	/*
	 * @Test public void verify_Add_NewMerchants() { signuppage=new
	 * SignUpPage(driver);
	 * signuppage.Create_Merchant("abc","xyz","34567890","h2@mail.com","rty@Ha",
	 * "rty@Ha","onine","hjtyu345678", "78907"); }
	 */

}
