package in.merchant.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import in.merchant.utilities.Excel;
import in.merchant.utilities.GeneralUtility;
import in.merchant.utilities.PageUtility;
import in.merchant.utilities.WaitUtility;

public class SignUpPage {

	WebDriver driver;
	Excel excel = new Excel();
	GeneralUtility generalutility;
	PageUtility pageutility;
	WaitUtility waitutility;
	// @FindBy(xpath="(//a[@class='MuiTypography-root MuiTypography-subtitle2
	// MuiLink-root MuiLink-underlineHover css-1c2db0i'])[2]")
	// private WebElement AccountCreate;
	@FindBy(xpath = "//input[@id=':r0:']")
	private WebElement ShopName;
	@FindBy(xpath = "//input[@id=':r1:']")
	private WebElement OwnerName;
	/*@FindBy(xpath = "div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']")
	private WebElement PhoneDrop;
	@FindBy(xpath = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1e7qtl8']")
	private WebElement Search;
	@FindBy(xpath = "img[@src='https://cdn.britannica.com/97/1597-050-008F30FA/Flag-India.jpg']")
	private WebElement FlagSelect;*/
	@FindBy(xpath = "//input[@id=':r2:']")
	private WebElement PhoneNumber;
	@FindBy(xpath = "//input[@id=':r4:']")
	private WebElement Email;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-1lwp7th'])[1]")
	private WebElement Eyeicon;
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement ConfirmPassword;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-1lwp7th'])[2]")
	private WebElement Eyeicon2;
	@FindBy(xpath = "//input[@id=':r6:']")
	private WebElement Business;
	@FindBy(xpath = "//input[@value='Services']")
	private WebElement Category;
	@FindBy(xpath = "//input[@id=':r8:']")
	private WebElement sales;
	@FindBy(xpath = "//input[@value='Online']")
	private WebElement salesD;
	@FindBy(xpath = "//input[@name='postal_code']")
	private WebElement PostalCode;
	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement signUp;
	

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * public void clickOnCreateAccount() { AccountCreate.click(); }
	 */
	public void enterShopName(String shopName) {
		ShopName.sendKeys(shopName);
	}

	public void enterOwnerName(String ownerName) {
		OwnerName.sendKeys(ownerName);
	}

	public void enterPhoneNumber(String phoneNumber) {
		PhoneNumber.sendKeys(phoneNumber);
	}

	public void enterBusinessEmail(String email) {
		Email.sendKeys(email);
	}

	public void enterPassword(String Password1) {
		Password.sendKeys(Password1);
	}

	public void enterConfirmPassword(String passWord) {
		ConfirmPassword.sendKeys(passWord);
	}

	public void clickEyeIcon() {
		Eyeicon.click();
	}

	public void clickEyeIcon2() {
		Eyeicon2.click();
	}
	
	public void autoSuggest()  {
		 
		 driver.findElement(By.xpath("//input[@placeholder='Business Category']")).sendKeys("Services");
		 driver.findElement(By.xpath("//input[@value='Services']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Business Category']")).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.xpath("//input[@placeholder='Business Category']")).sendKeys(Keys.ENTER);
		 //List<WebElement>   autosuggestElements=driver.findElements(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-1nhly7v'])[1]"));
		//for (WebElement element : autosuggestElements) {
			//String text=element.getText();
		//}
		 driver.findElement(By.xpath("//input[@placeholder='Sales Channel']")).sendKeys("Online");
		 driver.findElement(By.xpath("//input[@value='Online']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Sales Channel']")).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.xpath("//input[@placeholder='Sales Channel']")).sendKeys(Keys.ENTER);
	   }
	
	

	public void enterPostal(String postal) {
		PostalCode.sendKeys(postal);
	}
	public void clickSignUp() {
		signUp.click();
	}
	

	public void Create_Merchant(String shopName, String ownerName, String phoneNumber, String email, String Password1,
			String passWord, String postal) {
		// clickOnCreateAccount();
		enterShopName(shopName);
		enterOwnerName(ownerName);
		//clickOnPhoneDrop();
		//selectState();
		enterPhoneNumber(phoneNumber);
		enterBusinessEmail(email);
		enterPassword(Password1);
		enterConfirmPassword(passWord);
		clickEyeIcon();
		clickEyeIcon2();
		autoSuggest();
		enterPostal(postal);
		clickSignUp();
	}
}
