package in.merchant.utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	public WebDriver driver;
	WebDriverWait wait;

	public WaitUtility(WebDriver driver) {
		this.driver = driver;
	}

	public static final long IMPLICIT_WAIT = 10;
	public static final long PAGE_LOAD_WAIT = 20;

	public void element_ToBeClickable(long seconds, String xpath) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}

	public void visibility_OfElementLocated(long seconds, String xpath) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	public void fluentWait(long timeOut) {
		FluentWait wait = new FluentWait(driver);
		wait.until(ExpectedConditions.alertIsPresent());
		wait.ignoring(NoSuchElementException.class);
	}

}
