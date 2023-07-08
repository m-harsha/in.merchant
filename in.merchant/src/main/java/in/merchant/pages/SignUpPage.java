package in.merchant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.merchant.utilities.Excel;
import in.merchant.utilities.GeneralUtility;

public class SignUpPage {

	WebDriver driver;
	Excel excel = new Excel();
	GeneralUtility generalutility;
	// @FindBy(xpath="(//a[@class='MuiTypography-root MuiTypography-subtitle2
	// MuiLink-root MuiLink-underlineHover css-1c2db0i'])[2]")
	// private WebElement AccountCreate;
	@FindBy(xpath = "(//input[@id=':r0:']")
	private WebElement ShopName;
	@FindBy(xpath = "//input[@id=':rd:']")
	private WebElement OwnerName;
	@FindBy(xpath = "div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']")
	private WebElement PhoneDrop;
	@FindBy(xpath = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1e7qtl8']")
	private WebElement Search;
	@FindBy(xpath = "img[@src='https://cdn.britannica.com/97/1597-050-008F30FA/Flag-India.jpg']")
	private WebElement FlagSelect;
	@FindBy(xpath = "//input[@id=':r8:']")
	private WebElement PhoneNumber;
	@FindBy(xpath = "//input[@id=':ra:']")
	private WebElement Email;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-1lwp7th'])[1]")
	private WebElement Eyeicon;
	@FindBy(xpath = "/(//input[@type='password'])[2]")
	private WebElement ConfirmPassword;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-1lwp7th'])[2]")
	private WebElement Eyeicon2;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium MuiAutocomplete-popupIndicator css-1cmnjjk'])[1]")
	private WebElement Business;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium MuiAutocomplete-popupIndicator css-1cmnjjk'])[2]")
	private WebElement Sales;
	@FindBy(xpath = "//input[@id=':r53:']")
	private WebElement PostalCode;

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

	public void clickOnPhoneDrop() {
		PhoneDrop.click();
	}

	public void selectState() {
		FlagSelect.click();
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

	public void BusinessCategory(String category) {
		Business.sendKeys(category);
	}

	public void SalesChannel(String channel) {
		Sales.sendKeys(channel);
	}

	public void enterPostal(String postal) {
		PostalCode.sendKeys(postal);
	}

	public void Create_Merchant(String shopName, String ownerName, String phoneNumber, String email, String Password1,
			String passWord, String category, String channel, String postal) {
		// clickOnCreateAccount();
		enterShopName(shopName);
		enterOwnerName(ownerName);
		clickOnPhoneDrop();
		selectState();
		enterPhoneNumber(phoneNumber);
		enterBusinessEmail(email);
		enterPassword(Password1);
		enterConfirmPassword(passWord);
		clickEyeIcon();
		clickEyeIcon2();
		BusinessCategory(category);
		SalesChannel(channel);
		enterPostal(postal);
	}
}
