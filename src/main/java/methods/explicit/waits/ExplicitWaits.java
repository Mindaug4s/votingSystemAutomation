package methods.explicit.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class ExplicitWaits {

	WebDriver driver;

	public ExplicitWaits(WebDriver driver) {
		this.driver = driver;

	}

	public void fluentWait(final WebElement nameOfTheElement) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		if (nameOfTheElement.isEnabled()) {
			System.out.println("Element is present");

			WebElement alertElement = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {

					if (nameOfTheElement.isDisplayed()) {
						return nameOfTheElement;
					} else {
						return null;

					}

				}
			});

		}
	}

	public static void fluentWait(final WebElement nameOfTheElement, WebDriver driver) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		if (nameOfTheElement.isEnabled()) {
			//System.out.println("Element is present");

			WebElement alertElement = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {

					if (nameOfTheElement.isDisplayed()) {
						return nameOfTheElement;
					} else {
						return null;

					}

				}
			});

		}
	}

	public void waitForJavascript() {
		new WebDriverWait(driver, 5).until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
			}
		});
	}

	public static void waitForJavascript(WebDriver driver) {
		new WebDriverWait(driver, 5).until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
			}
		});
	}
}
